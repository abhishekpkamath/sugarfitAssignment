# ABOUT THE APPLICATION
This is a Basic Spring Application built with gradle. The configuration used are as follows:
* Language: Java (17)
* Build tool: Graddle
* Spring boot ver: 4.0.2
* Packaging: jar
* Configuration: YAML

## System requirement:
The application is written and tested in windows. There may be slight variation in setup required to run the application. The following is required for the application to run:
* Docker desktop

## How to run
In the root directory of the system, run the following command:
```
docker compose up --build
```

## Design Decisions
The following design decision were taken:
1. Using graddle as the build tool instead of maven. This is due to the fact that Gradle is generally better for large, complex, or high-performance projects due to its speed, flexibility, and incremental builds.
2. Using docker to make sure the application can be built consistently on any system.
3. Using docker compose to convert the system into a micro-service architecture. A react client client side app or a local DB service instance (PostgreSQL, MongoDB or MySQL) can be added as a microservice to the system.
4. The source code is divided into three parts:
    * Main controller module: This is where the main controller application logic resides.
    * router module: This is where all the REST endpoints are written.
    * Data set module: contains all the data set used by the REST endpoints.

## Assumptions
* It was assumed that the application will be run on a single VM instance for deployment.
* Did not setup a kubernetes cluster for load balancing.
* Did not setup Nginx for reverse proxy.

## Future Roadmap
The following improvement can be done in the application:
1. Add a container for react frontent.
2. Add a container for a local DB instance (MongoDB, PostgreSQL, MySQL).
3. Add a cache like redis.
4. The entire application can be ported to kubernetes for better scaling.
