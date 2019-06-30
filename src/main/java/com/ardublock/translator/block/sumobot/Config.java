package com.ardublock.translator.block.sumobot;

import com.ardublock.translator.Translator;

public class Config {
    static void setupMotorPins(Translator translator){
        translator.addOutputPin("MOTEUR_G_PWM");
        translator.addOutputPin("MOTEUR_D_PWM");
        translator.addOutputPin("MOTEUR_G_DIR_1");
        translator.addOutputPin("MOTEUR_G_DIR_2");
        translator.addOutputPin("MOTEUR_D_DIR_1");
        translator.addOutputPin("MOTEUR_D_DIR_2");
    }

    static void setupUltrasonicPins(Translator translator){
        translator.addOutputPin("ULTRASON_TRIGGER");
        translator.addInputPin("ULTRASON_ECHO");
    }

    public static String TCRT_AVG = "4";
    public static String TCRT_AVD = "15";
    static void setupTCRT(Translator translator){
        translator.addInputPin(TCRT_AVG);
        translator.addInputPin(TCRT_AVD);
    }
}
