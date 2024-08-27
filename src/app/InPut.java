package src.app;

import java.util.Scanner;

public class InPut {

    Scanner scanner;

    public InPut() {
        this.scanner = new Scanner(System.in);
    }

    public View.Message input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String sender = scanner.nextLine();
        System.out.print("Enter the message: ");
        String text = scanner.nextLine();

        return new View.Message(sender, text);
    }
    public void close() {
        scanner.close();
    }
}
