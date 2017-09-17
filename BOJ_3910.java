import java.util.Scanner;  
  
public class Main {  
    final static int MAX=101;  
    //방향{왼쪽:0, 아래쪽:1, 오른쪽:2, 위쪽:3}  
    static int[] dx={0,1,0,-1};   
    static int[] dy={-1,0,1,0};  //dx,dy : 방향 변경을 위한 배열  
    static int N,K,L;  
    static int arr[][]=new int[MAX][MAX]; //MAP  
    //static int body[][] = new int[MAX][MAX];   
    static int time[]=new int[MAX]; //뱀의 방향 변환 정보 - 초  
    static char dir[] = new char[MAX]; //뱀의 방향 변환 정보 - 방향  
    //static int size=1;  
      
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        int result=0;  
        for(int i=0;i<K;i++){ //사과 위치 입력 받고, 사과 있는 곳은 4로 셋팅  
            int x,y;  
            x=sc.nextInt();  
            y=sc.nextInt();  
            arr[x][y]=4;  
        }  
        L=sc.nextInt();  
        for(int i=0;i<L;i++){    //뱀의 방향 변환 정보 입력  
            time[i]=sc.nextInt();  
            dir[i]=sc.next().charAt(0);  
        }  
        result=baam();  
        System.out.println(result);       
    }  
    static int baam(){    
        int cx=1,cy=1, direction=2, com_idx=0;  //cx,cy:현재 뱀의 머리 위치, direction:방향, com_idx:방향바꾼횟수  
        int ret_time=0; // 전체 걸린 초  
        arr[1][1]=1; //처음 위치 : arr[1][1]  
        while(true){  
            ret_time++;  
            cx+=dx[direction];   
            cy+=dy[direction];  //오른쪽으로 이동  
            if(cx<1 || cx>N || cy<1 || cy>N || arr[cx][cy]==1)  //벽에 부딪히거나, 뱀의 몸에 부딪히면 루프 탈출  
                break;  
            if(arr[cx][cy]==0){ //이동했는데 아무것도 없으면  
                  
                //(+)꼬리제거  
                  
            }  
              
            //(+)머리 큐에 넣기  
              
            arr[cx][cy]=1;  //뱀의 머리가 이동한 곳 1로 변경  
            if(com_idx<L && ret_time==time[com_idx]){    //방향을 바꿀때가 됬으면  
                if(dir[com_idx]=='L') { //바꿀 방향이 L인 경우  
                    direction+=1; direction%=4;   
                }  
                else {  // 바꿀 방향이 D인 경우  
                    direction+=3; direction%=4;  
                }  
                com_idx++;  //방향을 바꾸었으니 com_idx ++ 해줌  
            }  
        }  
        return ret_time;    // 총 걸린시간 리턴  
    }  
}  

