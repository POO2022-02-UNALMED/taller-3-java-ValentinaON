package taller3.televisores;

public class TV {
	public Marca marca;
	private int canal = 1;
	private int precio = 500;
	public boolean estado;
	private int volumen = 1;
	public Control control;
	static int numTv;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTv++;
	}
	
	public int getNumTv() {
		return numTv;
	}
	
	public static void setNumTv(int numTv) {
		TV.numTv = numTv;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
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
		this.volumen = volumen;
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
		if(this.canal > 0 && this.canal <= 120 && this.estado == true) {
			this.canal++;
		}
	}
	
	public void canalDown() {
		if(this.canal > 0 && this.canal <= 120 && this.estado == true) {
			this.canal--;
		}
	}
	
	public void volumenUp() {
		if(this.volumen >= 0 && this.volumen < 7 && this.estado == true) {
			this.volumen++;
		}
	}
	
	public void volumenDown() {
		if(this.volumen >= 1 && this.volumen <= 7 && this.estado == true) {
			this.volumen--;
		}
	}

}
