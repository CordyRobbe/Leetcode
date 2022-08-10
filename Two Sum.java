class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        
        for (int i = 0; i<nums.length;i++){
            if (result.containsKey(nums[i])){
                int a = result.get(nums[i]);
                return new int[]{a, i};
            } else result.put(target - nums[i], i);
        }
        return new int[2];
    }
}
