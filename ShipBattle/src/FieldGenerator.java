import java.util.Random;

public class FieldGenerator {
    final static Random random = new Random();

    public Field generateField() {
        Cell[][] cells = new Cell[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int number = random.nextInt(100);
                boolean isShip = (number < 10);
                cells[i][j] = new Cell(isShip);

            }
        }
        Field field = new Field(cells);
        return field;

    }

}
