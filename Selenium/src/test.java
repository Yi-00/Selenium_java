import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        for(int i=0; i<=5;i++){
            for(int j=i;j>0;j--){
                System.out.println(i);
            }
            System.out.println();
        }
    }
}