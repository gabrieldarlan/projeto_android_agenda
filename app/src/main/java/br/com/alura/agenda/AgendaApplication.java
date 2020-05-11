package br.com.alura.agenda;

import android.app.Application;

import br.com.alura.agenda.dao.AlunoDao;
import br.com.alura.agenda.model.Aluno;

@SuppressWarnings("ALL")
public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDao dao = new AlunoDao();
        dao.salva(new Aluno("Maria","(11) 4184-9645","maria@gmail.com"));
        dao.salva(new Aluno("Mariana","(11) 4178-9646","mariana@gmail.com"));
    }
}
