package com.xhlim.springboot;

import org.junit.Test;

/**
 * @author xhlim@outlook.com
 * @create 2018-03-16
 */
public class LogTest {

    @Test
    public void test(){

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i< 2000000; i++) {
            builder.append("a");
        }

    }

}
