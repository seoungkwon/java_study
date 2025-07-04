package study.practice.practice57;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class practice57 {

	public static void main(String[] args) throws ParseException {
		
		String jsonText = "{\r\n"
				+ "\"id\": 1,\r\n"
				+ "\"name\": \"John Doe\",\r\n"
				+ "\"contacts\": [\r\n"
				+ "{\r\n"
				+ "\"type\": \"email\",\r\n"
				+ "\"value\": \"john.doe@example.com\"\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"type\": \"phone\",\r\n"
				+ "\"value\": \"01023456789\"\r\n"
				+ "}\r\n"
				+ "],\r\n"
				+ "\"address\": {\r\n"
				+ "\"street\": \"123 Main Street\",\r\n"
				+ "\"city\": \"Seoul\",\r\n"
				+ "\"zipcode\": \"12345\"\r\n"
				+ "},\r\n"
				+ "\"orders\": [\r\n"
				+ "{\r\n"
				+ "\"orderId\": \"ORD-001\",\r\n"
				+ "\"date\": \"2024-07-09\",\r\n"
				+ "\"items\": [\r\n"
				+ "{\r\n"
				+ "\"id\": 1,\r\n"
				+ "\"name\": \"Smartphone\",\r\n"
				+ "\"quantity\": 2\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": 2,\r\n"
				+ "\"name\": \"Laptop\",\r\n"
				+ "\"quantity\": 1\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"orderId\": \"ORD-002\",\r\n"
				+ "\"date\": \"2024-07-10\",\r\n"
				+ "\"items\": [\r\n"
				+ "{\r\n"
				+ "\"id\": 3,\r\n"
				+ "\"name\": \"Headphones\",\r\n"
				+ "\"quantity\": 1\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}";

		JSONParser jsonParser = new JSONParser();
		JSONObject obj = (JSONObject)jsonParser.parse(jsonText);
		
		UserDTO user = new UserDTO();
        user.setId(((Long) obj.get("id")).intValue());
        user.setName((String) obj.get("name"));
        
        JSONArray contacts = (JSONArray) obj.get("contacts");
        ArrayList<ContactDTO> contactList = new ArrayList<>();
        
        for(Object o : contacts) {
        	JSONObject contactObj = (JSONObject) o;
        	
        	ContactDTO contact = new ContactDTO();
        	contact.setType((String) contactObj.get("type"));
        	contact.setValue((String) contactObj.get("value"));
        	contactList.add(contact);
        }
        user.setContacts(contactList);
        
        JSONObject adr = (JSONObject) obj.get("address");
        AddressDTO address = new AddressDTO();
        address.setStreet((String) adr.get("street"));
        address.setCity((String) adr.get("city"));
        address.setZipcode((String) adr.get("zipcode"));
        user.setAddress(address);
        
        JSONArray ord = (JSONArray) obj.get("orders");
        ArrayList<OrderDTO> orderList = new ArrayList<>();
        
        for(Object o : ord) {
        	JSONObject orderObj = (JSONObject) o;
        	OrderDTO order = new OrderDTO();
        	order.setOrderId((String) orderObj.get("orderId"));
    		order.setDate((String) orderObj.get("date"));		
	    	JSONArray items = (JSONArray) orderObj.get("items");
	    	for(int j=0; j<items.size(); j++) {
	    		JSONObject item = (JSONObject)items.get(j);
	    		ItemDTO itemDTO = new ItemDTO();
	    		
	    		
	    	}
	    	List<ItemDTO> itemList = new ArrayList<>();
        }
        
		
		
	}

}
