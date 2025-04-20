package org.example.LSP.GoodCode;

public class Main {
    public static void readAnyFile(ReadableFile file){
        file.read();
    }
    public static void main(String[] args) {
        WritableFile writable = new WritableFile();

        writable.write();
        writable.read();

        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();

        System.out.println("**********");
        readAnyFile(writable);
        readAnyFile(readableFile);
    }
}
