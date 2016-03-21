

# A sample application using Spring Boot and Angular2

## How to run
* In IntelliJ Idea - Create 'Run Configuration' Tomcat -> Local Server with sba2-webapp:war exploded.

## Configure Dev Environment
* Add Spring facet in sba2-webapp module to gain better Spring support in IntelliJ.
* IntelliJ Tomcat Run Configuration: On update action - Redeploy; On frame deactivation - Update classes and resources.

## Conventions
* Project root package is <code>zhy2002.sba2</code>.
* All Maven modules are prefixed <code>sba2-</code>.
* Don't break development experience in IntelliJ.

## Deployment
* The build artifact can be deployed in Tomcat

## Todo
* Currently the war file can be deployed to Tomcat and is executable. However it makes more sense to use Maven profile
to separate these two types of builds.

