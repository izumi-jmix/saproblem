## System authenticator problem
It is a bug demo project. Failed to initialize a Spring bean (PostConstruct) in case using SystemAuthenticator.

### Used:
* Java v. 11.
* Jmix v. 1.3.3.

### How to reproduce:
* Uncomment 14 line at org.izumi.jmix.saproblem.ProblemBean
* Launch application
* You will get an error, similar to content of [docs/stacktrace.txt](docs/stacktrace.txt)