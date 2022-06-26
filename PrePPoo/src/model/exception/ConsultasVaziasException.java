/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.exception;

/**
 *
 * @author eduar
 */
public class ConsultasVaziasException extends Exception{

    public ConsultasVaziasException() {
        super("Numero da consulta invalido ou nao ha consultas para desmarcar.");
    }
    
}
