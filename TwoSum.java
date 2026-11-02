import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Map stores: value -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement has already been seen, return its index and current index
            if (map.containsKey(complement)) {
                return new int[]{ map.get(complement), i };
            }

            // Otherwise, store current value and its index
            map.put(nums[i], i);
        }

        return new int[]{}; // No pair found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]"); // Output: [0, 1]
    }
}
