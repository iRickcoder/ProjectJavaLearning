package learnjavadoc;
/**
 * Javadoc learning code
 * Javadoc学习范例
 *
 * You can learn most Javadoc usages from this example code. A good Java project should have a nice Javadoc.
 * 从此范例中可以学习到绝大部分Javadoc的用法。作为Java程序员，Javadoc的学习是必要的。
 *
 * <p>Just use 'javac' compile this class {@code javac JavaDocExample.java} and run it with 'java'
 * {@code java JavaDocExample}. Run this program will generate a standard java doc in this dir.
 * If you can not compile this code. You can use {@code javadoc -encoding utf-8 JavaDocExample.java} in shell, it is same.
 * 本例程可以直接使用javac命令编译 {@code javac JavaDocExample.java}然后使用java命令运行
 * {@code java JavaDocExample}。运行此程序会在当前目录下生成一份标准的java doc。
 * 如果无法编译的话，在shell中使用{@code javadoc -encoding utf-8 JavaDocExample.java -d doc}也是一样的。</p>
 *
 * <p>Any problems happened to this code please see{@link #help()}
 * which can run with {@code java JavaDocExample -h}. It will print many problem you may meet.
 * 在运行编译程序的过程中，遇到任何问题可以参阅{@link #help()} ，
 * 这个注释包含一部分你可能会遇到的情况。这个注释在编译完成后可以使用{@code java JavaDocExample -h}打印到shell。</p>
 *
 * @author rick, rick_z@outlook.com
 * @version 0.1
 */
public class JavaDocExample extends JavaDocShellExe{

    public final static String className = "JavaDocExample";
    public static void main(String[] args) {

        if (args.length > 0){
            switch (args[0]){
                case "-h":
                case "help":
                case "-H":
                    help();
                    break;
                default:
                    break;
            }
        }
        System.out.println("hello java doc");
    }

    public static void help() {
        JavaDocExample instanceThis = new JavaDocExample();
        String []cmd = {"echo","this is help info!"};
        instanceThis.exec(cmd);
    }
}