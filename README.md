# tennis-game

Dans ce kata, vous vous focaliserez sur le score d'un set de Tennis.

La base

Dans le jeu du Tennis, les joueurs commencent avec un score de 0. Avec plusieurs échanges ils gagnent des points et donc gagnent des séquences (jeux) :

0 -> 15 -> 30 -> 40
Si un joueur a 40 et marque encore contre son adversaire alors il gagne le jeu tant que l'autre joueur n'a pas lui aussi 40.
Si les deux joueurs ont 40 alors il y a deuce.
Marquer durant deuce donne au joueur avantage .
Si l'autre joueur marque aussi alors on retourne deuce à nouveau.
Si un joueur a avantage et marque après alors ce joueur gagne le jeu.
Besoin

Ecrire un programme qui prend en compte ces éléments pour le tableau des score entre deux joueurs de Tennis.

Les joueurs doivent être capable de marquer des points.
Le set doit être fini avec un gagnant.
Le cas deuce doit être traité.
Le cas du tie-break en fin de set doit être traité.
Apres qu'une partie soit gagnée, le joueur gagnant doit être déterminé.
On doit pouvoir suivre le score de chaque joueurs à tout moment durant la partie.
