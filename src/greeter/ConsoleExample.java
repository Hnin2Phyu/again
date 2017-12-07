package greeter;

import java.io.*;

public class ConsoleExample {
    public static String getLineFromConsole (String prompt) {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print (prompt + ": ");
        try {
            return (br.readLine());
        } catch (Exception e) {
		    System.err.print("Exception error=" + e.getMessage());
            return (null);
        }
    }

    public static void main (String args[]) {
        String line = getLineFromConsole ("Type some text");
        System.out.println ("You typed: " + line);
    }
}
