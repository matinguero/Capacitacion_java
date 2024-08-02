package controllers;




import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.ForwardEvent;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Label;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Listitem;

import models.Conexion;
import models.Musicas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControllerMusica extends GenericForwardComposer<Component> {
	
    @Wire
    private Listbox musicListbox;
    @Wire
    private Label idLabel, nombreLabel, duracionLabel, fechaLabel, artistaLabel, filenameLabel;

    @Wire
    private Textbox searchTextbox;

    private ArrayList<Musicas> musicList= new ArrayList<>();
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        init(); // Call init method after composing to initialize data and UI
    }
    @Init
    public void init() {
       
    }
    
    
    public void onClick$searchButton(ForwardEvent event) {
    	
    	
    	
    	BuscaryCargar();
    
    	
       
    }
    
    public void BuscaryCargar() {
    	
    	  String searchTerm = searchTextbox.getValue();
        musicList.clear();
        musicListbox.getItems().clear();
        try (Connection conn = Conexion.getConnection()) {
            String query = "{CALL spBuscarMusica(?)}";
            try (CallableStatement stmt = conn.prepareCall(query)) {
                stmt.setString(1, "%" + searchTerm + "%");
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Musicas musica = new Musicas(
                            rs.getInt("id"),
                            rs.getString("Nombre"),
                            rs.getString("Duracion"),
                            rs.getString("Fecha_publicacion"),
                            rs.getString("Artista")
                    );
                    musicList.add(musica);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        updateListbox();
        
    }
    
    
    
    private void updateListbox() {
        for (Musicas itemNuevo : musicList) {
            Listitem item = new Listitem();
            item.setParent(musicListbox);
            item.setValue(itemNuevo);

            Listcell cell = new Listcell();
            cell.setParent(item);
            cell.setLabel(String.valueOf(itemNuevo.getId()));

            cell = new Listcell();
            cell.setParent(item);
            cell.setLabel(itemNuevo.getNombre());

            cell = new Listcell();
            cell.setParent(item);
            cell.setLabel(itemNuevo.getDuracion());

            cell = new Listcell();
            cell.setParent(item);
            cell.setLabel(itemNuevo.getFecha());

            cell = new Listcell();
            cell.setParent(item);
            cell.setLabel(itemNuevo.getArtista());

            
        }
    }
    
    

    
    // Getters and setters (if needed)
}