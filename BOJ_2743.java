import java.util.Scanner;  
  
public class pro_2743 {  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        String str = sc.next();  
        char ch[]=str.toCharArray();  
        int len=0;  
        for(int i:ch)  
            len++;  
          
        System.out.println(len);  
    }  
}  

