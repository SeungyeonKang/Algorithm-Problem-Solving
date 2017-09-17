import java.util.Scanner;  
  
public class pro_11279 {  
    static int[] heap;  
    static int size=0;  
      
    static void add(int x){  
        int idx=size;  
        heap[size++]=x;  
        while(true){    //부모보다 값이 크면 부모와 바꾸길 반복  
            int p=(idx-1)/2;    //부모의 인덱스  
            if(heap[p]<heap[idx]){   //부모보다 값이 크면 서로 바꾸고 현재 인덱스를 부모로 바꾸어줌  
                int tmp=heap[p];  
                heap[p]=heap[idx];  
                heap[idx]=tmp;  
                idx=p;  
            }  
            else  
                break;  
              
        }  
    }  
      
    static void remove(){  
        if(size==0){  
            System.out.println("0");  
        }  
        else{  
            System.out.println(heap[0]);  
            heap[0]=heap[size-1];   //가장 끝의 값이 부모의 값이 됨  
            size--;  
        }  
        int idx=0;  
        while(true){  
            int MAX=idx;    //자신과, 오른쪽자식, 왼쪽 자식 중 최대값 찾기 위한 인덱스 값  
              
            //만약 왼쪽자식이 존재하고, 왼쪽 자식의 값이 현재 MAX 값보다 크면 MAX를 왼쪽 자식으로 셋팅  
            if((idx+(idx+1)<size) &&( heap[idx+(idx+1)]>heap[MAX]))  
                MAX=idx+(idx+1);  
              
            //만약 오른쪽자식이 존재하고, 오른쪽 자식의 값이 현재 MAX 값보다 크면 MAX를 오른쪽 자식으로 셋팅  
            if((idx+(idx+2))<size &&( heap[idx+(idx+2)]>heap[MAX]))  
                MAX=idx+(idx+2);  
  
            //자식들보다 자신이 가장 크면 올바른 경우이므로 break  
            if(MAX==idx)  
                break;  
              
            //자식이 더 크면 해당 자식과 자신을 바꾸고, 또 아래의 자식들과 비교  
            else{  
                int tmp=heap[MAX];  
                heap[MAX]=heap[idx];  
                heap[idx]=tmp;  
                idx=MAX;  
            }  
                  
        }  
    }  
      
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        int N=sc.nextInt();  
        heap=new int[N];  
        for(int i=0;i<N;i++){  
            int x=sc.nextInt();  
            if(x==0)  
                remove();  
            else  
                add(x);  
        }  
          
    }  
}  
