import java.awt.Point;

public class tricky {
	
	public static void tricky(Point arg1,Point arg2){
	arg1.x = 100;
	arg1.y = 100; // ȣ���� �ƴ϶� ���� ���� �ִ� ��쿡�� �������� �ٲ�� ��? // ���Ⱑ �ݹ��� ���۷���? // �޼ҵ� �ȿ��� ���ڸ� ���� �����ϸ� �ݹ��� ���۷����ΰ���
	

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


