public class Perzona implements Comparable<Kane> {
	boolean perzona;
	public Perzona(boolean perzona) {
		this.perzona = perzona;
	}
	public static Perzona getPerzonaFalza() {
		return new Perzona(false);
	}
	public void REDIMI() {
	    /*la perzona falsa kiede skusa e diventa kome i kani, solo un p�  peggio*/
	    this.perzona = true;
	}
	public String KonfrontaConKani() {
		if(perzona==false)
			return "SN MEJO I KANID DELE PERZONE FALSE1!1!!";
		return "I KANI SONO MEJO DELE PERZONE11!!1";
	}
	@Override
	public int compareTo(Kane o) {
		if(perzona=false)
			return -100000;
		return -10000;
	}
}