package com.aida.helper;

import com.aida.util.TestUtil;
import com.aida.util.functions.ObjectHandler;
import com.aida.util.functions.ObjectProcess;
import com.aida.util.helper.CollectionHelper;
import com.aida.util.helper.FileHelper;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by monsoon on 18/06/2017.
 */
public class FileHelperTest {
    private  String file =  TestUtil.path+ "EnglishWrite.txt";

    /**
     * 逐行打印
     */
    @Test
    public void handlerWithLine(){
        FileHelper.handlerWithLine(new File(file), "UTF-8", new ObjectHandler<String>() {
            @Override
            public void handler(String s) {
                System.out.println(s);
            }
        }) ;
    }

    /**
     * 逐行读取并获取长度大于15的行
     */
    @Test
    public void processWithLine(){
        List<String> lines = new ArrayList<String>();
        FileHelper.processWithLine(new File(file), "UTF-8", lines, new ObjectProcess<String,String>() {
            @Override
            public String process(String o) {
                if(o != null && o.length() > 15){
                    return o;
                }
                return null;
            }
        });

        CollectionHelper.handler(lines, new ObjectHandler<String>() {
            @Override
            public void handler(String s) {
                System.out.println(s);
            }
        });

    }
}