package com.example.demo.commands;

public interface Command {
    void execute(String input);
    boolean matches(String input);
}
