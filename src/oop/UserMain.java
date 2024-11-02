public class User {

    String userName; // Attribut som tillhör klassen
    String password;
    String typeOfUser;

    public User(String userName, String password) // Konstruktor
    {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName()
    {
        return userName;
    }
    public String getPassword()
    {
        return password;
    }
    public String changeUserName(String newUserName) // In-parameter - Tas emot från en annan klass
    {
        if(newUserName.length() < 4)
        {
            return this.userName;
        }
        else
        {
            return this.userName = newUserName;
        }
    }
    public String changePassword(String newPassword)
    {
        if(newPassword.length()>= 7 && newPassword.length()<=20) //
        {
            System.out.println("The new password is " );
            this.password = newPassword;
        }
        else
        {
            System.out.println("The password won't work ");
        }
        return password;
    }



}
