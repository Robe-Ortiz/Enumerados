package generoLiterario;

public class Libro {

	private GeneroLiterario generoLiterario;

	public Libro(GeneroLiterario generoLiterario) {
		this.generoLiterario = generoLiterario;
	}
		
	public GeneroLiterario getGeneroLiterario() {
		return generoLiterario;
	}







	public static void main(String[] args) {
		
		Libro prueba = new Libro(GeneroLiterario.FICCION);
		Libro prueba2 = new Libro(GeneroLiterario.BIOGRAFIA);
		
		System.out.println(prueba.getGeneroLiterario().esFiccion());
		System.out.println(prueba.getGeneroLiterario().esAptoParaNinos());
		System.out.println(prueba.getGeneroLiterario().getDescripcion());
		System.out.println();
		System.out.println(prueba2.getGeneroLiterario().esFiccion());
		System.out.println(prueba2.getGeneroLiterario().esAptoParaNinos());
		System.out.println(prueba2.getGeneroLiterario().getDescripcion());
		
	
	}
	
	
}
