package generoLiterario;

public enum GeneroLiterario {

	FICCION("Genero de ficción"), NO_FICCION("Genero que no incluye ficción"), POESIA("Poesías bonitas"),
	BIOGRAFIA("Historias sobre algunas personas");

	private String descripcion;

	private GeneroLiterario(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public boolean esFiccion() {
		return this == GeneroLiterario.FICCION;
	}
	
	public boolean esAptoParaNinos() {
		if(this == GeneroLiterario.POESIA || this== GeneroLiterario.FICCION)  
			return true;
		return false;
	}
}
