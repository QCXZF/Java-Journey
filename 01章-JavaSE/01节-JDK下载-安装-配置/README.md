## 下载 **JDK**

- JDK(J2SE Development Kit), 也叫java开发包,运行Java必备环境
  - 下载地址:java.sun.com(官网地址,根据实际需求下载相应版本,学习建议下载1.8版本,太新的相对不稳定)

---

## 安装 **JDK**

- 1.双击下载下来的exe(建议安装在 C:\Program Files (x86)\Java\jdk1.8.0_91 下面)
- 2.JDK安装完成后,在自定义安装中建议安装 JRE(J2SE Runtime Environment) java运行时环境 (java程序运行所需要的环境)
- 3.路径一般为: C:\Program Files (x86)\Java\jre1.8.0_91
  - ☆ 注: JDK 本身带了个 JRE,提供给开发者测试用.单独安装个 JRE 可以给客户用

---

☆☆☆☆☆ 
## 配置 **环境变量** (在系统变量做修改,所有用户都能用)

- 1.Path 最后面加上 ;C:\Program Files (x86)\Java\jdk1.8.0_91\bin (;与前面的路径相隔)
- 2.也可新建变量 JAVA_HOME, 变量值 C:\Program Files (x86)\Java\jdk1.8.0_91
- 3.在 Path 的值最后加上 ;%JAVA_HOME%\bin  (可在命令行里输入 echo %JAVA_HOME% 查看配置的环境变量)
- 4.CLASSPATH .;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar
- 5.或者 .;C:\Program Files (x86)\Java\jdk1.8.0_91\lib\dt.jar;C:\Program Files (x86)\Java\jdk1.8.0_91\lib\tools.jar
  - ☆ 注:一定要加 . → 可找到当前路径下的class

---

## 检验配置是否正确

- 1.win+R 输入 cmd, 将路径定位到当前路径下
- 2.执行 javac HelloWorld.java (javac 编译命令)
- 3.当前路径下再输入 dir 会发现当前路径下多了个 HelloWorld.class 文件 (编译生成的文件)
- 4.再执行 java HelloWorld 执行该编译文件 (java 执行命令)
- 5.看是否打印出 HelloWorld (打印出来即配置完成)
