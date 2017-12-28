package open.botao.code.test;

public class StaticSingletonTest implements Runnable{

	private StaticSingletonTest() {
		System.out.println("StaticSingleton is create");
	}
	
	private static class StaticSingletonHolder{
		private static StaticSingletonTest instance = new StaticSingletonTest();
	}
	
	public static StaticSingletonTest getInstance(){
		return StaticSingletonHolder.instance;
	}
	
	@Override
	public void run() {
		
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			StaticSingletonTest.getInstance();
		}
		System.out.println(System.currentTimeMillis() - beginTime);
	}
	
	public static void main(String[] args) {
		// LazySingleton.createString();
		for (int i = 0; i < 5; i++) {
			new Thread(new StaticSingletonTest()).start();
		}
	}

}
