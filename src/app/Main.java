package src.app;

public class Main extends View {

    public static void main(String[] args) {

        View view = new View();
        View printer = new View();

        View.Message message = view.input();
        printer.print(message);

        view.close();
    }

}
