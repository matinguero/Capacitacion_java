package controllers;
import models.Musicas;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.ForwardEvent;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Textbox;

public class MusicInsertController extends GenericForwardComposer<Component>  {
	
	@Wire
	private Textbox nombreBox,duracionBox,artistaBox;
	
	
	 public void doAfterCompose(Component comp) throws Exception {
	        super.doAfterCompose(comp);
	        init(); // Call init method after composing to initialize data and UI
	    }
	    @Init
	    public void init() {
	       
	    }
	
	
	public void onClick$btnInsert (ForwardEvent event){
		 Time duracion = parseTime(duracionBox);
		Musicas.InsertarCancion(nombreBox,duracion );
	}
	
	  private static Time parseTime(String timeStr) {
	        try {
	            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	            java.util.Date date = sdf.parse(timeStr);
	            return new Time(date.getTime());
	        } catch (ParseException e) {
	            System.out.println("Invalid time format. Please enter time in HH:mm:ss format.");
	            return null;
	        }
	    }
	
}
