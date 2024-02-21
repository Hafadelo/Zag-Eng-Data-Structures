import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your text");
        String text = s.next();
        int freq[] = new int[26];
        for (int i = 0; i < text.length(); i++) {
            freq[hash(text.charAt(i))]++;
        }
        for (int i = 0; i < text.length(); i++) {
            int index = hash(text.charAt(i));
            if (freq[index] == 1) {
                System.out.println(text.charAt(i));
                break;
            }
        }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }

    public static int hash(int charr) {
        return charr - 'a';
    }
}