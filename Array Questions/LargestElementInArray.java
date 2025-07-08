
import java.util.*;
 class LargestElementInArray {
    public static int largestElement(int[] nums){
        int largest = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[6];
        System.out.println("Vaues for array : ");
        for (int i = 0; i < nums.length; i++) {
            
            nums[i] = sc.nextInt();
        }
        // System.out.println("the given array is : ");
        //  for (int i = 0; i < nums.length; i++) {
            
        //     System.out.println(nums[i]);
        // }




        int largestElement = largestElement(nums);
        System.out.println("Largest element in this array is : ");
        System.out.println(largestElement);
        sc.close();
        
        
    }
}
