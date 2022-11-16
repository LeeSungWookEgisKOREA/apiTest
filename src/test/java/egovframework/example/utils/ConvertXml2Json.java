package egovframework.example.utils;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class ConvertXml2Json {
	
	 public static void main(String[] args) throws JSONException {
		 
        String xmlStr =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<note>\n" +
                    "<to>Tove</to>\n" +
                    "<from>Jani</from>\n" +
                    "<heading>Reminder</heading>\n" +
                    "<body>Don't forget me this weekend!</body>\n" +
                "</note>";

        JSONObject json = XML.toJSONObject(xmlStr);
        String jsonStr = json.toString(4);
        System.out.println(jsonStr);
	    }
	 
}
