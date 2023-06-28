package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestMonthServiceTest {

    @Test
    public void calculateForCaseOne(){
        RestMonthService service = new RestMonthService();
        int expected =3;

        int actual = service.calculate(10_000,3_000,20_000);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void calculateForCaseTwo(){
        RestMonthService service = new RestMonthService();
        int expected = 2;
        int actual = service.calculate(100_000,60_000,150_000);

        Assertions.assertEquals(expected,actual);
    }
}
