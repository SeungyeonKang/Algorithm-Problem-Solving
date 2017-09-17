import java.util.*;  
  
public class Main {  
    static int[][] map;   
    static int N,M,MAX=0,v_size=0;  
    static boolean visit[][];   //바이러스가 퍼진 곳 표시하기 위한 배열  
    static Pair[] virus = new Pair[64]; //바이러스가 존재하는 곳 저장하는 배열  
    static Queue<Pair> queue = new LinkedList<Pair>();  //bfs()구현을 위한 큐  
    static int dx[] = {-1,0,1,0};   //이동을 위한 배열  
    static int[] dy = {0,1,0,-1};  
      
    static class Pair{  //x,y 정보를 입력받는 Pair 클래스 선언  
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
                    virus[v_size]=new Pair(i,j);    //바이러스의 위치를 virus 배열에 저장  
                    v_size++;  
                }  
            }  
        }  
        dfs(0,0,0);   
        System.out.println(MAX);  
          
    }  
      
    static void dfs(int x, int y, int d){   //벽 3개를 세우기 위한 dfs 함수  
        if(d==3){   //벽이 3개 세워졌으면 바이러스의 위치를 큐에 넣고 bfs() 호출  
            visit = new boolean[N][M];  
            for(int i=0;i<v_size;i++){  
                queue.add(new Pair(virus[i].x, virus[i].y));  
            }  
            bfs();  
            return;  
        }  
          
        for(int i=x;i<N;i++){    //벽이 3개가 아니면 또 다른 벽을 세움  
            for(int j=0;j<M;j++){  
                if(map[i][j]==0){     
                    map[i][j]=3;    //벽 세움  
                    dfs(i,j,d+1);     
                    map[i][j]=0;    //벽 없앰  
                }  
            }  
        }  
    }  
      
    static void bfs(){  //바이러스 퍼짐을 위한 함수  
          
        while(!queue.isEmpty()){    //큐가 비어있을떄까지 반복  
            Pair p = queue.poll();    
            visit[p.x][p.y]=true;   //큐에서 꺼내 방문하고 방문 표시  
              
            for(int i=0;i<4;i++){    //방향 변경 (동서남북)  
                int nx = p.x+dx[i];  
                int ny = p.y+dy[i];  
                  
                if(nx<0 || nx>=N || ny<0 || ny>=M)  //방문할 수 없는 곳이면  
                    continue;  
                if(visit[nx][ny]==false && map[nx][ny]==0){     //방문할 수 있는 곳이고, 바이러스가 퍼지지 않은 곳이면  
                    queue.add(new Pair(nx,ny)); //큐에 추가  
                }  
            }  
        }  
        int cnt=0;  //바이러스가 퍼지지 않은 곳을 세기 위한 변수  
        for(int i=0;i<N;i++){  
            for(int j=0;j<M;j++){  
                if(visit[i][j]==false && map[i][j]==0)  //바이러스가 방문하지 않았고 값이 0이 들어있으면  
                    cnt++;  //카운트 증가  
            }  
        }  
        if(MAX<cnt)  //cnt가 최대 값보다 크면 바꾸어줌  
            MAX=cnt;  
    }  
  
}  

