
import java.util.*;
import java.lang.*;


public class Token{
	//Token code
	public int code;
	//Token text (e.g., for, while, if, etc)
	public String text;
	//Token line
	public int line;
	/**
		Constructor
		@param code: token code
		@param text: token text
		@param line: line where the token is located
	**/
	public Token(int code, String text, int line){
		this.text = text;
		this.code = code;
		this.line = line;
	}
	
	
}
