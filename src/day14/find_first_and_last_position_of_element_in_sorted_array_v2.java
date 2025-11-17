class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        int start = findStart(nums, target);
        int end = findEnd(nums, target);
        return new int[]{start,end};
    }

    private int findStart(int[]nums, int target){
        int low = 0;
        int high = nums.length-1;
        int start = -1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                start = mid;
                high = mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return start;
    }

    private int findEnd(int[]nums, int target){
        int low = 0;
        int high = nums.length-1;
        int end = -1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                end=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return end;
    }
}