class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);

        for(int i = 2; i * i < n; i++){
            if(prime[i] == true){
                for(int p = i*i; p < n; p+=i){
                    prime[p] = false;
                }
            }
        }

        int primeCount = 0;
        for(int i = 2; i < n; i++){
            if(prime[i] == true)   primeCount++;
        }
        return primeCount;
    }
}