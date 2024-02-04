import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int amount = s.nextInt();
        QueueWithArray hotPotato = new QueueWithArray(amount);
        for (int i = 0; i < amount; i++) ;
        {
            String names = s.next();
            hotPotato.enqueue(names);
        }
        int tosses = s.nextInt();
        while (hotPotato.count > 1) {
            for (int i = 0; i < tosses - 1; i++)
                hotPotato.enqueue(hotPotato.dequeue());
            hotPotato.dequeue();
        }
        System.out.println("The winner is" + hotPotato.dequeue());

    }
}