# virtualstream
Fibonacci RESTful web service

about:
    
    This application produces a sequence of one or more comma-delimited Fibonacci numbers
    based on the ‘len’ argument.
   
    It correctly handles invalid input and converts internal exceptions to valid HTTP 
    status codes.

    This application is written in the Java language and its operation is not confined
    by primitive data types (i.e long, int etc.). It will produce output until 
    all available heap space has been used. Additional heap space may be 
    specified (see deployment below).

    Currently this application only supports console logging for demonstration
    purposes as logging policy and design would be heavily influenced by deployment 
    in virtual scenarios (i.e. logging as part of a Docker service).


repo:

    https://github.com/gitHubUser828999/virtualstream.git


deployment: (cd to the base virtual stream repo directory)

   In a shell window (linux/mac), execute the following
   java -jar build/libs/gs-rest-service-0.1.0.jar
   
   additional heap space may be included in the above command line, 
   i.e java -Xmx6g -jar ….

   
manual test:

   After starting the application, open a web browser to the following URL

   localhost:8080/fibonacci?len=23


build:
   
    This application has been built as a gradle project. 
    Install the latest version of gradle (https://gradle.org/install/)

    cd to the base virtual stream repo directory 
    type gradle build

       This will build the application and run the test suite against it.
    After successful build, the application may be launched within gradle 
    by typing gradle bootrun

