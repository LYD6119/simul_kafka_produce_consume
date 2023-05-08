现在在47.113.195.206的9092端口有一个“kafka” 在监听信息，请自己实现producer对象和consumer对象与这个“Kafka”建立链接实现一次消息的生产和消费。

生产者对象需要实现如下内容：
producer接口，包括produce和connect方法，
Produce(string, Message) //生产信息
Connect(string, string) //建立连接

producer类，含有属性如下：
Ip string
Port string
Rq  Request

Request类中写消息内容，含有属性如下：
Topic string //将向kafka的homework1 topic 发送消息。
Ms Message

消费者对象需要实现如下内容：
Consumer接口，包括consume和connect方法，
Consume(string, Message)
Connect(string, string)

Consumer类，含有属性如下：
Ip string
Port string
Resp  Response

Response类中写消息内容，含有属性如下：
Id string
Name string
Topic string //将从kafka的homework1 topic 消费消息。
		Ms Message

Message中的内容：
Name string //姓名
Id string   //学号
Ip string   // 你本地电脑的ip，建议不要在异地提交，这个ip和学号是唯一对应的关系
Status string // 初始为空
content string // 下面问题的答案，不用长篇大论，三个英文字母就能搞定(TCP)
uuid string // 初始为空

要实现的功能：
完成connect与“kafka”建立连接，之后实现produce过程向kafka生产消息，在原版kafka的实现中，生产消费是将producer和consumer对象进行序列化传输的，所以在“Kafka”中，请同样模拟这一过程，将生产者和消费者进行序列化，序列化方式为最简单的转为二进制。
