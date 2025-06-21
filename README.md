🚀 E-commerce Automation Testing Suite
📦 End-to-End Selenium WebDriver Automation for a Live E-commerce Platform

📋 Table of Contents

📖 About the Project

🛠️ Built With

🌟 Features

🧪 Test Data Dependency

🚀 Getting Started

👤 Author


📖 About the Project
This project is a comprehensive automation suite developed in Java using Selenium WebDriver and TestNG, built to test a user’s complete journey on an e-commerce website—from registration to order placement and account deletion.

🔗 Target Website
https://www.automationexercise.com/

The suite simulates real-world shopping workflows including user registration, login/logout, product browsing, cart management, checkout, brand selection, and form handling.

🛠️ Built With
Technology	                Version         	Purpose
---------------------------------------------------------------------------
Java                    	11+         	    Core programming language
Selenium WebDriver      	4.33.x	            Browser automation
TestNG	                    7.11.x	            Test execution & management
Apache Commons Lang     	3.17.x	            Random string generation (test data)
Maven                   	Latest          	Dependency management
ChromeDriver	            Latest	            WebDriver for Chrome
Eclipse / IntelliJ	        Latest	            Development IDE


🌟 Features
✅ Automated Account Signup with Dynamic Data
✅ Personal & Address Information Submission
✅ Product Search & Scroll Handling
✅ Newsletter Subscription Testing
✅ Randomized Product Addition to Cart
✅ Brand Browsing & Branded Product Interaction
✅ Full Cart Checkout Flow with Payment Info
✅ Contact Form Submission & Alert Handling
✅ Logout & Login Verification
✅ Account Deletion Workflow
✅ Priority-Based Test Execution using TestNG
✅ JavaScript Scrolling via JavascriptExecutor
✅ WebDriverWait for dynamic element loading


🧪 Test Data Dependency
All random test data is generated and maintained in a dedicated class:
testData.java

Key elements provided:

🔐 email, password, nameOnCard, and cardNumber are randomly generated using Apache Commons Lang

📦 Arrays of names, cities, companies, and products are used to create variability in each test run

📆 Randomized date values for birthday and credit card expiry

📲 Dynamic phone number and ZIP code generation

📜 setUp() method initializes and configures the WebDriver session

⚙️ JavascriptExecutor js is initialized for scroll actions used in tests

Make sure to update the ChromeDriver path and ensure the browser matches your environment setup.


🚀 Getting Started

Prerequisites
-Java JDK 11 or later

-Eclipse or IntelliJ IDE

-Google Chrome Browser

-ChromeDriver installed and path set

-Internet access to interact with the live site

-Maven (if managing dependencies externally)


👤 Author
Amer Mohammad Nawasreh
📍 Computer Engineering
💼 QA Engineer | Test Automation Enthusiast
🔗 Amer Mohammad Nawasreh - LinkedIn
📧 Email: amnawasreh2@gmail.com