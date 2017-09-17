import java.util.Scanner;  
  
public class Main {  
    final static int MAX=101;  
    //����{����:0, �Ʒ���:1, ������:2, ����:3}  
    static int[] dx={0,1,0,-1};   
    static int[] dy={-1,0,1,0};  //dx,dy : ���� ������ ���� �迭  
    static int N,K,L;  
    static int arr[][]=new int[MAX][MAX]; //MAP  
    //static int body[][] = new int[MAX][MAX];   
    static int time[]=new int[MAX]; //���� ���� ��ȯ ���� - ��  
    static char dir[] = new char[MAX]; //���� ���� ��ȯ ���� - ����  
    //static int size=1;  
      
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        int result=0;  
        for(int i=0;i<K;i++){ //��� ��ġ �Է� �ް�, ��� �ִ� ���� 4�� ����  
            int x,y;  
            x=sc.nextInt();  
            y=sc.nextInt();  
            arr[x][y]=4;  
        }  
        L=sc.nextInt();  
        for(int i=0;i<L;i++){    //���� ���� ��ȯ ���� �Է�  
            time[i]=sc.nextInt();  
            dir[i]=sc.next().charAt(0);  
        }  
        result=baam();  
        System.out.println(result);       
    }  
    static int baam(){    
        int cx=1,cy=1, direction=2, com_idx=0;  //cx,cy:���� ���� �Ӹ� ��ġ, direction:����, com_idx:����ٲ�Ƚ��  
        int ret_time=0; // ��ü �ɸ� ��  
        arr[1][1]=1; //ó�� ��ġ : arr[1][1]  
        while(true){  
            ret_time++;  
            cx+=dx[direction];   
            cy+=dy[direction];  //���������� �̵�  
            if(cx<1 || cx>N || cy<1 || cy>N || arr[cx][cy]==1)  //���� �ε����ų�, ���� ���� �ε����� ���� Ż��  
                break;  
            if(arr[cx][cy]==0){ //�̵��ߴµ� �ƹ��͵� ������  
                  
                //(+)��������  
                  
            }  
              
            //(+)�Ӹ� ť�� �ֱ�  
              
            arr[cx][cy]=1;  //���� �Ӹ��� �̵��� �� 1�� ����  
            if(com_idx<L && ret_time==time[com_idx]){    //������ �ٲܶ��� ������  
                if(dir[com_idx]=='L') { //�ٲ� ������ L�� ���  
                    direction+=1; direction%=4;   
                }  
                else {  // �ٲ� ������ D�� ���  
                    direction+=3; direction%=4;  
                }  
                com_idx++;  //������ �ٲپ����� com_idx ++ ����  
            }  
        }  
        return ret_time;    // �� �ɸ��ð� ����  
    }  
}  

