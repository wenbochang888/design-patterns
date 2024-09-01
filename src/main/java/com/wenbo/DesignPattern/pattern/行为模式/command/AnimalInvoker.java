package com.wenbo.DesignPattern.pattern.行为模式.command;

/**
 * @author changwenbo
 * @date 2024/7/29 21:51
 */
public class AnimalInvoker {
    private BaseCommand command;

    public AnimalInvoker(BaseCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}

