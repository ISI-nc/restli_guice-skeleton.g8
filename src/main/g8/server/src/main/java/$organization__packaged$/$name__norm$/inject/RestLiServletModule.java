package $organization$.$name;format="norm"$.inject;



import com.google.inject.servlet.ServletModule;
import com.linkedin.restli.server.guice.GuiceRestliServlet;

/**
 * copié à partir du squelette de projet  rest.liGuice-skeleton.g8
 * Definit le servlet guice sur l'URL /*
 * @author bjamet
 *
 */
public class RestLiServletModule extends ServletModule {
	@Override
	protected void configureServlets() {
		serve("/*").with(GuiceRestliServlet.class);
		
	}
}