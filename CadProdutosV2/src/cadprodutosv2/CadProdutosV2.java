package cadprodutosv2;

import java.io.*;
import java.io.IOException;

public class CadProdutosV2 {

    public static void main(String[] args) {

        String empresa = "TI Solutions";

        System.out.println(empresa);
        System.out.println("CARREGANDO SISTEMA DE CADASTROS, POR FAVOR AGUARDE!");

        int retornoLinhas = 0;
        int opcao = 0;
        int cod = 0;
        String linha = "";
        String nextLine = "";
        String produtos[] = new String[100];

        File dir = new File("C:\\Users\\gposs\\Documents\\NetBeansProjects\\CadProdutosV2\\database");//nova instancia da classe File e o caminho do diretorio a ser criado
        File arq = new File(dir, "database.txt"); // cria o novo arquivo de database.

        if (!dir.exists()) { // se caso o diretorio não existe ele entra no if, e cria o diretorio

            //System.out.println("Diretorio não existe:");
            dir.mkdir();

        } else { //se caso o diretorio exista não faz nada

            //System.out.println("Diretorio existe:");// verificação
        }

        if (!arq.exists()) {//se o arquivo não existe, então tente criar ele.

            //System.out.println("Base de dados não existe, criando base de dados:");//verificacao
            try {// tente criar um aquivo,
                arq.createNewFile();

            } catch (IOException e) {//caso der erro, mostre na tela.
                e.printStackTrace();
            }

        } else {// caso o arquivo exista

            //System.out.println("arquivo existe:");
        }

        try { // tente contar as linhas

            FileReader fileReader = new FileReader(arq); //arquivo a ser lido
            BufferedReader bufferedReader = new BufferedReader(fileReader);// leitura de arquivo
            LineNumberReader lnr = new LineNumberReader(fileReader);//inicia o lineReader para ler a quantidade de linhas no banco
            lnr.skip(Long.MAX_VALUE);//le o arquivo até o final
            retornoLinhas = lnr.getLineNumber();
            System.out.println("linhas " + retornoLinhas);

            fileReader.close();
            bufferedReader.close();
            lnr.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

        try { //tente ler o arquivo, caso consiga faça

            int i = 0;
            FileReader fileReader = new FileReader(arq); //arquivo a ser lido
            BufferedReader bufferedReader = new BufferedReader(fileReader);// leitura de arquivo

            while ((linha = bufferedReader.readLine()) != null) {

                produtos[i] = linha;
                i++;
            }

            fileReader.close();
            bufferedReader.close();

        } catch (IOException e) { // caso não consiga ler o arquivo, imprima na tela o erro.
            e.printStackTrace();
        }

        while (opcao != 5) {

            System.out.println("+------------------------------+");
            System.out.println("| 1 - CADASTRO DE PRODUTOS     |");
            System.out.println("| 2 - RELATÓRIO DE PRODUTOS    |");
            System.out.println("| 3 - ALTERAR                  |");
            System.out.println("| 4 - EXCLUIR PRODUTO          |");
            System.out.println("| 5 - SAIR                     |");
            System.out.println("+------------------------------+");
            opcao = Entrada.leiaInt("Informe uma opção: ");

            switch (opcao) {

                case 1://cadastro de produtos
                    System.out.println("+---+ CADASTRO DE PRODUTOS +---+");
                    produtos[retornoLinhas] = Entrada.leiaString("Informe um produto para cadastro");
                    retornoLinhas++;
                    System.out.println("PRODUTO CADASTRADO COM SUCESSO!");

                    break;

                case 2://consultas

                    while (opcao != 3) {

                        System.out.println("+------------------------------+");
                        System.out.println("| 1 - LISTA TODOS PRODUTOS     |");
                        System.out.println("| 2 - RELATÓRIO DE PRODUTOS    |");
                        System.out.println("| 3 - SAIR                     |");
                        System.out.println("+------------------------------+");
                        opcao = Entrada.leiaInt("Informe uma opção: ");

                        switch (opcao) {

                            case 1:// consulta todos os produtos

                                System.out.println("+---+ RELATÓRIO DE PRODUTOS +--+");

                                for (int i = 0; i < retornoLinhas; i++) {
                                    System.out.println("Produto " + (i + 1) + " - " + produtos[i]);
                                }
                                break;

                            case 2://consulta produto cadastrado

                                System.out.println("+---+ CONSULTA DE PRODUTOS +---+");

                                String nomeConsulta = Entrada.leiaString("Informe um nome produto para consultar:");
                                boolean achei = false;

                                for (int i = 0; i < retornoLinhas; i++) {
                                    if (nomeConsulta.equalsIgnoreCase(produtos[i])) {
                                        System.out.println("Produto " + nomeConsulta + " localizado, código do produto " + (i + 1));
                                        achei = true;
                                    }

                                }
                                if (achei == false) {
                                    System.out.println("Produto não localizado");
                                }
                                break;

                            case 3://sai submenu

                                break;

                            default:
                                System.out.println("Opção invalida, escolha uma opção válida:");

                        }
                    }

                    break;

                case 3://alterar cadastro de produtos

                    System.out.println("+----+ ALTERAÇÃO PRODUTOS +----+ ");
                    cod = Entrada.leiaInt("Informe o código do produto para alterar o cadastro:");
                    cod = cod - 1;
                    produtos[cod] = Entrada.leiaString("Informe o novo nome do produto:");
                    System.out.println("Alteração efetuada com sucesso: ");

                    break;

                case 4://excluir produto cadastrado

                    if (retornoLinhas > 0) {

                        System.out.println("+---+ EXCLUSÃO DE PRODUTOS +---+");
                        cod = Entrada.leiaInt("Informe o código do produto a ser excluido:");
                        cod = cod - 1;
                        produtos[cod] = "EXCLUIDO";

                    } else {
                        System.out.println("Não há produtos cadastrados para excluir");
                    }

                    break;

                case 5://grava no banco e sai do sistema

                    try {

                        FileWriter escreverArq = new FileWriter(arq, false);//abre o arquivo para escrita
                        PrintWriter escrever = new PrintWriter(escreverArq);//escreve no arquivo

                        for (int i = 0; i < retornoLinhas; i++) {
                            escrever.println(produtos[i]);
                        }

                        escreverArq.close();

                    } catch (IOException e) {

                        e.printStackTrace();
                    }

                    break;

                default:

                    System.out.println("Opção invalida, escolha uma opção válida:");

            }
        }

        System.exit(0);
    }
}
