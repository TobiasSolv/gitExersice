import java.util.Scanner;

public class GitExercise {

    void go(){
        String userinput;
        int userinput2;
        Scanner in = new Scanner(System.in);
        System.out.println("It works!");

        System.out.print("Enter your name: ");
        userinput = in.nextLine();
        System.out.println("Hello, " + userinput);

        System.out.println();
        System.out.print("What is your age? ");
        userinput2 = in.nextInt();
        System.out.println("Your age is, " + userinput2);

        System.out.println("something");

    }

    public static void main(String[] args) {
        new GitExercise().go();
    }
}
