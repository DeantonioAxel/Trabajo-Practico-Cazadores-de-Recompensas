package ar.edu.unlam.alumno.pb2.agencia;

import java.util.LinkedList;
import java.util.List;

import ar.edu.unlam.alumno.pb2.cazador.Cazador;
import ar.edu.unlam.alumno.pb2.profugo.Profugo;

public class Agencia {
	private List<Cazador> listaCazadores = new LinkedList<Cazador>();
	private List<Profugo> listaProfugos = new LinkedList<Profugo>();
	
	public Agencia(List<Cazador> listaCazadores, List<Profugo> listaProfugos) {
		this.listaCazadores = listaCazadores;
		this.listaProfugos = listaProfugos;
	}
}
