package tareaEntregaMatrices;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] mat_mccdu = { { 5, 6, 2, -4 },
                { 6, 7, 8, 3 },
                { 10, 4, -5, 9 },
                { 4, -7, 1, 12 } };
        int[][] not_mat_mccdu = { { 5, 6, 2, -4 },
                { 6, 7, 8, 3 },
                { 10, 4, -5, 9 },
                { 4, -7, 12, 1 } };

        // mat_mccdu
        if (Libreria.mccud(mat_mccdu)) {
            System.out.println("mat_mccdu es mccud");
        } else {
            System.out.println("mat_mccdu no es mccud");
        }
        
        // not_mat_mccud
        if (Libreria.mccud(not_mat_mccdu)) {
            System.out.println("not_mat_mccdu es mccud");
        } else {
            System.out.println("not_mat_mccdu no es mccud");
        }
    }
}