
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String reverseString(String s) {
        Stack<String> stack = new Stack<>();
        String reverse = "";
        for (int i = 0; i < s.length(); i++)
            stack.push(s.charAt(i));
        while (!stack.isEmpty())
            reverse += stack.pop();
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverseString("Ziad")) ;
    }

    }



