import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game {
  // TODO: ask if the following are allowed:
  // [ ] enums
  // [ ] regex pattern matching
  // [ ] printf
  private String Language = new String();
  private ArrayList<String> PlayingField = new ArrayList<String>();
  private Scanner input = new Scanner(System.in);
  private Pattern germanPattern = Pattern.compile(".*[dD][eE].*");
  private Pattern englishPattern = Pattern.compile(".*[eE][nN].*");
  private Pattern yesPattern = Pattern.compile(".*[yY][eE]?[sS]?.*");
  private Pattern noPattern = Pattern.compile(".*[nN][oO]?.*");
  private Pattern quitPattern = Pattern.compile(".*[qQ][uU][iI][tT]|[eE][xX][iI][tT]|[xX]|[qQ].*");
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
      Matcher germanMatcher = germanPattern.matcher(rawInput);
      Matcher englishMatcher = englishPattern.matcher(rawInput);
      Matcher quitMatcher = quitPattern.matcher(rawInput);

      if (germanMatcher.matches()) { // German has been selected
        Language = "de";
        System.out.println("Sie haben Deutsch als Sprache ausgewählt.");
        languageHasBeenSelected = true;
        break;
      } else if (englishMatcher.matches()) { // English has been selected
        Language = "en";
        System.out.println("You have chosen English as your language.");
        languageHasBeenSelected = true;
        break;
      } else if (quitMatcher.matches()) { // User wants to quit the game
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
      Matcher yesMatcher = yesPattern.matcher(rawInput);
      Matcher noMatcher = noPattern.matcher(rawInput);
      Matcher quitMatcher = quitPattern.matcher(rawInput);

      if (yesMatcher.matches()) { // User wants to change the language
        // Changing to the other language
        if (Language.equals("en")) {
          Language = "de";
        } else if (Language.equals("de")) {
          Language = "en";
        }
      } else if (noMatcher.matches()) { // User wants to keep using the same language
        languageHasBeenChanged = true;
        break;
      } else if (quitMatcher.matches()) { // User wants to quit the game
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
