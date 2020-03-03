# Fabriquer un executable JAR avec Netbeans et Maven 

## Introduction

**Maven** est un outil de construction de projets (build) open source développé par la fondation Apache. Il permet de faciliter et d'automatiser certaines tâches de la gestion d'un projet Java.
Il permet notamment :

 - d'automatiser certaines tâches : compilation, tests unitaires et  déploiement des applications qui composent le projet
 - de gérer des dépendances vis-à-vis des bibliothèques nécessaires au   projet
 - créer une archive de type **.jar**

L'arborescence d'un projet Maven est par défaut imposée ce qui implique que l'arborescence de base de chaque projet Maven est toujours la même.  Elle permet aux développeurs de facilement être familiarisés avec la structure des projets.

## Le problème avec Netbeans

Lorsque vous exécutez votre projet JAR depuis l'intérieur de l'EDI Netbeans, vous pouvez définir la classe principale à partir des propriétés du projet , item **Run** , ce qui implique que le code s'exécute correctement à partir de l'EDI. Mais lorsque vous l'exécutez à partir de la ligne de commande avec quelque chose comme:
```bash
java -jar Mon_IHM-1.0-SNAPSHOT.jar
```
vous obtenez un message d'erreur “**no main manifest attribute**”.

Cela se produit lorsque le projet est en cours de construction par Maven. La classe principale que vous avez spécifiée dans les propriétés Netbeans n'est pas exportée par Netbeans dans le fichier **pom.xml** utilisé par Maven; en d'autres termes: Netbeans sait quelle est votre classe principale mais pas Maven.

Pour résoudre ce problème, vous devez modifier à la main le fichier **pom.xml** de votre projet .
Vous devez ajouter l'extrait XML suivant à votre pom.xml, il peut aller n'importe où dans l'élément <project>, on le mets généralement après l'élément `<properties>`: Bien sûr adaptez le chemin et le nom de la classe principale en fonction de votre projet.

## Extrait du fichier pom.xml
Dans le fichier pom.xml
```xml

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>2.4</version>
                <configuration>
                    <archive>
                        <manifest>
                            <addClasspath>true</addClasspath>
		                              <mainClass>edu.touchard.mon_ihm.Formulaire</mainClass>
                        </manifest>
                    </archive>
                </configuration>
            </plugin>
        </plugins>
    </build>  

```




# Changelog

**29/01/2020 : ** Ajout du README . 

> **Notes :**


> - Licence : **licence publique générale** ![enter image description here](https://img.shields.io/badge/licence-GPL-green.svg)
> - Auteur **Philippe SIMIER** Lycée Touchard Le Mans
>  ![enter image description here](https://img.shields.io/badge/built-passing-green.svg)
<!-- TOOLBOX 

Génération des badges : https://shields.io/
Génération de ce fichier : https://stackedit.io/editor#
example : https://github.com/adrien3d/IO_WSSFM10-Arduino

