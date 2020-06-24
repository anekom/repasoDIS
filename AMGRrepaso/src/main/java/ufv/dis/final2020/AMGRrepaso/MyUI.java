package ufv.dis.final2020.AMGRrepaso;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
    	Inventario inventario = new Inventario();
    	
        final VerticalLayout layout = new VerticalLayout();
        
        final TextField name = new TextField();
        name.setCaption("Type your name product here:");
        
        final TextField cathegory = new TextField();
        cathegory.setCaption("Type the product cathegory here:");
        
        final TextField price = new TextField();
        price.setCaption("Type price here:");
        
        final TextField ean = new TextField();
        ean.setCaption("Type the ean13 product here:");

        Button button = new Button("generate product");
        button.addClickListener(e -> {
            
        	Producto p = new Producto(name.getValue(), cathegory.getValue(), Integer.parseInt(price.getValue()), ean.getValue());
        	
        	inventario.addProducto(p);
        	
        	GeneradorEAN13.generarEAN(p);
        	
        });
        
        layout.addComponents(name, cathegory, price, ean, button);
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
