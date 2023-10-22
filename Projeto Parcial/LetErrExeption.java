//Mauricio Junior de Brito      RA:2525321

public class LetErrExeption extends Exception {

    Leitura l = new Leitura();

    public void impMsgNomeErr() {
        l.entDados("\nO nome do Medicamento deve conter ate 15 caracteres! - Pressione ENTER para continuar...");
    }

    public Comprimido corrNomeComp(Comprimido comp) {

        try {
            comp.setNome(l.entDados("Novo Nome..: "));
        }
        catch(LetErrExeption lee) {
            impMsgNomeErr();
            comp = corrNomeComp(comp);
        }
        return comp;
    }

    public Solucao corrNomeSol(Solucao sol) {

        try {
            sol.setNome(l.entDados("Novo Nome..: "));
        }
        catch(LetErrExeption lee) {
            impMsgNomeErr();
            sol = corrNomeSol(sol);
        }
        return sol;
    }

    public Topico corrNomeTop(Topico top) {

        try {
            top.setNome(l.entDados("Novo Nome..: "));
        }
        catch(LetErrExeption lee) {
            impMsgNomeErr();
            top = corrNomeTop(top);
        }
        return top;
    }
}
