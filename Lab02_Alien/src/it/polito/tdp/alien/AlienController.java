package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	private AlienDictionary alienDictionary = new AlienDictionary();
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	txtResult.clear();
		String riga = txtWord.getText().toLowerCase();

		// Controllo sull'input
		if (riga == null || riga.length() == 0) {
			txtResult.setText("Inserire una o due parole.");
			return;
		}
    	
		StringTokenizer st = new StringTokenizer(riga, " ");
		if (!st.hasMoreElements()) {
			txtResult.setText("Inserire una o due parole.");
			return;
		}

		// Estraggo la prima parola
		String alienWord = st.nextToken();
		if(st.hasMoreTokens()) {
			String translation=st.nextToken();
			if (!alienWord.matches("[a-zA-Z]*")) {
				txtResult.setText("Inserire solo caratteri alfabetici.");
				return;
			}
			alienDictionary.addWord(alienWord, translation);
			
			txtResult.appendText("La parola "+alienWord+" con relativa traduzione "+translation+ " è stata inserita correttamente");
			
		} else {

			// Controllo che non ci siano caratteri non ammessi
			if (!alienWord.matches("[a-zA-Z]*")) {
				txtResult.setText("Inserire solo caratteri alfabetici.");
				return;
			}

			String translation = alienDictionary.translateWord(alienWord);

			if (translation != null) {
				txtResult.setText(translation);
			} else {
				txtResult.setText("La parola cercata non esiste nel dizionario.");
			}
}
		
		
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	txtWord.clear();
    	txtResult.clear();
    }
    
}
