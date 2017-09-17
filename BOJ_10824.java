import java.util.Scanner;  
  
public class pro_11655 {  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        String str = sc.nextLine();  
        char ch[]=str.toCharArray();  
        for(int i=0; i<ch.length; i++){  
            if(ch[i]>='a' && ch[i]<='m')  
                ch[i]+=13;  
            else if(ch[i]>='n' && ch[i]<='z')  
                ch[i]-=13;  
            else if(ch[i]>='A' && ch[i]<='M')  
                ch[i]+=13;  
            else if(ch[i]>='N'&& ch[i]<='Z')  
                ch[i]-=13;  
        }  
          
            System.out.println(ch);  
    }  
  
}  

