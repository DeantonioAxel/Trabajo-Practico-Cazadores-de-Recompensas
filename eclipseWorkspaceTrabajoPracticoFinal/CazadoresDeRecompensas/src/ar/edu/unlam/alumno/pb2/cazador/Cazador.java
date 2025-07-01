package ar.edu.unlam.alumno.pb2.cazador;

public abstract class Cazador {

	protected String nombreCazador;
	protected Integer experiencia;

	public Cazador(String nombreCazador, Integer experiencia) {
		this.experiencia = experiencia;
		this.nombreCazador = nombreCazador;
	}

	public abstract Integer sumarExperiencia();
	
	public abstract void capturar();

}
