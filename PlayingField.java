import java.util.ArrayList;

public class PlayingField {
  private static final String X = "X";
  private static final String O = "O";
  private static final String EMPTY = " ";

  // ┏ ┓ ┗ ┛ ┃ ┳ ┻ ╋ ┫ ┣ ━
  // ┌ ┐ └ ┘ │ ├ ┤ ┬ ┴ ┼ ─
  // ═ ║ ╔ ╗ ╚ ╝ ╠ ╣ ╦ ╩ ╬

  /**
   *  ┌───┬───┬───┐ ┏━━━┳━━━┳━━━┓ ╔═══╦═══╦═══╗
   *  │ 1 │ 2 │ 3 │ ┃ 1 ┃ 2 ┃ 3 ┃ ║ 1 ║ 2 ║ 3 ║
   *  ├───┼───┼───┤ ┣━━━╋━━━╋━━━┫ ╠═══╬═══╬═══╣
   *  │ 4 │ 5 │ 6 │ ┃ 4 ┃ 5 ┃ 6 ┃ ║ 4 ║ 5 ║ 6 ║
   *  ├───┼───┼───┤ ┣━━━╋━━━╋━━━┫ ╠═══╬═══╬═══╣
   *  │ 7 │ 8 │ 9 │ ┃ 7 ┃ 8 ┃ 9 ┃ ║ 7 ║ 8 ║ 9 ║
   *  └───┴───┴───┘ ┗━━━┻━━━┻━━━┛ ╚═══╩═══╩═══╝
   */

  private ArrayList<String> filed = new ArrayList<>();

  public PlayingField() {
    for (int i = 0; i <= 9; i++) {
      filed.add(EMPTY);
    }
  }

  public String getFieldContent(int coordinate) {
    return filed.get(coordinate);
  }

  public void setFieldToX(int coordinate) {
    filed.set(coordinate, X);
  }

  public void setFieldToO(int coordinate) {
    filed.set(coordinate, O);
  }

  public void setFieldToEmpty(int coordinate) {
    filed.set(coordinate, EMPTY);
  }

  public String getFieldState() {
    return "";
  }

  public void print() {
    System.out.println("╔═══╦═══╦═══╗");
    System.out.printf("║ %s ║ %s ║ %s ║\n", filed.get(0), filed.get(1), filed.get(2));
    System.out.println("╠═══╬═══╬═══╣");
    System.out.printf("║ %s ║ %s ║ %s ║\n", filed.get(3), filed.get(4), filed.get(5));
    System.out.println("╠═══╬═══╬═══╣");
    System.out.printf("║ %s ║ %s ║ %s ║\n", filed.get(6), filed.get(7), filed.get(8));
    System.out.println("╚═══╩═══╩═══╝");
  }
}
