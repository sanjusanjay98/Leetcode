class Solution {
    public int addDigits(int num) {
        if(num==0)  return 0;
        while(num/10!=0){
            int sum=0;
            while(num/10!=0){
                sum+=(num%10);
                num/=10;
            }
            sum+=num;
            num=sum;
        }
        return num;
    }
}