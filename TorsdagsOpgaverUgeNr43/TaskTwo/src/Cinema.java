

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];
        this.seats[0][0] = "X"; // Initialize the director's seat
        // Initialize all other seats to "O"
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                if (i != 0 || j != 0) { // Skip the director's seat
                    this.seats[i][j] = "O";
                }
            }
        }
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, its value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        if (row >= 0 && row < seats.length && seat >= 0 && seat < seats[row].length) {
            if (seats[row][seat].equals("O")) {
                seats[row][seat] = "X";
                return true;
            }
        }
        return false; // If seat is out of bounds or already reserved
    }

    public boolean cancelReservation(int row, int seat) {
        if (row >= 0 && row < seats.length && seat >= 0 && seat < seats[row].length) {
            if (seats[row][seat].equals("X")) { // Check for "X" instead of "x"
                seats[row][seat] = "O";
                return true;
            }
        }
        return false; // If seat is out of bounds or not reserved
    }

    public String toString() {
        String result = ""; // Initialize to an empty string
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
