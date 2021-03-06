package sample.bizfuse.web;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * This is a helper Java class that provides an alternative to creating a
 * web.xml. This will be invoked only when the application is deployed to a
 * servlet container like Tomcat, Jboss etc.
 */
public class ApplicationWebXml extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		return application.sources(BizfuseWebApplication.class);
	}
}
