package com.exemplo.hospitalPAN.model;

import java.util.Objects;

public class Agenda {

	String id;
	String data;
	String paciente;
	Medico medico;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	@Override
	public int hashCode() {
		return Objects.hash(data, id, medico, paciente);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return Objects.equals(data, other.data) && Objects.equals(id, other.id) && Objects.equals(medico, other.medico)
				&& Objects.equals(paciente, other.paciente);
	}
	
	
	
}
