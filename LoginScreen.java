/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuySmart;

import java.util.Scanner;

/**
 *
 * @author Austin
 */
public class LoginScreen {
    
public static String user;
public static String pass;

public LoginScreen()
{
    
}

public LoginScreen (String user, String pass)
{
    this.user=user;
    this.pass=pass;
}

public void setuser (String newuser)
{
    this.user = newuser;
    
}

public void setpass (String newpass)
{
    this.pass = newpass;
    
}

public String getpass()
{
    return this.pass;
}
public String getuser()
{
    return this.user;
}
}
