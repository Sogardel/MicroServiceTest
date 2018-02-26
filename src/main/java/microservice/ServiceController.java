package microservice;


import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value = "/dragos3", method = RequestMethod.GET)
	public ResponseEntity<String> dragos3(){
		return new ResponseEntity<String>("Im the third microservice!", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/dragos4", method = RequestMethod.GET)
	public ResponseEntity<String> dragos4(){
		return new ResponseEntity<String>("Im the fourth running microservice!", HttpStatus.OK);
	}
	
}
