public class MissingNumber {

    public static void main(String[] args) {
        int[] arr5 = {0,2,4,6,1,5};
        System.out.println(missingNumber(arr5));
    }

    public static int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int actualsum = nums.length*(nums.length+1)/2;
        sum=actualsum-sum;
        return sum;
    }
    
}
