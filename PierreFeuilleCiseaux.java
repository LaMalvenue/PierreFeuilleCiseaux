import java.util.Scanner;
import static java.lang.Character.toUpperCase;

public class PierreFeuilleCiseaux {
    public static void main(String[] args) {
        char choixJoueur = ' ', reponse='Y', machineJeu=' ';
        int scoreJoueur=0, scoreMachine=0;
        Scanner lc = new Scanner(System.in);
        System.out.println("Pierre / Feuille / Ciseaux\n");


            do {
                System.out.println("Voulez-vous jouer ? (Y/N)");
                reponse = toUpperCase(lc.nextLine().charAt(0));
                if (reponse == 'Y') {
                    System.out.println("Cool !");

                    for (int coups=0; coups<3; coups++)  {
                    System.out.println("Il vous reste "+(3-coups)+" coups.");
                    System.out.println("Indiquez votre choix : pierre, feuille, ciseaux ? ");
                    choixJoueur = lc.nextLine().charAt(0);

                    // Initialisation machine

                    int machine = randomWithRange(1,3);

                    if (machine == 1) {
                        machineJeu = 'p';
                        System.out.println("Machine = Pierre !");
                    } else if (machine == 2) {
                        machineJeu = 'f';
                        System.out.println("Machine = Feuille !");
                    } else if (machine == 3) {
                        machineJeu = 'c';
                        System.out.println("Machine = Ciseaux !");
                    }
                    // Fin initialisation machine

                    // Résultats


                    if (choixJoueur == 'p') {                                  // Si le joueur joue pierre
                        if (machineJeu == 'p') {
                            System.out.println("Match nul !");
                            scoreJoueur = scoreJoueur + 1;
                            scoreMachine = scoreMachine + 1;
                        }
                        if (machineJeu == 'f') {
                            System.out.println("Dommage !");
                            scoreMachine = scoreMachine + 1;
                        }
                        if (machineJeu == 'c') {
                            System.out.println("Bravo !");
                            scoreJoueur = scoreJoueur + 1;
                        }
                    }                                                                   // Fin joueur joue pierre

                    if (choixJoueur == 'f') {                                              // Si le joueur joue feuille
                        if (machineJeu == 'p') {
                            System.out.println("Bravo !");
                            scoreJoueur = scoreJoueur + 1;
                        }
                        if (machineJeu == 'f') {
                            System.out.println("Match nul !");
                            scoreJoueur = scoreJoueur + 1;
                            scoreMachine = scoreMachine + 1;
                        }
                        if (machineJeu == 'c') {
                            System.out.println("Dommage !");
                            scoreMachine = scoreMachine + 1;
                        }
                    }                                                             // Fin joueur joue feuille


                    if (choixJoueur == 'c') {                                              // Si le joueur joue ciseaux
                        if (machineJeu == 'p') {
                            System.out.println("Dommage !");
                            scoreMachine = scoreMachine + 1;
                        }
                        if (machineJeu == 'f') {
                            System.out.println("Bravo !");
                            scoreJoueur = scoreJoueur + 1;
                        }
                        if (machineJeu == 'c') {
                            System.out.println("Match nul !");
                            scoreJoueur = scoreJoueur + 1;
                            scoreMachine = scoreMachine + 1;
                        }
                    }                                                         // Fin joueur joue ciseaux


                }                   // Fin coups <= 3
                }   // Fin si le joueur dit Y

                System.out.println("\nScore joueur : " + scoreJoueur);
                System.out.println("Score machine : " + scoreMachine);
                if (scoreJoueur > scoreMachine) System.out.println("Bravo, vous avez gagné !\n");
                if (scoreJoueur < scoreMachine) System.out.println("Vous êtes vraiment mauvais !\n");


            } while (reponse == 'Y');
            System.out.print("Au revoir...");

        } // Fin main

    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    } // Fin class
