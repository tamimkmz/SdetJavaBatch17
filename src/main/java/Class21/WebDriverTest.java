package Class21;

class WebDriverTest {
    public static void main(String[] args) {
        WebDriver [] arr={new ChromeDriver()};
        for(WebDriver d:arr){
            d.openBrowser();
            d.loadURL("Amazon.com");
            d.performTesting();
            d.close();
        }
    }

}

