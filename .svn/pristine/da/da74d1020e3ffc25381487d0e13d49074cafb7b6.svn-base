package com.meizu.scorpio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 * Created by 张宏南 on 2016-11-22.
 * Project GSLBHttpCode
 * Package jetty
 */

public class Sample {

    public static void main(String[] args) {
        String num,Result;
        int other=2;
        int otherWeight=50*other;
        int ONE_HUNDRED=100;
        float flowValue;
        for (;;){
            num="0";
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入开始计算：");
            num=scanner.nextLine();
            flowValue=Float.parseFloat(num);
            float weight = (float) ((otherWeight * flowValue) / (ONE_HUNDRED -flowValue));
            //int weight = (int)((otherWeight * flowValue) / (ONE_HUNDRED - flowValue));
            Result=sendGet("http://dev.api.kiev.meizu.com/apps/scorpio-kiev/providers",null);
            System.out.println("接口查询"+Result);
            Time();
            System.out.println("受压测的机器weight为："+weight);
            System.out.println("反验流量百分比："+weight/(weight+50*other)*100);
        }
    }
    public static String Time(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));
        return df.format(new Date());
    }




    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
             //   System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

}
