package demo;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;

import demo.HelloServer.Client;

/**
 * thrift RPC框架客户端
 * 
 * @author csy
 *
 */
public class HelloServerClient {

	/**
	 * 客户端远程连接服务端
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TSocket socket = null;
		try {
			// 设置端口信息
			socket = new TSocket("localhost", 6788);
			//设置传输协议
			TProtocol protocol = new TBinaryProtocol(socket);
			//使用thrift生成的中间代码创建生成客户端
			Client client = new HelloServer.Client(protocol);
			//打开端口连接
			socket.open();
			//进行通信
			int result = client.returnone("ss");
			System.out.println("客户端返回结果为：" + result);
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (socket != null)
				socket.close();
		}
	}

}
