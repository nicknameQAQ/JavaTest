package com.xinjia.test;

public class HelloWorld {
    public static void main(String[] args) {
        //输出Hello World
        /*
        细节1.
            修改注释颜色 color scheme \ language defaults \ comments
        细节2.
            快捷键注释
            单行注释快捷键 ctrl + /
            多行注释快捷键 ctrl + shift + /
        细节3.
            注释的运行规则
            注释不会影响程序的运行结果,仅仅是对代码的解释说明
        细节4.
            注释的嵌套
            不要嵌套
         */
        System.out.println("Hello World");





        /*数据类型小结
        double 取值范围 0.0 ~ 1.7 * 10^308
        float 取值范围 0.0 ~ 3.4 * 10^38
        long 取值范围 -9.2 * 10^18 ~ 9.2 * 10^18
        int 取值范围 -2^31 ~ 2^31 - 1
        short 取值范围 -2^15 ~ 2^15 - 1
        byte 取值范围 -2^7 ~ 2^7 - 1
        char 取值范围 0 ~ 65535
        boolean 取值范围 true false
        默认数据类型 int
        默认数据类型的取值范围 -2^31 ~ 2^31 - 1
        定义long 数据类型 需要在数字后面加上L
        定义float 数据类型 需要在数字后面加上F

        */


        /*
        1. 【强制】代码中的命名均不能以下划线或美元符号开始，也不能以下划线或美元符号结束。
        反例：_name / __name / $Object / name_ / name$ / Object$
        2. 【强制】代码中的命名严禁使用拼音与英文混合的方式，更不允许直接使用中文的方式。
        说明：正确的英文拼写和语法可以让阅读者易于理解，避免歧义。注意，即使纯拼音命名方式也要避免采用。
        正例：alibaba / taobao / youku / hangzhou 等国际通用的名称，可视同英文。反例：DaZhePromotion [打折] / getPingfenByName() [评分] / int 某变量 = 3
        3. 【强制】类名使用 UpperCamelCase 风格，必须遵从驼峰形式，但以下情形例外：DO / BO /
        DTO / VO / AO
        正例：MarcoPolo / UserDO / XmlService / TcpUdpDeal / TaPromotion反例：macroPolo / UserDo / XMLService / TCPUDPDeal / TAPromotion
        4. 【强制】方法名、参数名、成员变量、局部变量都统一使用 lowerCamelCase 风格，必须遵从驼峰形式。
        正例： localValue / getHttpMessage() / inputUserId
        5. 【强制】常量命名全部大写，单词间用下划线隔开，力求语义表达完整清楚，不要嫌名字长。
        正例：MAX_STOCK_COUNT
        反例：MAX_COUNT




        驼峰命名:
        方法,变量
        一个单词 全部小写
        多个单词 首字母大写 其他小写
        类,接口,枚举,注解
        一个单词 全部大写
        多个单词 首字母大写 其他小写
        */




        /*
        键盘录入
        Scanner类
        import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        接收整数:
        int a = sc.nextInt();
        接收小数:
        double b = sc.nextDouble();
        接收字符串(文本):
        String c = sc.next();







        */






    }
}
