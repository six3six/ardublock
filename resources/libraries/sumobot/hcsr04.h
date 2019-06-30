#include "Arduino.h" // bibliothèque pour la gestion de projet Arduino

// Pins provenant du fichier principal
const int ULTRASON_ECHO    = 14; // Pin ECHO du module ultrason HC-SR04
const int ULTRASON_TRIGGER = 13; // Pin TRIGGER du module ultrason HC-SR04
extern const int ULTRASON_TRIGGER;

// Déclarations des fonctions
long ultrason_distance();