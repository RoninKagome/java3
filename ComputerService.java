package com.company;

public class ComputerService {
    static void createFile(Computer computer, String filename) {
        computer.files.add(FileService.createFile(filename));
    }
}
