// return the maximum number of consecutive 1's in the array
public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] binaryArray = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        int result = findMaxConsecutiveOnes(binaryArray);

        System.out.println("Maximum number of consecutive 1's: " + result);
    }
}
