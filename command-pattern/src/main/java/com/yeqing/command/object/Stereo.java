package com.yeqing.command.object;

public class Stereo {
    public void on(){
        System.out.println("音响打开了");
    }

    public void off(){
        System.out.println("音响关闭了");
    }

    public void setCD(String s){
        System.out.println("放"+ s +"的CD");
    }

    public void setVolume(int i){
        System.out.println("设置" + i + "的音量");
    }
}
