package 백준_쇠막대기;
import java.util.*;

public class Main {
	//static int N;
	static Stack<Object> stack = new Stack<Object>();
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str;
		int result=0;
		
		str=sc.next();
		result=cut_func(str);
		System.out.println(result);
		return;
	}
	static int cut_func(String str){	//쇠막대기 자르는 함수
		int count=0;	//잘린 쇠막대기의 갯수 세는 변수
		int stack_size=0;	//스택의 크기
		char[] a = str.toCharArray();
		
		for(int i=0;i<(a.length)-1;i++){	// (뒤에 바로 )가 나오면 레이저이기 때문에 레이저 표시(1,2)
			if(a[i]=='(' && a[i+1]==')'){
				a[i]=1;
				a[i+1]=2;
			}
		}
		for(int i=0;i<a.length; i++){
			if(a[i]=='('){	//(가 나오면 그 갯수대로 count 증가하고 스택에 넣고 스택사이즈 증가
				stack.push(a[i]);
				stack_size++;
				count++;
			}
			else if(a[i]==')'){	//)가 나오면 count는 그대로 두고 스택사이즈만 줄여줌
				stack.pop();
				stack_size--;
			}
			else if(a[i]==2)	//2가 나오면 레이저 다음이므로 현재 막대기갯수 *2가 된다.
				count+=stack_size;	//따라서 count를 스택 사이즈 만큼 증가시킴
		}
		return count;
	}

}
