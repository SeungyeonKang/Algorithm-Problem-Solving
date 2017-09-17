import java.util.*;  
public class p1463_make1 {  
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
        if(x==1)  
            return 0;  
        if(D[x-1]>0)  
            Min=D[x-1]+1;  
        else{  
            D[x-1]=make_1(x-1);  
            Min=D[x-1]+1;  
        }  
        if(x%3==0){  
            int tmp=x/3;  
            if(D[tmp]==0)  
                D[tmp]=make_1(tmp);  
            if(Min>D[tmp]+1)  
                Min=D[tmp]+1;  
        }  
        if(x%2==0){  
            int tmp=x/2;  
            if(D[tmp]==0)  
                D[tmp]=make_1(tmp);  
            if(Min>D[tmp]+1)  
                Min=D[tmp]+1;  
        }  
        D[x]=Min;  
        return D[x];  
          
    }  
  
}  
