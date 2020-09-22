package com.company;

public class FileService {
    static File createFile(String filename) {
        File file = new File(filename);
        return file;
    }
    static String getName(File file) {
        return file.name;
    }
}
