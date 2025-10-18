package ex_20_OOPs_Encapsulation;

public class Lab152_Encap {
    public static void main(String[] args) {
        Login Login = new Login("Sachin", "Login@123");
        System.out.println(Login.password);
    }
}
class Login{
    public String username;  // public class can be used by everyone
    public String password;

    public Login(String username, String password){
        this.username = username;
        this.password = password;
}
class Login1{
    public String getUsername() { // format Get
        return username;
    }

    public void setUsername(String username) { // format Set
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
        private String password; // right click > Generate > Getter (Accessors) and Setter (Mutators)

        Login1 (String username, String password){
            this.username = username;
            this.password = password;
        }
} /*     Controlled Access
public method everyone can use
     private method usage only within the class
             protected within the package*/
}
