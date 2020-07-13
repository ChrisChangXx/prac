#使用方法

##1.将hsdis-amd64.dll文件放入jdk安装位置
`C:\Program Files\Java\jdk1.8.0_221\jre\bin\server目录下`
##2.VM options参数为
`-server -XX:+UnlockDiagnosticVMOptions -XX:+TraceClassLoading  -XX:+PrintAssembly -XX:+LogCompilation -XX:LogFile=live.log`

_来源：https://www.jianshu.com/p/78f71c033fae_