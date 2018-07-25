package thrift;

import org.apache.thrift.TException;

public class HelloServiceImpl implements Hello.Iface{

	public String helloString(String para) throws TException {
		// TODO Auto-generated method stub
		        return "服务端回话:你的"+para+"信息已经被我查收";	   
	}
	

}
