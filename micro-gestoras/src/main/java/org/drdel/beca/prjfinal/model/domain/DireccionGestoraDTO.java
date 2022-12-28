package org.drdel.beca.prjfinal.model.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.json.JSONObject;

import javax.validation.constraints.Size;
import java.util.Date;

public class DireccionGestoraDTO {

    private Long idDireccion;

    private Long idGestora;

    private String direccion;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Size(max = 10)
    private Date aud_crea_date;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Size(max = 20)
    private Date aud_mod_date;

    @Size(max = 20)
    private String aud_crea_proc;


    @Size(max = 20)
    private String aud_mod_proc;

    @Size(max = 20)
    private String aud_crea_usu;

    @Size(max = 20)
    private String aud_mod_usu;


    //CONSTRUCTOR
    public DireccionGestoraDTO() {
    }

    public DireccionGestoraDTO(Long idDireccion, Long idGestora, String direccion, Date aud_crea_date, Date aud_mod_date, String aud_crea_proc, String aud_mod_proc, String aud_crea_usu, String aud_mod_usu) {
        this.idDireccion = idDireccion;
        this.idGestora = idGestora;
        this.direccion = direccion;
        this.aud_crea_date = aud_crea_date;
        this.aud_mod_date = aud_mod_date;
        this.aud_crea_proc = aud_crea_proc;
        this.aud_mod_proc = aud_mod_proc;
        this.aud_crea_usu = aud_crea_usu;
        this.aud_mod_usu = aud_mod_usu;
    }


    //SET-GET
    public Long getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Long getIdGestora() {
        return idGestora;
    }

    public void setIdGestora(Long idGestora) {
        this.idGestora = idGestora;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getAud_crea_date() {
        return aud_crea_date;
    }

    public void setAud_crea_date(Date aud_crea_date) {
        this.aud_crea_date = aud_crea_date;
    }

    public Date getAud_mod_date() {
        return aud_mod_date;
    }

    public void setAud_mod_date(Date aud_mod_date) {
        this.aud_mod_date = aud_mod_date;
    }

    public String getAud_crea_proc() {
        return aud_crea_proc;
    }

    public void setAud_crea_proc(String aud_crea_proc) {
        this.aud_crea_proc = aud_crea_proc;
    }

    public String getAud_mod_proc() {
        return aud_mod_proc;
    }

    public void setAud_mod_proc(String aud_mod_proc) {
        this.aud_mod_proc = aud_mod_proc;
    }

    public String getAud_crea_usu() {
        return aud_crea_usu;
    }

    public void setAud_crea_usu(String aud_crea_usu) {
        this.aud_crea_usu = aud_crea_usu;
    }

    public String getAud_mod_usu() {
        return aud_mod_usu;
    }

    public void setAud_mod_usu(String aud_mod_usu) {
        this.aud_mod_usu = aud_mod_usu;
    }

    public String toJSON(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("idDireccion" ,idDireccion);
        jsonObject.put("idGestora" ,idGestora);
        jsonObject.put("direccion" ,direccion);
        jsonObject.put("aud_crea_date" ,aud_crea_date);
        jsonObject.put("aud_mod_date" ,aud_mod_date);
        jsonObject.put("aud_crea_proc" ,aud_crea_proc);
        jsonObject.put("aud_mod_proc" ,aud_mod_proc);
        jsonObject.put("aud_crea_usu" ,aud_crea_usu);
        jsonObject.put("aud_mod_usu" ,aud_mod_usu);

        return jsonObject.toString();

    }
}
