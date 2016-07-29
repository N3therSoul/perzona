/**
 * @author Kowalski7cc
 * KLASSE PER RAPPRESENTARE UNA PERZONA (FALZA)
 * Ringrazio la community di GH per i numerosi suggerimenti!
 * 
 * IMPORTANTE LA KLASSE KANE, CHE NON � DELLA KASTA {@link Kane}
 */
public class Perzona implements Comparable<Kane> {
	boolean perzona;
	int et�;
	/**
	 * LE PERZONE ANNO L'ET� E SN VERE O FALZE
	 * @param perzona SE � VERA O FALZA
	 * @param et�
	 */
	public Perzona(boolean perzona, int et�) {
		this.perzona = perzona;
		this.et� = et�;
	}
	/**
	 * LE PERZONE KE NON CONOSCIAMO SN FALZE HA PRIORI
	 */
	public Perzona() {
		perzona = false;
		et� = 40;
	}
	/**
	 * METODO CONTRO LA KASTA PER TROVARE LE PERZONE FALZE
	 * @return PERZONA FALZA
	 */
	public static Perzona getPerzonaFalza() {
		return new Perzona(false,40);
	}
	/**
	 * METODO PER FARSI PERDONARE, MA LI KANI SN MEJO
	 */
	public void REDIMI() {
	    /*la perzona falsa kiede skusa e diventa kome i kani, solo un p�  peggio*/
	    this.perzona = true;
	}
	/**
	 * KONFRONTA LE PERZONE KON I KANI
	 * @return I KANI SN KOMUNCUE MEJO
	 */
	public String KonfrontaConKani() {
		if(perzona==false)
			return "SN MEJO I KANID DELE PERZONE FALSE1!1!!";
		return "I KANI SONO MEJO DELE PERZONE11!!1";
	}
	/**
	 * GUARDA L'ET� DI UNA PERZONA
	 * @return et�
	 */
	public int getEt�() {
		return et�;
	}
	/**
	 * KOMPARA I KANI CON LE PERZONE, MA SONO MGLIO I KANI11!!
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Kane o) {
		if(perzona=false)
			return -100000;
		return -10000;
	}
	/**
	 * BUONGIORNISSIMO!!!11!111!
	 * @return kaff�?????
	 */
	public String Kaff�() {
		if(this.getEt�()>=40)
			return "Buongiornissimooo kaff�����?!!? 1!";
		return null;
	}
}