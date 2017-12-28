package open.botao.code.test;

public class SingletonLazyModeTest implements Runnable {
	private SingletonLazyModeTest() {
		System.out.println("LazySingleton is create");
	}

	private static SingletonLazyModeTest instance = null;

	public static synchronized SingletonLazyModeTest getInstance() {
		if (instance == null) {
			instance = new SingletonLazyModeTest();
		}
		return instance;
	}

	public static void createString() {
		System.out.println("create String");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			SingletonLazyModeTest.getInstance();
		}
		System.out.println(System.currentTimeMillis() - beginTime);
	}

	public static void main(String[] args) {
		// LazySingleton.createString();
		for (int i = 0; i < 5; i++) {
			new Thread(new SingletonLazyModeTest()).start();
		}
	}

}
