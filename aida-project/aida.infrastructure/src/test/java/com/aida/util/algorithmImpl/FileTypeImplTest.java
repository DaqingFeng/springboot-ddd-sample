package com.aida.util.algorithmImpl;

import junit.framework.TestCase;
import org.junit.Test;

import com.aida.util.TestUtil;
import com.aida.util.algorithmImpl.FileTypeImpl;

import java.io.File;

public class FileTypeImplTest extends TestCase {

    @Test
    public void testFileType() {
        assertEquals("gif", FileTypeImpl.getFileType(new File(TestUtil.path + "ali.gif")));
        assertEquals("png", FileTypeImpl.getFileType(new File(TestUtil.path + "tgepng")));
    }

}