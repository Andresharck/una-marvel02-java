package Divertidamente.Wanda;

import java.lang.classfile.instruction.SwitchCase;
import java.text.BreakIterator;

public class Wanda_Marvel {

    public static void main(String[] args) {
        String faseWanda = "wandaVision";
        String status;

        switch (faseWanda) {
            case "Vingadora":
                status = "Heroina em treinamento";
                break;
            case "Feiticeira Escarlate":
                status = "Dominio da magia do caos";
                break;
            case "wandaVision":
                status = "criação do hex é vida suburbana";
                break;
            default:
                status = "Fase desconhecida";
                break;

        }
        System.out.println("Status: " + status);
    }
}
