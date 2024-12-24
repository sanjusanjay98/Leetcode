class Solution {
    public int splitNum(int num) {
        String numString = Integer.toString(num);
        char[] numArray = numString.toCharArray();
        Arrays.sort(numArray);

        int firstSum = 0, secondSum = 0, resultSum = 0;

        if(numArray.length % 2 == 0) {
            for(int i = 0; i < numArray.length; i += 2){
                firstSum = firstSum * 10 + Integer.parseInt(String.valueOf(numArray[i]));
                secondSum = secondSum * 10 + Integer.parseInt(String.valueOf(numArray[i + 1]));
            }
            resultSum = firstSum + secondSum;
        }

        else {
            for(int i = 0; i < numArray.length - 1; i += 2){
                firstSum = firstSum * 10 + Integer.parseInt(String.valueOf(numArray[i]));
                secondSum = secondSum * 10 + Integer.parseInt(String.valueOf(numArray[i + 1]));
            }
            firstSum = firstSum * 10 + Integer.parseInt(String.valueOf(numArray[numArray.length - 1]));
            resultSum = firstSum + secondSum;
        }
        return resultSum;
    }
}