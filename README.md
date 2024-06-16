# Activité Pratique N°2 - Spring Data JPA Hibernate

## Objectif
L'objectif de cette activité pratique était de créer et de gérer une application Spring Boot avec une base de données JPA, en suivant les instructions des vidéos fournies. Nous avons utilisé IntelliJ Ultimate pour le développement, créé des entités JPA, configuré des bases de données et testé diverses opérations CRUD.

## Détails de l'Activité

### 1. Installation de IntelliJ Ultimate
Nous avons installé IntelliJ IDEA Ultimate pour bénéficier de ses fonctionnalités avancées de développement Spring Boot.

### 2. Création d'un Projet Spring Initializer
Nous avons créé un projet Spring Initializer avec les dépendances suivantes :
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok

### 3. Création de l'Entité JPA Produit
Nous avons défini l'entité JPA `Produit` :

![image](https://github.com/ducloser90/SD_Activite2/assets/167253342/b0939c8e-9690-4c3c-aee6-fbcb13675e44)

## Configuration de l'Unité de Persistance
Nous avons configuré l'unité de persistance dans le fichier application.properties :

![image](https://github.com/ducloser90/SD_Activite2/assets/167253342/f2fede4a-1393-4193-b69e-2cfbe08eb23d)


## Création de l'Interface JPA Repository
Nous avons créé une interface PatientRepository basée sur Spring Data JPA :

![image](https://github.com/ducloser90/SD_Activite2/assets/167253342/73347277-07e4-4e50-8b73-31721bb16642)


## Test des Opérations de Gestion de Patients
Nous avons testé les opérations CRUD suivantes dans une classe de test ou un composant Spring Boot :

![image](https://github.com/ducloser90/SD_Activite2/assets/167253342/9f51efdd-8e24-44d2-a380-ac261acf32c3)

Ajouter des patients
Consulter tous les patients
Consulter un patient
Chercher des patients
Mettre à jour un patient
Supprimer un patient

![image](https://github.com/ducloser90/SD_Activite2/assets/167253342/b63325ff-1eb4-4643-8b24-7e315844ba04)


![image](https://github.com/ducloser90/SD_Activite2/assets/167253342/cd8c9a62-e189-4219-826f-08f8256f38e0)


## Migration de H2 Database vers MySQL
Nous avons migré la base de données de H2 vers MySQL en modifiant le fichier application.properties :

![image](https://github.com/ducloser90/SD_Activite2/assets/167253342/a79b4292-0beb-4511-855a-52d3bda99e4f)

