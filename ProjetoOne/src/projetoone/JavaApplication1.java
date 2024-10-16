package projetoone;

import javax.swing.JOptionPane;

public class JavaApplication1 {

    public static void main(String[] args) {
        ControlaAluno controlaAlunos = new ControlaAluno();
        ControlaProfessor controlaProfessor = new ControlaProfessor();
        ControlaSala controlaSala = new ControlaSala();
        ControlaCurso controlaCursos = new ControlaCurso(controlaProfessor, controlaSala);
        ControlaInscricao controlaInscricao = new ControlaInscricao(controlaCursos, controlaAlunos);

        String nomes = "";

        int menu = 0;

        boolean existeProfessoresNoSistema = false;
        boolean existeSalasNoSistema = false;
        boolean existeCursoNoSistema = false;
        boolean existeAlunoNoSistema = false;

        while (true) {
            menu = Entrada.leiaInt("--Menu Inicial-- \n"
                    + "1 - Cadastrar curso\n"
                    + "2 - Cadastrar professor\n"
                    + "3 - Cadastrar aluno\n"
                    + "4 - Cadastrar sala\n"
                    + "5 - Inscrição\n"
                    + "6 - Consultas\n"
                    + "7 - Alterar\n"
                    + "8 - Deletar\n"
                    + "9 - SAIR DO SISTEMA");
            switch (menu) {
                case 1: // cadastro de curso

                    nomes = "";

                    if (!existeProfessoresNoSistema)// se não existe professores no sistema
                    {
                        System.out.println("Não existe professor registrado no sistema, favor, clique na opção 2");
                    }

                    if (!existeSalasNoSistema)//se não existe sala no sistema
                    {
                        System.out.println("Não existe predio/sala registrado no sistema, favor, clique na opção 4");
                    }

                    if (existeProfessoresNoSistema && existeSalasNoSistema) {

                        for (Professor professor : controlaProfessor.getProfessores()) {
                            nomes += professor.getIdProfessor() + " - " + professor.getNomeProfessor() + "\n";
                        }

                        Professor professor = null;

                        while (professor == null) {
                            int codigo = Entrada.leiaInt("Qual professor gostaria de selecionar? \n"
                                    + nomes);

                            professor = controlaProfessor.getProfessorPorCodigo(codigo);
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

                        controlaCursos.adicionaCurso(novoCurso);

                        existeCursoNoSistema = true;
                        nomes = "";

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
                    JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!" + novoAluno.getIdAluno() + " - " + novoAluno.getNomeAluno());

                    existeAlunoNoSistema = true;
                    break;

                case 4: //cadastro de salas

                    Sala novaSala = new Sala();
                    novaSala.setPredio(Entrada.leiaInt("Informe o novo predio: "));
                    novaSala.setSala(Entrada.leiaInt("Informe a nova Sala: "));
                    controlaSala.addSala(novaSala);
                    JOptionPane.showMessageDialog(null, "Sala cadastrada com sucesso!" + novaSala.getIdSalaEPredio() + " - " + " predio: " + novaSala.getPredio() + " sala: " + novaSala.getSala());

                    existeSalasNoSistema = true;

                    break;

                case 5: //inscrição de alunos

                    if (!existeCursoNoSistema) {
                        System.out.println("Não existe curso registrado no sistema, favor, clique na opção 1");
                    }

                    if (!existeAlunoNoSistema) {
                        System.out.println("Não existe aluno registrado no sistema, favor, clique na opção 3");
                    }

                    if (existeCursoNoSistema && existeAlunoNoSistema) {

                        for (Curso curso : controlaCursos.getCursos()) {
                            nomes += curso.getIdCurso() + " - " + curso.getNome() + "\n";
                        }

                        Curso curso = null;

                        while (curso == null) {
                            int codigo = Entrada.leiaInt("Qual curso gostaria de selecionar? \n"
                                    + nomes);

                            curso = controlaCursos.getCursoPorCodigo(codigo);
                            if (curso == null) {
                                JOptionPane.showMessageDialog(null, "Curso não encontrado");
                            }
                        }

                        nomes = " ";

                        for (Aluno aluno : controlaAlunos.getAlunos()) {
                            nomes += aluno.getIdAluno() + " - " + aluno.getNomeAluno() + "\n";
                        }

                        Aluno aluno = null;

                        while (aluno == null) {
                            int codigo = Entrada.leiaInt("Qual aluno gostaria de selecionar? \n"
                                    + nomes);

                            aluno = controlaAlunos.getAlunoPorCodigo(codigo);

                            if (aluno == null) {
                                JOptionPane.showMessageDialog(null, "Aluno não encontrado");
                            }
                        }

                        Inscricao novaInscricao = new Inscricao();
                        novaInscricao.setAluno(aluno);
                        novaInscricao.setCurso(curso);
                        nomes = " ";

                        JOptionPane.showMessageDialog(null, "Incrição feita com sucesso!\n" + "Id da inscricao: " + novaInscricao.getIdInscricao()
                                + "\nAluno cadastrado:\n "
                                + "id do aluno: " + novaInscricao.getAluno().getIdAluno()
                                + " nome do aluno: " + novaInscricao.getAluno().getNomeAluno()
                                + "\nCurso:"
                                + "\nCodigo do curso: " + novaInscricao.getCurso().getIdCurso()
                                + "\nData de inicio do curso: " + novaInscricao.getCurso().getDiaInicio()
                                + "\nData de termino do curso: " + novaInscricao.getCurso().getDiaFim()
                                + "\nNome do professor: " + novaInscricao.getCurso().getProfessor().getNomeProfessor()
                                + "\nPredio: " + novaInscricao.getCurso().getSala().getPredio() + " sala: " + novaInscricao.getCurso().getSala().getSala()
                        );

                        controlaInscricao.adicionaInscricao(novaInscricao);
                    }

                    break;

                case 6:
                    menu = 0;
                    while (menu != 6) {
                        menu = Entrada.leiaInt("Digite a opção desejada\n"
                                + "1 - Consultar cursos\n"
                                + "2 - Consultar professores\n"
                                + "3 - Consultar alunos\n"
                                + "4 - Consultar predio/salas\n"
                                + "5 - Consultar inscrições\n"
                                + "6 - VOLTAR AO MENU PRINCIPAL");

                        switch (menu) {
                            case 1:// consultar cursos

                                JOptionPane.showMessageDialog(null, "Listagem de Cursos\n" + controlaCursos.imprimeCursos());
                                break;

                            case 2:// consultar Professores

                                JOptionPane.showMessageDialog(null, "Listagem de professores\n" + controlaProfessor.imprimeProfessor());
                                break;

                            case 3://consultar Alunos

                                JOptionPane.showMessageDialog(null, "Listagem de alunos\n" + controlaAlunos.imprimeAlunos());
                                break;

                            case 4://consultar salas

                                JOptionPane.showMessageDialog(null, "Listagem de predio/sala\n" + controlaSala.imprimeSalas());
                                break;

                            case 5://consulta Inscricoes

                                JOptionPane.showMessageDialog(null, "Listagem de inscrições\n" + controlaInscricao.imprimeInscricoes());
                                break;

                            case 6://voltar ao menu principal

                                System.out.println("Saindo do sub menu");
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA, escolha uma opção válida no sistema");
                        }
                    }

                    break;
                case 7:
                    menu = 0;
                    while (menu != 6) {
                        menu = Entrada.leiaInt("Digite a opção desejada\n"
                                + "1 - Alterar cursos\n"
                                + "2 - Alterar professores\n"
                                + "3 - Alterar alunos\n"
                                + "4 - Alterar predio/salas\n"
                                + "5 - Alterar inscrições\n"
                                + "6 - VOLTAR AO MENU PRINCIPAL");

                        switch (menu) {
                            case 1:// alterar cursos
                                nomes = "";
                                Integer codigo = null;
                                for (Curso curso : controlaCursos.getCursos()) {
                                    nomes += curso.getIdCurso() + " - " + curso.getNome() + "\n";
                                }

                                Curso curso = null;

                                while (curso == null) {
                                    codigo = Entrada.leiaInt("Qual curso gostaria de selecionar? \n"
                                            + nomes);
                                    curso = controlaCursos.getCursoPorCodigo(codigo);
                                    if (curso == null) {
                                        JOptionPane.showMessageDialog(null, "Curso não encontrado");
                                    }
                                }
                                controlaCursos.alteraCursos(codigo);
                                break;

                            case 2:// alterar Professores
                                codigo = null;
                                nomes = "";
                                for (Professor professor : controlaProfessor.getProfessores()) {
                                    nomes += professor.getIdProfessor() + " - " + professor.getNomeProfessor() + "\n";
                                }

                                Professor professor = null;

                                while (professor == null) {
                                    codigo = Entrada.leiaInt("Qual professor gostaria de selecionar? \n"
                                            + nomes);

                                    professor = controlaProfessor.getProfessorPorCodigo(codigo);

                                    if (professor == null) {
                                        JOptionPane.showMessageDialog(null, "Professor não encontrado");
                                    }
                                }
                                controlaProfessor.alteraProfessor(codigo);

                                break;

                            case 3://alterar Alunos
                                codigo = null;
                                nomes = "";
                                for (Aluno aluno : controlaAlunos.getAlunos()) {
                                    nomes += aluno.getIdAluno() + " - " + aluno.getNomeAluno() + "\n";
                                }

                                Aluno aluno = null;

                                while (aluno == null) {
                                    codigo = Entrada.leiaInt("Qual aluno gostaria de selecionar? \n"
                                            + nomes);

                                    aluno = controlaAlunos.getAlunoPorCodigo(codigo);

                                    if (aluno == null) {
                                        JOptionPane.showMessageDialog(null, "Aluno não encontrado");
                                    }
                                }
                                controlaAlunos.alteraAlunos(codigo);

                                break;

                            case 4://alterar salas

                                codigo = null;
                                nomes = "";

                                for (Sala sala : controlaSala.getSalas()) {
                                    nomes += sala.getIdSalaEPredio() + " - " + "Predio: " + sala.getPredio() + " sala: " + sala.getSala() + "\n";
                                }

                                Sala sala = null;

                                while (sala == null) {
                                    codigo = Entrada.leiaInt("Qual predio/sala gostaria de selecionar? \n"
                                            + nomes);

                                    sala = controlaSala.getSalasPorCodigo(codigo);

                                    if (sala == null) {
                                        JOptionPane.showMessageDialog(null, "Predio/sala não encontradas");
                                    }
                                }
                                controlaSala.alteraSalas(codigo);
                                break;

                            case 5://alterar Inscricoes

                                codigo = null;
                                nomes = "";
                                for (Inscricao inscricao : controlaInscricao.getInscricoes()) {
                                    nomes += inscricao.getIdInscricao() + " - " + inscricao.getAluno() + "\n"
                                            + inscricao.getCurso() + "\n\n";
                                }

                                Inscricao inscricao = null;

                                while (inscricao == null) {
                                    codigo = Entrada.leiaInt("Qual inscricao gostaria de selecionar? \n"
                                            + nomes);

                                    inscricao = controlaInscricao.getInscricaoPorCodigo(codigo);

                                    if (inscricao == null) {
                                        JOptionPane.showMessageDialog(null, "Aluno não encontrado");
                                    }
                                }
                                controlaInscricao.alteraInscricao(codigo);
                                break;

                            case 6://voltar ao menu principal

                                System.out.println("Saindo do sub menu");
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA, escolha uma opção válida no sistema");
                        }
                    }
                    break;
                case 8:
                    menu = 0;
                    while (menu != 6) {
                        menu = Entrada.leiaInt("Digite a opção desejada\n"
                                + "1 - Deletar cursos\n"
                                + "2 - Deletar professores\n"
                                + "3 - Deletar alunos\n"
                                + "4 - Deletar predio/salas\n"
                                + "5 - Deletar inscrições\n"
                                + "6 - VOLTAR AO MENU PRINCIPAL");
                        switch (menu) {
                            case 1:
                                Integer codigo = null;
                                nomes = "";
                                for (Curso curso : controlaCursos.getCursos()) {
                                    nomes += curso.getIdCurso() + " - " + curso.getNome() + "\n";
                                }

                                Curso curso = null;

                                while (curso == null) {
                                    codigo = Entrada.leiaInt("Qual curso gostaria de selecionar? \n"
                                            + nomes);

                                    curso = controlaCursos.getCursoPorCodigo(codigo);

                                    if (curso == null) {
                                        JOptionPane.showMessageDialog(null, "Curso não encontrado");
                                    }
                                }
                                controlaCursos.removerCurso(codigo);
                                JOptionPane.showMessageDialog(null, "Curso removido com sucesso!");
                                break;
                            case 2:
                                codigo = null;
                                nomes = "";
                                for (Professor professor : controlaProfessor.getProfessores()) {
                                    nomes += professor.getIdProfessor() + " - " + professor.getNomeProfessor() + " - " + professor.getCpfProfessor() + "\n";
                                }

                                Professor professor = null;

                                while (professor == null) {
                                    codigo = Entrada.leiaInt("Qual professor gostaria de selecionar? \n"
                                            + nomes);

                                    professor = controlaProfessor.getProfessorPorCodigo(codigo);

                                    if (professor == null) {
                                        JOptionPane.showMessageDialog(null, "Professor não encontrado");
                                    }
                                }
                                controlaProfessor.removerProfessor(codigo);
                                JOptionPane.showMessageDialog(null, "Professor removido com sucesso!");
                                break;
                            case 3:
                                codigo = null;
                                nomes = "";
                                for (Aluno aluno : controlaAlunos.getAlunos()) {
                                    nomes += aluno.getIdAluno() + " - " + aluno.getNomeAluno() + "\n";
                                }

                                Aluno aluno = null;

                                while (aluno == null) {
                                    codigo = Entrada.leiaInt("Qual aluno gostaria de selecionar? \n"
                                            + nomes);

                                    aluno = controlaAlunos.getAlunoPorCodigo(codigo);

                                    if (aluno == null) {
                                        JOptionPane.showMessageDialog(null, "Aluno não encontrado");
                                    }
                                }
                                controlaAlunos.removerAluno(codigo);
                                JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
                                break;
                            case 4:
                                codigo = null;
                                nomes = "";
                                for (Sala sala : controlaSala.getSalas()) {
                                    nomes += sala.getIdSalaEPredio() + " - Predio" + sala.getPredio() + " - sala" + sala.getSala() + "\n";
                                }

                                Sala sala = null;

                                while (sala == null) {
                                    codigo = Entrada.leiaInt("Qual predio/sala gostaria de selecionar? \n"
                                            + nomes);

                                    sala = controlaSala.getSalasPorCodigo(codigo);

                                    if (sala == null) {
                                        JOptionPane.showMessageDialog(null, "Predio/sala não encontrado");
                                    }
                                }
                                controlaSala.removerSala(codigo);
                                JOptionPane.showMessageDialog(null, "Predio/sala removido com sucesso!");
                                break;
                            case 5:
                                codigo = null;
                                nomes = "";
                                for (Inscricao inscricao : controlaInscricao.getInscricoes()) {
                                    nomes += inscricao.getIdInscricao() + " - Aluno" + inscricao.getAluno() + " - curso" + inscricao.getCurso() + "\n";
                                }

                                Inscricao inscricao = null;

                                while (inscricao == null) {
                                    codigo = Entrada.leiaInt("Qual inscrição gostaria de selecionar? \n"
                                            + nomes);

                                    inscricao = controlaInscricao.getInscricaoPorCodigo(codigo);

                                    if (inscricao == null) {
                                        JOptionPane.showMessageDialog(null, "Inscrição não encontrado");
                                    }
                                }
                                controlaInscricao.removeInscricao(codigo);
                                JOptionPane.showMessageDialog(null, "Inscrição removido com sucesso!");
                                break;
                            case 6:
                                System.out.println("Saindo do menu de deletar");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA, escolha uma opção válida no sistema");
                        }
                    }

                    break;
                case 9:

                    System.out.println("Saindo do sistema...");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA, escolha uma opção válida no sistema");

            }
        }

    }
}
