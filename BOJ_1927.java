import java.util.*;  
  
public class pro_1927 {  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
          
        //�켱����ť�� �̿��ϸ� ���� ���� �켱����(���� ���� ��) ������� ��� �����ϴ�.  
        PriorityQueue<Integer> q= new PriorityQueue<Integer>();  
        int n=sc.nextInt();  
        while(n-- > 0){  
            int x=sc.nextInt();  
            if(x==0){  
                if(q.isEmpty())  
                    System.out.println(0);  
                else    //���� ���� �� ���  
                    System.out.println(q.poll());  
            }  
            else  
                q.offer(x);  
        }  
    }  
  
}  

