import java.util.ResourceBundle;

public class j183 {

    public static void main(String[] args) {
        ResourceBundle dbPro = ResourceBundle.getBundle("db");
        String dricerclass = dbPro.getString("dricerclass");
        String url = dbPro.getString("url");
        String username = dbPro.getString("username");
        String password = dbPro.getString("password");
        System.out.println(dricerclass);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);
    }
}
