# Gestion de Collection de Poupées Russes

Ce projet consiste à créer une application console en Java pour gérer une collection de poupées russes. La première partie du projet consiste à créer une hiérarchie de classes pour représenter les poupées russes et à implémenter des fonctionnalités telles que l'ouverture, la fermeture, le placement et le retrait de poupées. La deuxième partie du projet consiste à concevoir la modélisation UML de l'application de gestion de collection de poupées russes.

## Partie 1: Java OOP

### Classe de Base: Poupee

La classe Poupee représente la base de la hiérarchie. Elle encapsule les propriétés communes à toutes les poupées.

- **Constructeur**: Initialise une poupée avec une taille donnée.
- **Méthodes abstraites**:
  - `void ouvrir()`: Ouvre la poupée.
  - `void fermer()`: Ferme la poupée.
  - `void placerDans(Poupee p)`: Place la poupée courante dans la poupée `p`.
  - `void sortirDe(Poupee p)`: Sort la poupée courante de la poupée `p`.

### Classe Concrète: PoupéeRusse

La classe PoupéeRusse hérite de la classe de base Poupee et implémente les méthodes spécifiques.

- **Constructeur**: Appelle le constructeur de la classe de base.
- **Méthodes**:
  - `void ouvrir()`: Ouvre la poupée russe.
  - `void fermer()`: Ferme la poupée russe.
  - `void placerDans(Poupee p)`: Place la poupée russe dans la poupée `p`.
  - `void sortirDe(Poupee p)`: Sort la poupée russe de la poupée `p`.

## Partie 2: Conception UML

### Diagramme de Classe

- **Collectionneur**: Représente un collectionneur de poupées russes. Il a des attributs tels que nom, adresse, et nombre de poupées dans sa collection. Il possède également des méthodes telles que `ajouterPoupée()` et `supprimerPoupée()`.
- **PoupéeRusse**: Représente une poupée russe dans la collection. Contient des attributs comme taille, couleur et année de fabrication. Il a des méthodes telles que `ouvrir()`, `fermer()` et `vérifierContenu()`.
- **Collection**: Représente la collection de poupées russes du collectionneur. Possède des attributs comme `nombreTotal`, et des méthodes telles que `ajouterPoupée()`, `supprimerPoupée()` et `afficherCollection()`.

### Diagramme de Cas d'Utilisation

- **Ajouter une Poupée**: Le collectionneur peut ajouter une nouvelle poupée russe à sa collection.
- **Supprimer une Poupée**: Le collectionneur peut retirer une poupée russe de sa collection.
- **Vérifier le Contenu**: Le collectionneur peut vérifier si une poupée russe donnée contient une autre poupée.
- **Afficher la Collection**: Le collectionneur peut voir toutes les poupées russes de sa collection.

### Diagramme de Séquence

- Le Collectionneur ajoute une nouvelle poupée russe à sa collection.
- Le système vérifie si la poupée russe est déjà présente dans la collection.
- Si non, la poupée russe est ajoutée à la collection.
- Le système confirme l'ajout au Collectionneur.
