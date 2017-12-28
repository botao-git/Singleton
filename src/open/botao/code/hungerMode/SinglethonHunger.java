package open.botao.code.hungerMode;

public class SinglethonHunger {

	private static SinglethonHunger instance = new SinglethonHunger();
	
	private SinglethonHunger(){};

	public static SinglethonHunger getInstance() {
		return instance;
	}
	
	
}
