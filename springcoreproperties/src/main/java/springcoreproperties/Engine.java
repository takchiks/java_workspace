package springcoreproperties;

public class Engine {
	private int engineNo;
	private int bhp;
	public Engine(int engineNo, int bhp) {
		super();
		this.engineNo = engineNo;
		this.bhp = bhp;
	}
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public int getBhp() {
		return bhp;
	}
	public void setBhp(int bhp) {
		this.bhp = bhp;
	}
	public void startEngine() {
		System.out.println("Engine Started");
	}
	public void stopEngine() {
		System.out.println("Engine Stopped");
	}
	
}
