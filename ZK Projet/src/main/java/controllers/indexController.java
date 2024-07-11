package controllers;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Label;

public class indexController extends baseController{
	
	
	private Label lblSaludo;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		
		
		super.doAfterCompose(comp);
		lblSaludo.setValue("Hola mundo desde controller index");
	}
	
	 
	public void onClick$btnSaludo(Event evt) {
		lblSaludo.setValue("Hiciste click en el boton");
		lblSaludo.setStyle("Color:blue");
	}
	
}
