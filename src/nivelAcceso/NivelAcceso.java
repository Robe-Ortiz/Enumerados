package nivelAcceso;

public enum NivelAcceso {
ADMINISTRADOR("crear,editar,lectura,eliminar"),EDITOR("editar,lectura"),VISITANTE("lectura");
	private String permisos;

	private NivelAcceso(String permisos) {
		this.permisos = permisos;
	}

	public String getPermisos() {
		return permisos;
	}
	
	public boolean puedeEditar() {
		
		return this.getPermisos().contains("editar");
	}
	
	
	
}
