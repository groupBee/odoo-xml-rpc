package groupbee;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import static java.util.Collections.emptyList;

public class Main {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        final String url = "http://211.188.51.238:8069",
                db = "groupbee",
                username = "jeenukchung@groupbee.co.kr",
                password = "p@ssw0rd";


        final XmlRpcClient client = new XmlRpcClient();

        final XmlRpcClientConfigImpl common_config = new XmlRpcClientConfigImpl();
        common_config.setServerURL(new URL(String.format("%s/xmlrpc/2/common", url)));
        System.out.println(client.execute(common_config, "version", emptyList()));
        final XmlRpcClientConfigImpl start_config = new XmlRpcClientConfigImpl();
        start_config.setServerURL(new URL(url+"/start"));



    }
}