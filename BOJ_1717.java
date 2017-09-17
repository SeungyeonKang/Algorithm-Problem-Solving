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
      
    static int find(int x){ //x�� ���� ������ ã�� �޼ҵ�  
        if(p[x]==x)  
            return x;  
        else  
            return p[x]=find(p[x]); //���� ������ root�� parent�� �ٲ�  
    }  
      
    static void union(int a, int b){    // �� ������ ��ġ�� �޼ҵ�  
        a=find(a);  //���� �ش� ������ parent�� ã��  
        b=find(b);  
          
        if(d[a]<d[b])    //���̰� �� ���� ���� root�� ����  
            p[a]=b;  
        else{  
            p[b]=a; //���� ���̰� ���ٸ� ��ģ�� ���̸� 1 ����������  
            if(d[a]==d[b])  
                d[a]++;  
        }  
    }  
      
    static void check(int a, int b){    //�� ������ ���� �������� üũ�ϴ� �޼ҵ�  
        a=find(a);  
        b=find(b);  
        //System.out.println(a+" "+b);  
        if(a==b)    //���� �����̸� parent�� �����Ƿ�  
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
