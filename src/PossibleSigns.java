public class PossibleSigns {

    public final String letters = "abcdefghijklmnopqrstuwxyz";
    public final String upper_letters = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
    public final String polish_letters = "ąĄŻżŹźĆćłŁÓóĘęŃń";
    public final String numbers = "0123456789";
    public final String special_signs = "!@#$%^&*()_+=";

    private StringBuilder stringFinal;


    public void GenerateLetters(boolean uppercase_lettersIncluded, boolean polish_lettersIncluded, boolean numbersIncluded, boolean special_signsIncluded) {
        stringFinal = new StringBuilder();
        stringFinal.append(letters);

        if (uppercase_lettersIncluded) {
            stringFinal.append(upper_letters);
        }
        if (polish_lettersIncluded) {
            stringFinal.append(polish_letters);
        }
        if (numbersIncluded) {
            stringFinal.append(numbers);
        }
        if (special_signsIncluded) {
            stringFinal.append(special_signs);
        }
    }
    public String getString(){
        return stringFinal.toString();
    }


}
