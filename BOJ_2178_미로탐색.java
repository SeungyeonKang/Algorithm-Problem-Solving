//�̷�Ž��

import java.util.*;


class Pair2{		//ť��  x,y,���� ĭ ���� ¦�� �����ϱ� ���� class
	int x,y;
	int count;
	Pair2(int x, int y, int count){
		this.x=x;
		this.y=y;
		this.count = count;
	}
}
public class BOJ_2178_�̷�Ž�� {
	static char[][] maze;
	static int[][] visit;
	static int N,M;
	static int dx[]={0,0,1,-1};
	static int dy[]={1,-1,0,0};
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		sc.nextLine();
		maze = new char[N][M];
		visit=new int[N][M];
		
		for(int i=0;i<N;i++){
			String tmp=sc.nextLine();
			maze[i]=tmp.toCharArray();
		}

		bfs_find_exit();	
		
	}
	static void bfs_find_exit(){	// ĭ ���� ����
		Queue<Pair2> q = new LinkedList<Pair2>();
		q.add(new Pair2(0,0,1));
		visit[0][0]=1;
		
		while(!q.isEmpty()){
			
			Pair2 tmp = q.remove();
			if(tmp.x==N-1 && tmp.y==M-1){	//������ ĭ�� ������ count�� ����ϰ� break
				System.out.println(tmp.count);
				break;
			}
			
			for(int i=0;i<4;i++){
				int cx = dx[i]+tmp.x;
				int cy = dy[i]+tmp.y;
				
				if(cx>=0 && cx<N && cy>=0 && cy<M){
					if(maze[cx][cy]=='1' && visit[cx][cy]==0){
					q.add(new Pair2(cx,cy,tmp.count+1));	//���� �ε����� ť�� �����ϰ� count�� ���� �ε���+1 ����
					visit[cx][cy]=1;
					}
				}
				
			}
		}
		
	}
}
