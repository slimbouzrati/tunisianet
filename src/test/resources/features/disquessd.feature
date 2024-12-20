#Author: Slim

Feature: DisqueSSD

Scenario: Cliquer sur un produit

Given Utilisateur est sur la page SSD

When Utilisateur clique sur un produit "Disque Dur Interne SSD TwinMOS NGFFDGBM2280 SATA III M.2 / 128 Go"

Then La page de produit est affichée  "Disque Dur Interne SSD TwinMOS NGFFDGBM2280 SATA III M.2 / 128 Go"

And Le produit est en stock 

