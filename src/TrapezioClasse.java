/**
 * 
 * @author Peter Durante
 * @version 1.0
 * @since 1.0
 *
 */
public class TrapezioClasse {
	
	private float B,b,h;
	
	/**
	 * Metodo costruttore
	 * @param B Base Maggiore
	 * @param b Base Minore
	 * @param h Altezza
	 */
	public TrapezioClasse(float B,float b, float h ) {
		this.B=B;
		this.b=b;
		this.h=h;
	}
	
	/**
	 * metodo che calcola l'area del trapezio utilizzando come dati le variabili dichiarate nel costruttore
	 * @return Area float
	 */
	public float calcolaArea() {
		return((B+b)*h)/2;
	}
	
	public static void main(String[]args) {
		TrapezioClasse t= new TrapezioClasse(5,3,3);
		System.out.println(t.calcolaArea());
	}
}
