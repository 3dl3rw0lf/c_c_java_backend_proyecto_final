/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author xang_
 */
public class Piloto {
    private Long pilotId;
    private String pilotName;
    private String pilotImg_src;
    private String pilotAlt_img;
    private String pilotFlag;
    private String pilotCountry;
    private String pilotBadge;
    private int pilotTitles;

    public Piloto(Long pilotId, String pilotName, String pilotImg_src, String pilotAlt_img, String pilotFlag, String pilotCountry, String pilotBadge, int pilotTitles) {
        this.pilotId = pilotId;
        this.pilotName = pilotName;
        this.pilotImg_src = pilotImg_src;
        this.pilotAlt_img = pilotAlt_img;
        this.pilotFlag = pilotFlag;
        this.pilotCountry = pilotCountry;
        this.pilotBadge = pilotBadge;
        this.pilotTitles = pilotTitles;
    }

    public Long getPilotId() {
        return pilotId;
    }

    public void setPilotId(Long pilotId) {
        this.pilotId = pilotId;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public String getPilotImg_src() {
        return pilotImg_src;
    }

    public void setPilotImg_src(String pilotImg_src) {
        this.pilotImg_src = pilotImg_src;
    }

    public String getPilotAlt_img() {
        return pilotAlt_img;
    }

    public void setPilotAlt_img(String pilotAlt_img) {
        this.pilotAlt_img = pilotAlt_img;
    }

    public String getPilotFlag() {
        return pilotFlag;
    }

    public void setPilotFlag(String pilotFlag) {
        this.pilotFlag = pilotFlag;
    }

    public String getPilotCountry() {
        return pilotCountry;
    }

    public void setPilotCountry(String pilotCountry) {
        this.pilotCountry = pilotCountry;
    }

    public String getPilotBadge() {
        return pilotBadge;
    }

    public void setPilotBadge(String pilotBadge) {
        this.pilotBadge = pilotBadge;
    }

    public int getPilotTitles() {
        return pilotTitles;
    }

    public void setPilotTitles(int pilotTitles) {
        this.pilotTitles = pilotTitles;
    }
    
    
}
