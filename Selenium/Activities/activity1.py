# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
import time

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://training-support.net/")

    # Print the title of the page
    print("Page title is: ", driver.title)

    # Find the "About Us" button on the page using ID and click it
    driver.find_element(By.LINK_TEXT, "About Us").click()
    time.sleep(3)
    # Print the main title of the new page
    print("New page main title is: ", driver.find_element(By.TAG_NAME,"h1").text) 
    time.sleep(3)
    # Print the sub title of the new page
    print("New page sub title is: ", driver.find_element(By.TAG_NAME,"h2").text) 