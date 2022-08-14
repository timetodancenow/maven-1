package ru.netology.sqr;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalc () {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService ();

        int actual = service.calcSqr ( 10, 99 );

        int expected = 0;

        Assert.assertEquals ( expected, actual );

    }

    @Test
    public void shouldCalculate () {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService ();

        int actual = service.calcSqr ( 99, 10 );

        int expected = 0;

        Assert.assertEquals ( expected, actual );

    }

}