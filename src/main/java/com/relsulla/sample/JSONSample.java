package com.relsulla.sample;


import org.json.JSONObject;

/**
 * Created by Bob on 11/7/2015.
 */
public class JSONSample {
    public static void main(String[] args) {

        System.out.println("########################################################");
        System.out.println("##                                                    ##");
        System.out.println("## Hello World                                        ##");
        System.out.println("##                                                    ##");
        System.out.println("########################################################");

        JSONSample instance = new JSONSample();

        instance.run();

        System.out.println("########################################################");
        System.out.println("##                                                    ##");
        System.out.println("## END                                                ##");
        System.out.println("##                                                    ##");
        System.out.println("########################################################");

        System.out.println("Jenkins Test");
        System.out.println("This one");
    }

    private void run() {

        JSONObject obj = new JSONObject();

        obj.put("name", "foo");
        obj.put("num", new Integer(100));
        obj.put("balance", new Double(1000.21));
        obj.put("is_vip", new Boolean(true));

        System.out.print(obj);
        System.out.println("\nDONE");
    }
}
