import java.util.Scanner;  
public class p1463_make1_2 {  
    static int D[];  
    static int n;  
  
      
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        n=sc.nextInt();  
        D=new int[n+1];  
        int result = make_1(n);  
        System.out.println(result);  
  
          
    }  
      
    static int make_1(int x){  
        int Min;  
        for(int i=2;i<=x;i++){  
            Min=D[i-1]+1;  
            if(i%3==0){  
                int tmp=i/3;  
                if(Min>D[tmp]+1)  
                    Min=D[tmp]+1;  
            }  
            if(i%2==0){  
                int tmp=i/2;  
                if(Min>D[tmp]+1)  
                    Min=D[tmp]+1;  
            }  
  
            D[i]=Min;  
        }  
        return D[x];  
          
    }  
  
}  
