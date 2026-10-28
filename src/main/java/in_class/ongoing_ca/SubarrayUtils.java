package in_class.ongoing_ca;

public class SubarrayUtils {

    /**
     * find the shortest subarray that sum is at least the target.
     *
     * @param numbers the array of positive integers
     * @param target the minimum required sum
     * @return the start and end, or {0} if none is found
     */
    public static int[] shortestSubarrayBruteForce(int[] numbers, int target) {
        int shortestLength = numbers.length + 1;
        int bestStart = -1;
        int bestEnd = -1;

        for (int start = 0; start < numbers.length; start++) {
            int sum = 0;

            for (int end = start; end < numbers.length; end++) {
                sum = sum + numbers[end];

                if (sum >= target) {
                    int length = end - start + 1;
                    if (length < shortestLength) {
                        shortestLength = length;
                        bestStart = start;
                        bestEnd = end;
                    }
                }
            }
        }
        if (bestStart == -1) {
            return new int[]{0};
        }

        return new int[]{bestStart, bestEnd};
    }
    /**
     * Find the shortest subarray that sum is at least the target
     * using two pointers.
     *
     * @param numbers the array of positive integers
     * @param target the minimum required sum
     * @return the start and end, or {0} if none is found
     */
    public static int[] shortestSubarrayTwoPointer(int[] numbers, int target) {
        int left = 0;
        int sum = 0;
        int shortestLength = numbers.length + 1;
        int bestStart = -1;
        int bestEnd = -1;

        for (int right = 0; right < numbers.length; right++) {
            sum = sum + numbers[right];

            while (sum >= target) {
                int length = right - left + 1;

                if (length < shortestLength) {
                    shortestLength = length;
                    bestStart = left;
                    bestEnd = right;
                }

                sum = sum - numbers[left];
                left++;
            }
        }
        if (bestStart == -1) {
            return new int[]{0};
        }
        return new int[]{bestStart, bestEnd};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 1, 2, 4, 3};

        int[] bruteForce = shortestSubarrayBruteForce(numbers, 7);
        int[] twoPointer = shortestSubarrayTwoPointer(numbers, 7);

        System.out.println("Brute force: " + bruteForce[0] + ", " + bruteForce[1]);
        System.out.println("Two pointer: " + twoPointer[0] + ", " + twoPointer[1]);

        int[] noResult = shortestSubarrayTwoPointer(numbers, 20);
        System.out.println("No result: " + noResult[0]);
    }
}