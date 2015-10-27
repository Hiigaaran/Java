/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dto;

import cl.dominio.Participante;
import cl.dominio.Raza;
import java.io.Serializable;

/**
 *
 * @author profe Hernán
 * @version 9-10-2015
 */
public class ParticipanteRazaDTO implements Serializable{
    
    private Participante participante;
    private Raza raza;

    public ParticipanteRazaDTO() {
    }

    public ParticipanteRazaDTO(Participante participante, Raza raza) {
        this.participante = participante;
        this.raza = raza;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }
    
    
    
    
}
