import java.util.Stack;
import java.util.Scanner;
//import java.util.*;


public class Main {
	//static String[] a = new String[50];
	//static String[] result = new String[50];
	static Stack<Object> stack = new Stack<Object>();
	static int i;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N;
		
		N=sc.nextInt();
		String[] a = new String[N];
		String[] result = new String[N];
		String tmp;
		
		for(i=0; i<N; i++){
			a[i]=sc.next();
			tmp=isVaild(a[i]);
			result[i]=tmp;
			stack.clear();
			
			
		}
		for(int i=0;i<N;i++){
			System.out.println(result[i]);
		}
		
		
	}
	
	static String isVaild(String str){	//�ùٸ� ��ȣ ������ �ƴ��� Ȯ���ϴ� �Լ�
		char[] a = str.toCharArray();
		//Object tmp;
		
		for(char j : a){
			if(j=='(')
				stack.push(j);
			else{
				if(stack.isEmpty()==true){ //(�� ���̻� ���µ� (�� ������ ��� NO
					return "NO";
				}
				else{
					//System.out.println(stack.peek());
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()==false)	// ���ڿ��� �� �����µ� (�� �����ִ� ��� NO
		{
			return "NO";
		}
		else
			return "YES";
			
	}

}