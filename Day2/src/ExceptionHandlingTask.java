
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ExceptionHandlingTask {

	public static void main(String[] args) {
		try {
			  int result = 10 / 0;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }

       
		try {
            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
