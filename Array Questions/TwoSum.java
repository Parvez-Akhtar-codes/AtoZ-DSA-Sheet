import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr9 = {3,2,4,5,1};
        int target = 8;
        System.out.println(Arrays.toString(twosumofarray(arr9, target)));
    }

    public static int[] twosumofarray(int[] nums , int target){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            int req= target-nums[i];
            if(hm.containsKey(req)){
                int[] nums2 = {hm.get(req),req};
                return nums2;
            }
            hm.put(nums[i], i);

        }
        return null;

    }
}
