import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /*  HashMap<Character,Integer> problem1 = new HashMap<>();
        String Ziad = "Manchester United is the best in the world";
        for (char z: Ziad.toCharArray()){
            if (!problem1.containsKey(z)) {
                problem1.put(z,1);
            }
            else {
                int value = problem1.get(z);
                value++;
                problem1.put(z,value);
         }

        }
        System.out.println(problem1);


    }
       */

        /* HashMap<Character, Integer> problem2 = new HashMap<>();
        String Ziad = "aaassskkkkdkkkgggllwww";
        for (char z : Ziad.toCharArray()) {
            if (!problem2.containsKey(z)) {
                problem2.put(z, 1);
            } else {
                int value = problem2.get(z);
                value++;
                problem2.put(z, value);
            }
        }
        for (char z : Ziad.toCharArray()) {
            int value = problem2.get(z);
            if (value == 1) {
                System.out.println(z);
                return;
            }
        }
        System.out.println("no nonrepeated character");
         */

      /*  HashMap<Object, Integer> problem3 = new HashMap<>();
        int maxValue = 0;
        Object key = null ;
        int[] Ziad = {1, 2, 3, 3, 3, 2, 1, 1, 3, 2, 1, 2, 2, 2, 1, 1, 1, 3};
        for (int z : Ziad) {
            if (!problem3.containsKey(z)) {
                problem3.put(z, 1);
            } else {
                int value = problem3.get(z);
                value++;
                problem3.put(z, value);
            }
        }
        for (int z : Ziad) {
            if (problem3.get(z) > maxValue) {
                maxValue = problem3.get(z);
                key = z ;
            }
        }
        System.out.println(key);
        O(n)
       */
    }
}