/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gposs
 */
public class Start {

    public static void main(String[] args) {
        Carro carros[] = new Carro[5];

        for (int i = 0; i < carros.length; i++) {
            Carro c = new Carro();

            c.modelo = Entrada.leiaString("Digite o nome do modelo do carro n" + i);
            c.cor = Entrada.leiaString("Digite a cor do carro do modelo " + c.modelo);

            carros[i] = c;
        }
        while (true) {
            int menu = Entrada.leiaInt("Digite uma opção: \n"
                    + "[0] - Ligar o carro\n"
                    + "[1] - Acelerar o carro\n"
                    + "[2] - frear o carro\n"
                    + "[3] - Desligar o carro\n"
                    + "[4] - velocidade atual"
                    + "[5] - sair");
            if (menu == 4) {
                System.exit(0);
            }

            String modelo = Entrada.leiaString("Qual o modelo do carro");

            int index = -1;

            Carro carro = null;

            for (int i = 0; i < carros.length; i++) {
                if (carros[i].modelo.toLowerCase().contains(modelo.toLowerCase())) {
                    carro = carros[i];
                }
            }

            if (carro != null) {
                switch (menu) {
                    case 1:
                        carro.ligar();
                        break;
                    case 2:
                        carro.acelerar();
                        break;
                    case 3:
                        carro.frear();
                        break;
                    case 4:
                        System.out.println(carro.modelo + " = " + carro.velocidade);
                    default:
                        throw new AssertionError();
                }
            } else {
                System.out.println("Carro não encontrado");
            }

        }

    }
}
