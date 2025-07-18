import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args){
        int[] arr3 = {9};
        System.out.println(Arrays.toString(plusone(arr3)));
    }
    // public static int[] PlusOne(int[] nums){
    //     int result = 0;
    //     for(int i=0;i<nums.length;i++){
    //          result = result * 10+ nums[i] ;
    //     }
    //     result=result+1;

    //     int newLength = (int)Math.log10(result) + 1;
    //     int[] ans = new int[newLength];
    //     int divisor = (int)Math.pow(10, newLength - 1);
    //     for (int i = 0; i < newLength; i++) {
    //         ans[i] = result / divisor;
    //         result = result % divisor;
    //         divisor = divisor / 10;
    //     }
    //     return ans;

    // }

    public static int[] plusone(int[] nums){
        int n= nums.length;

        for(int i = n-1; i>=0;i--){
            if(nums[i]<9){
                nums[i]++;
                return nums;
            }
            nums[i]=0;
        }
        int[] newnumber = new int [n+1];
        newnumber[0]=1;
        return newnumber;
    }
    
}
