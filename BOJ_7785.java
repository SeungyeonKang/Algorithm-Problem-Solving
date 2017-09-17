import java.util.Arrays;  
import java.util.HashSet;  
import java.util.Scanner;  
import java.util.Set;  
  
public class pro_7785_2 {  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        int N=sc.nextInt();  
          
        String str1, str2;  
          
        Set<String> set = new HashSet<>();  //ȸ�翡 �ִ� ����� �����ϱ� ���� set  
          
        for(int i=0;i<N;i++){  
            str1=sc.next();  
            str2=sc.next();  
            if(str2.equals("enter"))      
                set.add(str1);  //set�� �߰�����  
            else    //leave ���̸� set���� ����  
                set.remove(str1);  
        }  
          
        //������������ �����ϱ� ���� set�� �迭�� �ٲپ���  
        String[] arr = set.toArray(new String[set.size()]);  
        Arrays.sort(arr);   //�������� ����  
          
        //������������ ���  
        for(int i=arr.length-1; i>=0; i--){  
            System.out.println(arr[i]);  
        }  
          
    }  
}  

