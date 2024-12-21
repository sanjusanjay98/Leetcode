class Solution {
    public int maxChunksToSorted(int[] arr) {
        int numValue=0, chunk=0;
        for(int i = 0; i < arr.length; i++){
            numValue = Math.max(numValue, arr[i]);
            if(numValue == i) chunk++;
        }
        return chunk;
    }
}