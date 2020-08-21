package com.concur.hackerearth;
//import java.io.*;
//import java.util.*;
//
//
//public class TestClass {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//        int T = Integer.parseInt(br.readLine().trim());
//        for(int t_i=0; t_i<T; t_i++)
//        {   String[] arr_ =  br.readLine().split(" ");
//            int Array[] = new int[2];
//            for(int i=0;i<2;i++){
//                  Array[i] = Integer.parseInt(arr_[i]);
//            }
//            int N = Array[0];
//            int q = Array[1];
//            String[] arr_A = br.readLine().split(" ");
//            int[] A = new int[N];
//            
//            for(int i_A=0; i_A<arr_A.length; i_A++)
//            {
//            	A[i_A] = Integer.parseInt(arr_A[i_A]);
//            }
//          
//            String[] arr_query = br.readLine().split(" ");
//            int[] query = new int[q];
//            for(int i_query=0; i_query<arr_query.length; i_query++)
//            {
//            	query[i_query] = Integer.parseInt(arr_query[i_query]);
//            }
//            
//            int[] out_ = final_arr(A, query, q, N);
//            System.out.print(out_[0]);
//            for(int i_out_=1; i_out_<out_.length; i_out_++)
//            {
//            	System.out.print(" " + out_[i_out_]);
//            }
//            System.out.println("");
//         }
//
//         wr.close();
//         br.close();
//    }
//    static int[] final_arr(int[] A, int[] query, int q, int N){
//        // Write your code here
//        A = quicksort(A, 0,N);
//        for(int step : query) {
//            for(int x = step+1; x<A.length; x++) {
//                if(A[x]<A[step])
//                    A[x]=0;
//            }
//        }
//        return A;
//        
//    }
//    
//    static int[] quicksort(int A[], int lo, int hi) {
//        int p = 0;
//        if (lo<hi)
//            p = partition(A,lo,hi);
//        quicksort(A,lo,p-1);
//        quicksort(A, p+1, hi);
//        
//        return A;
//    }
//    
//    static int partition(int A[],int lo,int hi){
//        int pivot = A[hi];
//        int i = lo -1;
//        for(int j = lo; j<hi; j++) {
//            if(A[j]<pivot)
//            {
//                i++;
//                int temp = A[j];
//                A[j] = A[i];
//                A[i] = temp;
//            }
//        }
//        
//        int temp = A[hi];
//        A[hi] = A[i+1];
//        A[i+1] = temp;
//        
//        return (i+1);
//        
//    }
//}



import java.util.Arrays;
import java.util.List;

public class FindNthNodeFromLast {
    
    MyLinkedList<Integer> head;
    MyLinkedList<Integer> temp;
    
    public static void main(String [] args) {
         new FindNthNodeFromLast().createList(new Integer [] {1,2,3,4,5});
     new FindNthNodeFromLast().findNthNode(4);
    }

    private void findNthNode(int n) {
        MyLinkedList<Integer> temp1 = head;
        MyLinkedList<Integer> temp2 = head;
        
        int count = 1;
        
        while (temp1 != null && count != n + 1) {
            temp1 = temp1.next;
            count++;
        }
        
        if (temp1 == null) {
            System.out.println("Not a valid input");
        }
        else {
            while (temp1 != null) {
                temp2 = temp2.next;
                temp1 = temp1.next;
            }
            System.out.println(n+ " count node from end is: "+ temp2.info);
        }
    }

    private void createList(Integer[] integers) {

        Arrays.asList(integers).stream().forEach(inte -> {
            if (head == null) {
                head = new MyLinkedList(inte, null);
                temp = head;            
            }
            else {
                temp.next = new MyLinkedList(inte, null);
                temp = temp.next;
            }
            
        });
    }

    
}


class MyLinkedList<T> {
    
    T info;
    MyLinkedList next;
    
    MyLinkedList(T info, MyLinkedList next) {
        this.info = info;
        this.next = next;
    }
}