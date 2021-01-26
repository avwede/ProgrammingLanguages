import java.util.*;
import java.lang.*;
import java.io.*;

class pAnomalies {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
        int [] v = new int [a];
        
        for (int q = 0; q<a; q++){
        v[q] = in.nextInt();
        
        }
        int count = 0;
        
        for (int i = 0; i<a; i++){
            boolean anomaly = true;
            
            for (int j = 0; j<a; j++){
                if ((i != j) && (Math.abs(v[j] - v[i]) <= b)){
                    anomaly = false;
                }
            }
            if (anomaly == true){
                count++;
            }
        }
        System.out.println(count);
	}
}
