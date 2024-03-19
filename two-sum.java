class Solution {
    public int[] twoSum(int[] nums, int target) {
        int term = 0;
        int[] res = new int[2];
        
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                term = nums[i] + nums[j];
                if (term == target){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
    return res;
    }
}