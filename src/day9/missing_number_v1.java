class Solution {
    public int missingNumber(int[] nums) {
       int missing = 0;
       int n = nums.length;
       int sum = (n*(n+1))/2;
       int arraySum = 0;
       for(int i=0; i<n; i++){
        arraySum+=nums[i];
       }

       return sum - arraySum;
    }
}