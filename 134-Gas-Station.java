class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas=0,sumCost=0;
        for(int i:gas)  sumGas+=i;
        for(int i:cost)  sumCost+=i;
        if(sumGas<sumCost)  return -1;
        int total=0;
        int index=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            if(total<0){
                total=0;
                index=i+1;
            }
        }
        return index;
    }
}