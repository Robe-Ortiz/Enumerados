package clasificacionVideojuegos;

public enum ClasificacionVideojuego {
	ACCION("Juegos de acción", "Adultos", "Multijugador"), AVENTURA("Juegos de aventura", "Todos", "Individual"),
	ESTRATEGIA("Juegos de estrategia", "Adultos", "Individual"),
	SIMULACION("Juegos de simulación", "Menores", "Individual"),
	DEPORTES("Juegos de deportes", "Todos", "Multijugador");

	private String descripcion;
	private String edadRecomendada;
	private String jugabilidadPrincipal;

	private ClasificacionVideojuego(String descripcion, String edadRecomendada, String jugabilidadPrincipal) {
		this.descripcion = descripcion;
		this.edadRecomendada = edadRecomendada;
		this.jugabilidadPrincipal = jugabilidadPrincipal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getEdadRecomendada() {
		return edadRecomendada;
	}

	public String getJugabilidadPrincipal() {
		return jugabilidadPrincipal;
	}

	public boolean esAptoParaMenores() {
		if(this.getEdadRecomendada().equals("Todos") || this.getEdadRecomendada().equals("Menores")) {
			return true;
		}
		return false;
	}
	
	public boolean esMultijugador() {
		return this.getJugabilidadPrincipal().equals("Multijugador");
	}
	
}
