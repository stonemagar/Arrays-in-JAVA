// Find Numbers with Even Number of Digits
public class NumbersWithEvenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 67, 8901, 12345};

        int count = findNumbersWithEvenDigits(nums);
        
        System.out.println("The count of numbers with an even number of digits is: " + count);
    }

    static int findNumbersWithEvenDigits(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean hasEvenDigits(int num) {
        int digitCount = 0;

        while (num != 0) {
            num /= 10;
            digitCount++;
        }

        return digitCount % 2 == 0;
    }

}
    

