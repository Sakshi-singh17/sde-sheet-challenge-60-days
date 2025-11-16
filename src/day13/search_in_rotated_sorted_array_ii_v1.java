class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return true;
            }

            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            //right sorted
            if(nums[mid]<=nums[high]){
                //target in sorted
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }
                //not in sorted
                else{
                    high=mid-1;
                }
            }
            //left sorted
            else{
                //target in sorted
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }
                 //not in sorted
                 else{
                    low=mid+1;
                 }

            }
        }
        return false;
    }
}