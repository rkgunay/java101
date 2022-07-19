import java.util.Scanner;
public class LoginSystemProgram {

    public static void login(){
        Scanner inputUsername = new Scanner(System.in);
        Scanner inputPassword = new Scanner(System.in);
        System.out.println("Kullanıcı adını giriniz: ");
        String userName = inputUsername.nextLine();
        System.out.println("Şifre giriniz: ");
        String password = inputPassword.nextLine();
        validate(userName, password);
    };
    public static void validate(String userName, String password){

        if(userName.equals("patika")&&password.equals("patika123")){
            System.out.println("Sisteme Giriş Başarılı");
        }
        resetPassword(userName, password);
    };
    public static void resetPassword(String userName, String password){
        System.out.println("Şifrenizi Unuttuysanız Yenilemek İçin 1'e Basın. Giriş Ekranına Gelmek İçin Başka Tuşa Basın.");
        Scanner inputSelection = new Scanner(System.in);
        String selection = inputSelection.nextLine();
        if(selection.equals("1")){
            System.out.println("Yeni şifrenizi giriniz: ");
            Scanner inputNewPassword = new Scanner(System.in);
            String newPassword = inputNewPassword.nextLine();
            if(newPassword.equals("patika123")){
                System.out.println("Yeni şifreniz eskisi ile aynı olamaz.");
                resetPassword(userName, password);
            }
            login();
        }else{
            login();
        }

    };
    public static void main(String[] args) {
        login();

    }

}
