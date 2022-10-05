class Main {
  private static String title = """
  _______ _        _______           _______
 |__   __(_)      |__   __|         |__   __|
    | |   _  ___     | | __ _  ___     | | ___   ___
    | |  | |/ __|    | |/ _` |/ __|    | |/ _ \\ / _ \\
    | |  | | (__     | | (_| | (__     | | (_) |  __/
    |_|  |_|\\___|    |_|\\__,_|\\___|    |_|\\___/ \\___|
""";
  public static void main(String[] args) {
    System.out.println();
    System.out.println(title);

    PlayingField field = new PlayingField();

    field.setFieldToX(3);
    field.setFieldToO(5);
    field.print();
  }
}
