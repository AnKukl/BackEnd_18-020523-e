import java.util.Scanner;

public class Game {
    private MessagePrinter massagePrinter;
    private Scanner scanner;

    private static int points;


    public Game(MessagePrinter massagePrinter, Scanner scanner) {
        this.massagePrinter = massagePrinter;
        this.scanner = scanner;
    }

    public static int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void start(Field field) {

        massagePrinter.printInfo();
        shotTheShip(field);
    }

    public void shotTheShip(Field field) {
        for (int i = 0; i < 10; i++) {


            massagePrinter.printNumber();
            int row = scanner.nextInt();


            if (row < 9) {
                massagePrinter.printSecondNumber();
            } else {
                System.out.println("Введите число меньше длины игрового поля");
                massagePrinter.printNumber();
                row = scanner.nextInt();
            }


            int column = scanner.nextInt();
            if (column < 9) {

            } else {
                System.out.println("Введите число меньше длины игрового поля");
                massagePrinter.printSecondNumber();
                column = scanner.nextInt();
            }

            boolean result = field.checkCell(row, column);


            if (result) {
                points += 1;
                massagePrinter.printWinMessage();
                massagePrinter.printPoints();
            } else {
                massagePrinter.printLoseMessage();
                massagePrinter.printPoints();
            }
            if (i < 9) {
                System.out.println(field);
            }
        }
    }
}
