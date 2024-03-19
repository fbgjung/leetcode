class Solution {
    public int[] replaceElements(int[] arr) {
        int maxNum = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                maxNum = Math.max(arr[j],maxNum);
                arr[i] = maxNum;
            }
            maxNum = 0;
        }
        arr[arr.length-1] = -1;
        
        return arr;   
    }
}