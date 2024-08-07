package controllers;



import models.Musicas;
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
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ControllerMusica extends GenericForwardComposer<Component> {
	@Wire
	private Textbox nombreBox,duracionBox,artistaBox;
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
    	canciones();
    }
    
    
    public void onClick$searchButton(ForwardEvent event) {
    	
    	
    	
    	BuscaryCargar();
    
    	
       
    }
    
    
    
    public void onClick$btnInsertE (ForwardEvent event){
		Update();
		
		
	}
   
    

	public void onClick$btnInsert (ForwardEvent event){
		Insertar();
		
		
	}
	
	public void onClick$btneliminar (ForwardEvent event){
		
		Eliminar();
	}
	
	
	
	
	public void Update() {
		Musicas musicas = parseListitemToMusicas(musicListbox.getSelectedIndex());
		if (musicas != null) {
			Musicas.ActualizarCancion(musicas.getId(), musicas.getNombre(), parseTime(musicas.getDuracion()), musicas.getArtista());
		}
	}
	
	public void Eliminar() {
		Musicas musicas = parseListitemToMusicas(musicListbox.getSelectedIndex());

		if (musicas != null) {
			Musicas.BorrarCancion(musicas.getId());
		}
	}
	
	
	
	
	
	
	public void Insertar() {
		
Time duracion = parseTime(duracionBox.getText());
		
		Musicas.InsertarCancion(nombreBox.getText(),duracion,artistaBox.getText() );
		 
	}
	  private static Time parseTime(String duracionBox2) {
	        try {
	            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	            java.util.Date date = sdf.parse(duracionBox2);
	            return new Time(date.getTime());
	        } catch (ParseException e) {
	            System.out.println("Invalid tilme format. Please enter time in HH:mm:ss format.");
	            return null;
	        } 
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
	  
	  public void canciones() {
    	  try (Connection conn = Conexion.getConnection()) {
	            String query = "select * from Musica";
	            try (CallableStatement stmt = conn.prepareCall(query)) {
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
	  public Musicas parseListitemToMusicas(int index) {
		    Listitem selectedItem = musicListbox.getItemAtIndex(index);

		    if (selectedItem != null) {
		        Listcell idCell = (Listcell) selectedItem.getChildren().get(0);
		        Listcell nombreCell = (Listcell) selectedItem.getChildren().get(1);
		        Listcell duracionCell = (Listcell) selectedItem.getChildren().get(2);
		        Listcell fechaCell = (Listcell) selectedItem.getChildren().get(3);
		        Listcell artistaCell = (Listcell) selectedItem.getChildren().get(4);

		        int id = Integer.parseInt(idCell.getLabel());
		        String nombre = nombreCell.getLabel();
		        String duracion = duracionCell.getLabel();
		        String fecha = fechaCell.getLabel();
		        String artista = artistaCell.getLabel();

		        return new Musicas(id, nombre, duracion, fecha, artista);
		    }

		    return null;
		}
    
    // Getters and setters (if needed)
}