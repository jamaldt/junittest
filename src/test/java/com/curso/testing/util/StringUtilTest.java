package com.curso.testing.util;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * System:                 CleanBnB
 * Name:                   StringUtilTest
 * Description:            Class that represents a StringUtilTest's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/8/21
 */
public class StringUtilTest
{
    public static void main(String[] args)
    {
        String result = StringUtil.repeat("hola",3);
        System.out.println(result);
        assertEquals("holaholahola",result);
        /*if(!result.equals("holaholahola")){
            //System.out.println("ERROR");
            throw new RuntimeException("ERROR");        }*/
    }
    @Test
    public void testRepeat(){
        Assert.assertEquals("holahola",StringUtil.repeat("hola",2));
    }
/*
    private static void assertEquals(String actual,String expected){
        if(!actual.equals(expected)){
            throw new RuntimeException(actual + "is not equal to " + expected);
        }
    }*/
}