import java.util.HashMap;  
import java.util.Scanner;  
  
  
public class pro_4195_5 {  
    static int root[];  // ��Ʈ �����ϴ� �迭  
    static int cnt[];   // ģ����Ʈ��ũ ���� �迭  
      
    static int find(int x){  
        if(root[x]==x)  
            return x;  
        else  
            return root[x]=find(root[x]);  
          
    }  
      
    static int merge(int p, int q){  
        p=find(p);  
        q=find(q);  
        if(p!=q){                   //�ΰ� �θ� ���� ������  
            root[q]=p;              //p�� ��Ʈ�� ����  
            cnt[p]+=cnt[q];         //��Ʈ���� ��ġ�Ƿ� cnt�� ���� �����ش�  
            cnt[q]=1;               //q�� �ܸ���尡 �Ǿ����Ƿ� cnt ���� 1�� ��  
        }  
        return cnt[p];  
    }  
      
    public static void main(String args[]){  
        int T;  
        Scanner sc= new Scanner(System.in);  
        T=sc.nextInt();  
        for(int i=0;i<T;i++){    //�׽�Ʈ���̽�   
            int N, idx1,idx2,num=0;  
            N=sc.nextInt();  
            root=new int[N*2];  
            cnt=new int[N*2];  
            HashMap<String,Integer>index = new HashMap<String,Integer>();     
            //String�� �׿� ���� index�� ���� ��� �����ϱ� ���� hashmap ���  
            String str1, str2;  
            for(int j=0;j<2*N;j++){  //root�� cnt �ʱ�ȭ  
                root[j]=j;  
                cnt[j]=1;  
            }  
            for(int j=0;j<N;j++){  
                str1=sc.next();  
                str2=sc.next();  
                if(index.containsKey(str1)==false) index.put(str1, num++);  
                //hashmap�� str1�̶�� Ű�� ������ �ʿ� Ű�� �ε��� �� �߰��ϰ�, �ε��� �ϳ� ������Ŵ  
                idx1=index.get(str1);  
                //���� �̸�(Ű)�� �ش��ϴ� �ε��� ���� ���� idx1�� ����  
                if(index.containsKey(str2)==false) index.put(str2, num++);  
                //hashmap�� str2��� Ű�� ������ �ʿ� Ű�� �ε��� �� �߰��ϰ�, �ε��� �ϳ� ������Ŵ  
                idx2=index.get(str2);  
                //���� �̸�(Ű)�� �ش��ϴ� �ε��� ���� ���� idx2�� ����  
                int result=merge(idx1,idx2);    //�ΰ� merge  
                System.out.println(result);  
                  
            }  
        }  
    }  
}  

