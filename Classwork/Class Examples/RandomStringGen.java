import java.util.Random;
public class RandomStringGen {
    public static void main(String[] args) {
        Random random = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt();
            char c = alphabet.charAt(index);
            sb.append(c);
        }
        //System.out.println(c+" c");
        System.out.println(sb);
    }
}



