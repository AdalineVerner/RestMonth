package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class RestMonthServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Rest.csv")
    public void calculateForCaseOne(int expected, int income,int expenses,int threshold) {
        RestMonthService service = new RestMonthService();

        int actual = service.calculate(income,expenses,threshold);

        Assertions.assertEquals(expected, actual);
    }
       // @Test

      //  public void calculateForCaseTwo(){
          //  RestMonthService service = new RestMonthService();
         //   int expected =2;

      //      int actual = service.calculate(100_000,60_000,150_000);

        //    Assertions.assertEquals(expected,actual);
   // }

}
