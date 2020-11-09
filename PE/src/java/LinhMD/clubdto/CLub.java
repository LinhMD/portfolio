/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinhMD.clubdto;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Club implements Serializable{
    private String id;
    private String clubName;
    private String noOFChampion;
    private String country;
    private boolean isActive;

    public Club() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getNoOFChampion() {
        return noOFChampion;
    }

    public void setNoOFChampion(String noOFChampion) {
        this.noOFChampion = noOFChampion;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    
}
