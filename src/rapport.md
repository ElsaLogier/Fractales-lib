# Rapport de SAE

***Membres du groupe :*** Nicolas Facon / Arnaud Fievet / Elsa Logier

### Première journée :

***Travaux finis***
**Elsa :**
	- Partie Gestion de projet 
		- Création des tickets
		- Définition des dépendances entre tickets 
		- Description des taches dans les tickets
		- Partage des taches

**Nicolas :**
	- Implémentation des opérations du plan complexe
	- Ensemble de Mandelbrot
	- Commencer le diagramme de classe

> Difficultés sur le plan complexe à cause des nombres complexes

**Arnaud :** 
	- Implémentation des opérations sur les nombres complexes 
	- Généralités sur les suites
	- Ensemble de Julia

***Bilan de la journée :***
Le groupe a bien avancé, le projet est bien défini pour la semaine à venir , nous sommes tous satisfait du travail effectué 

**********
### Deuxième journée :

***Travaux finis***
**Elsa :**
	- Choix des couleurs
	- Suivi de la gestion de projet 
		- définition des jalons
	- Début du rapport
	- Construction de fractales à base de figures géométriques

> Difficultés pour comprendre la mise en place du décorateur au niveau du choix des couleurs.

**Nicolas :**
	- Suites chaotiques (donné à Arnaud)
	- Continuer le diagramme de classe
	- Représentation des figures
	- Création des images 

>Difficultés et abandon du ticket de suites chaotiques à cause des mathématiques 

**Arnaud :** 
	- Ensemble des deux générés
	- Suites chaotiques
	- Représentation des figures (donné à Nicolas)

> Difficultés  de compréhension de la différence entre les suites chaotiques et les suites classiques

***Bilan de la journée :***
Le groupe a de nouveau rendu plus de tickets que le nombre prévu minimum pour pouvoir terminer dans les temps. Nous sommes heureux du travail effectué aujourd'hui ainsi que du partage des tâches et nous avons bien avancé.

************
### Troisième journée :

***Travaux finis***
**Nicolas :** 
	- Débug des fonctionnalités déjà en place
	- Diagramme UML 

**Arnaud :** 
	- Scripts de la classe principale
	- Débug des fonctionnalités déjà en place


***Travaux en cours***
**Elsa :** 
	- Construction de fractales à partir de figures géométriques

> Difficultés au niveau de la compréhension du fonctionnement du patron de méthode, de la construction du SVG et de l'instance PrintWriter

**Nicolas :**
	- Génération des images 

> Difficultés au niveau de la compréhension de l'implémentation de la méthode génération

**Arnaud :**
	- Diagramme de bifurcation

>Difficultés au niveau du diagramme de bifurcation 

***Bilan de la journée :***
Le groupe s'est retrouvé confronté à des difficultés et n'a donc pu rendre qu'un seul tickets sur les 5 prévus pour la journée. Nous sommes un peu déçu de notre travail et espérons que demain nous travaillerons de manière plus efficace.
Néanmoins nous avons, en fin de journée, obtenu un visuel de nos suites déjà créées , nous savons donc que la phase de débug sera courte.
************
### Quatrième journée :
***Travaux finis***
**Elsa :**
	- Rapport 
	- Construction de fractales à partir de figures géométriques

**Nicolas :**
	- Génération des images
	- Continuer diagramme de classe

***En cours***
**Elsa :** 
	- Quelques fractales à base géométrique (tapis de Sierpinski)

**Arnaud :**
	- Diagramme de bifurcation
	- Scripts de lancement

***Bilan de la journée :***
Nous trouvons que le groupe a bien avancé , nous sommes content de notre travail.
******
### Cinquième journée :
***Travaux finis***
**Nicolas :**
	-tapis de Sierpinski
	-triangle de Sierpinski

**Elsa :**
	-tapis de Sierpinski (donné à Nicolas)
	-commentaires des codes
	-écriture du rapport.

**Arnaud:**
	- Scripts de lancement 
	- Suites chaotiques 

***Bilan de la journée***
Le groupe a presque entièrement terminé. Nous pourrons rendre le travail demandé dans les temps.

**************
### Bilan de la semaine : 
Nous avons trouvé cette SAE très enrichissante et nous avons beaucoup aimé travailler dessus. 
Au niveau gestion du temps et du projet nous trouvons que nous avons bien réparti les tâches. 

****
***Patrons de conception :***

**Implantation des opérations sur le plan complexe :** Pour le patron de conception de la question 5 nous avons choisi de faire un décorateur car on doit ajouter dynamiquement des fonctionnalités à un objet existant (une translation).

Pour le patron de conception de la question 6 nous avons choisi de faire un décorateur car on doit ajouter dynamiquement des fonctionnalités à un objet existant (le "zoom" sur un point du plan )


**Généralités sur les suites :** Pour le patron de conception de la question 7 nous avons choisi de faire une Stratégie car toutes les suites fonctionnent de la même manière mais elles ont simplement des formules mathématiques différentes.

Pour le patron de conception de la question 8 nous avons choisi de faire un itérateur car c'est le seul patron de conception qui permet de parcourir les éléments d'une collection d'objets. 

**Couleurs :** Pour le patron de conception de la question 13 nous avons choisi de faire une Stratégie car toutes les palettes fonctionnent de la même manière mais elles ont simplement des couleurs différentes.

Pour le patron de conception de la question 14 nous avons choisi de faire un décorateur car on doit ajouter dynamiquement des fonctionnalités à un objet existant (un masque).


**Suite chaotiques et diagramme de bifurcation :** Pour le patron de conception de la question 15 nous avons choisi de faire un adaptateur car nous devons rendre compatible un point avec IComplex.


**Création d'images en Java :** Pour le patron de conception de la question 24 nous avons choisi de faire un adaptateur car nous devons rendre compatible BufferedImage avec IFractalImage.


**Génération des images** Pour le patron de conception de la question 26 nous avons choisi de faire un Builder car cela nous permet de réaliser la construction complexe d'une image


**Représentation des différentes figures :** Pour le patron de conception de la question 29 nous avons choisi de faire un décorateur car on doit ajouter dynamiquement des fonctionnalités à un objet existant (un transform).

Pour le patron de conception de la question 30 nous avons choisir de faire un composite pour pouvoir utiliser une méthode sur l'intégralité des figures.

**Construction de fractales a base de figures géométriques :** Pour le patron de conception de la question 31 on utilise une méthode car on va réaliser des opérations toujours dans le même ordre.
