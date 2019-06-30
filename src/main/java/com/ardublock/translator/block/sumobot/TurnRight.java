package com.ardublock.translator.block.sumobot;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.BlockException;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;

public class TurnRight extends TranslatorBlock {


    public TurnRight(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label) {
        super(blockId, translator, codePrefix, codeSuffix, label);
    }

    @Override
    public String toCode() throws SocketNullException, SubroutineNotDeclaredException, BlockException {
        translator.addHeaderFile("moteur.h");
        Config.setupMotorPins(translator);
        TranslatorBlock socket = this.getTranslatorBlockAtSocket(0);
        return "moteur_rotation_droite((int)" + socket.toCode() + ", (int)" + socket.toCode() + ");";
    }
}
