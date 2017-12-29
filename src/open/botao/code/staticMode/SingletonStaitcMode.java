package open.botao.code.staticMode;

public class SingletonStaitcMode implements Runnable{

	private SingletonStaitcMode(){
		
	}
	
	private static class SingletonStaticHolde{
		private static SingletonStaitcMode instance = new SingletonStaitcMode();
	}
	
	public static SingletonStaitcMode getInstance(){
		return SingletonStaticHolde.instance;
	}
	

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			
			SingletonStaitcMode mode = SingletonStaitcMode.getInstance();
			System.out.println(mode);
			
			System.out.println(Thread.currentThread().getName()+"<<<<<<<<<<<<<");
		}
		
	}
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println("---------------------");
			new Thread(new SingletonStaitcMode()).start();
		}
	}


	
	
	
	
}
