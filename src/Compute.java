/**
 * Vladimir Sabulov
 * version 1.1 - 09.07.2021
 */
import java.util.Scanner;

public class Compute {
    static String[] strings;
    static int expressionResult;
    public static void main(String[] args) {
        System.out.println("Введите выражение в формате a + b через пробелы, " +
                "где a и b - целые арабские или римские числа от 1 до 10 включительно, а вместо + любой арифметический оператор");
        Scanner console = new Scanner(System.in);
        String expression = console.nextLine();
        strings = Strings.conversionToArray(expression);

        int firsNumber = Numbers.determineNumber(strings[0]);

        int secondNumber = Numbers.determineNumber(strings[2]);

        try {
            switch(strings[1]) {
                case "+":
                    expressionResult = firsNumber + secondNumber;
                    break;
                case "-":
                    expressionResult = firsNumber - secondNumber;
                    break;
                case "*":
                    expressionResult = firsNumber * secondNumber;
                    break;
                case "/":
                    expressionResult = firsNumber / secondNumber;
                    break;
                default:
                    throw new Exception();
                }
        }catch (Exception ex){
            System.out.println("Неверно введён арифметический оператор");
            System.exit(1);
        }


        NumeralSystem.printResult(expressionResult);




    }


}
