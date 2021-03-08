package org.xumiao.Facade;

public class FujiXT4 implements Camera{
    @Override
    public void shutter() {
        System.out.println("咔嚓，这张扫街图片完美啊~");
    }
}
