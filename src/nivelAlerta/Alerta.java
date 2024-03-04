package nivelAlerta;

public class Alerta {

	private NivelAlerta nivelDeAlerta;

	public Alerta(NivelAlerta nivelDeAlerta) {
		this.nivelDeAlerta = nivelDeAlerta;
	}

	
	public NivelAlerta getNivelDeAlerta() {
		return nivelDeAlerta;
	}

	public void setNivelDeAlerta(NivelAlerta nivelDeAlerta) {
		this.nivelDeAlerta = nivelDeAlerta;
	}
	
	
	
	public static void main(String[] args) {
		
		Alerta prueba = new Alerta(NivelAlerta.BAJO);
		System.out.print(prueba.getNivelDeAlerta().getDescripcion());
		System.out.println("       "+prueba.getNivelDeAlerta().getAccionesRecomendadas());
		
		prueba.setNivelDeAlerta(prueba.getNivelDeAlerta().escalar());
		System.out.print(prueba.getNivelDeAlerta().getDescripcion());
		System.out.println("      "+prueba.getNivelDeAlerta().getAccionesRecomendadas());
		
		prueba.setNivelDeAlerta(prueba.getNivelDeAlerta().escalar());
		System.out.print(prueba.getNivelDeAlerta().getDescripcion());
		System.out.println("       "+prueba.getNivelDeAlerta().getAccionesRecomendadas());
		
		prueba.setNivelDeAlerta(prueba.getNivelDeAlerta().escalar());
		System.out.print(prueba.getNivelDeAlerta().getDescripcion());
		System.out.println("    "+prueba.getNivelDeAlerta().getAccionesRecomendadas());
		
		
		System.out.println();
		
		prueba.setNivelDeAlerta(prueba.getNivelDeAlerta().desescalar());
		System.out.print(prueba.getNivelDeAlerta().getDescripcion());
		System.out.println("    "+prueba.getNivelDeAlerta().getAccionesRecomendadas());
		
		prueba.setNivelDeAlerta(prueba.getNivelDeAlerta().desescalar());
		System.out.print(prueba.getNivelDeAlerta().getDescripcion());
		System.out.println("   "+prueba.getNivelDeAlerta().getAccionesRecomendadas());
		
		
		
		
		
		
		
	}
}
