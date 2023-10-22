// Aluno: Mauricio Junior de Brito     RA: 2525321

public class NumErrException extends Exception {
    
    Leitura l = new Leitura();

    public void impMsgCodErr() {

        l.entDados("\nO Codigo deve conter 3 digitos! Pressione ENTER para continuar...");
    }

    public Comprimido corrCodComp(Comprimido comp) {

        try {
            comp.setCodigo(Integer.parseInt(l.entDados("Novo Codigo..: ")));
        }
        catch(NumErrException nee) {
            impMsgCodErr();
            comp = corrCodComp(comp);
        }
        return comp;
    }

    public Solucao corrCodSol(Solucao sol) {

        try {
            sol.setCodigo(Integer.parseInt(l.entDados("Novo Codigo..: ")));
        }
        catch(NumErrException nee) {
            impMsgCodErr();
            sol = corrCodSol(sol);
        }
        return sol;
    }

    public Topico corrCodTop(Topico top) {

        try {
            top.setCodigo(Integer.parseInt(l.entDados("Novo Codigo..: ")));
        }
        catch(NumErrException nee) {
            impMsgCodErr();
            top = corrCodTop(top);
        }
        return top;
    }

    public void impMsgCnpjErr() {

        l.entDados("\nO CNPJ deve conter 5 digitos! Pressione ENTER para continuar...");
    }

    public Comprimido corrCnpjComp(Comprimido comp) {

        try {
            comp.getFabricante().setCnpj(Integer.parseInt(l.entDados("Novo CNPJ..: ")));
        }
        catch(NumErrException nee) {
            impMsgCnpjErr();
            comp = corrCnpjComp(comp);
        }
        return comp;
    }

    public Solucao corrCnpjSol(Solucao sol) {

        try {
            sol.getFabricante().setCnpj(Integer.parseInt(l.entDados("Novo CNPJ..: ")));
        }
        catch(NumErrException nee) {
            impMsgCnpjErr();
            sol = corrCnpjSol(sol);
        }
        return sol;
    }

    public Topico corrCnpjTop(Topico top) {

        try {
            top.getFabricante().setCnpj(Integer.parseInt(l.entDados("Novo CNPJ..: ")));
        }
        catch(NumErrException nee) {
            impMsgCnpjErr();
            top = corrCnpjTop(top);
        }
        return top;
    }
}
