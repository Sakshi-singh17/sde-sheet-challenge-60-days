package day2;
//31. Next Permutation
public class NexTPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        //finding the break point
        int index = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }

        //if no break point is present
        if(index==-1){
            rev(nums,  0, n-1);
            return;
        }

        //finding next greater element
        for(int i=n-1; i>=index; i--){
            if(nums[i]>nums[index]){
                swap(nums, i, index);
                break;
            }
        }

        //sorting the rest elements
        rev(nums, index+1, n-1);
    }

    public void swap(int[]nums, int i, int index){
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }

    public void rev(int[]nums, int start, int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}
