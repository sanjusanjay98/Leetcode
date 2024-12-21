class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int lcs[][] = new int[text1.length() + 1][text2.length() + 1];

        for(int rows = 1; rows <= text1.length(); rows++){
            for(int  cols = 1; cols <= text2.length(); cols++){
                if(text1.charAt(rows - 1) == text2.charAt(cols - 1))
                    lcs[rows][cols] = lcs[rows-1][cols-1]+1;
                
                else
                    lcs[rows][cols] = Math.max(lcs[rows-1][cols], lcs[rows][cols-1]);
            }
        }

        return lcs[text1.length()][text2.length()];
    }
}