package com.wenbo.DesignPattern.pattern.行为模式.command;

import com.wenbo.DesignPattern.pattern.Animal;
import lombok.extern.slf4j.Slf4j;

/**
 * @author changwenbo
 * @date 2024/7/29 21:51
 */
@Slf4j
public class SpeakCommand implements BaseCommand {
    private final Animal animal;

    public SpeakCommand(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void execute() {
        animal.speak();
    }
}

