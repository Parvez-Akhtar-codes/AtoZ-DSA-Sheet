public class MajorityElement {
    public static void main(String[] args) {
        int[] nums4 = {2,3,3,2,3,2,2};
        System.out.println(majorityelement(nums4));
    }

    public static int majorityelement(int[] nums){

        int count=0;
        int cand=0;
        for(int i =0;i<nums.length;i++){

            if(count==0){
                cand = nums[i];
            }

            if(cand==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return cand;

    //  int count = 1; // Start with 1 to include nums[0] itself
    //     for (int i = 1; i < nums.length; i++) {
    //         if (nums[0] == nums[i]) {
    //             count++;
    //         }
    //     }
    //     // Check if nums[0] really is the majority
    //     if (count > nums.length / 2) {
    //         return nums[0];
    //     } else {
    //         // If not, check for another possible majority element
    //         for (int i = 1; i < nums.length; i++) {
    //             int candidate = nums[i];
    //             int candidateCount = 0;
    //             for (int j = 0; j < nums.length; j++) {
    //                 if (nums[j] == candidate) {
    //                     candidateCount++;
    //                 }
    //             }
    //             if (candidateCount > nums.length / 2) {
    //                 return candidate;
    //             }
    //         }
    //         // If no majority found, return -1 or throw exception
    //         return -1;
    //     }
    }
}
