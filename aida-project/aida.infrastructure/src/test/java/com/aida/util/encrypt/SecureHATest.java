package com.aida.util.encrypt;

import com.aida.util.encrypt.SecureHA;

import junit.framework.TestCase;

public class SecureHATest extends TestCase {
    public void testGetResult() throws Exception {

        String result = SecureHA.getResult("简单加密");
        System.out.println(result);


    }
}

