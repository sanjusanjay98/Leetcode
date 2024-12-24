class Solution {
    public int alternateDigitSum(int n) {
        String str = Integer.toString(n);
        char[] numArray = str.toCharArray();
        int resultSum = 0;
        
        if(numArray.length % 2 == 0) {
            for(int i = 0; i < numArray.length; i += 2)
                resultSum += Integer.parseInt(String.valueOf(numArray[i])) - Integer.parseInt(String.valueOf(numArray[i + 1]));
        }
        else {
            for(int i = 0; i < numArray.length - 1; i += 2)
                resultSum += Integer.parseInt(String.valueOf(numArray[i])) - Integer.parseInt(String.valueOf(numArray[i + 1]));
            resultSum += Integer.parseInt(String.valueOf(numArray[numArray.length - 1]));
        }

        return resultSum;
    }
}