package ����_�踷���;
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
	static int cut_func(String str){	//�踷��� �ڸ��� �Լ�
		int count=0;	//�߸� �踷����� ���� ���� ����
		int stack_size=0;	//������ ũ��
		char[] a = str.toCharArray();
		
		for(int i=0;i<(a.length)-1;i++){	// (�ڿ� �ٷ� )�� ������ �������̱� ������ ������ ǥ��(1,2)
			if(a[i]=='(' && a[i+1]==')'){
				a[i]=1;
				a[i+1]=2;
			}
		}
		for(int i=0;i<a.length; i++){
			if(a[i]=='('){	//(�� ������ �� ������� count �����ϰ� ���ÿ� �ְ� ���û����� ����
				stack.push(a[i]);
				stack_size++;
				count++;
			}
			else if(a[i]==')'){	//)�� ������ count�� �״�� �ΰ� ���û���� �ٿ���
				stack.pop();
				stack_size--;
			}
			else if(a[i]==2)	//2�� ������ ������ �����̹Ƿ� ���� ����ⰹ�� *2�� �ȴ�.
				count+=stack_size;	//���� count�� ���� ������ ��ŭ ������Ŵ
		}
		return count;
	}

}
