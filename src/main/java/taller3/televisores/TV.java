package taller3.televisores;

public class TV {
	public Marca marca;
	private int canal = 1;
	private int precio = 500;
	public boolean estado;
	private int volumen = 1;
	public Control control;
	static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		if(canal > 0 && canal <= 120 && estado == true) {
			this.canal = canal;
		}
	}

	public int getPrecio() {
		return precio;
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if(volumen >= 0 && volumen <= 7 && estado == true) {
			this.volumen = volumen;
		}
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public void canalUp() {
		if(this.canal < 120 && estado == true) {
			this.canal++;
		}
	}
	
	public void canalDown() {
		if(this.canal > 1 && estado == true) {
			this.canal--;
		}
	}
	
	public void volumenUp() {
		if(this.volumen < 7 && estado == true) {
			this.volumen++;
		}
	}
	
	public void volumenDown() {
		if(this.volumen >= 1 && estado == true) {
			this.volumen--;
		}
	}

}
