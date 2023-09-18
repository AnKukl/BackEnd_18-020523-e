import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FieldGenerator fieldGenerator = new FieldGenerator();
        Field field = fieldGenerator.generateField();
        MessagePrinter messagePrinter = new MessagePrinter();
        Scanner scanner = new Scanner(System.in);

        System.out.println(field);

        Game game = new Game(messagePrinter, scanner);
        game.start(field);
    }
}