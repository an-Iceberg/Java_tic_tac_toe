import java.util.ArrayList;
import java.util.Scanner;

public class Game {
  private static final String X = "X"; // TODO: use these static consts
  // All loops are allowed

  // TODO: make program work WITHOUT regex
  // Allowed: foreach, while
  // Consider using iterators, maybe
  private String Language = new String();
  private ArrayList<String> PlayingField = new ArrayList<>();
  private Scanner input = new Scanner(System.in);
  /**
   * Field:
   * +---+---+---+
   * | 1 | 2 | 3 |
   * +---+---+---+
   * | 4 | 5 | 6 |
   * +---+---+---+
   * | 7 | 8 | 9 |
   * +---+---+---+
   */
  private String title = """
  _______ _        _______           _______
 |__   __(_)      |__   __|         |__   __|
    | |   _  ___     | | __ _  ___     | | ___   ___
    | |  | |/ __|    | |/ _` |/ __|    | |/ _ \\ / _ \\
    | |  | | (__     | | (_| | (__     | | (_) |  __/
    |_|  |_|\\___|    |_|\\__,_|\\___|    |_|\\___/ \\___|
""";

  public Game() {
    // Initialising the playing field
    PlayingField.add(" ");
    PlayingField.add(" ");
    PlayingField.add(" ");

    PlayingField.add(" ");
    PlayingField.add(" ");
    PlayingField.add(" ");

    PlayingField.add(" ");
    PlayingField.add(" ");
    PlayingField.add(" ");

    System.out.println(title);

    boolean languageHasBeenSelected = false;

    // Asking user for language
    do {
      System.out.print("Choose a language (de/en): ");

      // Getting user input
      String rawInput = input.nextLine();

      if (rawInput.contains("de")) { // German has been selected
        Language = "de";
        System.out.println("Sie haben Deutsch als Sprache ausgewählt.");
        languageHasBeenSelected = true;
        break;
      } else if (rawInput.contains("en")) { // English has been selected
        Language = "en";
        System.out.println("You have chosen English as your language.");
        languageHasBeenSelected = true;
        break;
      } else if (rawInput.contains("q") || rawInput.contains("x") || rawInput.contains("quit") || rawInput.contains("exit")) { // User wants to quit the game
        // TODO: quit the program
      }
      // If the user has not provided a satisfactory answer the program just keeps asking for a valid answer
    } while (!languageHasBeenSelected);

    System.out.println();
  }

  public void askForLanguageChange() {
    boolean languageHasBeenChanged = false; // TODO: rename this

    do {
      // Asking the user if they want to change the language in the current language
      if (Language.equals("en")) {
        System.out.print("Do you want to change the language? (y/n): ");
      } else if (Language.equals("de")) {
        System.out.print("Möchten Sie die Sprache wechseln? (y/n): ");
      }

      // Getting user input
      String rawInput = input.nextLine();

      if (rawInput.contains("y") || rawInput.contains("yes")) { // User wants to change the language
        // Changing to the other language
        if (Language.equals("en")) {
          Language = "de";
        } else if (Language.equals("de")) {
          Language = "en";
        }
      } else if (rawInput.contains("n") || rawInput.contains("no")) { // User wants to keep using the same language
        languageHasBeenChanged = true;
        break;
      } else if (rawInput.contains("q") || rawInput.contains("x") || rawInput.contains("quit") || rawInput.contains("exit")) { // User wants to quit the game
        // TODO: quit the program
      }

    } while (!languageHasBeenChanged);

    System.out.println();
  }

  public void printPlayingField() {
    askForLanguageChange();

    String playerName = new String("Player");

    if (Language.equals("de")) {
      playerName = "Spieler";
    }

    System.out.println("CPU: O | " + playerName + ": X");
    System.out.println("+---+---+---+");
    System.out.println("| 1 | 2 | 3 |");
    System.out.println("+---+---+---+---+");
    System.out.printf("| %s | %s | %s | a |\n", PlayingField.get(0), PlayingField.get(1), PlayingField.get(2));
    System.out.println("+---+---+---+---+");
    System.out.printf("| %s | %s | %s | b |\n", PlayingField.get(3), PlayingField.get(4), PlayingField.get(5));
    System.out.println("+---+---+---+---+");
    System.out.printf("| %s | %s | %s | c |\n", PlayingField.get(6), PlayingField.get(7), PlayingField.get(8));
    System.out.println("+---+---+---+---+");

    System.out.println();
  }

  public void checkForWinCondition() {
  }
}
