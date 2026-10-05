package com.mycompany.exercicio_while_2;

import javax.swing.JOptionPane;

public class Exercicio_while_2 {

    public static void main(String[] args) {
        int i = 0;
        do{
            JOptionPane.showMessageDialog(null,"valor de i = " + i);
            i++;
        }while(i < 5);
    }
}