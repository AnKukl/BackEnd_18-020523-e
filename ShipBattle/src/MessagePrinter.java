public class MessagePrinter {

    public void printInfo() {
        System.out.println("Игра началась");
        System.out.println("..............");
    }

    public void printNumber() {
        System.out.println("Введите число: ");
    }

    public void printSecondNumber() {
        System.out.println("Введите второе число: ");
    }

    public void printWinMessage() {
        System.out.println("Nice shot!");
    }

    public void printLoseMessage() {
        System.out.println("Shame on you!");
    }

    public void printPoints() {
        System.out.println("Текущее количество баллов: " + Game.getPoints());
    }


}
