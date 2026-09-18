class Solution {
    public int maxSubarraySumCircular(int[] A) {

        int n = A.length;

        int max_straight_sum = Integer.MIN_VALUE;
        int min_straight_sum = Integer.MAX_VALUE;

        int array_SUM = 0;

        int temp_maxSUM = 0;
        int temp_minSUM = 0;

        for (int i = 0; i < n; i++) {

            array_SUM += A[i];

            // Maximum subarray sum
            temp_maxSUM += A[i];

            if (temp_maxSUM > max_straight_sum) {
                max_straight_sum = temp_maxSUM;
            }

            if (temp_maxSUM < 0) {
                temp_maxSUM = 0;
            }

            // Minimum subarray sum
            temp_minSUM += A[i];

            if (temp_minSUM < min_straight_sum) {
                min_straight_sum = temp_minSUM;
            }

            if (temp_minSUM > 0) {
                temp_minSUM = 0;
            }
        }

        // If all elements are negative
        if (array_SUM == min_straight_sum) {
            return max_straight_sum;
        }

        // Normal maximum vs circular maximum
        return Math.max(
            max_straight_sum,
            array_SUM - min_straight_sum
        );
    }
}