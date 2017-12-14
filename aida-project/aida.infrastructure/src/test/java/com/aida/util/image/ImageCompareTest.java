package com.aida.util.image;

import junit.framework.TestCase;

import java.io.File;

import com.aida.util.TestUtil;
import com.aida.util.image.ImageCompare;


public class ImageCompareTest extends TestCase {

    public void testCompareImage() throws Exception {
        String path = TestUtil.path+"/image";
        float v = ImageCompare.compareImage(new File(path + "/1.jpg"), new File(path + "/1.jpg"));
        System.out.println(v);
    }
}