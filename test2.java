import java.util.HashMap;

public class test2 {
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the difference and its corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the difference
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }
        
        // If no solution is found (shouldn't happen based on the problem description)
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Result: [" + result1[0] + ", " + result1[1] + "]");

        // Example 2
        int[] nums2 = {2,5,5,11};
        int target2 = 10;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Result: [" + result2[0] + ", " + result2[1] + "]");

        // Example 3
        int[] nums3 = {3,2,3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Result: [" + result3[0] + ", " + result3[1] + "]");
    }
}
