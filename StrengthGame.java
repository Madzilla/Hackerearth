package com.concur.hackerearth;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class StrengthGame {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testCases = br.readLine(); 
		long test = Integer.parseInt(testCases);

		while(test-- > 0 ) {

			String[] str = br.readLine().split(" ");
			int int1 =  0;
			double test1 = 0;
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			int s = Integer.parseInt(str[2]);
			double result = 0.0;

			for(int i =0;i<k;i++) {
				for(int x =0; x<=n;x++) {
					 int1 = int1+x ;
				}
				test1 = Math.pow(int1,k);
				int test12 = (int) test1;
				// Intialize all BigInteger Objects 
				BigInteger biginteger1 = new BigInteger(String.valueOf(int1)); 
				BigInteger biginteger2 = new BigInteger(String.valueOf(n+1)); 


				  
		        // perform modInverse operation on biginteger1 using biginteger2. 
		         result = (int1*(test12^-1))%(1e9+7);


			}
			System.out.println(result);

		}

	}
    static int modInverse(int a, int test1) 
    { 
        a = a % test1; 
        for (int x = 1; x < test1; x++) 
           if ((a * x) % test1 == 1) 
              return x; 
        return 1; 
    } 
}
