package com.curso.testing.util;

/**
 * System:                 CleanBnB
 * Name:                   PasswordUtil
 * Description:            Class that represents a PasswordUtil's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/8/21
 */
public class PasswordUtil
{
    public  enum SecurityLevel{
        WEAK,MEDIUM,STRONG
    }

    public static SecurityLevel assessPassword(String password){
        if(password.length() < 8){
            return  SecurityLevel.WEAK;
        }

        if(password.matches("[a-zA-A]+")){
            return SecurityLevel.WEAK;
        }
        return SecurityLevel.MEDIUM;
    }
}
