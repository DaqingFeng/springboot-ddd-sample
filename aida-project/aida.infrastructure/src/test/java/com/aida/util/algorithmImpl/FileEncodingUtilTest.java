package com.aida.util.algorithmImpl;

import junit.framework.TestCase;

import java.io.File;
import java.io.FilenameFilter;

import com.aida.util.TestUtil;
import com.opslab.util.algorithmImpl.FileEncodingUtil;

public class FileEncodingUtilTest extends TestCase {

    public void testConvert()   {
        String file = TestUtil.path+ "GBKTOUTF8.txt";
        FileEncodingUtil.convert(file, "GBK", "UTF-8");
    }

    public void testConvert1() {
        String file = TestUtil.path + "GBKTOUTF8.txt";
        FileEncodingUtil.convert(file, "UTF-8", "GBK", new FilenameFilter() {
                    public boolean accept(File dir, String name) {
                        return name.endsWith("txt");
                    }
                });
    }

    public void testConvert2(){
        String file = TestUtil.path + "GBKTOUTF8.txt";
        FileEncodingUtil.convert(new File(file),"GBK", "UTF-8");
    }
}