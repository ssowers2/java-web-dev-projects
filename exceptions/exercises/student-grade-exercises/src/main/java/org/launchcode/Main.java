package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        try {
            if (y == 0) {
                throw new ArithmeticException("This is not correct. Y should not equal zero!");
            }

         int divideResult = x /y;

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        return 0;
    }
}
