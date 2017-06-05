package Models;

public class Viaje {
	//atributos
	private float FechaSalida;
	private float FechaLlegada;
	private float precio;
	
	//Constructor
	public Viaje(float fechaSalida, float fechaLlegada, float precio) {
		FechaSalida = fechaSalida;
		FechaLlegada = fechaLlegada;
		this.precio = precio;
	}

	//Metodos
	public float getFechaSalida() {
		return FechaSalida;
	}

	public void setFechaSalida(float fechaSalida) {
		FechaSalida = fechaSalida;
	}

	public float getFechaLlegada() {
		return FechaLlegada;
	}

	public void setFechaLlegada(float fechaLlegada) {
		FechaLlegada = fechaLlegada;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Viaje [FechaSalida=" + FechaSalida + ", FechaLlegada=" + FechaLlegada + ", precio=" + precio + "]";
	}
	
	
	
}
