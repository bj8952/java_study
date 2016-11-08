import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception{

	public MyException(){
		super("사용자 정의 예외입니다.");
		System.out.println("입력 범위를 초과하였습니다.");
	}
}

public class quickCD {

	public static void main(String []args)throws MyException{
		
		Scanner in = new Scanner(System.in);
		int x,y;
		int result;

		
		try{
		System.out.println("x입력");
		x= in.nextInt();
		System.out.println("y입력");
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
			System.out.println("0으로 나눔");
		}
		catch(InputMismatchException e){
			System.out.println("숫자를 잘못");
		}
		catch(MyException e){
		
			
		}
		
		
	}
	
}
