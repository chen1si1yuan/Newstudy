package demo;

import org.apache.thrift.TException;


/**
 * 实现thrift声明的服务
 * @author csy
 *
 */
public class HelloServerImpl implements HelloServer.Iface{

	/**
	 * 实现returnone接口服务
	 */
	public int returnone(String param) throws TException {
		// TODO Auto-generated method stub
		return 1;
	}

}
