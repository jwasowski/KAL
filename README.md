# Project Title

KAL - Guns and ammunitions comparator REST Service

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See installing for notes on how to deploy the project on a live system.
What you need to get started? First of all you need Java SE Developement Kit, atleast  version 8 (versions 10 and 11 are not tested), Apache Maven to build WAR and Glassfish 5+ or equivalent compatible application server. 
To test endpoints of REST service, it is good to have HTTP Client, for example Postman. More details are contained in following sections. 

### Prerequisites

What things you need to install the software and how to install them:

Java SE Developement Kit 8:
```
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
```

Apache Maven website with guides and documentation:
```
https://maven.apache.org/
```

Glassfish link:
```
https://javaee.github.io/glassfish/download
```

Glassfish installation guide:
```
https://javaee.github.io/glassfish/doc/5.0/installation-guide.pdf
```

### Installing

Instructions for Glassfish.
Import KAL to your IDE, then open project root folder in your CLI and type:
```
mvn compile war:war 
```
or
```
mvn compile war:exploded
```
When Maven is finished with creating WAR or Exploded WAR then just simply invoke Glassfish command (domain is default):
```
asadmin start-domain
```
after the domain is set up, deploy WAR or Exploded WAR on Glassfish domain.
For WAR (Windows CMD path syntax):
```
asadmin deploy target\KAL
```
For Exploded WAR (deploydir is outdated, but still working properly):
```
asadmin deploydir target\KAL
```
Use Postman or equivalent and create example HTTP Get request, to get all gun types with desired calibers:
```
http://localhost:8080/KAL/rest/search?gun-type=Handgun&caliber=9x19&caliber=5.56x&gun-type=Rifle
```
List of query parameters to combine:
```
"gun-manufacturer" - text type, 
"gun-type" - text type ("Handgun","Rifle","Shotgun"),
"caliber" - text type,
"gun-magazine" - number type,
"gun-weight" - number type,
"gun-length" - number type,
"gun-barrel-length" - number type, 
"ammo-type" - text type, 
"ammo-manufacturer" - text type, 
"ammo-name" - text type, 
"ammo-energy" - number type,
"ammo-velocity" - number type,
"ammo-mass" - number type
```
Currently there are only some dummy data present (3 Handguns, 2 Rifles, 2 9x19 ammo types, 1 7.62x39 ammo type and 1 5.56x46 ammo type).

## Authors

* **Jakub Wąsowski** - *Rest Service* - [JWasowski](https://github.com/jwasowski)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details


