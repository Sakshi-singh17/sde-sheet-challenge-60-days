class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high=nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }

            //right is sorted
            if(nums[mid]<=nums[high]){
                //target present in sorted
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }
                //target not present in sorted
                else{
                    high=mid-1;
                }
            }
            //left is sorted
            else{
                //target present in sorted
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }
                //target not present in sorted
                else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}