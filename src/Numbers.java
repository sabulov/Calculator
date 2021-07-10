class Numbers {
    static final String[] arabicNumbers = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    static final String[] romanNumbers = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};


    static int determineNumber(String numberInText) {
        int foundNumber = 0;
        try {
            for (int i = 0; i < arabicNumbers.length; i++) {
                if (numberInText.equals(arabicNumbers[i]) || numberInText.equals(romanNumbers[i])) {
                    foundNumber = Integer.parseInt(arabicNumbers[i]);
                    break;
                }
            }
            if (foundNumber == 0) {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println("Неверно введено число");
            System.exit(1);
        }
        return foundNumber;
    }

}
