class Solution {
    public int countPrimes(int n) {
       boolean[] notPrimes = new boolean [n];
		if (n <= 2) return 0;
		
		int count = 1; 
		
		for (int i = 3; i < n; i += 2) { 
			if (!notPrimes[i]) {
				count++;
				
				for (int j = 1; j*i < n; j++) { 
					notPrimes[j*i] = true;
				}
			}
		}
		
		return count;
    }
}