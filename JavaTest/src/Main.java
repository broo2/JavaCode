import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from the IntelliJ IDE");
        System.out.println("update 1 for Git test");

        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while(isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song of repeat?  If so, answer yes");

            String userInput = input.next();
            if(userInput.equals("yes")) {
                isOnRepeat = false;
            }
            System.out.println("Playing next song...");
        }
    }
}
