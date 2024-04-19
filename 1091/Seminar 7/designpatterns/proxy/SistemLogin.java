public class SistemLogin implements AbstractLogin{
    String username;
    String parola;

    public SistemLogin(String username, String parola) {
        this.username = username;
        this.parola = parola;
    }

    @Override
    public boolean login(String username, String parola) {
        if(this.username.equals(username) && this.parola.equals(parola))
            return true;
        else
            return false;
    }
}
