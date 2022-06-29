/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author eduar
 */
public class Paciente extends Pessoa{

    private String problema;

    public Paciente(String problema, String nome, int idade, char sexo) {
        super(nome, idade, sexo);
        this.problema = problema;
    }
    
    public void contarProblema(){
        System.out.println(this.problema);
    }
    
    


}
