package $organization$.$name;format="norm"$.inject;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.linkedin.restli.server.RestLiConfig;

import $organization$.$name;format="norm"$.itf.ExampleItf;
import $organization$.$name;format="norm"$.impl.ExampleImpl;

/**
 * copié à partir du squelette de projet  rest.liGuice-skeleton.g8
 * a utiliser pour inscrire les services au sein de l'aplication
 *  
 * @author bjamet
 *
 */
public class RestLiModule extends AbstractModule {
	@Override
	protected void configure() {
		// TODO ecrire les binding ici
		//binder().bind(Itf.class).to(ItfImpl.class);
		binder().bind(ExampleItf.class).to(ExampleImpl.class);
		
	}
	@Provides
	RestLiConfig provideRestLiConfig() {
		RestLiConfig restLiConfig = new RestLiConfig();
		restLiConfig.setResourcePackageNames("$organization$.$name;format="norm"$");
		
		return restLiConfig;
	}

}