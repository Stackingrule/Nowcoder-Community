package com.nowcoder.community;

import java.io.IOException;

public class Wktests {

    public static void main(String[] args) {

        String cmd = "c:/Program Files/wkhtmltopdf/bin/wkhtmltoimage --quality 75 https://www.nowcoder.com d:/work/data/wk-images/03.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("OK!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
