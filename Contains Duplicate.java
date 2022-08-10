class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> tracker = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (tracker.containsKey(nums[i])) {
                tracker.put(nums[i], tracker.get(nums[i])+1);
                if (tracker.get(nums[i]) >= 2) {
                    return true;
                }
            } else tracker.put(nums[i], 1);
        }
        return false;
    }
}
