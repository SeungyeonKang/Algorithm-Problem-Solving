import java.util.*;  
public class pro_2667 {  
    static int a[][];  
    static int dx[] = {1,0,-1,0};  
    static int dy[] = {0,1,0,-1};  
    static int cnt=2;  
    static int n;  
    static int sum[];  
    static void dfs(int x, int y){  
        a[x][y]=cnt;  
        sum[cnt]++;  
        for(int i=0;i<4;i++){  
            if(x+dx[i]<n && x+dx[i]>=0 && y+dy[i]<n && y+dy[i]>=0){  
                if(a[x+dx[i]][y+dy[i]]==1)  
                    dfs(x+dx[i],y+dy[i]);  
            }  
        }  
    }  
      
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        n=sc.nextInt();  
        a=new int[n][n];  
        sum=new int[n*n];  
        for(int i=0;i<n;i++){  
            String str = sc.next();  
            char ch[]=str.toCharArray();  
            for(int j=0;j<ch.length;j++){  
                a[i][j]=ch[j]-'0';  
            }  
        }  
          
        for(int i=0;i<n;i++){  
            for(int j=0;j<n;j++){  
                if(a[i][j]==1){  
                    dfs(i,j);  
                    cnt++;  
                }  
            }  
        }  
  
        Arrays.sort(sum);  
        System.out.println(cnt-2);  
        for(int i=n*n-cnt+2;i<n*n;i++){  
            System.out.println(sum[i]);  
        }  
  
    }  
}  


