import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums3 = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortedColor(nums3)));
    }
    public static int[] sortedColor(int[] nums ){
        int count=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;

            }
            else if(nums[i]==1){
                count1++;
            }
            else if(nums[i]==2){
                count2++;
            }
        }
        
        for(int i=0;i<count;i++){
            nums[i]=0;
        }
        for(int i=count;i<count+count1;i++){
            nums[i]=1;
        }
        for(int i=count+count1;i<nums.length;i++){
            nums[i]=2;
        }
        return nums;
    }
}
