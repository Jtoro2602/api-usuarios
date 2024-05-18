package cl.prueba.pruebajava.mysql.entity;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Transactional
@Table(name="usuarios", schema = "pta")
public class Usuarios implements Serializable {

    @Id
    @Column(name="id_usuarios")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigInteger idUsuarios;

    @Column(name="rut")
    public String rut;

    @Column(name="nombre")
    public String nombre;

    @Column(name="apellido_paterno")
    public String apellidoPaterno;

    @Column(name="apellido_materno")
    public String apellidoMaterno;

    @Column(name="fono")
    public String fono;

    @Column(name="sexo")
    public String sexo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_insert")
    public Date fechaInsert;

    public Usuarios(){}

    public BigInteger getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(BigInteger idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaInsert() {
        return fechaInsert;
    }

    public void setFechaInsert(Date fechaInsert) {
        this.fechaInsert = fechaInsert;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "idUsuarios=" + idUsuarios +
                ", rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", fono='" + fono + '\'' +
                ", sexo='" + sexo + '\'' +
                ", fechaInsert=" + fechaInsert +
                '}';
    }
}
