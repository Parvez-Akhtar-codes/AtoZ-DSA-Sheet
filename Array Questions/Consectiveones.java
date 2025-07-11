public class Consectiveones {
    public static void main(String[] args) {
        int[] arr6 = {1,0,1,1,0,1};
        System.out.println(Consectiveone(arr6));
    }

    public static int Consectiveone(int[] nums){
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            }else{
                count=count-count;
            }

        }
        return maxCount;

    }
    
}
