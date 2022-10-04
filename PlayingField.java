import java.util.ArrayList;

public class PlayingField {
  private static final String X = "X";
  private static final String Y = "Y";
  private static final String EMPTY = " ";

  private ArrayList<String> filed = new ArrayList<>();

  public PlayingField() {
    for (int i = 0; i < 10; i++) {
      filed.add(EMPTY);
    }
  }

  public String getFieldContent(int coordinate) {
    return filed.get(coordinate);
  }

  public void setFieldContent(int coordinate, String content) {
    filed.set(coordinate, content);
  }

  public String getFieldState() {
    return "";
  }

  public void print() {
  }
}
