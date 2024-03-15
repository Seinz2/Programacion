package tareaEvaluableAulaVectores;

public class TareaEvaluableAulaVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []relieve= {2,4,3,5,5,5,5,7,9,8,6,5,7,8,8,8,10,9,7,6,4,3,4,4,4,2,0};
		System.out.println("Número de valles: " + numeroValle(relieve));
		System.out.println("Valor del pico más alto: " + valorPicoMasAlto(relieve));
		System.out.println("Número de mesetas: " + numeroMesetas(relieve));
	}
	/**
	 * te dice si es un valle
	 * @param v : int
	 * @param pos : int
	 * @return : boolean
	 */
	public static boolean esValle(int[] v, int pos) {
		boolean esValle = false;
		if (pos > 0 && pos < v.length - 1) {
			if (v[pos] < v[pos - 1] && v[pos] < v[pos + 1]) {
				esValle = true;
			}
		}
		return esValle;
	}	
		/**
		 * te dice si es un pico
		 * @param v : int
		 * @param pos : int
		 * @return : boolean
		 */
	public static boolean esPico(int[] v, int pos) {
		boolean esPico = false;
		if (pos > 0 && pos < v.length - 1) {
			if (v[pos] > v[pos - 1] && v[pos] > v[pos + 1]) {
				esPico = true;
				}
			}
			return esPico;
		}
	/**
	 * te dice el numero de valles
	 * @param v : int
	 * @return : int
	 */
	public static int numeroValle(int[] v) {
		int numValles = 0;
		for (int i = 0; i < v.length; i++) {
			if (esValle(v, i)) {
				numValles++;
			}
		}
		return numValles;
	}
	/**
	 * te dice el valor del pico mas alto
	 * @param v : int
	 * @return : int
	 */
	public static int valorPicoMasAlto(int[] v) {
		int valorPicoMasAlto = 0;
		for (int i = 0; i < v.length; i++) {
			if (esPico(v, i)) {
				if (v[i] > valorPicoMasAlto) {
					valorPicoMasAlto = v[i];
				}
			}
		}
		return valorPicoMasAlto;	
	}
	/**
	 * te dice si tiene mesetas
	 * @param v : int
	 * @return : boolean
	 */
	public static boolean tieneMeseta(int[] v) {
		boolean tieneMeseta = false;
		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] == v[i + 1]) {
				tieneMeseta = true;
			}
		}
		return tieneMeseta;
	}
	/**
	 * te dice el numero de mesetas
	 * @param v : int
	 * @return : int
	 */
	public static int numeroMesetas(int[] v) {
		if (!tieneMeseta(v)) {
			return 0;			
		}
		int numMesetas = 0;
		boolean esMeseta = false;
		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] == v[i + 1]) {
				esMeseta = true;
			} else {
				if (esMeseta) {
					numMesetas++;
					esMeseta = false;
				}
			}
		}
		return numMesetas;
	}
}