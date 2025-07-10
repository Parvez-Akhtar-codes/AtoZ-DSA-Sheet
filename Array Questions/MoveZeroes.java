import java.util.Arrays;

public class MoveZeroes {
    
    public static void main(String[] args) {
        int[] arr4 = {0,1,0,3,12};
        System.out.println(Arrays.toString(movezero(arr4)));
    }
    public static int[] movezero(int[] nums){
        int size = nums.length;
         if(size==0 || size == 1){
             return nums;
         }
        int nz=0;
        int z=0;
        while (nz<size) {
            if(nums[nz]!=0){
                int temp = nums[nz];
                nums[nz]=nums[z];
                nums[z]=temp;
                nz++;
                z++;
            }else{
                nz++;
            }
        }
        return nums;
    }
}
