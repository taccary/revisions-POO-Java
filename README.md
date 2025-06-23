# Exemple de Codespace Java

Ce dépôt contient un exemple de projet en java construit avec Maven, configuré pour être utilisé dans un Codespace GitHub.

La configuration du Codespace a été réalisée en suivant ce mode [opératoire github](
https://docs.github.com/fr/codespaces/setting-up-your-project-for-codespaces/adding-a-dev-container-configuration/setting-up-your-java-project-for-codespaces)

Le projet est un petit jeu de combat entre 2 équipes de personnages créé par Hervé l'Helguen.
C'est un projet utilisé en devoir de vacances d'été pour les étudiants de SIO1-SLAM.

La branche Main contient le projet à réaliser.
La branche correction contient le corrigé du projet.


Pour executer les tests unitaires, ce placer dans le dossier où se trouve le pom.xml avant de lancer Maven :
```bash
cd /workspaces/test-java/revisions
mvn test
```

