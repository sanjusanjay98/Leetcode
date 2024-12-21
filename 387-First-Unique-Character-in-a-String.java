class Solution {
    public int firstUniqChar(String s) {
        int strLen=s.length();
        Map<Character,Integer> hs=new HashMap<>();
        for(char ch:s.toCharArray())    hs.put(ch,hs.getOrDefault(ch,0)+1);
        for(int i=0;i<strLen;i++){
            int frequency=hs.get(s.charAt(i));
            if(frequency==1)    return i;
        }
        return -1;
    }
}