public class Perzona implements Comparable<Kane> {
	boolean perzona;
	int et�;
	public Perzona(boolean perzona, int et�) {
		this.perzona = perzona;
		this.et� = et�;
	}
	public static Perzona getPerzonaFalza() {
		return new Perzona(false,40);
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
	public int getEt�() {
		return et�;
	}
	@Override
	public int compareTo(Kane o) {
		if(perzona=false)
			return -100000;
		return -10000;
	}
	public String Kaff�() {
		if(this.getEt�()>=40)
			return "Buongiornissimooo kaff�����?!!? 1!";
		return null;
	}
}