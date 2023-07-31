package com.muhammet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class Test06_TekrarEdenTestler {

    @RepeatedTest(100)
    void getPostListTest(){
        System.out.println("postlar listelendi.");
    }

    @RepeatedTest(value = 50, name = "denemeler {currentRepetition}. Deneme / {totalRepetitions} TEST")
    @DisplayName("Post Listeleme Testi")
    void getPostListTest2(){
        System.out.println("postlar listelendi.");
    }


}
