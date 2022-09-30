# IBM Business Automation - Decision Manager Open Edition - Customer Demo

This repository contains a sample decision service, used for demonstrating the capabilities of Kogito.

## Dependencies

This project uses the common parent POM for Kogito applications, which you can find at: [**Kogito Demo Parent**](https://github.com/blulas/kogito-demo-parent).  The demo parent must be the first repository built with Maven.

## How To Build

This repository is built using `mvn clean install` by either the CI/CD pipeline or on a local developer workstation.  Note that this repository requires the [**Kogito Demo Parent**](https://github.com/blulas/kogito-demo-parent) to be installed into Maven first.

## How To Deploy

This repository is built using `mvn clean deploy` by either the CI/CD pipeline or on a local developer workstation. 

## How To Run 

This decision service is implemented as a Quarkus micro-service and as such can be tested locally by simply running the following Maven command:  `mvn compile quarkus:dev`, which starts Quarkus in `DEV` mode on your local machine.  

## How To Test

There are multiple ways to test this decision service, since the generated interface is a domain specific REST API.  Included in this repository is a set of Postman tests, which you can find the postman directory of this repository.

## Additional Information (*Appendicies*)
This repository is focused on business automation using **IBM Decison Manager Open Edition** products, which in turn rely on various open source tools and technology. The following online documentation is available in order to learn various aspects of these tools:

- [**Apache Maven**](https://maven.apache.org/) is a free and open source software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project’s build, reporting and documentation from a central piece of  information. A **getting started guide** is available [here](http://maven.apache.org/guides/getting-started/).
- [**Git**](https://git-scm.com//) is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency. There is a **handbook** available [here](https://guides.github.com/introduction/git-handbook/), as well as various **guides** for learning and working with Git available [here](https://guides.github.com/
- [**Quarkus**](https://quarkus.io) Quarkus was created to enable Java developers to create applications for a modern, cloud-native world. Quarkus is a Kubernetes-native Java framework tailored for GraalVM and HotSpot, crafted from best-of-breed Java libraries and standards. The goal is to make Java the leading platform in Kubernetes and serverless environments while offering developers a framework to address a wider range of distributed application architectures.
- [**Kogito**](https://kogito.kie.org) Kogito is designed from ground up to run at scale on cloud infrastructure. If you think about business automation think about the cloud as this is where your business logic lives these days. By taking advantage of the latest technologies (Quarkus, knative, etc.), you get amazingly fast boot times and instant scaling on orchestration platforms like Kubernetes.