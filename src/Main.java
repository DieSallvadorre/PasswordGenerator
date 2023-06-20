import java.util.Scanner;
public class Main {



    public static void main(String[] args) {

        PossibleSigns signs = new PossibleSigns();
        Generator generator = new Generator();

        Scanner sc = new Scanner(System.in);
        int length = 0, n = 0;
        String password_toUse = "";
        String generatedPassword;

        boolean uppercase_lettersIncluded = false,  polish_lettersIncluded = false,numbersIncluded = false, special_signsIncluded = false;


        System.out.print("Enter a number how long generated password should be: ");
        length = sc.nextInt();

        System.out.println("Should password contain upper letters?\n0 = no\n1 = yes");
        n = sc.nextInt();
        if(n == 1){
            uppercase_lettersIncluded = true;
        }

        System.out.println("Should password contain polish letters?\n0 = no\n1 = yes");
        n = sc.nextInt();
        if(n == 1){
            polish_lettersIncluded = true;
        }

        System.out.println("Should password contain numbers?\n0 = no\n1 = yes");
        n = sc.nextInt();
        if(n == 1){
            numbersIncluded = true;
        }

        System.out.println("Should password contain special signs?\n0 = no\n1 = yes");
        n = sc.nextInt();
        if(n == 1){
            special_signsIncluded = true;
        }


        signs.GenerateLetters(uppercase_lettersIncluded, polish_lettersIncluded, numbersIncluded, special_signsIncluded);
        password_toUse = signs.getString();
        for(int i = 0; i<10; i++) {
            generatedPassword = generator.generate(password_toUse, length);

            System.out.println("Generated password = \n" + generatedPassword);
        }

    }



}
