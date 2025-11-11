package day5;
//540. Single Element in a Sorted Array
public class Single_Element{
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(nums.length==1 ||nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }

        int l=1;
        int h=n-2;
        while(l<=h){
            int mid=(l+h)/2;

            //if mid is single
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            //in left half so eleminate left half
            else if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2==1 && nums[mid]==nums[mid-1])){
                //single is in right half
                l=mid+1;
            }
            //in right half so eleminate right half
            else{
                //singe is in left half
                h=mid-1;
            }
        }
        return -1;
    }
}
