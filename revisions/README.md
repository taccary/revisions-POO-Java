# Projet Révisions d'été Java : Jeu de Combat de Personnages

Ce projet est un petit jeu de combat entre 2 équipes de personnages créé par Hervé l'Helguen.
La consigne du travail est donnée dans le fichier `Exercice Jeu Personnages Armes.pdf` situé à la racine du projet`.
C'est un projet utilisé en devoir de vacances d'été pour les étudiants de SIO1-SLAM.

- La branche Main contient le projet à réaliser.
- La branche correction contient le corrigé du projet.

## Lancer le projet
Pour lancer le projet, il faut faire un clic droit sur le fichier `Main.java` dans l'explorateur de fichiers et choisir "Run Java".

L'icône de lecture dans la barre d'outils en haut de l'éditeur permet également de lancer le projet.

## Debugger le projet
Pour déboguer le projet, il faut faire un clic droit sur le fichier `Main.java` dans l'explorateur de fichiers et choisir "Debug Java".

L'icône de débogage dans la barre d'outils en haut de l'éditeur permet également de lancer le débogueur si un point d'arrêt est défini dans le code.

Lorsque le débogueur est lancé, il est possible de visualiser les variables, les appels de méthode et d'autres informations utiles dans la vue de débogage.

## tests unitaires
Le projet contient des tests unitaires pour vérifier le bon fonctionnement du code. Ces tests sont situés dans le dossier `src/test/java`. Ils sont écrits en utilisant JUnit 5.
Pour , il est nécessaire d'avoir Maven installé dans le Codespace. Maven est déjà configuré dans ce projet.

Pour exécuter les tests unitaires, il faut faire un clic droit sur un fichier de test dans l'explorateur de fichiers et choisir "Run Tests" ou "Debug Tests".

L'icône de lecture dans la barre d'outils en haut de l'éditeur permet également de lancer les tests si le fichier de test est ouvert.

Enfin, il est possible de lancer les tests unitaires en utilisant la commande Maven suivante dans le terminal :
```bash
cd /workspaces/test-java/revisions
mvn test
```

## Architecture du projet
Ce projet est configuré pour être utilisé avec Visual Studio Code et l'extension Java Pack. Il utilise Maven comme système de gestion de projet, ce qui permet de gérer les dépendances et la compilation du code.
Le projet est organisé selon une structure standard de projet Java avec Maven. Voici un aperçu de la structure du projet :

```
src
├── main
│   └── java
│       └── jeuconcepts
│           ├── Arme.java
│           ├── Jeu.java
│           ├── Main.java
│           ├── Personnage.java
│           └── Reservoir.java
└── test
    └── java
        └── jeuconcepts
            ├── ArmeTest.java
            └── JeuTest.java
```


Les fichiers sources Java se trouvent dans le dossier `src/main/java/jeuconcepts`, tandis que les tests unitaires sont situés dans le dossier `src/test/java/jeuconcepts`.
Les ressources du projet, telles que les fichiers de configuration, peuvent être placées dans le dossier `src/main/resources`.
Les fichiers compilés seront générés dans le dossier `target` à la racine du projet. Ce dossier est créé automatiquement par Maven lors de la compilation du projet. Il n'est pas nécessaire de le modifier manuellement. Il contient les classes compilées, les dépendances et d'autres fichiers nécessaires à l'exécution du projet. Il n'est pas nécessaire de le versionner dans Git, car il est généré automatiquement à chaque compilation, c'est pourquoi il est ignoré au niveau du fichier `.gitignore` pour éviter de le versionner.

