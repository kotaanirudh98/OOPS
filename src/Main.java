import User.User;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User s = new User("abhi",  "4807913088s");

//        User s = new User();
//        s.setUsername("abhi");
//
//        System.out.println(s.getUsername());
//        System.out.println(s.getUserId());


        User s2 = new User(s);

        System.out.println("s " + s.getUsername());
        System.out.println("s2" + s2.getUsername());

        s2.setContactInfo("12345");
        System.out.println("s2r" + s2.getContactInfo());
        System.out.println("s1r" + s.getContactInfo());

        
        // Upadting the file..




    }
}