public class SavingsCalculator {
    public static void main(String[] args) {
        int monthlyDeposit = 500;   // deposit every month
        int totalSavings = 0;       // initial savings
        int target = 5000;          // goal amount
        int month = 0;

        while (totalSavings < target) {
            month++;
            totalSavings += monthlyDeposit;  // add monthly deposit
            System.out.println("Month " + month + ": Total Savings = ₹" + totalSavings);
        }
    }
}
