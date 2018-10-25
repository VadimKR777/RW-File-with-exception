import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TestApp {

	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);
		File file = new File("D:\\testFile.txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
		} catch (FileNotFoundException e2) {
			System.err.println("File not found!");
		}
		 
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e1) {
			System.err.println("File not found!");
		}

		String firstname = null;
        String lastname = null;
        int age = 0;

        System.out.println("Firstname: ");
        firstname = in.next();
        System.out.println("Lastname: ");
        lastname = in.next();
        System.out.println("Age: "); 
    try {
        age = in.nextInt();
    }catch (InputMismatchException e) {
    	System.err.println("Input error!");
    }
    
    
        pw.println(firstname + " "+ lastname + " " + age);
        pw.println(firstname);
        pw.println(lastname);
        pw.println(age);
        pw.close();
  
		while (scanner.hasNextLine()) {
        	System.out.println(scanner.nextLine());
        }
   
        scanner.close();
	}
}
