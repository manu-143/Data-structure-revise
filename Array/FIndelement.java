import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = scn.nextInt();
    }
    
    int d = scn.nextInt();
    int flag =0;
    for (int i=0;i<arr.length;i++){
        if(arr[i] == d){
            flag = 1;
            System.out.println(i);
            
            break;
        }
        
    }
    if(flag == 0){
        System.out.println("-1");
    }          

    
    
 }

}