class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int prod = 1;
        for(int i = 0;i<nums.length;i++){
            prod = prod*nums[i];
        }
        prefix[0] = 1;
        int p = nums[0];
        for(int i = 1;i<nums.length;i++){
            prefix[i] = p;
            p = p*nums[i];
        }
        int[] suffix = new int[nums.length];
        suffix[nums.length-1] = 1;
        for(int i = nums.length-2;i>=0;i--){
            suffix[i] = nums[i+1]*suffix[i+1];

        }
            int[] ans = new int[nums.length];
             for(int i = 0; i < nums.length; i++){
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;

    }
}  
