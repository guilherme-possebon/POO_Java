
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
        int opcao = 0;
        ControlaArma controlaArma = new ControlaArma();
        ControlaPersonagem controlaPersonagem = new ControlaPersonagem();

        while (opcao != 6) {
            opcao = Entrada.leiaInt("Digite um numero\n\n"
                    + "[1] - Cadastrar Arma\n"
                    + "[2] - Listar Armas\n"
                    + "[3] - Cadastrar Personagem\n"
                    + "[4] - Listar Personagens\n"
                    + "[5] - Comprar arma\n"
                    + "[6] - Sair");
            switch (opcao) {
                case 1:
                    Arma arma = new Arma();
                    arma.setNome(Entrada.leiaString("Digite o nome de uma arma"));
                    arma.setDano(Entrada.leiaInt("Digite um dano para a arma causar"));
                    arma.setMunicao(Entrada.leiaInt("Digite a quantidade de mucicao"));
                    arma.setPreco(Entrada.leiaDouble("Digite o preço da arma"));
                    controlaArma.addNovaArma(arma);
                    break;
                case 2:
                    System.out.println(controlaArma.imprimeArma());
                    break;
                case 3:
                    Personagem personagem = new Personagem();
                    personagem.setNome(Entrada.leiaString("Digite o nome do seu personagem"));
                    personagem.setDinheiro(Entrada.leiaDouble("Digite a quantidade de dinheiro do personagem"));
                    personagem.setVida(Entrada.leiaInt("Digite um valor da vida do personagem entre 1 e 100"));
                    controlaPersonagem.addNovoPersonagem(personagem);
                    break;
                case 4:
                    System.out.println(controlaPersonagem.imprimePersonagem());
                    break;
                case 5:
                    opcao = 0;
                    String nome = "";
                    for (Personagem p : controlaPersonagem.getPersonagens()) {
                        nome += "Id: " + p.getId() + " - nome: " + p.getNome() + " - vida " + p.getVida() + " - R$ " + p.getDinheiro() + "\n";

                    }
                    personagem = null;
                    while (personagem == null) {
                        int codigo = Entrada.leiaInt("Qual personagem gostaria de selecionar? \n"
                                + nome);
                        personagem = controlaPersonagem.getPersonagemPorCodigo(codigo);
                    }
                    nome = "";

                    for (Arma a : controlaArma.getArmas()) {
                        nome += "Id: " + a.getId() + " - nome: " + a.getNome() + " - R$ " + a.getPreco() + " - municao " + a.getMunicao() + " - dano: " + a.getDano() + "\n";

                    }
                    arma = null;
                    while (arma == null) {
                        int codigo = Entrada.leiaInt("Qual arma gostaria de selecionar? \n"
                                + nome);
                        arma = controlaArma.getArmaPorCodigo(codigo);
                    }
                    nome = "";

                    personagem.setArmasNoInventario(arma);

                    break;
                case 6:
                    System.out.println("Saindo..");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Numero invalido, digite um numero valido");
            }
        }

    }
}
