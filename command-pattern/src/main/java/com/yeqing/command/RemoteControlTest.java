package com.yeqing.command;

import com.yeqing.command.comman.impl.LightOnCommand;
import com.yeqing.command.control.SimpleRemoteControl;
import com.yeqing.command.object.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("room");
        LightOnCommand lighOn = new LightOnCommand(light);

        remote.setCommand(lighOn);
        remote.buttonWasPressed();
    }
}
