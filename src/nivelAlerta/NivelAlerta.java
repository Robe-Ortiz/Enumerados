package nivelAlerta;

public enum NivelAlerta {
	BAJO("Nivel bajo de alerta","Revisar incidente"),MEDIO("Nivel medio de alerta","Gestionar inmediatamente el incidente"),
	ALTO("Nivel alto de alerta","Avisar urgentemente al administrador"),CRITICO("Nivel crítico de alerta","Corred insensatos");
	
	private String descripcion;
	private String accionesRecomendadas;
	
	
	
	private NivelAlerta(String descripcion, String accionesRecomendadas) {
		this.descripcion = descripcion;
		this.accionesRecomendadas = accionesRecomendadas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getAccionesRecomendadas() {
		return accionesRecomendadas;
	}
	
	public NivelAlerta escalar() {
		switch (this) {
		case BAJO: 
			return MEDIO;
		case MEDIO:
			return ALTO;
		case ALTO:
			return CRITICO;
		default:
			return this;
		}
	}

	public NivelAlerta desescalar() {
		switch (this) {
		case CRITICO:
			return ALTO;
		case ALTO:
			return MEDIO;
		case MEDIO:
			return BAJO;
		default:
			return this;
		}
	}
	
	
}
