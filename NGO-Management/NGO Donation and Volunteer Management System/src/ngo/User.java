package ngo;

public class User {
    protected int iuserId;
    protected String sname;
    protected String semail;
    protected String sphone;

    public User(int iuserId,String sname,String semail,String sphone){
        this.iuserId=iuserId;
        this.sname=sname;
        this.semail=semail;
        this.sphone=sphone;
    }

    public void login() {
        System.out.println(sname+" logged in");
    }

    public void logout(){
        System.out.println(sname +" logged out");
    }

    @Override
    public String toString() {
        return "ID: "+iuserId+",Name: "+sname+ ",Email: "+semail+ ",Phone: "+sphone;
    }

    public static void main(String[] args) {
        User user = new User(1, "Khaviya", "khaviya@gmail.com", "6380115521");
        user.login();
        user.logout();
        System.out.println(user);
    }
}
