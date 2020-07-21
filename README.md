This is a quick demonstration I wrote up to run a couple tests on the Florida Blue website using Java/Selenium along with TestNG. 
Using the Page Object Model, I am able to quickly adapt to any changes on the site. I can also easily and quickly add additional functionality as the site evolves over time.

===RUNNING THE PROGRAM===
To run this test on your system, please consider the following:
1. You'll want to download chromedriver.exe and add it to the project - making sure to download the version that matches your current version of Chrome.
2. At the time of this writing this program uses Selenium 3.14.159. 
3. Guava version 29 is added as a Maven dependency.
4. You will also want to download and add TestNG to the project as well. Although I have it added as a Maven Dependency I've found that it doesn't actually show up as an option to run until it is downloaded and installed into t


===THE TESTS===

As this is a quick demonstration I have two tests written:
1. FloridaBlueIndexPageTest - This test doesn't do much. It only clicks on a few links on the main page, returning back to the main page after each click. 
2. FloridaBlueLoginTest - This is the main test. It clicks on the Login button, types in gibberish into the username and password field and clicks on the 'Go' Button. At this point the site redirects the user to a jsp page with an unauthorized message. One test here will verify that it actually sent you to the unauthorized page while the other verifies the message written is what is written there.


If you have any questions please feel free to reach out to me. 
