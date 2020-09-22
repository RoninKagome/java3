package com.company;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("apple");
        Computer computer = new Computer();
        ComputerService.createFile(computer,StudentService.generateFilename(student));

        System.out.println(FileService.getName(computer.files.get(0)));
    }
}
