package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BasicDriver {
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static ThreadLocal<String> threadDriverName = new ThreadLocal<>();

    public static void setThreadDriverName(String browserName){
        threadDriverName.set(browserName);
    }

    public static WebDriver getDriver() {
        if (threadDriverName.get() == null) {
            threadDriverName.set("chrome");
        }
        if (threadDriver.get() == null) {
            switch (threadDriverName.get()) {
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;
                case "safari":
                    threadDriver.set(new SafariDriver());
                    break;
                case "brave":
                    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true"); // Chrome Driver Output Proerty leri susturdu sadece Error verirse bir sey yazacak
                    ChromeOptions opt = new ChromeOptions();
                    opt.addArguments("--remote-allow-origins=*");
                    opt.setBinary("C:/Program Files/BraveSoftware/Brave-Browser/Application/brave.exe");
                    threadDriver.set(new ChromeDriver(opt));
                    break;
                default:
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");

                    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

                    threadDriver.set(new ChromeDriver(options));
            }

        }
        return threadDriver.get();
    }

    public static void quitDriver() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            threadDriver.set(null);
        }
    }
}