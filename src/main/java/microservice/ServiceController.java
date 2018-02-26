package microservice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ServiceController {
	
	@SuppressWarnings("serial")
	ArrayList<String> supplier = new ArrayList<String>(){{
		   add("39999");
		   add("15040");
		   add("89500");
		   }};

	@SuppressWarnings("serial")
	ArrayList<String> article_nr = new ArrayList<String>(){{
		   add("501236001001");
		   add("589654002001");
		   add("7895001001");
		   add("501236001001");
		   add("909094002001");
		   add("3334001001");
		   add("45326001001");
		   add("58002001");
		   add("9087001001");
		   add("212446001001");
		   add("556674002001");
		   add("1231001001");
		   }};		   

		@SuppressWarnings("serial")
		ArrayList<String> store_nr = new ArrayList<String>(){{
			   add("1 - Metro Store 10");
			   add("2 - Metro Store 11");
			   add("3 - Metro Store 12");
			   add("4 - Metro Store 13");
			   add("5 - Metro Store 14");
			   add("6 - Metro Store 15");
			   add("7 - Metro Store 16");
			   add("8 - Metro Store 17");
			   add("9 - Metro Store 18");
			   add("10 - Metro Store 19");
			   add("11 - Metro Store 20");
			   add("12 - Metro Store 21");
			   }};	
			   

	@RequestMapping(value = "/Supplier", method = RequestMethod.GET)
	public ResponseEntity<Object> dragos(){
		return new ResponseEntity<Object>(supplier, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/Article/{id}", method = RequestMethod.GET)
	public Object dragos2(@PathVariable long id){
		//return new ResponseEntity<Object>(article_nr., HttpStatus.OK);
		return article_nr.get((int) id);
	}
	
	@RequestMapping(value = "/storeId", method = RequestMethod.POST)
		public Object storeID(@Validated @RequestBody String id){
			//return new ResponseEntity<Object>(article_nr., HttpStatus.OK);
			return new ResponseEntity<Object>("The requested StoreID is :  " + store_nr.toString(), HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/allStores", method = RequestMethod.GET)
	public ResponseEntity<String> dragos4(){
		return new ResponseEntity<String>("Im the fourth running microservice!", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/articleID",method = RequestMethod.POST)	
	public Object dragostest(@Validated @RequestBody long id){
		//return new ResponseEntity<Object>(article_nr., HttpStatus.OK);
		return article_nr.get((int) id);
	
}}
