public class SingleNumber {
    public static void main(String[] args) {
        int[] arr7 = {2,2,1};
        System.out.println(singlenumber(arr7));
    }
    public static int singlenumber(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
           count = count ^ nums[i];
        }
        return count;
    }
    
}
