import javax.ws.rs.Consumes
import javax.ws.rs.Path
import javax.ws.rs.Produces

import grails.converters.JSON

@Path('/test')
class TestResource {

//    @GET 
//    @Produces(['application/json', 'text/x-json'])
//    JSON getTestJson() { 
//        new Person(name:'martin') as JSON
//    }
    
//    @POST
    @Produces(['application/xml', 'application/json'])
    Object getTestXml() { 
        new Person(name:'martin')
    }
    
//    @GET @Produces('*/*')
//    JSON getTestDefault() { 
//        getTestJson()
//    }
      
}