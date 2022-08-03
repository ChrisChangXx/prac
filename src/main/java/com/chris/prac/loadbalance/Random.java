package com.chris.prac.loadbalance;

public class Random {

    public static String getServer() {
        java.util.Random random = new java.util.Random();
        int pos = random.nextInt(ServerIps.LIST.size());
        return ServerIps.LIST.get(pos);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getServer());
        }
    }
}
