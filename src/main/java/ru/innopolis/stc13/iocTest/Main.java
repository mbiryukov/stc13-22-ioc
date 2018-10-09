package ru.innopolis.stc13.iocTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.innopolis.stc13.iocTest.IO.DataHandler;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("appContext.xml");
        DataHandler dataHandler =
                (DataHandler) applicationContext.getBean("dataHandler");
        dataHandler.handleData("SomeSrc", "AnotherSrc");
    }
}
