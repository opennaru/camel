package camel.samples;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.CamelContext;


public class FileCopierWithCamel {
	
		   public  static  void Main (String args []) throws Exception {
		    CamelContext context = new DefaultCamelContext();
		      context.addRoutes (new RouteBuilder () {
		         public  void configure () {
		          from ( "file:data/inbox?noop=rue" )  
		              .to ( "file:data/outbox" );       
		        }
		      });
		      context.start ();
		      Thread.sleep ( 10000 );
		      context.stop ();
		  }

}
