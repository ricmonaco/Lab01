package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;
    
    @FXML
    private TextArea txtTempo;

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	
    	long start, end;
    	start = System.nanoTime();
    	this.elenco.addParola(this.txtParola.getText());
    	this.txtResult.setText(elenco.getElenco().toString());
    	end = System.nanoTime();
    	
    	String s = ""+ (end - start) + " ns";
    	
    	this.txtTempo.setText(s);
    }

    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	long start, end;
    	start = System.nanoTime();
    	this.elenco.reset();
    	this.txtResult.setText("");
    	this.txtParola.setText("");
    	end = System.nanoTime();
    	
    	String s = ""+ (end - start) + " ns";
    	
    	this.txtTempo.setText(s);
    	
    }
    
    @FXML
    void doDelete(ActionEvent event) {
    	long start, end;
    	start = System.nanoTime();
    	this.elenco.cancella(this.txtParola.getText());
    	this.txtResult.setText(elenco.getElenco().toString());
    	end = System.nanoTime();
    	
    	String s = ""+ (end - start) + " ns";
    	
    	this.txtTempo.setText(s);	
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
