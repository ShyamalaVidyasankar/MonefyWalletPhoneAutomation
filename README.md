# Appium Automation Testing For Monefy App

## Overview
This is the test automation for Monefy application mobile, which contains a set of automated steps based on Android application, which in turn compound one of the proposed scenarios automated. 

## Explanation of the Automated Scenario 
Record a income, record a expense, then evaluate if income minus expense are equal to balance calculated by application. If so, then, the result is successful, otherwise is failed.  

### How to use the test suite
```
1. Run MonefyMainClass java class
2. When appear the Income Amount request, please enter this value
3. When appear the Expense Amount request, please enter this value
4. Wait for testing finishes while this running. 
5. Once test finish to run,in the IDE console you'll see a printed message indicating if the test succeeded or failed, 
   based on the scenario definition in above section. 
```

### Folder structure
- lib folder (stored in the project root folder): Which contains all libraries used in the project. 
- GenericMethods java class: Which contains generic methods used in MonefyTest java class.
- MonefyTest java class: Which contains the main method, and all steps that make up the test. 
- screens Package: Which contains one class for each screen used in MonefyTest java class.
- com.monefy.app.lite_2019-10-27.apk: APK file, based on which run the automated test.

### Used tools/technologies
```
IDE IntelliJ
java 
Appium
Selenium
Node.js
Android Studio
```
