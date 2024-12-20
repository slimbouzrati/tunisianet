#Author: Slim
Feature: HomePage TunisiaNet

  Background: 
    Given utilisateur est sur la page dacceuil

  Scenario: Selectionner un menu de la page dacceuil
    When utilisasteur survole la souris sur le menu "Stockage"
    And utilisateur clique sur le menu "Disque SSD"
    Then utilisateur est derige vers la page produit "Disque SSD"

  Scenario: chercher un produit
    When utilisateur cherche un produit avec son nom "Slim"
    Then le resultat de recherche du produit "Slim2" est affiche
