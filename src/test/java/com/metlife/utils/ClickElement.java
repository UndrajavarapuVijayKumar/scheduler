/*
 *Created By: Undrajavarapu Vijay Kumar
 *Project: Scheduler_Capstone
 *
 */
/*

package com.metlife.utils;

import static com.metlife.utils.WebDriver_Utils.driver;

public class ClickElement {
    public void clickElement(By elementBy) throws Exception {

        boolean exceptionOccured = false;
        String beforeClickUrl = driver.getCurrentUrl();

        try {

            if (isElementPresent(elementBy, 2)) {

                driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

                try {

                    try {/**
                        driver.findElement(elementBy).click();

                        if (beforeClickUrl.equalsIgnoreCase(driver
                                .getCurrentUrl())
                                && currentBrowser == Browser.IE) {

                            jsClick(elementBy);
                        }

						*/
                        /*
                         * if(currentBrowser == Browser.IE) {
                         * jsClick(elementBy); }
                         *


					} catch (NoSuchElementException nsee) {

						exceptionOccured = true;
						HomerLogger.getInstance().info(nsee.toString());
					}

				} catch (Exception ex) {

					exceptionOccured = true;
					HomerLogger.getInstance().info(ex.toString());
				}

				if (exceptionOccured) {

					try {

						jsClick(elementBy);
						validateUrl(elementBy);

					} catch (Exception ex) {

						HomerLogger.getInstance().info(ex.toString());
					}

				} else {

					validateUrl(elementBy);
				}

			} else {

				if (!continueOnClickFail) {

					//throw new Exception("Custom Error");
				}

			}

			driver.manage().timeouts()
					.implicitlyWait(waitTime, TimeUnit.SECONDS);

		} catch (Exception ex) {

			if (ex.getMessage().trim() == "Custom Error") {

				report.addCustomErrorStep(
						"Terminating test case as click element was not found",
						"Click Element: " + elementBy.toString()
								+ " was not found");

				ReusableComponents rc = new ReusableComponents(driver, report,
						this, dataHelper);
				rc.throwCustomException();
			}

			handleAlert();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}

}
*/