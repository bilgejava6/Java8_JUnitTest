package com.muhammet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Bu Sinif Ozel bir ozelligi test etmek icin olusturuldu")
public class Test02_DisplayName {

    @Test
    @DisplayName("Bu test metodu 01")
    void test01(){
        System.out.println("Test 01");
    }

    @Test
    @DisplayName("")
    void test02_NEYYY(){
        System.out.println("Test 01");
    }

    @Nested
    class nestedClassOrnek{

        @Test
        @DisplayName("Bu test metodu 02")
        void deneme(){
            System.out.println("Deneme");
        }
    }


}
