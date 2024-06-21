import java.util.Scanner;
public class Persondata {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String Name = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter your score");
        double score = scanner.nextDouble();

        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);

    }
    
}
