Rest.li + Guice Project Skeleton
========================

A project skeleton generator for [rest.li](http://rest.li) and [guice](https://github.com/google/guice).

Requirements
------------

* Java 1.7
* <a href="http://www.gradle.org/">Gradle</a> 2.0+
* <a href="https://github.com/n8han/giter8">Giter8</a>

Setup
-----

Install [giter8](https://github.com/n8han/giter8) either manually:

```
curl https://raw.github.com/n8han/conscript/master/setup.sh | sh
cs n8han/giter8
```

or using homebrew:

```
brew update && brew install giter8
```

Try it Out
----------

```
g8 git@github.com:ISI-nc/restli_guice-skeleton.g8

Creation d'un projet rest.li + Guice 


name [myRestLiProject]: 
organization [nc.isi.service]: 
project_description [Mon projet a moi]: 
restli_resource [myDataRessource]: 
restli_resource_entity [myDataTransfert]: 

Template applied in ./myRestLiProject
```

The  directory now contains a skeleton rest.li + guice project. You can build it and test it, .e.g.:

```
cd myREstLiProject
gradle build
...

gradle JettyRunWar
...
> Building 90% > :fortunes-server:jettyRunWar > Running at http://localhost:8080/

## in another terminal, do:

curl http://localhost:8080/myDataRessource/1
...
{"message":"Hello, myRestLiProject"}
```

To modify your rest.li resource, simply edit:

```
fortunes-server/src/main/java/nc/isi/service/myrestliproject/rest/MyDataResource.java
```

Usage
-----

To generate a project skeleton to fit your needs, set the properties:

* 'organization' - The java package name to use for your application
* 'name' - The name of your application, used for the gradle project name
* 'project_description' - description of your project set in web.xml
* 'restli_resource' - The name of inital sample REST resource to generate, you can easily add others later
* 'restli_resource_entity' - The name of the initial REST entity for your resource, you can add more of these later as well

You can pass in any of these properties as arguments, if you do this, any you do not set will use their default value.


