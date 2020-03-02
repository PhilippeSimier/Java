# Fabriquer un executable JAR avec Netbeans et Maven 

## Le problème

Lorsque vous exécutez votre projet JAR depuis l'intérieur de l'EDI Netbeans, vous pouvez définir la classe principale à partir de l'item **Run** des propriétés du projet, ce qui signifie que le code s'exécute correctement à partir de l'EDI. Mais lorsque vous l'exécutez à partir de la ligne de commande avec quelque chose comme:
```bash
java -jar Mon_IHM-1.0-SNAPSHOT.jar
```
vous obtenez “**no main manifest attribute**”.

Cela se produit car le projet est en cours de construction par Maven et la classe principale que vous avez spécifiée dans les propriétés Netbeans n'est pas exportée par Netbeans vers le fichier **pom.xml** de Maven; en d'autres termes: Netbeans sait quelle est votre classe principale mais pas Maven.

Pour résoudre ce problème, vous devez modifier le fichier pom.xml de votre projet .
Vous devez ajouter l'extrait XML suivant à votre pom.xml, il peut aller n'importe où dans l'élément <project>, on le mets généralement après l'élément <properties>:

## (no main manifest attribute)
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

