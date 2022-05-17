

import java.io.*;

public class Parser {
	// token: (Token) used to process each token in the source code
	private Token token;
  private Token pastToken;
	// lexer: (Lexer) used to obtain each token in the source code
	private Lexer lexer;

	/**
	 * Constructor: Creates the lexer to obtain each token in the source file Points
	 * the iterator to the first token Starts parsing at the start symbol according
	 * the the grammar
	 **/
	public Parser(String fileName) {
		try {
			// Creates the lexer
			lexer = new Lexer(fileName);
			// Points the iterator to the first token
			token = lexer.nextToken();
			// Starts the parser
			program();
		} catch (FileNotFoundException ex) {
			System.out.println("File not found!");
			System.exit(1);
		}
	}

	/**
	 * Function recognize: verifies if the current token corresponds to the expected
	 * token according with the grammar and move the tokenIterator to the next one.
	 * 
	 * @param expected: (int) expected token code
	 * @throws Exception
	 **/
	private void recognize(int expected) {
		if (token.code == expected){
			// the token is the expected one, move the tokenIterator
			pastToken = token;
			token = lexer.nextToken();
		}else {
			// The current token is not expected, syntax error!
			String err = "Syntax error in line " + pastToken.line;
			if(expected == Lexer.NUMBER){
				err += ".\nExpected: NUMBER, VARIABLE, CONSTANT O (EXPRESSION)";
			}else{
				err += ".\nExpected: " + lexer.getText(expected);
			}
			err += " after " + pastToken.text + ". But I Found \"" + token.text + "\" "+ "in line " + token.line + ".";	
			// System.out.println("Syntax error in line " + token.line);
			// System.out.println("Expected: " + expected + " found " + token.code);
			// STOP!
			throw new RuntimeException(err);
			// System.exit(2);
		}
	}

	/**
	 * Function program: verifies the production <program>::= program
	 * <funDefinitionList> endProgram
	 **/
	public void program() {
		// checks for "program"
		recognize(Lexer.PROGRAM);
		// checks for <funDefinitionList>
		funDefinitionList();
		// checks for "endProgram"
		recognize(Lexer.ENDPROGRAM);
		// if EOf is found, no error is found!
		if (token.code == Lexer.EOF) {
			System.out.println("No errors found!");
		}
	}

	/**
	 * Function funDefinitionList: verifies the production
	 * <funDefinitionList>::=<funDefinition> { <funDefinition> }
	 **/
	public void funDefinitionList() {
		// checks for <funDefinition>
		funDefinition();
		// verifies if there are more <funDefinition>
		while (lexer.getCurrentToken().code == Lexer.DEF) {
			funDefinition();
		}
	}

	/**
	 * Function funDefinition: verifies the production <funDefinition>::= def
	 * <variable> <lparen> [<varDefList>] <rparen> [<varDefList>] [<statementList>]
	 * enddef
	 **/
	public void funDefinition() {
		// checks for "def"
		recognize(Lexer.DEF);
		// checks for <variable>
		recognizeVariable();// nombre
		// checks for "("
		recognize(Lexer.LPAREN);
		// verifies if there are parameters
		if (lexer.getCurrentToken().code != Lexer.RPAREN) // def main ( ) def main ( int a int b)
			varDefList();
		// checks for ")"
		recognize(Lexer.RPAREN);
		// ver is there are variables definition
		if (lexer.getCurrentToken().code == Lexer.INT)
			varDefList();
		if (lexer.getCurrentToken().code == Lexer.CONSTANT)
			constDefList();

		// checks for <statementList>
		statementList();

		// expresion();
		// checks for "enddef"
		recognize(Lexer.ENDDEF);
	}

	/**
	 * Function varDefList: verifies the production <varDefList>::=<varDef>
	 * {<varDef>}
	 **/
	public void varDefList() {
		// checks for <varDef>
		varDef();
		// Verifies if there are more <varDef>
		while (lexer.getCurrentToken().code == Lexer.INT) {
			varDef();
		}
	}

	public void constDefList() {
		constDef();

		while (lexer.getCurrentToken().code == Lexer.CONSTANT) {
			constDef();
		}

	}

	/**
	 * Function varDef: verifies the production <varDef>::=int variable
	 **/
	public void varDef() {
		recognize(Lexer.INT);
		recognizeVariable();
		if (lexer.getCurrentToken().code == Lexer.ASSIGN) {
			recognize(Lexer.ASSIGN);
			expression();
		}
	}

	public void constDef() {
		recognize(Lexer.CONSTANT);
		recognize(Lexer.INT);
		recognizeConstant();
		recognize(Lexer.ASSIGN);
		expression();
	}

	public void assign() {
		recognizeVariable();
		recognize(Lexer.ASSIGN);
		expression();
	}

	/**
	 * Function statementList: verifies the production <statementList>::=<statement>
	 * {<statement>}
	 **/

	public void statementList() {
		// checks for <statement>
		statement();
		// verifies if there are more <statement>
		while ((lexer.getCurrentToken().code != Lexer.ENDDEF) && (statement()))
			;
	}

	/**
	 * Function statement: verifies the production <statement>::= read <variable> |
	 * print <variable> | call <variable> <lparen> [ <argumentList> ] <rparen>
	 **/
	public boolean statement() {
		boolean r = false;
		// checks for read <variable>
		if (lexer.getCurrentToken().code == Lexer.READ) {
			readStatement();
			r = true;
		} // checks for print <variable>
		else if (lexer.getCurrentToken().code == Lexer.PRINT) {
			printStatement();
			r = true;
		} // Checks for
		else if (lexer.getCurrentToken().code == Lexer.VARIABLE) {
			assign();
			r = true;
		} else if (lexer.getCurrentToken().code == Lexer.IF) {
			ifStatement();
			r = true;
		} else if (lexer.getCurrentToken().code == Lexer.WHILE) {
			whileStament();
			r = true;
		}
		// checks for call <variable> <lparen> [argumentList] <rparen>
		else if (lexer.getCurrentToken().code == Lexer.CALL) {
			callStament();
			r = true;
		}
		return r;
	}

	public void printStatement() {
		recognize(Lexer.PRINT);
		expression();
		System.out.println("Print ok!");
	}

	public void readStatement() {
		recognize(Lexer.READ);
		recognize(Lexer.VARIABLE);
		System.out.println("Read ok!");
	}

	public void callStament() {
		// checks for "call"
		recognize(Lexer.CALL);
		// checks for <variable>
		recognize(Lexer.VARIABLE);
		// checks for <lparen>
		recognize(Lexer.LPAREN);
		// verifies if there is an argument list
		if (lexer.getCurrentToken().code != Lexer.RPAREN)
			argumentList();
		// checks for <rparen>
		recognize(Lexer.RPAREN);
		System.out.println("call function ok!");
	}

	public void whileStament() {
		recognize(Lexer.WHILE);
		recognize(Lexer.LPAREN);
		condition();
		recognize(Lexer.RPAREN);
		statementList();
		recognize(Lexer.ENDWHILE);
		System.out.println("while statement ok!");
	}

	public void ifStatement() {
		recognize(Lexer.IF);
		recognize(Lexer.LPAREN);
		condition();
		recognize(Lexer.RPAREN);
		statementList();
		if (lexer.getCurrentToken().code == Lexer.ELSE) {
			elseStatement();
		}
		recognize(Lexer.ENDIF);
		System.out.println("if statement ok!");
	}

	public void elseStatement() {
		recognize(Lexer.ELSE);
		statementList();

	}

	public void condition() {
		expression();
		try {
			recognize(Lexer.EQUALS);
		} catch (Exception e) {
			recognize(Lexer.DIFFERENT);
		}
		expression();
	}

	/**
	 * Function argumentList: verifies the production <argumentList> ::=
	 * <argumentDef> { <argumentDef> }
	 **/
	public void argumentList() {
		// Checks for <argumentDef>
		argumentDef();
		// verifies if there are more <argumentDef>
		while (lexer.getCurrentToken().code != Lexer.RPAREN)
			argumentDef();
	}

	/**
	 * Function argumentDef: verifies the production <argumentDef> ::= <variable>
	 **/
	public void argumentDef() {
		factor();

	}

	/**
	 * Function recognizeVariable: verifies for variables
	 * 
	 **/
	public void recognizeVariable() {
		recognize(Lexer.VARIABLE);
	}

	public void recognizeConstant() {
		recognize(Lexer.CONSTANT);
	}

	public void expression() {

		term();
		while (lexer.getCurrentToken().code == Lexer.ADDITION) {
			recognize(Lexer.ADDITION);
			term();
		}

	}

	public void expression2() {
		recognize(Lexer.LPAREN);
		expression();
		recognize(Lexer.RPAREN);
	}

	public void term() {
		factor();
		while (lexer.getCurrentToken().code == Lexer.MULTIPLICATION) {
			recognize(Lexer.MULTIPLICATION);
			factor();
		}

	}

	public void factor() {
		try {
			expression2();
		} catch (Exception e) {
			try {
				recognizeVariable();
			} catch (Exception d) {
				try {
					recognizeConstant();
				} catch (Exception f) {
					recognize(Lexer.NUMBER);
				}
			}
		}
	}



}
