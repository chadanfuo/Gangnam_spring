package sample3;
//3.0�� �ִ¼ҽ�
public class HelloApp2 {
	public static void main(String[] args) {
		MessageBean bean=new MessageBeanKr();
		bean.sayHello("Spring");
	}
	
}

interface MessageBean{
	public void sayHello(String name);
}
class MessageBeanEn implements MessageBean{
	public void sayHello(String name){
		System.out.println("Hello, " +name+"!");
	}
}
class MessageBeanKr implements MessageBean{
	public void sayHello(String name){
		System.out.println("�ȳ��ϼ���, "+name+"��.");
	}
}