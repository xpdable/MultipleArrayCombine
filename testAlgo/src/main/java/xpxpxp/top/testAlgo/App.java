package xpxpxp.top.testAlgo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
////        System.out.println( "Hello World!" );
    	String[] A = {"A1","A2","A3","A4"};
    	String[] B = {"B1","B2","B3"};
    	String[] C = {"C1","C2"};
    	String[] D = {"D1","D2","D3","D4","D5"};
    	String[][] data = {A,B,C,D};
    	getNext("",data);

    	
	}
    
    public static void getNext(String str, String[][] arr){
    	String[] A = arr[0];
    	String[][] N = copyArray(arr);
    	
    	for ( int i = 0 ;  i < A.length; i++){
    		if( N instanceof String[][]){
    			getNext(str+"\t"+A[i],N);
    		}else{
    			System.out.println(str+"\t"+A[i]);
    		}
    	}
    	
    }
    
    public static String[][] copyArray(String[][] arr){
    		String[][] b = null;
    	 if(arr.length>1){  
            b  = new String[arr.length-1][];  
             for(int i=1;i<arr.length;i++){  
                 b[i-1] = arr[i];  
             }  
         }  
    	 return b;  
    }
}
