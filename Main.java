import java.util.ArrayList;

class Game {
  private String Language = new String();
  private ArrayList<String> PlayingField = new ArrayList<String>();

  public Game() {
    PlayingField.add(" ");
    PlayingField.add(" ");
    PlayingField.add(" ");

    PlayingField.add(" ");
    PlayingField.add(" ");
    PlayingField.add(" ");

    PlayingField.add(" ");
    PlayingField.add(" ");
    PlayingField.add(" ");

    // TODO: ask user for language and accept input
  }

  public void printPlayingField() {
    System.out.println("+---+---+---+---+");
    System.out.println("| 1 | 2 | 3 |   |");
    System.out.println("+---+---+---+---+");
    System.out.println(String.format("| %s | %s | %s | a |", PlayingField.get(0), PlayingField.get(1), PlayingField.get(2)));
    System.out.println("+---+---+---+---+");
    System.out.println(String.format("| %s | %s | %s | b |", PlayingField.get(3), PlayingField.get(4), PlayingField.get(5)));
    System.out.println("+---+---+---+---+");
    System.out.println(String.format("| %s | %s | %s | c |", PlayingField.get(6), PlayingField.get(7), PlayingField.get(8)));
    System.out.println("+---+---+---+---+");
  }

  public void checkWinCondition() {
  }

  public static void main(String[] args) {
    Game game = new Game();

    game.printPlayingField();
  }
}
