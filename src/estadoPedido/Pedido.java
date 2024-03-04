package estadoPedido;

public class Pedido {

	private EstadoPedido estadoActualPedido;

	public Pedido() {
		this.estadoActualPedido = EstadoPedido.PENDIENTE;
	}

	public EstadoPedido getEstadoActualPedido() {
		return estadoActualPedido;
	}

	public void setEstadoActualPedido(EstadoPedido estadoActualPedido) {
		this.estadoActualPedido = estadoActualPedido;
	}
	
	
	
	public static void main(String[] args) {
		
		Pedido prueba = new Pedido();
		
		System.out.println(prueba.getEstadoActualPedido());	
		prueba.setEstadoActualPedido(prueba.getEstadoActualPedido().siguienteEstado());
		System.out.println(prueba.getEstadoActualPedido());
		

		
	}
	
}
