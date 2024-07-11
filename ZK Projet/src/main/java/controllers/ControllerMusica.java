package controllers;




import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Textbox;

import models.Musicas;

import java.util.ArrayList;
import java.util.List;

public class ControllerMusica extends GenericForwardComposer<Component> {


    @Wire
    private Listbox musicListbox;

    @Wire
    private Textbox searchTextbox;

    private List<Musicas> musicList;
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        init(); // Call init method after composing to initialize data and UI
    }
    @Init
    public void init() {
        // Initialize data (simulated for demonstration)
        musicList = new ArrayList<>();
        musicList.add(new Musicas(1, "Song A", "4:30", "2024-07-12", "Artist A", "songA.mp3"));
        musicList.add(new Musicas(2, "Song B", "3:45", "2024-07-11", "Artist B", "songB.mp3"));

        // Set model for listbox
        musicListbox.setModel(new ListModelList<>(musicList));
        
        
    }

    
    // Getters and setters (if needed)
}