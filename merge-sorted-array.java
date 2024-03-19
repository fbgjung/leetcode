import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int index = m + n - 1;
        int indexN = n - 1;
        
        while(indexN >= 0){
            for (int i = m; i <= index; i++){
                nums1[i] = nums2[i-m];
            }
            indexN--;
        }
         Arrays.sort(nums1);
    }
}