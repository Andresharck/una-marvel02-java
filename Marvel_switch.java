package Divertidamente.Wanda;

import java.io.ObjectInputFilter.Status;

public class Marvel_switch {
    public static void main(String[] args) {
        String faseWanda = "feiticeira escarlate";

        String status = switch (faseWanda) {

            case "Vingadora" -> "Heroina em trienamento e controle de poderes";
            case "WandaVision" -> "Criação de realidade alternativa (hex) por lutar";
            case "feiticeira escarlate" -> "Poder maximo: manipulação de magia do caos e do Darkhold";
            case "Civil War" -> "Confinamento no complexo dos Vingadores";
            default -> "fase não indetificada no multiverso";
        };
        System.out.println("Status da Wanda " + status);

    }
}
