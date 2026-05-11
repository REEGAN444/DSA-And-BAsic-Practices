public class WaterTank {
    public static void main(String[] args) {
        int tankCapacity = 100;   // total capacity in liters
        int inflowRate = 10;      // liters per minute
        int filled = 0;           // current filled amount
        int minutes = 0;

        while (filled < tankCapacity) {
            minutes++;
            filled += inflowRate;
            System.out.println("Minute " + minutes + ": Tank filled = " + filled + " liters");
        }
    }
}

