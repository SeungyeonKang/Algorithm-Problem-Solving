import java.util.Arrays;  
import java.util.Scanner;  
  
public class Main {  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        String str=sc.nextLine();  
        int N=str.length();  
        String str2[]=new String[N];  
          
        for(int i=0;i<N;i++){  
            str2[i]=str.substring(i, N); //i�ε������� N-1�ε������� �ڸ�  
        }  
          
        Arrays.sort(str2);  //�迭�� ������������ �������ִ� �޼ҵ�  
          
        for(int i=0;i<N;i++){  
            System.out.println(str2[i]);  
        }  
          
          
    }  
}  

