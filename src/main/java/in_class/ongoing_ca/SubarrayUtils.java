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
}