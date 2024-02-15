package com.reto1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();
        
        WebElement elementoPhones = driver.findElement(By.xpath("//a[@onclick=\"byCat('phone')\"]"));
        elementoPhones.click();
        Thread.sleep(2000);

        WebElement htc= driver.findElement(By.xpath("//a[@href='prod.html?idp_=7']"));
        WebElement htcPrecio = htc.findElement(By.xpath("//h5"));
        System.out.println(htcPrecio);
        
        WebElement elementoLaptops = driver.findElement(By.xpath("//a[@onclick=\"byCat('notebook')\"]"));
        elementoLaptops.click();
        Thread.sleep(2000);
        WebElement macAir = driver.findElement(By.xpath("//a[@href='prod.html?idp_=11']"));
        WebElement macAirPrecio = macAir.findElement(By.xpath("//h5"));
        System.out.println(macAirPrecio);
       
    
        WebElement macPro = driver.findElement(By.xpath("//a[@href='prod.html?idp_=15']"));
        WebElement macProPrecio = macPro.findElement(By.xpath("//h5"));
        System.out.println(macProPrecio);
        
        WebElement dell = driver.findElement(By.xpath("//a[@href='prod.html?idp_=12']"));
        WebElement dellPrecio = dell.findElement(By.xpath("//h5"));
        System.out.println(dellPrecio);

        WebElement elementoMonitor = driver.findElement(By.xpath("//a[@onclick=\"byCat('monitor')\"]"));
        elementoMonitor.click();
        Thread.sleep(2000);

        WebElement asus = driver.findElement(By.xpath("//a[@href='prod.html?idp_=14']"));
        WebElement asusPrecio = asus.findElement(By.xpath("//h5"));
        System.out.println(asusPrecio);

        driver.quit();
    }
}