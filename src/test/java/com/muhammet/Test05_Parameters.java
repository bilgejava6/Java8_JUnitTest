package com.muhammet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
public class Test05_Parameters {
    /**
     * girilen ismin baş harfinin m ile başlayıp başlamadığını test edelim.
     */
    @ParameterizedTest
    @ValueSource(strings = {"muhammet", "mehmet", "Mehmet muhammet","ahmet"})
    void upperCaseString(String ad){
        assertTrue(ad.toLowerCase().startsWith("m"));
    }
    @ParameterizedTest
    @CsvSource({
            "muhammet, 12345",
            "mehmet, 12345",
            "Mehmet muhammet, 12345",
    })
    void loginTest(String username, String password){
        String un = "muhammet";
        String pw = "12345";
        boolean islogin = false;
        if(un.equals(username) && pw.equals(password)){
            islogin = true;
        }
        assertTrue(islogin);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/MOCK_DATA.csv")
    void saveUser(ArgumentsAccessor arg){
        System.out.println("id....: "+ arg.getInteger(0));
        System.out.println("ad....: "+ arg.getString(1));

    }

}
