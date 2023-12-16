/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author xang_
 */
public class Escuderia {
    private Long idEscuderia;
    private String nombreEscuderia;
    private String img_Escuderia;
    private int titulosEscuderia;

    public Escuderia(Long idEscuderia, String nombreEscuderia, String img_Escuderia, int titulosEscuderia) {
        this.idEscuderia = idEscuderia;
        this.nombreEscuderia = nombreEscuderia;
        this.img_Escuderia = img_Escuderia;
        this.titulosEscuderia = titulosEscuderia;
    }

    public Long getIdEscuderia() {
        return idEscuderia;
    }

    public void setIdEscuderia(Long idEscuderia) {
        this.idEscuderia = idEscuderia;
    }

    public String getNombreEscuderia() {
        return nombreEscuderia;
    }

    public void setNombreEscuderia(String nombreEscuderia) {
        this.nombreEscuderia = nombreEscuderia;
    }

    public String getImg_Escuderia() {
        return img_Escuderia;
    }

    public void setImg_Escuderia(String img_Escuderia) {
        this.img_Escuderia = img_Escuderia;
    }

    public int getTitulosEscuderia() {
        return titulosEscuderia;
    }

    public void setTitulosEscuderia(int titulosEscuderia) {
        this.titulosEscuderia = titulosEscuderia;
    }
    
    
    
}
