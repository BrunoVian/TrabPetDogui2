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
    private static final String ENUM = "br.com.unipar.frameworks.model.enums";
    private static final String UTIL = "br.com.unipar.frameworks.model.util";
    
    
    private static Logger logGERAL = LogManager.getLogger(GERAL);
    private static Logger logPERSISTENCIA = LogManager.getLogger(PERSISTENCIA);
    private static Logger logENUM = LogManager.getLogger(ENUM);
    private static Logger logUTIL = LogManager.getLogger(UTIL);
    
    public static void infoGeral(String msg){
        logGERAL.info("--Msg Log Geral: " + msg);        
    }
    
    public static void erroGeral(Exception ex){
        logGERAL.error("--Msg Log Error: ",ex.getMessage());
        for(StackTraceElement el : ex.getStackTrace())
            logGERAL.error(( el.toString()));
    }
    
     public static void infoPersistencia(String msg){
        logPERSISTENCIA.info("--Msg Log Persistencia: " + msg);        
    }
    
    public static void erroPersistencia(Exception ex){
        logPERSISTENCIA.error("--Msg Log Persistencia: ",ex.getMessage());
        for(StackTraceElement el : ex.getStackTrace())
            logPERSISTENCIA.error(( el.toString()));
    }
    
    
    
    
    
}
