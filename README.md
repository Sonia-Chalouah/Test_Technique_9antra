Informations Générales

  Nom du Projet : Landing Page & Admin Interface with CRUD OperationsCandidat : [Sonia Chalouah]
  Technologies Utilisées :

Backend : Spring Boot

Frontend : Angular

Base de Données : MySQL

Autres Outils : Git, Postman, Tailwind, etc.

Structure du Projet :

Frontend : Angular (hébergé dans un dossier frontend)

Backend : Spring Boot (hébergé dans un dossier backend)

Description du Travail Réalisé

1. Landing Page

La landing page est conçue pour être visuellement attrayante et facile à naviguer. Elle met en avant les cours avec les informations suivantes :

Titre

Description

Prix

Aperçu de l'image

Fonctionnalités Implémentées :

Design Réactif : Compatible avec différents appareils (desktop, tablette, mobile).

Présentation des Cours : Affichage dynamique des cours récupérés depuis le backend.

Navigation Facile : Menu de navigation permettant de se déplacer entre les sections.

Animation : Utilisation de CSS et Bootstrap pour rendre l'interface moderne et engageante.

2. Admin Interface

L'interface d'administration permet la gestion des cours avec les opérations suivantes :

CRUD :

Create : Ajout de nouveaux cours avec un formulaire comprenant les champs Titre, Description, Prix, et Image.

Read : Visualisation de la liste des cours enregistrés dans la base de données.

Update : Modification des informations d'un cours existant.

Delete : Suppression d'un cours.

Architecture

Backend (Spring Boot) :

Endpoints RESTful :

GET /courses : Récupère tous les cours.

POST /courses : Ajoute un nouveau cours.

PUT /courses/{id} : Met à jour un cours existant.

DELETE /courses/{id} : Supprime un cours.

Sécurité : Mise en place d'une autorisation basique pour protéger l'accès aux API.

Gestion des Fichiers : Sauvegarde et récupération des images.

Frontend (Angular) :

Modules : Organisation du projet en modules pour une meilleure maintenabilité.

Services : Service Angular pour consommer les API REST.

Components :

LandingPageComponent : Affiche les cours sur la landing page.

AdminDashboardComponent : Permet la gestion des cours.

Design : Utilisation de Tailwind et CSS personnalisés.

Démonstration Vidéo

Une vidéo de démonstration a été enregistrée pour présenter :

Navigation sur la landing page.

Utilisation des fonctionnalités CRUD dans l'interface d'administration.

Upload d'une image et prévisualisation avant soumission.

Lien de la vidéo : [(https://drive.google.com/file/d/1Re06LyrcqSzYt_u-xvZpXX2v5uAK14rY/view?usp=sharing)]

Dépôt GitHub

Le code source complet du projet est disponible sur GitHub.Lien du Dépôt : [https://github.com/Sonia-Chalouah/Test_Technique_9antra.git]

Instructions pour Lancer le Projet

Backend :

Clonez le projet backend depuis le dépôt GitHub.

Configurez la base de données dans application.properties.

Lancez le backend avec mvn spring-boot:run.

Frontend :

Clonez le projet frontend depuis le dépôt GitHub.

Installez les dépendances avec npm install.

Lancez le frontend avec ng serve.

Accès :

Landing Page : http://localhost:4200/

Admin Interface : http://localhost:4200/admin

Conclusion

Ce projet m'a permis d'explorer et de renforcer mes compétences en développement web full-stack avec Spring Boot et Angular. J'ai veillé à produire un code propre et maintenable tout en assurant une expérience utilisateur optimale.

Je reste disponible pour tout complément d'information ou pour une démonstration en direct. Merci pour cette opportunité !

Cordialement,[Sonia Chalouah]

