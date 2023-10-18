package Class21;
// this the second extra tester
    public class WebDriverTester {
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


