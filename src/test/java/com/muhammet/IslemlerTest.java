package com.muhammet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IslemlerTest {

    @Test
    public void toplaTest(){
        Islemler islemler = new Islemler();
        int result = islemler.topla(5,12);
        /**
         * result değerinin 17 olmasını bekleriz eğer öyle ise uygulama başarılıdır.
         */
        Assertions.assertEquals(17,result);
    }

    @Test
    public void bolmeTest(){
        Islemler islemler = new Islemler();
        double result = islemler.bolme(10,2);
        Assertions.assertEquals(5,result);
    }

    @Test
    public void bolmeTestException(){
        Islemler islemler = new Islemler();
       // double result = islemler.bolme(10,0);
      Assertions.assertThrows(ArithmeticException.class,()->islemler.bolme(10,0));
    }
}
