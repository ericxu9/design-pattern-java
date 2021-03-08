package org.xumiao.Facade;

/**
 * 门面模式
 */
public class Application {

    public static void main(String[] args) {
        CameraMaker cameraMaker = new CameraMaker();
        cameraMaker.takePicture2EOSRP();
        cameraMaker.takePicture2XT4();
    }
}
