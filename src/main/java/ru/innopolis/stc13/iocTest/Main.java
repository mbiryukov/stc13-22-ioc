package ru.innopolis.stc13.iocTest;

import ru.innopolis.stc13.iocTest.IO.DBDownloader;
import ru.innopolis.stc13.iocTest.IO.DataHandler;
import ru.innopolis.stc13.iocTest.IO.FileUploader;

public class Main {
    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler();
        dataHandler.setDownloader(new DBDownloader());
        dataHandler.setUploader(new FileUploader());
        dataHandler.handleData("SomeSrc", "AnotherSrc");
    }
}
