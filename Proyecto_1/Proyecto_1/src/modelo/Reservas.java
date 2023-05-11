package modelo;

public class Reservas {
	
	private Habitacion habitacion;
	private Fecha fechaInicial;
	private Fecha fechaFinal;
	private Grupo grupo;
	private Factura factura;
	private int personas;
	private int ninos;
	private boolean checkIn;
	private boolean checkOut;
	private boolean lateCheckIn;
	private boolean lateCheckOut;
	private boolean visible;
	
	public Reservas(Habitacion h, Fecha fi, Fecha ff, Grupo g, Factura f, int p, int n, boolean cIn, boolean cOut, boolean lateCheckIn, boolean lCOut) {
		
		habitacion=h;
		fechaInicial=fi;
		fechaFinal=ff;
		grupo=g;
		factura=f;
		personas=p;
		ninos=n;
		checkIn=cIn;
		checkOut=cOut;
		this.lateCheckIn=lateCheckIn;
		lateCheckOut=lCOut;
		
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public Fecha getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Fecha fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Fecha getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Fecha fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

	public int getNinos() {
		return ninos;
	}

	public void setNinos(int ninos) {
		this.ninos = ninos;
	}

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	public boolean isCheckOut() {
		return checkOut;
	}

	public void setCheckOut(boolean checkOut) {
		this.checkOut = checkOut;
	}

	public boolean isLateCheckIn() {
		return lateCheckIn;
	}

	public void setLateCheckIn(boolean lateCheckIn) {
		this.lateCheckIn = lateCheckIn;
	}

	public boolean isLateCheckOut() {
		return lateCheckOut;
	}

	public void setLateCheckOut(boolean lateCheckOut) {
		this.lateCheckOut = lateCheckOut;
	}
	
	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean state) {
		this.visible = state;
	}
}
