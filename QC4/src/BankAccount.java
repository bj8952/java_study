public class BankAccount implements Runnable{

private int balance = 100;
public int getBalance() {
return balance;
}

public BankAccount(){}

public void run(){

}
	
public void withDraw(int amount) {
balance -= amount;
}
public void add(int money) {
balance += money;
System.out.println("���� : " + balance + " " + money + " ��ŭ �Ա�");
}
public void delete(int money) {
balance -= money;
System.out.println("���� : " +balance + " " + money + " ��ŭ ���");
}

}