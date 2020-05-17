package TasksForTraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        for (;;) {
            str = br.readLine();
            if (isDigit(str)) {
                if (Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128) {
                    print(Integer.parseInt(str));
                } else if (Short.parseShort(str) > 0 && Short.parseShort(str) < 128) {
                    print(Short.parseShort(str));
                }
            } else {
                if (str.equals("exit")) {
                    break;
                } else if (str.contains(".")) {
                    print(Double.parseDouble(str));
                } else print(str);
            }
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
