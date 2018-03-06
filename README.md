# Sample Cucumber Framework

This project contains Sample Cucumber Framework Functional Tests. The tech stack used for the project are:
1. **Cucumber-jvm** as testing framework for writing test scenarios in BDD format
2. **JAVA** as the programming language for writing test code
3. **Selenium** to drive browser interaction
4. **Gradle** as the build tool 
5. **IntelliJ** as the preferred IDE for writing java code.

#### Initial SetUp
1. Install JDK 1.8
2. Install IntelliJ (Community edition is fine)
3. Install cucumber for java plugin in intellij
4. Install gradle

#### Cloning & Importing Project
Once above setup is done, Then follow this steps for cloning & importing
1. Checkout project from ```https://github.com/vinaykumarvvs/Sample-Cucumber-Framework.git```
2. Import the project in IntelliJ using ```build.gradle -> Check "Auto Import" & Make Sure Java Path is Set```
3. Build Project ```IntelliJ -> Build -> Build Project```

#### Running tests
1. You can run the test from IntelliJ directly, by right clicking and **Run feature file**.This will require you to set the VM configurations before trying to run the tests. Add the following VM params before running tests.
```-Dbrowser=chrome -Denv=staging``` This will run the tests using chrome browser and against the staging environment.
2. For Linux user: You can run directly from command line. Use the following command to run the tests
```gradle clean build runInSequence -Dbrowser=chrome -Denv=staging -Ptags=@Sanity```
    This will run all tests that are tagged as @Sanity.
3. You can get your test Report available on link provided after successful build, can find in the link which is pointing your local where project is cloned:
    "/Sample Cucumber Framework/build/reports/cucumber/feature-overview.html"