import java.util.Scanner;  
  
public class pro_1717 {  
    static int N;  
    static int[] p;  
    static int[] d;  
      
    static void init(){  
        for(int i=0;i<=N;i++){  
            p[i]=i;  
            d[i]=0;  
        }  
    }  
      
    static int find(int x){ //x가 속한 집합을 찾는 메소드  
        if(p[x]==x)  
            return x;  
        else  
            return p[x]=find(p[x]); //속한 집합의 root로 parent를 바꿈  
    }  
      
    static void union(int a, int b){    // 두 집합을 합치는 메소드  
        a=find(a);  //먼저 해당 집합의 parent를 찾음  
        b=find(b);  
          
        if(d[a]<d[b])    //깊이가 더 깊은 쪽을 root로 삼음  
            p[a]=b;  
        else{  
            p[b]=a; //만약 깊이가 같다면 합친후 깊이를 1 증가시켜줌  
            if(d[a]==d[b])  
                d[a]++;  
        }  
    }  
      
    static void check(int a, int b){    //두 집합이 같은 집합인지 체크하는 메소드  
        a=find(a);  
        b=find(b);  
        //System.out.println(a+" "+b);  
        if(a==b)    //같은 집합이면 parent가 같으므로  
            System.out.println("YES");  
        else  
            System.out.println("NO");  
    }  
      
    public static void main(String args[]){  
        int M;  
        Scanner sc = new Scanner(System.in);  
        N=sc.nextInt();  
        M=sc.nextInt();  
        p=new int[N+1];  
        d=new int[N+1];  
        init();  
          
        for(int i=0;i<M;i++){  
            int tmp=sc.nextInt();  
            int a=sc.nextInt();  
            int b=sc.nextInt();  
            if(tmp==0)  
                union(a,b);  
            else if(tmp==1)  
                check(a,b);  
        }  
    }  
  
}  
