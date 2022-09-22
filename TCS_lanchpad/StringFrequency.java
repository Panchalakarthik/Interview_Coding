package TCS_lanchpad;
import java.util.Scanner;
public class StringFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String key = sc.nextLine();
        String[] words = text.split(" ");
        int count = 0;
        // System.out.println(words.toString());

        for (int i = 0; i < words.length; i++) {
            String temp = words[i].toLowerCase();
            key = key.toLowerCase();

            if (temp.compareTo(key) == 0) {
                count++;
            }
        }

        if ( count > 0) {
            System.out.println(count);
        } else {

            System.out.println("Word not found.");
        }
      sc.close();
    }
}
