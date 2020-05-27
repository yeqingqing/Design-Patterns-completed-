package com.yeqing.command.comman.impl;

import com.yeqing.command.comman.Command;
import com.yeqing.command.object.Stereo;

public class StereoOffWithCDCommand implements Command {

    Stereo stereo;
    public StereoOffWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.off();
    }
}
