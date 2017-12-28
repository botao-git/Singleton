package open.botao.code.doubleLock;

public class SingletonDoubleLock {

	private volatile static SingletonDoubleLock instance;
	
	private SingletonDoubleLock(){}

	public static SingletonDoubleLock getInstance() {
	
		if(instance == null){
			
			synchronized (SingletonDoubleLock.class) {
				instance = new SingletonDoubleLock();
			}
		}
		
		return instance;
	};
	
	
}
