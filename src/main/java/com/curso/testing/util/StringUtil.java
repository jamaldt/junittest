package com.curso.testing.util;

/**
 * System:                 CleanBnB
 * Name:                   StringUtil
 * Description:            Class that represents a StringUtil's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/8/21
 */
public class StringUtil
{
    public static String repeat(String str,int times){
        String result="";
        for (int i = 0; i < times; i++)
        {
            result += str;
        }
        return result;
    }
}
