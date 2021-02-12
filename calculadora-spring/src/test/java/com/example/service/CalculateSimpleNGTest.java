/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 *
 * @author jhamil
 */
public class CalculateSimpleNGTest {
    
    private WebDriver driver;
    
    public CalculateSimpleNGTest() {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        driver = new ChromeDriver();
        driver.get("http://localhost:8080/calculadora");
    }
    //suma
    @Test
    public void testAdd(){
        driver.findElement(By.name("a")).clear();
        driver.findElement(By.id("b")).clear();
        driver.findElement(By.name("a")).sendKeys("10");
        driver.findElement(By.id("b")).sendKeys("20");
        int res = 30;
        segundos(2);
        driver.findElement(By.xpath("/html/body/form/p[1]/input[1]")).click();
        segundos(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains(String.valueOf(res)));
        
    }
    //resta
    @Test
    public void testSubstract(){
        driver.findElement(By.name("a")).clear();
        driver.findElement(By.id("b")).clear();
        driver.findElement(By.name("a")).sendKeys("10");
        driver.findElement(By.id("b")).sendKeys("20");
        int res = -10;
        segundos(2);
        driver.findElement(By.xpath("/html/body/form/p[1]/input[2]")).click();
        segundos(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains(String.valueOf(res)));
        
    }
    //multiplicacion
    @Test
    public void testMultiply(){
        driver.findElement(By.name("a")).clear();
        driver.findElement(By.id("b")).clear();
        driver.findElement(By.name("a")).sendKeys("10");
        driver.findElement(By.id("b")).sendKeys("20");
        int res = 200;
        segundos(2);
        driver.findElement(By.xpath("/html/body/form/p[1]/input[3]")).click();
        segundos(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains(String.valueOf(res)));
        
    }
    //divicion
    @Test
    public void testDivide(){
        driver.findElement(By.name("a")).clear();
        driver.findElement(By.id("b")).clear();
        driver.findElement(By.name("a")).sendKeys("40");
        driver.findElement(By.id("b")).sendKeys("20");
        int res = 2;
        
        segundos(2);
        driver.findElement(By.xpath("/html/body/form/p[1]/input[4]")).click();
        segundos(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains(String.valueOf(res)));
        
    }
    //primer boton de borrar
    @Test
    public void testClear1(){
        int res = 0;
        segundos(2);
        driver.findElement(By.xpath("/html/body/form/p[1]/input[5]")).click();
        segundos(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains(String.valueOf(res)));
        
    }
    //fibonacii
    @Test
    public void testFibonacci(){
        driver.findElement(By.name("c")).clear();
        driver.findElement(By.id("c")).sendKeys("8");
        int res = 21;
        segundos(2);
        driver.findElement(By.xpath("/html/body/form/p[2]/input[1]")).click();
        segundos(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains(String.valueOf(res)));
        
    }
    //factorial
    @Test
    public void testFactorial(){
        driver.findElement(By.name("c")).clear();
        driver.findElement(By.id("c")).sendKeys("4");
        int res = 24;
        segundos(2);
        driver.findElement(By.xpath("/html/body/form/p[2]/input[2]")).click();
        segundos(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains(String.valueOf(res)));
        
    }
    //raiz cuadrada
    @Test
    public void testSqrt(){
        driver.findElement(By.name("c")).clear();
        driver.findElement(By.id("c")).sendKeys("25");
        int res = 5;
        segundos(2);
        driver.findElement(By.xpath("/html/body/form/p[2]/input[3]")).click();
        segundos(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains(String.valueOf(res)));
        
    }
    //potencia
    @Test
    public void testPower(){
        driver.findElement(By.name("c")).clear();
        driver.findElement(By.id("c")).sendKeys("6");
        int res = 36;
        segundos(2);
        driver.findElement(By.xpath("/html/body/form/p[2]/input[4]")).click();
        segundos(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains(String.valueOf(res)));
        
    }
    //segundo boton de borrar
    @Test
    public void testClear2(){
        int res = 0;
        segundos(2);
        driver.findElement(By.xpath("/html/body/form/p[2]/input[5]")).click();
        segundos(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains(String.valueOf(res)));
        
    }
    
    
    public void segundos(int s){
        try {
            Thread.sleep(s*1000);
        } catch (InterruptedException e) {
        }
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }
    
}
