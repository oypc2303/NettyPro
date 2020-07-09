package com.atguigu.nio;

import java.nio.ByteBuffer;

/**
 * <p>https://www.bilibili.com/video/BV1DJ411m7NR?p=17</p>
 *
 *  类型放入与取出的顺序要保持一致
 * @param
 * @return 
 * @author pcoy 2020/7/9 16:09
 */
public class NIOByteBufferPutGet {
    public static void main(String[] args) {
        //创建一个Buffer
        ByteBuffer buffer = ByteBuffer.allocate(64);

        //类型化方式放入数据
        buffer.putInt(100);
        buffer.putLong(9);
        buffer.putChar('尚');
        buffer.putShort((short) 4);

        //取出
        buffer.flip();

        System.out.println();

        System.out.println(buffer.getInt());
        System.out.println(buffer.getLong());
        System.out.println(buffer.getChar());
        System.out.println(buffer.getShort());
    }
}
