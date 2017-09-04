package utils;
import java.util.Random;
import java.util.UUID;

/**
 * Copyright © 2017 重庆猪八戒网络有限公司. All rights reserved.
 * @Title: MyUtils.java
 * @Prject: thinkingInJave
 * @Package:
 * @Description: TODO
 * @author: liujiaze
 * @date: 2017年9月1日 下午2:14:06
 * @version: V1.0
 */

/**
 * @Description: TODO
 * @author: liujiaze
 * @date: 2017年9月1日 下午2:14:06
 */
public class MyUtils {
    public static String get36GUID() {
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-", "");
        Random random = new Random();
        int factor = random.nextInt(9999);
        uuid = uuid + String.format("%04d", new Object[] {Integer.valueOf(factor)});
        return uuid;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 457; i++) {
            System.out.println(get36GUID());
        }
    }

}
