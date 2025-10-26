package day2;
//Better Approach
public class SortColors_Better {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }
        }

        for(int i=0; i<zero; i++){
            nums[i]=0;
        }

        int mid = zero+one;

        for(int i=zero; i<mid; i++){
            nums[i]=1;
        }

        for(int i=mid; i<nums.length; i++){
            nums[i]=2;
        }
    }

}
