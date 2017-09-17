import java.util.*;  
  
public class pro_10451 {  
    static boolean[] c;  
    static ArrayList<Integer>[] a;  
      
    static void dfs(int x){  
        if(c[x])  
            return;  
        c[x]=true;  
        for(int y : a[x]){  
            if(c[y]==false)  
                dfs(y);  
        }  
    }  
      
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        int T=sc.nextInt();  
        for(int i=0;i<T;i++){  
            int n=sc.nextInt();  
            a=(ArrayList<Integer>[]) new ArrayList[n+1];  
            c=new boolean[n+1];  
            for(int j=1;j<=n;j++){  
                a[j]=new ArrayList<Integer>();  
            }  
            for(int j=1;j<=n;j++){  
                int v=sc.nextInt();  
                a[j].add(v);  
            }  
              
            int count=0;  
            for(int j=1;j<=n;j++){  
                if(c[j]==false){  
                    count++;  
                    dfs(j);  
                }  
            }  
            System.out.println(count);  
              
        }  
    }  
      
}  

