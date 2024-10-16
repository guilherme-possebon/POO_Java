
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gposs
 */
public class ControlaPersonagem {

    private ArrayList<Personagem> personagens = new ArrayList<>();
    int serial = 1;
    ControlaArma controlaArma;

    public void addNovoPersonagem(Personagem novoPersonagem) {
        novoPersonagem.setId(serial++);
        personagens.add(novoPersonagem);

    }

    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }

    public String imprimePersonagem() {
        String a = "";

        for (Personagem p : getPersonagens()) {
            a += "Id personagem: " + p.getId() + "\nnome: " + p.getNome() + "\nvida: " + p.getVida() + "\ndinheiro: " + p.getDinheiro() + "\narmas: " + p.getArmas() + "\n";
        }
        return a;
    }

    public ArrayList<Personagem> setArma(int codigo) {
        Personagem personagem = getPersonagemPorCodigo(codigo);
        System.out.println(personagem.getArmas());
        return null;
    }

    public Personagem getPersonagemPorCodigo(int codigo) {
        for (Personagem personagem : personagens) {
            if (personagem.getId() == codigo) {
                return personagem;
            }
        }
        return null;
    }

}
