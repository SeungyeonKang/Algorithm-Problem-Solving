import java.util.Scanner;  
  
public class pro_10820 {  
    static int cnt[]={0,0,0,0};  
    public static void main(String args[]){  
        Scanner sc=new Scanner(System.in);  
        while(sc.hasNextLine()){    //요기 입력받는거 어떻게 해? ㅠㅠㅠ     
            String str=sc.nextLine();  
            for(int i=0;i<4;i++)  
                cnt[i]=0;  
            func(str);  
        }  
          
        sc.close();  
        return;  
    }  
      
    static void func(String st){  
        char ch[]=st.toCharArray();  
        int len=ch.length;  
        for(int j=0;j<len;j++){  
            if(ch[j]>=65 && ch[j]<=90)  
                cnt[1]++;  
            else if(ch[j]>=97 && ch[j]<=122)  
                cnt[0]++;  
            else if(ch[j]==32)  
                cnt[3]++;  
            else if(ch[j]>=48 && ch[j]<=57)  
                cnt[2]++;  
        }  
      
        System.out.println(cnt[0]+" "+cnt[1]+" "+cnt[2]+" "+cnt[3]);  
  
          
        return;  
    }  
}  
