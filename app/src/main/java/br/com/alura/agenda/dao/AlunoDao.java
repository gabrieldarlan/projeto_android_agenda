package br.com.alura.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.agenda.model.Aluno;

public class AlunoDao {

    private static int contadorDeIds = 1;
    private final static List<Aluno> alunos = new ArrayList<>();

    public void salva(Aluno aluno) {
        aluno.setId(contadorDeIds);
        alunos.add(aluno);
        atualizaIds();
    }

    private void atualizaIds() {
        contadorDeIds++;
    }

    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }

    public void edita(Aluno aluno) {
        Aluno alunoEncontrado = buscaAlunoPelaId(aluno);
        if (alunoEncontrado != null) {
            int posicaoDoAluno = alunos.indexOf(alunoEncontrado);
            alunos.set(posicaoDoAluno, aluno);
        }
    }

    private Aluno buscaAlunoPelaId(Aluno aluno) {
        for (Aluno a :
                alunos) {
            if (a.getId() == aluno.getId()) {
                return a;
            }
        }
        return null;
    }

    public void remove(Aluno aluno) {
        Aluno alunoDevolvido = buscaAlunoPelaId(aluno);
        if(alunoDevolvido!=null){
            alunos.remove(alunoDevolvido);
        }
    }
}
