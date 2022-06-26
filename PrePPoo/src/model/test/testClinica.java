/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model.test;

import java.util.concurrent.ConcurrentHashMap;
import model.Consulta;
import model.Medico;
import model.Paciente;
import model.Pessoa;

/**
 *
 * @author eduar
 */
public class testClinica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Medico m1 = new Medico("Roberto Staks", 45 , 'M');
        Paciente p1 = new Paciente("Dificuldade em respirar", "Fabiano Mendes", 26, 'M');
        Consulta c1 = new Consulta(10.5, "Roberto Staks", "Fabiano Mendes");
        Consulta c2 = new Consulta(12.5, "Gabriela Silveira", "Roberto Carlos");
        
        c1.marcarConsulta(c1);
        c1.marcarConsulta(c2);
        c1.verConsultas();
        c1.desmarcarConsulta(1);
        c1.desmarcarConsulta(0);
        c1.desmarcarConsulta(0);
        c1.verConsultas();
        m1.fichaPaciente(p1);
        
        c1.consultaEspecifica(c2);
    }
    
}
