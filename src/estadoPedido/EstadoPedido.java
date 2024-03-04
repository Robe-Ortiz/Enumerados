package estadoPedido;

public enum EstadoPedido {
	PENDIENTE("Pedido pendiente de confirmación", 1), PROCESANDO("Pedido en proceso de preparación", 2),
	ENVIADO("Pedido enviado al destinatario", 3), ENTREGADO("Pedido entregado correctamente", 4);

	private String mensaje;
	private int codigo;

	private EstadoPedido(String mensaje, int codigo) {
		this.mensaje = mensaje;
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public int getCodigo() {
		return codigo;
	}

	public EstadoPedido siguienteEstado() {
		switch (this) {
		case PENDIENTE:
			return PROCESANDO;
		case PROCESANDO:
			return ENVIADO;
		case ENVIADO:
			return ENTREGADO;
		default:
			return this;	
		}
	

	}
}
