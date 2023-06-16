/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.frameworks.hibernatemaven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PetDoguiLog {
    
    private static final String GERAL = "br.com.unipar.frameworks";
    private static final String PERSISTENCIA = "br.com.unipar.frameworks.model.dao";
    
    private static Logger logGERAL = LogManager.getLogger(GERAL);
    private static Logger logPERSISTENCIA = LogManager.getLogger(PERSISTENCIA);
    
    public static void infoGeral(String msg){
        logGERAL.info("--Mensagem Log Geral: " + msg);        
    }
    
    public static void erroGeral(Exception ex){
        
        logGERAL.error("--Mensagem Log Error: ",ex.getMessage());
        for(StackTraceElement el : ex.getStackTrace())
            logGERAL.error(( el.toString()));
       
    }
    
}
