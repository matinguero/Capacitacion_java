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

public class controladormusicaalternativoNOUSE extends GenericForwardComposer<Component> {

    @Wire
    private Listbox musicListbox;

    @Wire
    private Textbox searchTextbox;

    private ListModelList<Musicas> musicList;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        init(); // Call init method after composing to initialize data and UI
    }

    @Init
    public void init() {
        // Initialize data (simulated for demonstration)
        List<Musicas> initialMusicList = new ArrayList<>();
     //   initialMusicList.add(new Musicas(1, "Song A", "4:30", "2024-07-12", "Artist A", "songA.mp3"));
      //  initialMusicList.add(new Musicas(2, "Song B", "3:45", "2024-07-11", "Artist B", "songB.mp3"));

        // Set model for listbox
        musicList = new ListModelList<>(initialMusicList);
    }

    public ListModelList<Musicas> getMusicList() {
        return musicList;
    }

    @Command
    public void search() {
        String searchTerm = searchTextbox.getValue();
        List<Musicas> filteredList = new ArrayList<>();
        for (Musicas musica : musicList) {
            if (musica.getNombre().contains(searchTerm) || musica.getArtista().contains(searchTerm)) {
                filteredList.add(musica);
            }
        }
        musicList.clear();
        musicList.addAll(filteredList);
    }

    // Getters and setters (if needed)
}
