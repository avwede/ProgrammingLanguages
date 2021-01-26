import java.util.Arrays;
import java.util.Scanner;

public class p1059A{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        int n = scan.nextInt();
        int L = scan.nextInt();
        int a = scan.nextInt();
        boolean [] time = new boolean [L];
     
        for (int i = 0; i <n; i++){
            int minutes = scan.nextInt();
            int service = scan.nextInt();
            
            for (int j = minutes; j < minutes + service; j++){
                time [j]= true;
                
            }
        }
        int curr =0;
        int answer = 0;
        
        for (int i = 0; i <L; i++){
            if (!time[i]){
                curr++;
            } else { 
                answer += curr/a;
                curr = 0;
            }
        }
        answer += curr / a ;
        System.out.println (answer);
            }
        }