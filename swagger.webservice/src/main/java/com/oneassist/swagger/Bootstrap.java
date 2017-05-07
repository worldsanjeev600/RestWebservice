package com.oneassist.swagger;

import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.Info;
import io.swagger.models.License;
import io.swagger.models.Swagger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * 
 * @author Sanjeev Gupta
 *
 */
public class Bootstrap extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		Info info = new Info()
				.title("Swagger APIs Server")
				.description(
						"This is Swagger Tool for APIs here you can test the all APIs with proper requests and responses")
				.license(
						new License().name("OneAssist").url(
								"http://www.oneassist.in"));

		Swagger swagger = new Swagger().info(info);
		new SwaggerContextService().withServletConfig(config).updateSwagger(
				swagger);
	}
}