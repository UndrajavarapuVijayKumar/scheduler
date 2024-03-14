/*
 *Created By: Undrajavarapu Vijay Kumar
 *Project: Scheduler_Capstone
 *
 */


import org.openqa.selenium.support.ui.ExpectedConditions;

public class Exceptions {
    public static void main(String[] args) {
        /*
        We can acheive the time out exception using
        1. implicit wait
        2. Explicit wait
        3. Fluent wait
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.OfSeconds(30))
                .pollingEvery(Durattion.OfSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement element = wait.until(ExpectedConditions.precenseOfElementLocated(ELEMENT)));
        4. try catch
        * */
                // for No such element exception also we need to use Explicit wait
               //TimeOUt Exception
       /* for (int attemptMake = 0; attemptMake < attemptsForFilters; attemptMake++) {
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.name("make")));
                boolean makeDisplay = driver.findElement(By.name("make")).isDisplayed();
                boolean makeFilters = driver.findElement(By.name("make")).isEnabled();
                if (makeDisplay) {
                    if (makeFilters) {
                        Select makeSelect = new Select(driver.findElement(By.name("make")));
                        List<WebElement> listMake = makeSelect.getOptions();
                        for (int m = 1; m < listMake.size(); m++) {
                            if (listMake.get(m).getText().toLowerCase().equals(lineProcess.make.toLowerCase())) {
                                makeProcess = listMake.get(m).getText();
                                makeSelect.selectByIndex(m);
                                break;
                            }
                        }
                    }
                } else if (!makeFilters) {
                    System.out.println("Not Make Option detected for: " + lineProcess.model + " - attempt: " + attemptMake);
                }
            } catch (Exception e) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.name("make")));
                boolean makeDisplay = driver.findElement(By.name("make")).isDisplayed();
                boolean makeFilters = driver.findElement(By.name("make")).isEnabled();
                if (makeDisplay) {
                    if (makeFilters) {
                        Select makeSelect = new Select(driver.findElement(By.name("make")));
                        List<WebElement> listMake = makeSelect.getOptions();
                        for (int m = 1; m < listMake.size(); m++) {
                            if (listMake.get(m).getText().toLowerCase().equals(lineProcess.make.toLowerCase())) {
                                makeProcess = listMake.get(m).getText();
                                makeSelect.selectByIndex(m);
                                break;
                            }
                        }
                    }
                } else if (!makeFilters) {
                    System.out.println("Not Make Option detected for: " + lineProcess.model + " - attempt: " + attemptMake);
                }
            }
        }
    }
    staleElement(){
        try {
            WebElement element = driver.findElement(By.id("myElement"));
            element.click();
        } catch (StaleElementReferenceException e) {
            // Refresh the page
            driver.navigate().refresh();

            // Try to locate the element again
            element = driver.findElement(By.id("myElement"));
            element.click();
        }
    }
    staleElement_2(){
        WebElement element = driver.findElement(By.id("myElement"));

// Wait for the element to be visible
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));

// Click on the element
        element.click();
    }
    staleElement_3(){
        WebElement element = driver.findElement(By.id("myElement"));

// Refresh the page and wait for the element to be available
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));

// Click on the element
        element.click();
    }
*/}
}
