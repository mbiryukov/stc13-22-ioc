package ru.innopolis.stc13.iocTest.IO;

public class FileDownloader implements Downloader {
    @Override
    public String download(String path) {
        System.out.println(new StringBuilder("Resource from file")
                .append(path)
                .append(" was downloaded")
                .toString());
        return "CoNtEnT";
    }
}
