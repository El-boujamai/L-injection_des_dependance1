Compte Rendu : Injection des Dépendances et Framework IoC
Étudiante : Ouardia EL-BOUJAMAI

Filière : BDCC-2

Module : Architecture JEE / Spring IoC

Année Universitaire : 2025-2026

1. Introduction et Objectifs
L'objectif principal de ce travail est de maîtriser le concept de l'Inversion de Contrôle (IoC) et de l'Injection de Dépendances. En appliquant ces principes, nous visons à réduire le couplage entre les composants d'une application Java, facilitant ainsi sa maintenance, son évolutivité et sa testabilité.
2. Architecture du Projet
L'application respecte une architecture en couches pour séparer les responsabilités :

Couche DAO (Data Access Object) : Gestion de l'accès aux données via l'interface IDao.

Couche Métier : Implémentation de la logique applicative via IMetier.

Couche Présentation : Point d'entrée de l'application pour l'exécution et les tests.
<img width="874" height="442" alt="image" src="https://github.com/user-attachments/assets/63de7f19-d8d7-4ae0-9a88-c5def75667cb" />
3. Mise en Œuvre Technique

3.1. Définition des Interfaces (Couplage Faible)
Pour assurer un couplage faible, nous définissons des interfaces qui servent de contrats entre les couches.

IDao : Définit la méthode getData() pour la récupération des données.

 <img width="490" height="172" alt="image" src="https://github.com/user-attachments/assets/ecb47722-f1ab-4484-92bf-bac593468789" />

IMetier : Définit la méthode calcul() pour le traitement des données.

 <img width="574" height="198" alt="image" src="https://github.com/user-attachments/assets/7f910a59-37cb-401e-baa4-ab69f8aca697" />

3.2. Implémentations des Composants
DaoImpl : Fournit une simulation de récupération de données (ex: "Version base de données").

<img width="490" height="358" alt="image" src="https://github.com/user-attachments/assets/22bd257d-16d1-4190-aabc-1e00daa6e280" />

MetierImpl : Utilise une instance de IDao. L'injection peut se faire via un constructeur ou un setter.
  
  <img width="530" height="402" alt="image" src="https://github.com/user-attachments/assets/455cd667-6a9c-4211-beee-8f4ab9946663" />

4. Modes d'Injection des Dépendances
Nous avons exploré trois méthodes pour injecter la DaoImpl dans la MetierImpl :

 a. Par instanciation statique

Utilisation du couplage faible via l’interface IDao.

<img width="825" height="451" alt="image" src="https://github.com/user-attachments/assets/1936f3d7-a05e-4e28-a36e-78f66960f880" />

   b. Instanciation Dynamique (Réflexion Java)
Utilisation d'un fichier de configuration (config.txt) et de l'API Reflection de Java.
<img width="923" height="425" alt="image" src="https://github.com/user-attachments/assets/4905f90c-c77d-4749-9f34-9ad7a0981aec" />

Avantage : L'application devient fermée à la modification mais ouverte à l'extension.

<img width="875" height="419" alt="image" src="https://github.com/user-attachments/assets/4a4a96d1-2e32-4888-ac39-3050570ba58b" />

c. Injection avec Spring Framework

🔹Version XML

<img width="640" height="271" alt="image" src="https://github.com/user-attachments/assets/4ea8b59e-7208-4bd4-8674-65d65b06166a" />

<img width="910" height="460" alt="image" src="https://github.com/user-attachments/assets/e62462a6-4920-4c17-a1fe-7ed72aa8801b" />

🔹Version annotations

<img width="920" height="494" alt="image" src="https://github.com/user-attachments/assets/c97ef7ad-485c-4d31-895f-e4e63452550f" />
