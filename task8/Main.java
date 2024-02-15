import java.util.Scanner;
import java.util.NoSuchElementException;

// remove comments from every code to make it work
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       /* System.out.print("Enter the number of elements");
        int N = s.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter the max number");
        int M = s.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the array");
            arr[i] = s.nextInt();
            if (arr[i] > M)
                throw new NoSuchElementException("bigger than max");
        }
        frequancy(N, M, arr); */

        //---------------prob2-----------------

        /* String input = s.next() ;
        int [] freq = new int[26] ;
        for (int i = 0 ; i<input.length();i++)
            freq[input.charAt(i) - 'a']++;
        for (int i = 0 ;i<freq.length;i++)
            if (freq[i]!=0)
                System.out.println((char)(i + 'a') + " : " + freq[i]); */

        //------------------------prob3---------------------------------

       /* String S = "aahhhsokuuunnnmmzzz";
        int[] freqArray = new int[26];
        for (int i = 0; i < S.length(); i++)
            freqArray[S.charAt(i) - 'a']++;
        char[] sortedChars = new char[S.length()];
        int index = 0;
        for (int i = 0; i < freqArray.length; i++) {
            char c = (char) (i + 'a');
            for (int j = 0; j < freqArray[i]; j++) {
                sortedChars[index++] = c;
            }
        }
        for (int i = 0 ; i<sortedChars.length;i++)
            System.out.print(sortedChars[i]); */
    }


    public static void frequancy(int N, int M, int[] a) {
        int[] count = new int[M + 1];
        for (int i = 0; i < N; i++) {
            count[a[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            System.out.println(count[i]);
        }

    }
}
