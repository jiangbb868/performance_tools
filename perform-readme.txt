# 测试文件写入效率(毫秒)，写1000个文件，每个文件200字节
java -jar performance.jar diskw 200 1000

# 测试计算效率(毫秒), 计算1000000次浮点运算
java -jar performance.jar math 1000000

# 测试数据库写入效率(毫秒)，写入1000用户后删除
java -jar performance.jar database 127.0.0.1 5432 1000