    class Solution {
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> res = new HashSet<>();
        
            for(int i = 0;i<nums.length;i++){
                res.add(nums[i]);
            }
            int longest = 0;
            //start the sequence only if its the beginning
            //then what is the beginning
            //We can consider a number num as the start of a 
            //sequence if and only if num - 1 does not exist in the given array.
            for(int i = 0;i<nums.length;i++){
                if(!res.contains(nums[i]-1)){
                    int curr = nums[i];
                    int count = 1;
                    //expand forward
                    while(res.contains(curr+1)){
                        count++;
                        curr++;
                    }
                    longest = Math.max(longest,count);
                }
            }
            return longest;
        }
    }
