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

    public static String LED_1 = "0";
    public static String LED_2 = "12";
    public static String BP = "3";
    static public void setupGo(Translator translator){
        translator.addOutputPin(LED_1);
        translator.addOutputPin(LED_2);
        translator.addInputPin(BP);
        translator.addSetupCommand(
                "\n/* Ceci est un code obligatoire pour participer à la compétition */\n" +
                "bool led = false;\n" +
                "  \n" +
                "  while(digitalRead(" + BP + ") == HIGH) \n" +
                "  {\n" +
                "    if (led)\n" +
                "    {\n" +
                "      digitalWrite(" + LED_1 + ", LOW);\n" +
                "      digitalWrite(" + LED_2 + ", HIGH);\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "      digitalWrite(" + LED_1 + ", HIGH);\n" +
                "      digitalWrite(" + LED_2 + ", LOW);\n" +
                "    }\n" +
                "    \n" +
                "    led = !led;\n" +
                "    \n" +
                "    delay(200);\n" +
                "  }\n" +
                "  \n" +
                "  digitalWrite(" + LED_1 + ", LOW);\n" +
                "  digitalWrite(" + LED_2 + ", LOW);\n" +
                "/*****************************************************************/");
    }
}
