package $organization$.$name;format="norm"$.inject;


import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
/**
 * copié à partir du squelette de projet  rest.liGuice-skeleton.g8
 * Permet de definir le lien entre J2EE et Guice et Rest.li
 * @author bjamet
 *
 */
public class $name;format="Camel"$GuiceServletConfig extends GuiceServletContextListener {
	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new RestLiModule(),
				new RestLiServletModule());
	}

}

