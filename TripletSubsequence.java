class TripletSubsequence {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 0, 4};
        boolean result = increasingTriplet(nums);
        System.out.println("Has Increasing Triplet Subsequence: " + result);
    }

    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] <= first)
                first = nums[i];
            else if (nums[i] <= second)
                second = nums[i];
            else
                return true;
        }

        return false;
    }
}
