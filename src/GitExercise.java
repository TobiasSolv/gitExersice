import java.util.Scanner;

public class GitExercise {

    void go(){
        String userinput;
        System.out.println("It works!");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        userinput = in.nextLine();
        System.out.println("Hello, " + userinput);

    }

    public static void main(String[] args) {
        new GitExercise().go();
    }
}
