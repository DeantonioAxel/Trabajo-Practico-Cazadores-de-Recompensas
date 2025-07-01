package ar.edu.unlam.alumno.pb2.zona;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.alumno.pb2.profugo.Profugo;

public class Zona {

	private String nombreZona;
	private List<Profugo> listaProfugos = new LinkedList<Profugo>();
	
	public Zona(String nombreZona, List<Profugo> listaProfugos) {
		this.nombreZona = nombreZona;
		this.listaProfugos = listaProfugos;
	}
}
