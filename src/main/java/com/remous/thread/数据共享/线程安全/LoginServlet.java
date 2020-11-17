package com.remous.thread.数据共享.线程安全;

/**
 * @Author: Remous
 * @Date: 2020/10/23 21:55
 * @working hard
 */
public class LoginServlet {
    private static String usernameRef;

    private static String passwordRef;

    public static void doPost(String userName,String password){
        try {
            usernameRef=userName;
            if(userName.equals("a")){
                Thread.sleep(5000);
            }

            passwordRef=password;
            System.out.println("username= "+userName+" password="+password);

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
