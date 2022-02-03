package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.http.websocketx.WebSocket13FrameDecoder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;
    public static WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
      if(driver==null){
          driver=new ChromeDriver();
      }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
return driver;
    }
public static void closeDriver(){
      if(driver!=null){
          driver.quit();
          driver=null;
      }
}



}
