class Solution {
    public int missingNumber(int[] nums) {
        int missing = 0;
        boolean[]hash = new boolean[nums.length+1];
        for(int i=0; i<nums.length; i++){
            int index = nums[i];
            hash[index]=true;
        }

        for(int i=1; i<=nums.length; i++){
            if(!hash[i]){
                missing = i;
            }
        }
        return missing;
    }
}