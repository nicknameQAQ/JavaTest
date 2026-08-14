package hue.edu.jk2.wxj.StringBuilder;

public class Total {
    /*
    ==================== StringBuilder 构造方法 ====================

    1. StringBuilder()                  创建一个空的StringBuilder对象，初始容量为16
    2. StringBuilder(String str)        创建一个StringBuilder对象，并初始化为指定字符串的内容
    3. StringBuilder(int capacity)      创建一个空的StringBuilder对象，并指定初始容量大小
    4. StringBuilder(CharSequence seq)  创建一个StringBuilder对象，并初始化为指定CharSequence的内容

    ==================== 常见成员方法 ====================

    【增】
    - StringBuilder append(各种类型)    将参数追加到末尾，可追加字符串、数字、布尔值、字符等
    - StringBuilder insert(int, 各种类型) 在指定位置插入内容

    【删】
    - StringBuilder delete(int start, int end)       删除指定范围内的字符（含start，不含end）
    - StringBuilder deleteCharAt(int index)          删除指定位置的字符

    【改】
    - StringBuilder replace(int start, int end, String str)  将指定范围内的字符替换为给定字符串
    - void setCharAt(int index, char ch)                     将指定位置的字符替换为给定字符

    【查】
    - int length()                  返回字符序列的长度
    - int capacity()                返回当前容量
    - char charAt(int index)        返回指定位置的字符
    - int indexOf(String str)       返回指定子串第一次出现的索引，未找到返回-1
    - String substring(int start)             截取从start到末尾的子串
    - String substring(int start, int end)    截取从start到end的子串（含start，不含end）

    【反转】
    - StringBuilder reverse()         将字符序列反转

    【转换】
    - String toString()               将StringBuilder转换为String对象
    */

    public static void main(String[] args) {
        // ==================== 构造方法演示 ====================

        // 1. 无参构造：初始容量16
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1初始容量: " + sb1.capacity()); // 16

        // 2. 传入String构造
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2: " + sb2);

        // 3. 指定容量构造
        StringBuilder sb3 = new StringBuilder(50);
        System.out.println("sb3容量: " + sb3.capacity()); // 50

        // 4. 传入CharSequence构造
        StringBuilder sb4 = new StringBuilder(new StringBuffer("world"));
        System.out.println("sb4: " + sb4);

        System.out.println("====================");

        // ==================== append 追加 ====================
        StringBuilder sb = new StringBuilder();
        sb.append("hello");       // 追加字符串
        sb.append(' ');           // 追加字符
        sb.append(123);           // 追加int
        sb.append(3.14);          // 追加double
        sb.append(true);          // 追加boolean
        System.out.println("append结果: " + sb); // hello 1233.14true

        // ==================== insert 插入 ====================
        sb.insert(5, "!!!");     // 在索引5处插入
        System.out.println("insert结果: " + sb); // hello!!! 1233.14true

        // ==================== delete 删除 ====================
        sb.delete(5, 8);         // 删除索引5~7的字符
        System.out.println("delete结果: " + sb); // hello 1233.14true
        sb.deleteCharAt(5);      // 删除索引5处的字符
        System.out.println("deleteCharAt结果: " + sb); // hello1233.14true

        // ==================== replace 替换 ====================
        sb.replace(0, 5, "HELLO"); // 将索引0~4替换为HELLO
        System.out.println("replace结果: " + sb); // HELLO1233.14true

        // ==================== setCharAt 修改单个字符 ====================
        sb.setCharAt(0, 'h');     // 将索引0处改为小写h
        System.out.println("setCharAt结果: " + sb); // hELLO1233.14true

        // ==================== 查询相关 ====================
        System.out.println("length: " + sb.length());           // 字符长度
        System.out.println("capacity: " + sb.capacity());       // 当前容量
        System.out.println("charAt(0): " + sb.charAt(0));       // 索引0的字符
        System.out.println("indexOf(\"123\"): " + sb.indexOf("123")); // "123"首次出现位置
        System.out.println("substring(5): " + sb.substring(5));           // 从索引5截取到末尾
        System.out.println("substring(5,8): " + sb.substring(5, 8));     // 截取索引5~7

        // ==================== reverse 反转 ====================
        StringBuilder sbRev = new StringBuilder("abcdef");
        sbRev.reverse();
        System.out.println("reverse结果: " + sbRev); // fedcba

        // ==================== toString 转换 ====================
        String str = sbRev.toString();
        System.out.println("toString结果: " + str); // fedcba
    }
}
