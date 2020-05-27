package com.yeqing.command.comman.impl;

import com.yeqing.command.comman.Command;
import com.yeqing.command.object.Light;

public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
