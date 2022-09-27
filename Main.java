import java.util.ArrayList;

class Game {
  private ArrayList<Integer> PlayingField = new ArrayList<Integer>();

  public Game() {
    PlayingField.add(0);
    PlayingField.add(0);
    PlayingField.add(0);

    PlayingField.add(0);
    PlayingField.add(0);
    PlayingField.add(0);

    PlayingField.add(0);
    PlayingField.add(0);
    PlayingField.add(0);
  }

  public void printPlayingField() {
    System.out.println("+---+---+---+---+");
    System.out.println("| 1 | 2 | 3 |   |");
    System.out.println("+---+---+---+---+");
    System.out.println("|   |   |   | a |");
    System.out.println("+---+---+---+---+");
    System.out.println("|   |   |   | b |");
    System.out.println("+---+---+---+---+");
    System.out.println("|   |   |   | c |");
    System.out.println("+---+---+---+---+");
  }

  public static void main(String[] args) {
    Game game = new Game();

    game.printPlayingField();
  }
}
