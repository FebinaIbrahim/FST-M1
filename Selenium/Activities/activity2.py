# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
import time
# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/login-form")

    time.sleep(2)
    # Print the title of the page
    print("Page title is: ", driver.title)

    # Find the username field
    username = driver.find_element(By.ID, "username")
    # Find the password field
    password = driver.find_element(By.ID, "password")

    # Enter the given credentials
    # Enter username
    username.send_keys("admin")
    # Enter password
    password.send_keys("password")

    # Find the login button
    login = driver.find_element(By.XPATH, "//button[text()='Submit']")
    login.click()
    time.sleep(2)
    # Print the login message
    message1 = driver.find_element(By.TAG_NAME, "h1")
    print("Login message: ", message1.text)
    message2 = driver.find_element(By.TAG_NAME, "h2")
    print("Login message: ", message2.text)