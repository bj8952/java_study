import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception{

	public MyException(){
		super("����� ���� �����Դϴ�.");
		System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�.");
	}
}

public class quickCD {

	public static void main(String []args)throws MyException{
		
		Scanner in = new Scanner(System.in);
		int x,y;
		int result;

		
		try{
		System.out.println("x�Է�");
		x= in.nextInt();
		System.out.println("y�Է�");
		y = in.nextInt();
		
        if(x>1000){
			throw new MyException();
		}
        else if(x>1000){
        	throw new MyException();
        }
		
		result = x/y;
		System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("0���� ����");
		}
		catch(InputMismatchException e){
			System.out.println("���ڸ� �߸�");
		}
		catch(MyException e){
		
			
		}
		
		
	}
	
}
