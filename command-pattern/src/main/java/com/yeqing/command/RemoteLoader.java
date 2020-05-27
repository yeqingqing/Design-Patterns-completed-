package com.yeqing.command;

import com.yeqing.command.comman.impl.LightOffCommand;
import com.yeqing.command.comman.impl.LightOnCommand;
import com.yeqing.command.comman.impl.StereoOffWithCDCommand;
import com.yeqing.command.comman.impl.StereoOnWithCDCommand;
import com.yeqing.command.control.RemoteControl;
import com.yeqing.command.object.Light;
import com.yeqing.command.object.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl =new RemoteControl();
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenRoomLightOn,kitchenRoomLightOff);
        remoteControl.setCommand(2,stereoOnWithCD,stereoOffWithCD);

        System.out.println(remoteControl);

        remoteControl.onButtonWaPushed(0);
        remoteControl.offButtonWaPushed(0);
        remoteControl.onButtonWaPushed(1);
        remoteControl.offButtonWaPushed(1);
        remoteControl.onButtonWaPushed(2);
        remoteControl.offButtonWaPushed(2);
    }
}
