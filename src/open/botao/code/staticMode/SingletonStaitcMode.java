package open.botao.code.staticMode;

public class SingletonStaitcMode {

	private SingletonStaitcMode(){
		
	}
	
	private static class SingletonStaticHolde{
		private static SingletonStaitcMode instance = new SingletonStaitcMode();
	}
	
	public static SingletonStaitcMode getInstance(){
		return SingletonStaticHolde.instance;
	}
	
	
	public static void main(String[] args) {
		SingletonStaitcMode mode1 = SingletonStaitcMode.getInstance();
		SingletonStaitcMode mode2 = SingletonStaitcMode.getInstance();
		SingletonStaitcMode mode3 = SingletonStaitcMode.getInstance();
		SingletonStaitcMode mode4 = SingletonStaitcMode.getInstance();
		SingletonStaitcMode mode5 = SingletonStaitcMode.getInstance();
		SingletonStaitcMode mode6 = SingletonStaitcMode.getInstance();
		SingletonStaitcMode mode7 = SingletonStaitcMode.getInstance();
		System.out.println(mode1);
		System.out.println(mode2);
		System.out.println(mode3);
		System.out.println(mode4);
		System.out.println(mode5);
		System.out.println(mode6);
		System.out.println(mode7);
		
	}
	
	
	
	
}
