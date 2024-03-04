package clasificacionVideojuegos;

public class Videojuego {

	private ClasificacionVideojuego clasificacion;	

	public Videojuego(ClasificacionVideojuego clasificacion) {
		this.clasificacion = clasificacion;
	}

	public ClasificacionVideojuego getClasificacion() {
		return clasificacion;
	}


	public static void main(String[] args) {
		
		
		
		
		
		Videojuego prueba = new Videojuego(ClasificacionVideojuego.DEPORTES);
		
		System.out.println(prueba.getClasificacion().esAptoParaMenores());
		System.out.println(prueba.getClasificacion().esMultijugador());
		
		
		System.out.println();
		Videojuego prueba2 = new Videojuego(ClasificacionVideojuego.ESTRATEGIA);
		System.out.println(prueba2.getClasificacion().esAptoParaMenores());
		System.out.println(prueba2.getClasificacion().esMultijugador());
		
		
		
		
		
	}
	
}
