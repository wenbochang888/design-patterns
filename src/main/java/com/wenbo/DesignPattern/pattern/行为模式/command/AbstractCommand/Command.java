package com.wenbo.DesignPattern.pattern.行为模式.command.AbstractCommand;

/**
 * @author changwenbo
 * @date 2024/7/29 20:46
 */
@FunctionalInterface
public interface Command<T> {
    T execute();
}

