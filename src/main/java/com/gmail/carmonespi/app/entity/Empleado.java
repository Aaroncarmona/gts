package com.gmail.carmonespi.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {

	public Empleado() {
		this.puesto = new Puesto();
		this.nombramiento = new Nombramiento();
		this.turno = new Turno();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	@Temporal(TemporalType.DATE)
	@Column(name = "create_at")
	private Date createAt;
	private String sexo;
	private String email;
	@Column(name = "email_inst")
	private String emailIns;
	@Column(name = "tel_uni")
	private String telUni;
	@Column(name = "red_isnt")
	private String redInst;
	@Column(name = "tel_per")
	private String telPer;
	@Column(name = "is_valid")
	private boolean isValid;
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;
	@Temporal(TemporalType.DATE)
	@Column(name = "lastdate")
	private Date lastDate;

	@PrePersist
	public void prePersist() {
		this.lastDate = new Date();
		this.createAt = new Date();
	}

	@ManyToOne(fetch = FetchType.LAZY)
	private Puesto puesto;

	@ManyToOne(fetch = FetchType.LAZY)
	private Nombramiento nombramiento;

	@ManyToOne(fetch = FetchType.LAZY)
	private Turno turno;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailIns() {
		return emailIns;
	}

	public void setEmailIns(String emailIns) {
		this.emailIns = emailIns;
	}

	public String getTelUni() {
		return telUni;
	}

	public void setTelUni(String telUni) {
		this.telUni = telUni;
	}

	public String getRedInst() {
		return redInst;
	}

	public void setRedInst(String redInst) {
		this.redInst = redInst;
	}

	public String getTelPer() {
		return telPer;
	}

	public void setTelPer(String telPer) {
		this.telPer = telPer;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public Nombramiento getNombramiento() {
		return nombramiento;
	}

	public void setNombramiento(Nombramiento nombramiento) {
		this.nombramiento = nombramiento;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	private static final long serialVersionUID = 1L;

}
