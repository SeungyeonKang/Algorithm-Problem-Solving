import java.util.*;  
public class p9095_add {  
    static int d[]=new int[12];  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        int T=sc.nextInt();  
        d[1]=1;  
        d[2]=2;  
        d[3]=4;  
        while(T-- >0){  
            int n=sc.nextInt();  
            int result=count(n);  
            System.out.println(result);  
        }  
    }  
      
    static int count(int n){  
        for(int i=4;i<=n;i++){  
            if(d[i]==0)  
                d[i]=d[i-1]+d[i-2]+d[i-3];  
        }  
        return d[n];  
    }  
  
}  
