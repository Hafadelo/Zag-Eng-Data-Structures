
public class Main {
    public static void main(String[] args) {
        }

        public static Integer  ReversedNumber ( int number) {
            int reverse = 0;
            int remainder ;
            while (number != 0) {
                remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }
            return reverse ;
        }

        public static int RandomValue ( int number) {
        return (int)(Math.random()*(number+1));
        }

        public static int RandomMaxAndMin ( int max , int min) {
        return (int)((Math.random()*(max - min ))+min);
    }

        public static char RandomCharacter () {
        return (char)((Math.random()*(90-65))+65);
        }

        public static <T> void PrintArray(T [] array) {
        for(int i=0 ; i< array.length;i++)
            System.out.println(array[i]);
        }
    }
