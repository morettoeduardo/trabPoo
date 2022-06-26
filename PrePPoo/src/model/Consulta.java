/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import model.exception.ConsultaInexistente;
import model.exception.ConsultasVaziasException;

/**
 *
 * @author eduar
 */
public class Consulta {
    List<Consulta> consultas;
    
    private double horario;
    private String medico;
    private String paciente;

    public Consulta(double horario, String medico, String paciente) {
        this.consultas = new ArrayList();
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
    }
    
    public void verConsultas(){
        consultas.forEach( consulta -> System.out.println(consulta));
    }
    
    public void marcarConsulta(Consulta consulta){
        consultas.add(consulta);
    }
    
    public void consultaEspecifica(Consulta consulta) throws ConsultaInexistente{
        boolean existeConsulta = consultas.contains(consulta);
        if (existeConsulta){
            System.out.println(consulta);
        } else {
            throw new ConsultaInexistente();
        }
    }
    
    public void desmarcarConsulta(int index) throws ConsultasVaziasException{
        boolean estaVazia = consultas.isEmpty();
        if(estaVazia){
            throw new ConsultasVaziasException();
        } else{
            consultas.remove(index);
        }        
    }
    
    public String toString(){
        return "Paciente: " + this.paciente + "  --  Medico:  " + this.medico + "  --  Horario: " + this.horario;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public double getHorario() {
        return horario;
    }

    public String getMedico() {
        return medico;
    }

    public String getPaciente() {
        return paciente;
    }
    
}
