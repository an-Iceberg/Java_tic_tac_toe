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

  private ArrayList<String> field = new ArrayList<>();

  public PlayingField() {
    for (int i = 0; i <= 9; i++) {
      this.field.add(EMPTY);
    }
  }

  public String getFieldContent(int coordinate) {
    return this.field.get(coordinate);
  }

  public void setFieldToX(int coordinate) {
    this.field.set(coordinate, X);
  }

  public void setFieldToO(int coordinate) {
    this.field.set(coordinate, O);
  }

  public void setFieldToEmpty(int coordinate) {
    this.field.set(coordinate, EMPTY);
  }

  public String getFieldState() {
    return "";
  }

  public void print() {
    System.out.println("╔═══╦═══╦═══╗");
    System.out.printf("║ %s ║ %s ║ %s ║\n", this.field.get(0), this.field.get(1), this.field.get(2));
    System.out.println("╠═══╬═══╬═══╣");
    System.out.printf("║ %s ║ %s ║ %s ║\n", this.field.get(3), this.field.get(4), this.field.get(5));
    System.out.println("╠═══╬═══╬═══╣");
    System.out.printf("║ %s ║ %s ║ %s ║\n", this.field.get(6), this.field.get(7), this.field.get(8));
    System.out.println("╚═══╩═══╩═══╝");
  }
}
