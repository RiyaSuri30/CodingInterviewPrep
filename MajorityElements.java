class Solution {
    public int majorityElement(int[] nums) {
        // the concept of majority elements is as follows
        // when the array elements are sorted the majority element will always be at the middle
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
