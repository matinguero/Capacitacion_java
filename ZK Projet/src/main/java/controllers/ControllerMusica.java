package controllers;




import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.ForwardEvent;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Listitem;

import models.Musicas;

import java.util.ArrayList;
import java.util.List;

public class ControllerMusica extends GenericForwardComposer<Component> {
int cont;
	int flag=0;
    @Wire
    private Listbox musicListbox;

    @Wire
    private Textbox searchTextbox;

    private ArrayList<Musicas> musicList;
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        init(); // Call init method after composing to initialize data and UI
    }
    @Init
    public void init() {
       
    }
    public void onClick$searchButton(ForwardEvent event) {
    	
    	if (flag==0) {
    		cont=1;
    	}else {
    		
    		musicList.clear();
    	}
    	
    	 // Initialize data (simulated for demonstration)
        musicList = new ArrayList<>();
        musicList.add(new Musicas(1, "Song A", "4:30", "2024-07-12", "Artist A", "songA.mp3"));
        musicList.add(new Musicas(2, "Song B", "3:45", "2024-07-11", "Artist B", "songB.mp3"));

        // Set model for listbox
        
        Listitem item;
        Listcell cell;
        
        for(Musicas itemNuevo : musicList) {
        	
        	    item = new Listitem();
        	    item.setParent(musicListbox);
        	    item.setValue(itemNuevo);
        	    
        	    cell = new Listcell();
        	    cell.setParent(item);
        	    cell.setLabel(String.valueOf(itemNuevo.getId()));
        	    
        	    cell = new Listcell();
        	    cell.setParent(item);
        	    cell.setLabel(itemNuevo.getNombre());
        	    
        	    cell = new Listcell();
        	    cell.setParent(item);
        	    cell.setLabel(itemNuevo.getDuracion().toString());
        	    
        	    cell = new Listcell();
        	    cell.setParent(item);
        	    cell.setLabel(itemNuevo.getFecha());
        	    
        	    cell = new Listcell();
        	    cell.setParent(item);
        	    cell.setLabel(itemNuevo.getArtista());
        	    
        	  
        	  
        	    cell = new Listcell();
        	    cell.setParent(item);
        	    cell.setLabel(itemNuevo.getFilename());
        	

        	
        }
        
    }

    
    // Getters and setters (if needed)
}