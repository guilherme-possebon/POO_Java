package javaapplication1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JavaApplication1 {

    public static void main(String[] args) {
        ControlaAluno controlaAlunos = new ControlaAluno();
        ControlaCurso controlaCursos = new ControlaCurso();
        ControlaProfessor controlaProfessor = new ControlaProfessor();
        ControlaSala controlaSala = new ControlaSala();

        //ArrayList<Curso> cursos = new ArrayList<>();
        //ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Sala> salas = new ArrayList<>();
        //ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Inscricao> inscricoes = new ArrayList<>();
        String nomeAluno = "";

        int menu = 0;

        boolean existeProfessoresNoSistema = false;
        boolean existeSalasNoSistema = false;

        while (true) {
            menu = Entrada.leiaInt("--Menu Inicial-- \n"
                    + "1 - Cadastrar curso\n"
                    + "2 - Cadastrar professor\n"
                    + "3 - Cadastrar aluno\n"
                    + "4 - Cadastrar sala\n"
                    + "5 - Inscrição\n"
                    + "6 - Consultas\n"
                    + "7 - Sair");
            switch (menu) {
                case 1: // cadastro de curso

                    if (!existeProfessoresNoSistema)// se não existe professores no sistema
                    {
                        System.out.println("Não existe professor registrado no sistema, favor, clique na opção 2");
                    }

                    if (!existeSalasNoSistema)//se não existe sala no sistema
                    {
                        System.out.println("Não existe sala/predio registrado no sistema, favor, clique na opção 4");
                    }

                    if (existeProfessoresNoSistema && existeSalasNoSistema) {
                        String nomes = "";

                        for (Professor professor : controlaProfessor.getProfessores()) {
                            nomes += professor.getIdProfessor() + " - " + professor.getNomeProfessor() + "\n";
                        }

                        Professor professor = null;

                        while (professor == null) {
                            int codigo = Entrada.leiaInt("Qual professor gostaria de selecionar? \n"
                                    + nomes);

                            professor = controlaProfessor.getProfessorId(codigo);
                            if (professor == null) {
                                JOptionPane.showMessageDialog(null, "Professor não encontrado");
                            }
                        }

                        nomes = " ";

                        for (Sala sala : controlaSala.getSalas()) {
                            nomes += sala.getIdSalaEPredio() + " - sala: " + sala.getSala() + " - predio: " + sala.getPredio() + "\n";
                        }

                        Sala sala = null;

                        while (sala == null) {
                            int codigo = Entrada.leiaInt("Qual sala gostaria de selecionar? \n"
                                    + nomes);

                            sala = controlaSala.getSalasPorCodigo(codigo);

                            if (sala == null) {
                                JOptionPane.showMessageDialog(null, "Professor não encontrado");
                            }
                        }

                        Curso novoCurso = new Curso();
                        novoCurso.setNomeCurso(Entrada.leiaString("Informe o nome do curso:"));
                        novoCurso.setDiaInicio(Entrada.leiaString("Informe a data do inicio do curso"));
                        novoCurso.setDiaFim(Entrada.leiaString("Informe a data do final do curso:"));
                        novoCurso.setProfessor(professor);
                        novoCurso.setSala(sala);

                    }

                    break;

                case 2: //cadastro professor

                    Professor novoProfessor = new Professor();
                    novoProfessor.setNomeProfessor(Entrada.leiaString("Informe o nome do professor: "));
                    novoProfessor.setCpfProfessor(Entrada.leiaString("Informe o CPF no novo Professor:"));
                    controlaProfessor.adicionaProfessor(novoProfessor);
                    JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!" + novoProfessor.getIdProfessor() + " - " + novoProfessor.getNomeProfessor());
                    existeProfessoresNoSistema = true;
                    break;

                case 3: // cadastrar aluno

                    Aluno novoAluno = new Aluno();
                    novoAluno.setNomeAluno(Entrada.leiaString("Informe o nome do novo Aluno:"));
                    controlaAlunos.adicionaAluno(novoAluno);
                    break;

                /*
                    nomeAluno = Entrada.leiaString("Informe o nome do aluno");
                    Aluno novoAluno = new Aluno(nomeAluno);
                    System.out.println("Aluno cadastrado com sucesso!" + novoAluno.getIdAluno() + " - " + novoAluno.getNomeAluno());
                    break;*/
                case 4: //cadastro de salas

                    Sala novaSala = new Sala();
                    novaSala.setSala(Entrada.leiaInt("Informe a nova Sala: "));
                    novaSala.setPredio(Entrada.leiaInt("Informe o predio da nova sala: "));

                    controlaSala.addSala(novaSala);
                    existeSalasNoSistema = true;
                    /*
                    int predio = Entrada.leiaInt("Informe o número do prédio");
                    int sala = Entrada.leiaInt("Informe o número da sala");
                    Sala novaSala = new Sala(predio, sala);
                    salas.add(novaSala);
                    System.out.println("Predio e sala cadastrados com sucesso!" + novaSala.getIdSalaEPredio());
                     */

                    break;

                case 5: //inscrição de alunos
/*
                    boolean existeCursoNoSistema = false;
                    boolean existeAlunoNoSistema = false;

                    if (cursos.isEmpty())
                    {
                        System.out.println("Não existe curso registrado no sistema, favor, clique na opção 1");
                    } else
                    {
                        existeCursoNoSistema = true;
                    }
                    if (alunos.isEmpty())
                    {
                        System.out.println("Não existe aluno registrado no sistema, favor, clique na opção 3");
                    } else
                    {
                        existeAlunoNoSistema = true;
                    }

                    if (existeCursoNoSistema && existeAlunoNoSistema)
                    {

                        Curso curso = null;
                        Aluno aluno = null;
                        boolean existe = true;

                        while (existe)
                        {
                            String nomeCurso = Entrada.leiaString("Informe o nome do curso");
                            for (int i = 0; i < cursos.size(); i++)
                            {
                                if (nomeCurso.equalsIgnoreCase(cursos.get(i).getNome()))
                                {
                                    curso = cursos.get(i);
                                    System.out.println("Curso encontrado com sucesso!");
                                    existe = false;
                                } else
                                {
                                    System.out.println("Não foi encontrado o curso desejado, favor digite um curso já existente");
                                }
                            }
                        }
                        boolean existe2 = true;
                        while (existe2)
                        {

                            nomeAluno = Entrada.leiaString("Informe o nome do Aluno");
                            for (int i = 0; i < alunos.size(); i++)
                            {
                                if (nomeAluno.equalsIgnoreCase(alunos.get(i).getNomeAluno()))
                                {
                                    aluno = alunos.get(i);
                                    System.out.println("Aluno encontrado com sucesso!");
                                    existe2 = false;
                                } else
                                {
                                    System.out.println("Não foi encontrado o aluno desejado, favor digite um aluno já existente");
                                }
                            }
                        }

                        Inscricao i = new Inscricao(aluno, curso);
                        inscricoes.add(i);
                        System.out.println("Inscrição feita com sucesso!" + i.getIdInscricao());
                    }
                    break;

                case 6:
                    menu = 0;
                    while (menu != 6)
                    {
                        menu = Entrada.leiaInt("Digite a opção desejada\n"
                                + "1 - Consultar cursos\n"
                                + "2 - Consultar professores\n"
                                + "3 - Consultar alunos\n"
                                + "4 - Consultar predio/salas\n"
                                + "5 - Consultar inscrições\n"
                                + "6 - Sair");

                        switch (menu)
                        {
                            case 1:

                                System.out.println("\nConsultas do curso: ");
                                Curso c = new Curso();
                                System.out.println(c.imprimeCurso(cursos));
                                break;

                            case 2:

                                System.out.println("\nConsultas dos professores: ");
                                Professor p = new Professor();
                                p.imprimeProfessor(professores);
                                break;

                            case 3:

                                System.out.println("\nConsultas dos alunos: ");
                                Aluno a = new Aluno();
                                a.imprimeAluno(alunos);
                                break;

                            case 4:

                                System.out.println("\nConsultas das salas/predios: ");
                                Sala s = new Sala();
                                s.imprimeSalas(salas);
                                break;

                            case 5:

                                System.out.println("\nConsultas das inscrições: ");
                                Inscricao i = new Inscricao();
                                i.imprimeInscricoes(inscricoes, cursos);
                                break;

                            case 6:

                                System.out.println("Saindo do sub menu");
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA, escolha uma opção válida no sistema");

                        }
                    }

                    break;
                 */
                case 7:

                    controlaAlunos.gravaAlunos();
                    controlaCursos.gravaCurso();
                    System.out.println("Saindo do sistema...");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA, escolha uma opção válida no sistema");

            }
        }

    }
}
