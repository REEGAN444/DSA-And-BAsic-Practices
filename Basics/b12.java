//EvenOddCount
public class b12 {
    public static void main(String[] args) {
        // Hardcoded array
        int[] arr = {12, 45, 23, 68, 34, 9, 10};

        int evenCount = 0;
        int oddCount = 0;

        // Loop through array and count even and odd numbers
        for(int num : arr) {
            if(num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}