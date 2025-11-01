package ex_25_ENUM;

public class Lab181_Part_2 {
    public static void main(String[] args) {
        System.out.println(Env.Dev.getBaseUrl());
        System.out.println(Env.Staging.getBaseUrl());
        System.out.println(Env.Production.getBaseUrl());
    }
}
