package nivelAcceso;

public class Empleado {

	private NivelAcceso nivelDeAcceso;
	
	public Empleado(NivelAcceso nivelDeAcceso) {
		this.nivelDeAcceso = nivelDeAcceso;
	}
	
	
	
	
	public NivelAcceso getNivelDeAcceso() {
		return nivelDeAcceso;
	}

	public void setNivelDeAcceso(NivelAcceso nivelDeAcceso) {
		this.nivelDeAcceso = nivelDeAcceso;
	}




	public static void main(String[] args) {
		
		Empleado prueba = new Empleado(NivelAcceso.VISITANTE);
		
		System.out.println(prueba.getNivelDeAcceso().puedeEditar());
		
		Empleado prueba2 = new Empleado(NivelAcceso.EDITOR);
		
		System.out.println(prueba2.getNivelDeAcceso().puedeEditar());
		
		
	}
	
}
