package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

    public static void main(String[] args) {
        Operation[] operations = new Operation[4];

        operations[0] = new Credit("2024-10-01", 500.00);
        operations[1] = new Debit("2024-10-02", 200.00);
        operations[2] = new Credit("2024-10-03", 300.00);
        operations[3] = new Debit("2024-10-04", 150.00);

        double montantGlobal = 0;

        for (Operation operation : operations) {
            System.out.println("Type de l'opération: " + operation.getType());
            System.out.println("Date de l'opération: " + operation.getDate());
            System.out.println("Montant de l'opération: " + operation.getMontant());
            System.out.println("------------------------------");

            if (operation.getType().equals("CREDIT")) {
                montantGlobal += operation.getMontant();
            } else if (operation.getType().equals("DEBIT")) {
                montantGlobal -= operation.getMontant();
            }
        }
        System.out.println("Montant global des opérations: " + montantGlobal);
    }
}
