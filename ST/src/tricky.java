import java.awt.Point;

public class tricky {
	
	public static void tricky(Point arg1,Point arg2){
	arg1.x = 100;
	arg1.y = 100; // 호출이 아니라 직접 값을 넣는 경우에는 원본값이 바뀌는 듯? // 여기가 콜바이 레퍼런스? // 메소드 안에서 인자를 직접 변경하면 콜바이 레퍼런스인가봐
	

	Point temp = arg1;
	arg1 = arg2;
	arg2 = temp;
	
	System.out.println("arg1 : " + arg1 + " arg2 : "+ arg2 +" temp : " + temp) ;	
		
	}
	
public static void main(String [] args)
{
	Point pnt1 = new Point(1,1);
	Point pnt2 = new Point(2,2);
	System.out.println("x : " + pnt1.x + " y : "+ pnt1.y);	
	System.out.println("x : " + pnt2.x + " y : "+ pnt2.y);
	System.out.println("  ");	
	tricky(pnt1,pnt2);
	System.out.println("x : " + pnt1.x + " y : "+ pnt1.y);	
	System.out.println("x : " + pnt2.x + " y : "+ pnt2.y);
	System.out.println("x : " + pnt1 + " y : "+ pnt2);
	}
}


