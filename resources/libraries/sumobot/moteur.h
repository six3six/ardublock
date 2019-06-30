#include "Arduino.h" // bibliothèque pour la gestion de projet Arduino

// Constantes
// Vous n'êtes pas obligé d'utiliser ces valeurs, vous pouvez directement écrire un nombre de 0 à 255
#define MOTEUR_100 255  // valeur pour une PWM de 100%
#define MOTEUR_50  128  // valeur pour une PWM de  50%
#define MOTEUR_25  64   // valeur pour une PWM de  25%
#define MOTEUR_0   0    // valeur pour une PWM de   0%

// Pins provenant du fichier principal
const int MOTEUR_G_PWM     = 8;  // PWM moteur gauche
const int MOTEUR_G_DIR_1   = 6;  // Direction 1 moteur gauche
const int MOTEUR_G_DIR_2   = 5;  // Direction 2 moteur gauche
const int MOTEUR_D_PWM     = 7;  // PWM moteur droit
const int MOTEUR_D_DIR_1   = 9;  // Direction 1 moteur droit
const int MOTEUR_D_DIR_2   = 10; // Direction 2 moteur droit

// Déclarations des fonctions
void moteur_avance(byte val_gauche, byte val_droite);
void moteur_recule(byte val_gauche, byte val_droite);
void moteur_rotation_droite(byte val_gauche, byte val_droite);
void moteur_rotation_gauche(byte val_gauche, byte val_droite);
void moteur_bloque();
void moteur_stop();

