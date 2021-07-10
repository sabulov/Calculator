class NumeralSystem {
    static String translationToRomanNumeral(int number) {
        int ten = number / 10;
        int one = number % 10;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] romanTen = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] romanOne = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String first = "";
        String last = "";
        String whollyResult;
        for (int i = 0; i < numbers.length; i++) {
            if (ten == numbers[i]) {
                first = romanTen[i];
            }
            if (one == numbers[i]) {
                last = romanOne[i];
            }
        }
        whollyResult = first + last;
        return whollyResult;
    }

    static boolean identificationOfArabicNumeral(String numberInText) {
        boolean arabic = false;
        for (int i = 0; i < Numbers.arabicNumbers.length; i++) {
            if (numberInText.equals(Numbers.arabicNumbers[i])) {
                arabic = true;
                break;
            }
        }
        return arabic;
    }

    static boolean identificationOfRomanNumeral(String numberInText) {
        boolean roman = false;
        for (int i = 0; i < Numbers.romanNumbers.length; i++) {
            if (numberInText.equals(Numbers.romanNumbers[i])) {
                roman = true;
                break;
            }
        }
        return roman;
    }

    static void printResult(int resultInNumber) {
        try {
            if (identificationOfArabicNumeral(Compute.strings[0]) && identificationOfArabicNumeral(Compute.strings[2])) {
                System.out.println(resultInNumber);
            } else if (identificationOfRomanNumeral(Compute.strings[0]) && identificationOfRomanNumeral(Compute.strings[2])) {
                System.out.println(translationToRomanNumeral(resultInNumber));
            } else {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println("Числа введены в разных системах счисления");
            System.exit(1);
        }

    }

}
