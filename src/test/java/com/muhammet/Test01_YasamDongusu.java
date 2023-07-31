package com.muhammet;

import org.junit.jupiter.api.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Test01_YasamDongusu {

    private Islemler islemler;
    private int[] sayilar;

    /**
     * Tüm testlerden önce 1 kez çalışan ilk methoddur.
     */
    @BeforeAll
    void initAll(){
        System.out.println("Ilk Calisan BENIM");
    }

    /**
     * kullanılacak her testten önce tüm değişkenlerin  sıfırlanması ve initialize edilemesini
     * istiyorum. bunun için tüm test methodlarından önce çalışacak
     * @BeforeEach methodunu kullanıyorum.
     */

    @BeforeEach
    public void init(){
        System.out.println("Her test methosundan once calisir");
    }

    @Test
    public void test01() {
        System.out.println("Test01_YasamDongusu.test01()");
    }
    @Test
    @Disabled
    public void test02() {
        System.out.println("Test01_YasamDongusu.test02()");
    }

    /**
     * Methodların işlemleri bittikten sonra yapılacak işlemleri tamamlamak için
     * @AfterEach methodunu kullanıyorum.
     */
    @AfterEach
    public void sonCalisanMethod(){
        System.out.println("Her test methodundan sonra calisir");
    }

    @AfterAll
    void sonUtucu(){
        System.out.println("Son Utucu");
    }
}
