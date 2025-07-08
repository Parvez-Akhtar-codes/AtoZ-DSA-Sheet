public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(DuplicateElement(nums1));        
    }

    public static int DuplicateElement(int[] nums1){
        int count=0;
        for(int i=1;i<nums1.length;i++){
            if(nums1[count]!=nums1[i]){
                nums1[count+1] = nums1[i];
                count++;
            }
        }
        return count+1;
        // for(int i=0;i<nums1.length;i++){
        //     if(i<nums1.length-1 && nums1[i]==nums1[i+1]){
        //         continue;
        //     }
        //     else {
        //         nums1[count]=nums1[i];
        //         count++;
        //     }
        // }
        // return count;
    }
    
}
