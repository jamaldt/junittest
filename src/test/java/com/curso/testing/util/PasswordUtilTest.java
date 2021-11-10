package com.curso.testing.util;

import org.junit.Test;

import static com.curso.testing.util.PasswordUtil.SecurityLevel.MEDIUM;
import static com.curso.testing.util.PasswordUtil.SecurityLevel.STRONG;
import static com.curso.testing.util.PasswordUtil.SecurityLevel.WEAK;
import static org.junit.Assert.*;

/**
 * System:                 CleanBnB
 * Name:                   PasswordUtilTest
 * Description:            Class that represents a PasswordUtilTest's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/8/21
 */
public class PasswordUtilTest
{
    @Test
    public void weak_when_has_less_than_8_letters()
    {
        assertEquals(WEAK,PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_less_only_letters()
    {
        assertEquals(WEAK,PasswordUtil.assessPassword("abcdefg"));
    }

    @Test
    public void weak_when_has_letters_and_numbers()
    {
        assertEquals(MEDIUM,PasswordUtil.assessPassword("abcdefg"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcde12345"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd123!"));
    }


}