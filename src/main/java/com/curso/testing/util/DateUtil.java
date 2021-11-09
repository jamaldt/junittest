package com.curso.testing.util;

/**
 * System:                 CleanBnB
 * Name:                   DateUtil
 * Description:            Class that represents a DateUtil's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/9/21
 */
public class DateUtil {

    public static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
