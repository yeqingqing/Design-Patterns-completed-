package com.yeqing.command.control;

import com.yeqing.command.comman.Command;
import com.yeqing.command.comman.impl.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    /**
     * 确保所有的Command对象，
     * 然后按键就不需要判断slot是否为空了
     */
    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
          Command noCommand = new NoCommand();
        for(int i=0; i<7;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand,Command offCommand){

        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;

    }

    public void onButtonWaPushed(int slot){
        onCommands[slot].execute();
    }
    public void offButtonWaPushed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------Remote Control -------\n");
        for(int i = 0; i < onCommands.length; i++){
            stringBuffer.append("[slot" +i + "]" + onCommands[i].getClass().getName()
            + "  " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
