import java.util.*;  
public class p11726_2xn {  
    static int d[];  
      
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        int n=sc.nextInt();  
        d=new int[n+1];  
        int result = count(n);  
        System.out.println(result);  
    }  
      
    static int count(int n){  
        if(n==1){  
            d[n]=1;  
            return d[n];  
        }  
        if(n==2){  
            d[n]=2;  
            return d[n];  
        }  
        if(d[n-1]==0)  
            d[n-1]=count(n-1);  
        if(d[n-2]==0)  
            d[n-2]=count(n-2);  
        d[n]=(d[n-1]+d[n-2])%10007;  
        return d[n];  
    }  
      
  
}  

