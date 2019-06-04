package niuke.javawalktree;

import java.io.IOException;
import java.nio.file.*;

public class WalkTree {
    //递归遍历一个目录，筛选出需要查找的文件类型
    public static void main(String[] args) throws IOException {
        Path start = FileSystems.getDefault().getPath("C:\\Users\\asus\\Desktop");
        Files.walk(start)

                //Lambda表达式 ： 函数的参数 -> 函数体
                //Lambda表达式无需显示指定返回值类型，JVM会自动判断
                .filter(path -> path.toFile().isFile())
                .filter(path -> path.toString().endsWith(".pptx"))
                .forEach(System.out::println);
                //双冒号运算就是Java中的[方法引用]，格式：  类名::方法名
    }
}
