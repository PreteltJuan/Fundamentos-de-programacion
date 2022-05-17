public class Main{
 	public static void main(String args[]) {
		try {
			String fileName = "ProgramExample.txt";
			Parser parser = new Parser(fileName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}	