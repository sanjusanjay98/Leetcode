class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length()       ;
        if(n == k)  return true;
        if(n < k)   return false;
        int counts[] = new int[26];
        for(char ch : s.toCharArray())
            counts[ch - 'a']++;
        
        int oddCount = 0;
        for(int count : counts) {
            if(count % 2 == 1)
                oddCount++;
        }
        return oddCount <= k;
    }
}