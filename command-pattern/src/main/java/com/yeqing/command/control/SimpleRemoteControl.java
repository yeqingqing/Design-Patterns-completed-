package com.yeqing.command.control;

import com.yeqing.command.comman.Command;

public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl(){
    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
