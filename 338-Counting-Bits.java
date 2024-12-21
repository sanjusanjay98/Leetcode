class Solution {
    public int[] countBits(int n) {
        int[] bitsCount=new int[n+1];
        for(int i=0;i<=n;i++){
            bitsCount[i]=Integer.bitCount(i);
        }
        return bitsCount;
    }
}