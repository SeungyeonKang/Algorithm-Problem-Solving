import java.util.Arrays;  
import java.util.HashSet;  
import java.util.Scanner;  
import java.util.Set;  
  
public class pro_7785_2 {  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        int N=sc.nextInt();  
          
        String str1, str2;  
          
        Set<String> set = new HashSet<>();  //회사에 있는 사람을 저장하기 위한 set  
          
        for(int i=0;i<N;i++){  
            str1=sc.next();  
            str2=sc.next();  
            if(str2.equals("enter"))      
                set.add(str1);  //set에 추가해줌  
            else    //leave 값이면 set에서 제거  
                set.remove(str1);  
        }  
          
        //오름차순으로 정렬하기 위해 set을 배열로 바꾸어줌  
        String[] arr = set.toArray(new String[set.size()]);  
        Arrays.sort(arr);   //오름차순 정렬  
          
        //내림차순으로 출력  
        for(int i=arr.length-1; i>=0; i--){  
            System.out.println(arr[i]);  
        }  
          
    }  
}  

