/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author eduar
 */
public class Medico extends Pessoa{

    public Medico(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
    }
    
    public void fichaPaciente(Paciente paciente){   
        paciente.contarProblema();
    }
    
    public void prescreverReceita(){
        System.out.println("Receita...");
    }
    
}
