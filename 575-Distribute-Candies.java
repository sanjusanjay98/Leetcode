class Solution {
    public int distributeCandies(int[] candyType) {
        int typeLen=candyType.length/2;
        Set<Integer> s = new HashSet<>();
        for(int i:candyType){
            s.add(i);
            if(s.size()>=typeLen){
                return typeLen;
            }
        }
        return s.size();
    }
}
