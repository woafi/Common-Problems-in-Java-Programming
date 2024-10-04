
class Account {
    private String password;
    protected String email;
    public String name;

    // getters & setters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class accesModifier {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setPassword("abc");
        System.out.println(account1.getPassword());
    }

}
