package com.yeqing.command.comman.impl;

import com.yeqing.command.comman.Command;
import com.yeqing.command.object.Stereo;

import java.security.PublicKey;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.on();
        stereo.setCD("周杰伦");
        stereo.setVolume(11);
    }
}
