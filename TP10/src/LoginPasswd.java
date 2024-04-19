public class LoginPasswd {
    
    private String login;
    private String password;
    
    public LoginPasswd(String login, String password) throws TailleTropImportanteException{
        if(password.length() >= 10){
            throw new TailleTropImportanteException();
        }
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "login : "+this.getLogin()+", password : "+this.getPassword();
    }

    @Override
    public boolean equals(Object o){
        if(o == null){return false;}
        if(o ==this){return true;}
        if(!(o instanceof LoginPasswd)) {
            return false;
        }
        LoginPasswd lp = (LoginPasswd) o;
        return this.getLogin().equals(lp.getLogin());
    }
    
}
