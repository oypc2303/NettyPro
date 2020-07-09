package com.atguigu.nio;

import java.nio.IntBuffer;

/**
 * <p>https://www.bilibili.com/video/BV1DJ411m7NR?p=9</p>
 *
 * @param
 * @return 
 * @author pcoy 2020/7/9 13:55
 */
public class BasicBuffer {
    public static void main(String[] args) {

        //举例说明Buffer 的使用 (简单说明)
        //创建一个Buffer, 大小为 5, 即可以存放5个int
        IntBuffer intBuffer = IntBuffer.allocate(5);

        //向buffer 存放数据
//        intBuffer.put(10);
//        intBuffer.put(11);
//        intBuffer.put(12);
//        intBuffer.put(13);
//        intBuffer.put(14);
        for(int i = 0; i < intBuffer.capacity(); i++) {
            intBuffer.put( i * 2);
        }


        /*
        public final Buffer flip() {
        limit = position; //读数据不能超过5
        position = 0;
        mark = -1;
        return this;
    }
         */

        //如何从buffer读取数据
        //将buffer转换，读写切换(!!!)
        intBuffer.flip();
        intBuffer.position(1);//1,2
        System.out.println(intBuffer.get());
        intBuffer.limit(3);
        while (intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }
    }
}
