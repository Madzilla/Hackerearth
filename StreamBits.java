package com.concur.hackerearth;

import java.io.*;
import java.util.*;


public class StreamBits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         long X = Long.parseLong(br.readLine().trim());
         long T = Long.parseLong(br.readLine().trim());
         int N = Integer.parseInt(br.readLine().trim());
         long[] arr = new long[N];
         for(int i_arr=0; i_arr<arr.length; i_arr++)
         {
         	String arr_arr = br.readLine();
         	arr[i_arr] = Long.parseLong(arr_arr);
         }

         long out_ = solve(X, arr, T);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static long solve(long X, long[] arr, long T){
        // Write your code here
        ArrayList<Long> sentBits = new ArrayList<>();
    	long sum = 0;
    	long notSent =0;
    	int timeSoFar =0;
    	for(int i =0;i<arr.length; i++) {
    		sum += arr[i];
    		timeSoFar++ ;
    		if( timeSoFar < T && sum < X)
    		{
    			sentBits.add(arr[i]);
    		}
    		else if(timeSoFar < T && sum > X)
    		{
    			sentBits.add((long) 0);
    			sentBits.add(arr[i]);
    		}
    		else if(timeSoFar == T)
    			timeSoFar = 0;
    		
    		for( long x : sentBits)
    		{
    			if(x ==0)
    				notSent++;
    		}
    	}
    	return notSent;
    	
    
    }
    
}