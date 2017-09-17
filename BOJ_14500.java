import java.util.Scanner;  
import java.io.FileInputStream;  
  
public class Main {  
      
    static int N,M;  
    static int[][] arr;  
    static int[][] visit;  
    static int MAX;  
    static int sum;  
    static int dx[]={1,-1,0,0};  
    static int dy[]={0,0,1,-1};  
      
      
    public static void main(String args[]) throws Exception{  
        //Scanner scan = new Scanner(new FileInputStream("test.txt"));  
        Scanner scan = new Scanner(System.in);  
        N=scan.nextInt();  
        M=scan.nextInt();  
          
        arr=new int[N][M];  
        visit=new int[N][M];  
          
        for(int i=0;i<N;i++){  
            for(int j=0;j<M;j++){  
                arr[i][j]=scan.nextInt();  
            }  
        }  
          
        for(int i=0;i<N;i++){  
            for(int j=0;j<M;j++){  
                DFS(i,j,0);  
                sum=0;  
                exception(i,j);  
                sum=0;  
            }  
        }  
          
        System.out.println(MAX);  
        scan.close();  
    }  
      
    static void DFS(int x, int y, int depth){  
        if(depth==4){  
            if(sum>MAX)  
                MAX=sum;  
            return;  
        }  
          
        visit[x][y]=1;  
        sum+=arr[x][y];  
          
        for(int i=0; i<4; i++){ //이동할 수 있는 범위인지 확인하고 이동할 수 있는 범위이면 이동  
            int nx=x+dx[i];  
            int ny=y+dy[i];  
              
            if(nx>=0 && nx<N && ny>=0 && ny<M && visit[nx][ny]==0)  
                DFS(nx,ny,depth+1);  
        }  
        visit[x][y]=0;  
        sum-=arr[x][y];  
    }  
      
  
    static void exception(int x, int y){  
          
        int sum=arr[x][y];  
        int min = 5555;  
        int cnt=0;  
          
        for(int i=0; i<4;i++){             //현위치를 중심으로 위, 아래, 양옆을 모두 더함(갈 수 있는 경우만)  
            int nx=x+dx[i];  
            int ny=y+dy[i];  
            if(nx>=0 && nx<N && ny>=0 &&ny<M){  
                sum+=arr[nx][ny];  
                cnt++;  
                if(min>arr[nx][ny])  
                    min=arr[nx][ny];  
            }  
        }  
        if(cnt == 4){           //cnt==4라면 현위치를 포함해 동서남북으로 5개의 값을 더한 것이므로   
            sum-=min;             //그 중 가장 작은 값 빼줌  
            if(sum>MAX)  
            MAX=sum;  
        }  
    }  
      
}  
