package com.yeqing.command.comman.impl;

import com.yeqing.command.comman.Command;
import com.yeqing.command.object.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
