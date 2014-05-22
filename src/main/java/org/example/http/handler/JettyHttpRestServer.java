package org.example.http.handler;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

public class JettyHttpRestServer {

    //==================================================================================================================
    // Constants
    //==================================================================================================================
    private final static String RESOURCES_PACKAGE = "org.example.http.resources";


    //==================================================================================================================
    // Attributes
    //==================================================================================================================
    private final Server server;

    //==================================================================================================================
    // Constructors
    //==================================================================================================================
    public JettyHttpRestServer(final int httpPort) {
        this.server = new Server(httpPort);
        final ServletContextHandler handler = new ServletContextHandler();
        handler.setContextPath("");
        handler.addServlet(new ServletHolder(new ServletContainer(this.createResourceConfig())), "/*");
        this.server.setHandler(handler);

    }

    //==================================================================================================================
    // Public
    //==================================================================================================================

    public void start() throws Exception {
        this.server.start();
    }

    public void stop() throws Exception {
        this.server.stop();
    }

    //==================================================================================================================
    // Private
    //==================================================================================================================
    private ResourceConfig createResourceConfig() {
        final ResourceConfig resourceConfig = new ResourceConfig();
        resourceConfig.register(new MyBinder());
        resourceConfig.register(JacksonFeature.class);
        return resourceConfig.packages(RESOURCES_PACKAGE);
    }

    //==================================================================================================================
    // MAIN
    //==================================================================================================================
    public static void main(String[] args) throws Exception {
        final JettyHttpRestServer jettyHttpRestServer = new JettyHttpRestServer(8090);
        jettyHttpRestServer.start();
    }
}
