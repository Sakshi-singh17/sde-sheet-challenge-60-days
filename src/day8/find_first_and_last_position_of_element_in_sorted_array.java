class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        int start = binarySearch(nums, target, true);
        int end = binarySearch(nums, target, false);
        return new int[]{start,end};
    }

    private int binarySearch(int[]nums, int target, boolean findFirst){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                if(findFirst){
                    high = mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}