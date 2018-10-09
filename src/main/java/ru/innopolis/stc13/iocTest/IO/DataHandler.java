package ru.innopolis.stc13.iocTest.IO;

public class DataHandler {
    private Downloader downloader;
    private Uploader uploader;

    public DataHandler() {
    }

    public void handleData(String srcPath, String destPath) {
        String content = this.downloader.download(srcPath);
        String handledContent = handle(content);
        this.uploader.upload(destPath, handledContent);
    }

    private String handle(String content) {
        return content.toLowerCase();
    }

    public Downloader getDownloader() {
        return downloader;
    }

    public void setDownloader(Downloader downloader) {
        this.downloader = downloader;
    }

    public Uploader getUploader() {
        return uploader;
    }

    public void setUploader(Uploader uploader) {
        this.uploader = uploader;
    }
}
