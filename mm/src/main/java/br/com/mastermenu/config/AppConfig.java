package br.com.mastermenu.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.com.mastermenu.service.ItemService;

@ApplicationPath("/rest")
public class AppConfig extends Application {
	/*@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> recursos = new HashSet<Class<?>>();
		recursos.add(br.com.mastermenu.service.ItemService.class);
		return super.getClasses();
	}*/
	
	private Set<Object> singletons = new HashSet<Object>();
	 
    public AppConfig() {
    	singletons.add(new ItemService());
    }
 
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
