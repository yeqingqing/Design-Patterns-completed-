package com.yeqing.command.comman.impl;

import com.yeqing.command.comman.Command;

/**
 * Nocommand其实是一个空对象，，当你不想返回一个有意义的对象时，
 * 空对象就很有用。客户也可以将处理null的责任转移给空对象。
 * 比如遥控器不可能一出厂就设置了有意义的命令对象。
 * 所以提供NoCommand对象作为代用品，当调用它的execute()方法时，
 * 这种对象什么事情都不做，或者给一个什么都不做的提示
 *
 * 在很多设计模式中，都会看到空对象的使用，甚至有些时候，空对象
 * 本身也被视为一种设计模式
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("未设置");
    }
}
