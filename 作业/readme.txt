以命令行参数的形式指定所要统计的文件的行数。
class是已经编译好的，可以直接使用命令java CalculateLine CalculateLine.java    //统计CalculateLine.java的代码行数和空白行数
如果上述class文件不能直接运行，有可能是jdk版本的问题，我的版本是jdk 13，版本不对的话只能重新编译，命令如下：
javac -encoding utf-8 CalculateLine.java