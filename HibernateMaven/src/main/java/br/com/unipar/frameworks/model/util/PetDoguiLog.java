package br.com.unipar.frameworks.model.util;

import java.awt.Frame;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PetDoguiLog {

    private static final String GERAL = "br.com.unipar.frameworks";
    private static final String PERSISTENCIA = "br.com.unipar.frameworks.model.dao";
    private static final String FRAMES = "br.com.unipar.frameworks.model.frames";
    private static final String ENUM = "br.com.unipar.frameworks.model.enums";
    private static final String UTIL = "br.com.unipar.frameworks.model.util";

    private static Logger logGERAL = LogManager.getLogger(GERAL);
    private static Logger logPERSISTENCIA = LogManager.getLogger(PERSISTENCIA);
    private static Logger logFRAMES = LogManager.getLogger(FRAMES);
    private static Logger logENUM = LogManager.getLogger(ENUM);
    private static Logger logUTIL = LogManager.getLogger(UTIL);

    public static void infoGeral(String msg) {
        logGERAL.info("--Msg Log Geral: " + msg);
    }

    public static void erroGeral(Exception ex) {
        logGERAL.error("--Msg Log Error: ", ex.getMessage());
        for (StackTraceElement el : ex.getStackTrace()) {
            logGERAL.error((el.toString()));
        }
    }

    public void infoPersistencia(String msg, String nomeClasse) {
        logPERSISTENCIA.info("--Msg Log Persistencia: " + msg + " - " + nomeClasse);
    }

    public static void erroPersistencia(Exception ex) {
        logPERSISTENCIA.error("--Msg Log Persistencia: ", ex.getMessage());
        for (StackTraceElement el : ex.getStackTrace()) {
            logPERSISTENCIA.error((el.toString()));
        }
    }

    public static void infoEnum(String msg) {
        logENUM.info("--Msg Log Enum: " + msg);
    }

    public static void erroEnum(Exception ex) {
        logENUM.error("--Msg Log Enum: ", ex.getMessage());
        for (StackTraceElement el : ex.getStackTrace()) {
            logENUM.error((el.toString()));
        }
    }

    public static void infoUtil(String msg) {
        logUTIL.info("--Msg Log Util: " + msg);
    }

    public static void erroUtil(Exception ex) {
        logUTIL.error("--Msg Log Util: ", ex.getMessage());
        for (StackTraceElement el : ex.getStackTrace()) {
            logUTIL.error((el.toString()));
        }
    }

    public static void infoFrames(String msg) {
        logFRAMES.info("--Msg Log Frames: " + msg);
    }

    public static void erroFrames(Exception ex) {
        logFRAMES.error("--Msg Log Frames: ", ex.getMessage());
        for (StackTraceElement el : ex.getStackTrace()) {
            logFRAMES.error((el.toString()));
        }
    }

}
