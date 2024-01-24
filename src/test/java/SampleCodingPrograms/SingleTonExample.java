package SampleCodingPrograms;

import Reviews.java.eight.practice.by.ashok.example1.PalindromeTest;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class SingleTonExample {

    private boolean empty;
    private boolean boiled;
    private static SingleTonExample singleTonExampleObj;
//    private static final Logger log = LogManager.getLogManager(SingleTonExample.class);
    private static final Logger log = Logger.getLogger(SingleTonExample.class.getName());
    //= getInstance();
    private SingleTonExample(){
        empty=true;
        boiled=false;
    }
    public static SingleTonExample getInstance(){
        synchronized (SingleTonExample.class){
            if(singleTonExampleObj==null){
                log.info("creating singleton obje when null");
                singleTonExampleObj = new SingleTonExample();
            }
        }

        return singleTonExampleObj;
    }
//    ChromeOptions options = new ChromeOptions();
//    options.addArgument("incognito");
//    WebDriverManager.ChromeDriver().setup();
//    WebDriver driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.manage().window().fullscreen();
//    driver.manage().deleteAllCookies();
//    driver.get("url");


}
