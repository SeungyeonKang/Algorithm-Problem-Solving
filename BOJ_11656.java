import java.util.Arrays;  
import java.util.Scanner;  
  
public class Main {  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        String str=sc.nextLine();  
        int N=str.length();  
        String str2[]=new String[N];  
          
        for(int i=0;i<N;i++){  
            str2[i]=str.substring(i, N); //i인덱스부터 N-1인덱스까지 자름  
        }  
          
        Arrays.sort(str2);  //배열을 오름차순으로 정리해주는 메소드  
          
        for(int i=0;i<N;i++){  
            System.out.println(str2[i]);  
        }  
          
          
    }  
}  

