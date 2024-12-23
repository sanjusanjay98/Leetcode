class Solution {
    public int maximum69Number (int num) {
        char[] numArray = String.valueOf(num).toCharArray();
        
        for(int i = 0; i < numArray.length; i++) {
            if(numArray[i] == '6'){
                numArray[i] = '9';
                break;
            }
        }
        
        return Integer.parseInt(new String(numArray));
    }
}