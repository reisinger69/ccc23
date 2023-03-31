package reisinger.htl;

public class Main {
    //scheiß reisinger

    public static void main(String[] args) {
        countCells("O-O-O-O-O-O-O-O-O-O-\n" +
                "-O-O-O-O-O-O-O-O-O-O\n" +
                "O-O-O-O-O-O-O-O-O-O-\n" +
                "-O-O-O-O-O-O-O-O-O-O\n" +
                "O-O-O-O-O-O-O-O-O-O-\n" +
                "-O-O-O-O-O-O-O-O-O-O\n" +
                "O-O-O-O-O-O-O-O-O-O-\n" +
                "-O-O-O-O-O-O-O-O-O-O");
    }

    private static void countCells(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentC = input.charAt(i);
            if (currentC == 'O') {
                counter++;
            }
        }
        System.out.println("Cells: " + counter);
    }
}

