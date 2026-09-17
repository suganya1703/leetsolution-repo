class Solution {
    public int maxSubarraySumCircular(int[] A) {

        int n = A.length;

        int max_straight_SUM = Integer.MIN_VALUE;
        int min_straight_SUM = Integer.MAX_VALUE;

        int array_SUM = 0;

        int temp_maxSUM = 0;
        int temp_minSUM = 0;

        for (int i = 0; i < n; i++) {

            array_SUM += A[i];

            // Maximum subarray sum
            temp_maxSUM += A[i];

            if (temp_maxSUM > max_straight_SUM) {
                max_straight_SUM = temp_maxSUM;
            }

            if (temp_maxSUM < 0) {
                temp_maxSUM = 0;
            }

            // Minimum subarray sum
            temp_minSUM += A[i];

            if (temp_minSUM < min_straight_SUM) {
                min_straight_SUM = temp_minSUM;
            }

            if (temp_minSUM > 0) {
                temp_minSUM = 0;
            }
        }

        // If all elements are negative
        if (array_SUM == min_straight_SUM) {
            return max_straight_SUM;
        }

        // Normal maximum vs circular maximum
        return Math.max(
            max_straight_SUM,
            array_SUM - min_straight_SUM
        );
    }
}