import java.util.Scanner;

class Strings {


    static String[] conversionToArray(String text) {
        String[] receivedStrings = text.split(" ");
        try {
            //String[] strings = expression.split(" ");
            if (receivedStrings.length != 3) {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println("Неверно введено выражение");
            System.exit(1);
        }
        return receivedStrings;
    }


}
