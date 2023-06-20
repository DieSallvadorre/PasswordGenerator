import java.util.Random;
public class Generator {

    public String generate(String signs, int length){
        Random rand = new Random();
        String password = "";
        int max_range = signs.length()-1;
        int los;

        for(int i = 0; i<length; i++){
            los = rand.nextInt(max_range);
            password += signs.charAt(los);
        }
        return password;
    }

}
