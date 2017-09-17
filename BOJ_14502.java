import java.util.*;  
  
public class Main {  
    static int[][] map;   
    static int N,M,MAX=0,v_size=0;  
    static boolean visit[][];   //���̷����� ���� �� ǥ���ϱ� ���� �迭  
    static Pair[] virus = new Pair[64]; //���̷����� �����ϴ� �� �����ϴ� �迭  
    static Queue<Pair> queue = new LinkedList<Pair>();  //bfs()������ ���� ť  
    static int dx[] = {-1,0,1,0};   //�̵��� ���� �迭  
    static int[] dy = {0,1,0,-1};  
      
    static class Pair{  //x,y ������ �Է¹޴� Pair Ŭ���� ����  
        int x,y;  
        Pair(int x, int y){  
            this.x=x;  
            this.y=y;  
        }  
    }  
      
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        N = sc.nextInt();  
        M=sc.nextInt();  
        map = new int[N][M];  
          
        for(int i=0;i<N;i++){  
            for(int j=0;j<M;j++){  
                map[i][j]=sc.nextInt();  
                if(map[i][j]==2){  
                    virus[v_size]=new Pair(i,j);    //���̷����� ��ġ�� virus �迭�� ����  
                    v_size++;  
                }  
            }  
        }  
        dfs(0,0,0);   
        System.out.println(MAX);  
          
    }  
      
    static void dfs(int x, int y, int d){   //�� 3���� ����� ���� dfs �Լ�  
        if(d==3){   //���� 3�� ���������� ���̷����� ��ġ�� ť�� �ְ� bfs() ȣ��  
            visit = new boolean[N][M];  
            for(int i=0;i<v_size;i++){  
                queue.add(new Pair(virus[i].x, virus[i].y));  
            }  
            bfs();  
            return;  
        }  
          
        for(int i=x;i<N;i++){    //���� 3���� �ƴϸ� �� �ٸ� ���� ����  
            for(int j=0;j<M;j++){  
                if(map[i][j]==0){     
                    map[i][j]=3;    //�� ����  
                    dfs(i,j,d+1);     
                    map[i][j]=0;    //�� ����  
                }  
            }  
        }  
    }  
      
    static void bfs(){  //���̷��� ������ ���� �Լ�  
          
        while(!queue.isEmpty()){    //ť�� ������������� �ݺ�  
            Pair p = queue.poll();    
            visit[p.x][p.y]=true;   //ť���� ���� �湮�ϰ� �湮 ǥ��  
              
            for(int i=0;i<4;i++){    //���� ���� (��������)  
                int nx = p.x+dx[i];  
                int ny = p.y+dy[i];  
                  
                if(nx<0 || nx>=N || ny<0 || ny>=M)  //�湮�� �� ���� ���̸�  
                    continue;  
                if(visit[nx][ny]==false && map[nx][ny]==0){     //�湮�� �� �ִ� ���̰�, ���̷����� ������ ���� ���̸�  
                    queue.add(new Pair(nx,ny)); //ť�� �߰�  
                }  
            }  
        }  
        int cnt=0;  //���̷����� ������ ���� ���� ���� ���� ����  
        for(int i=0;i<N;i++){  
            for(int j=0;j<M;j++){  
                if(visit[i][j]==false && map[i][j]==0)  //���̷����� �湮���� �ʾҰ� ���� 0�� ���������  
                    cnt++;  //ī��Ʈ ����  
            }  
        }  
        if(MAX<cnt)  //cnt�� �ִ� ������ ũ�� �ٲپ���  
            MAX=cnt;  
    }  
  
}  

