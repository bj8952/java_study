public class testMain {
public static BankAccount account = new BankAccount();
public static void main (String []args) {

Thread depositMan = new Thread(account) {
	public void run(){
		account.add(10);
	};// 뭔가 들어가야 함
};
Thread withdrawMan = new Thread(account) {
	public void run(){
		account.delete(10);
	};// 뭔가 들어가야 함 
};
depositMan.start();
withdrawMan.start();
}
}