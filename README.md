# ps5-GroupeK
Kata - La main de Poker
septembre 2018
V0.1
Philippe Collet & Sébastien Mosser
D’après PokerHands (codingDojo.org, the coding dojo handbook de Emily Bache)
Description du problème		 	 	 		
Comparer deux mains de poker saisie sur l’entrée standard, déterminer laquelle est la plus forte et afficher ce résultat.			
Description des règles
Une main de poker comprend 5 cartes tirées d’un seul jeu de 52 cartes. Chaque carte à une couleur, Trèfle, Carreau, Coeur, Pique (dénotée Tr, Ca, Co, Pi) et une valeur parmi 2, 3, 4, 5, 6, 7, 8, 9, 10, valet, dame, roi, as (dénotée 2, 3, 4, 5, 6, 7, 8, 9, 10, V, D, R, A). Pour le calcul du score, toutes les couleurs ont le même niveau, par exemple l’as de carreau n’est pas battu par l’as de pique, ils sont égaux. Les valeurs sont ordonnées comme définies précédemment, le 2 étant la plus petite valeur et l’as la plus grande.
Une main de poker est faite de 5 cartes. Dans le texte ci-dessous, les mains sont classées de la plus faible à la plus forte :
Plus haute carte : les mains qui ne correspondent à aucune autre catégorie sont classées par la valeur de leur plus haute carte. Si les plus hautes cartes ont la même valeur, les mains sont classées par la plus haute suivante et ainsi de suite.
Paire : 2 des 5 cartes de la main ont la même valeur. Deux mains qui contiennent une paire sont classées par la valeur des cartes formant la paire. Si les valeurs sont les mêmes, les mains sont classées par les cartes hors de la paire, en ordre décroissant.
Deux paires : La main contient deux paires différentes. Les mains qui contiennent deux paires sont classées par la valeur de la paire la plus élevée. Deux mains avec la paire la plus élevée de même valeur sont classées par l’autre paire. Si ces valeurs sont les mêmes, les mains sont classées par la valeur de la carte restante.
Brelan : 3 cartes dans la main ont la même valeur. Deux mains avec un brelan sont classées par la valeur des 3 cartes.
Suite : 5 cartes de valeurs consécutives. Deux suites sont classées par la valeur de leur carte la plus élevée.
Couleur : La main contient 5 cartes de la même couleur. Deux mains “couleur” sont classées par les règles de la carte la plus élevée.
Full : La main contient  3 cartes de la même valeur avec les 2 cartes formant une paire, le classement se fait par la valeur des 3 cartes.
Carré : 4 cartes de la même valeur, classement par la valeur des 4 cartes.
Quinte Flush : 5 cartes de la même couleur avec des valeurs consécutives, classement par la carte la plus élevée dans la main.

Exemples
Main 1:  2Tr 6Ca 7Ca 8Tr APi
Main 2:  3Tr 5Ca 9Ca DCo RCo
La main 1 gagne avec carte la plus élevée : As

Main 1:  2Tr 6Ca 7Ca 8Tr APi
Main 2:  3Tr 5Ca 5Co DCo RCo
La main 2 gagne avec paire de 5

Main 1:  2Tr 6Ca 3Ca 8Tr APi
Main 2:  3Tr 6Pi 2Ca 8Co ACo
Egalite
Travail à réaliser
Première semaine : 
Spécifier un découpage des tâches et des releases pour implémenter une solution à 4 en Java.
Deuxième semaine : 
Rendre la spécification des tâches (mail avec fichier excel nommé “Lettre-du-groupe”-”specs”.xls, exemple A-specs.xls)
Commencer à implémenter la solution en versionnant le code, tenir à jour et modifier le planning des tâches…
Troisième semaine : 
Le code est sur le git, la progression s’est faite et continue commit par commit
Continuer mais avec des tests, plus rien n’est livré sans que vous puissiez donner confiance dans la correction de votre code et dans chaque livraison
Quatrième semaine : 
Les tests et le code sont sur le git...
Terminer avec une construction automatique et portable de votre livraison
Cinquième semaine : 
Le code et les tests peuvent être construits automatiquement à partir du git
Soutenance technique, et démarrage du projet suivant...
Logistique
Répartition des équipes : https://docs.google.com/spreadsheets/d/1ce5S4MoyPZkUhTDt1_Ki1xYHxY_iNKQxskN02cWWZfU/edit?usp=sharing 
Modèle de tableur excel de définition et suivi des tâches : https://drive.google.com/open?id=0B1jUYa7NNopqM1cwd0NrUVY3MFU  
