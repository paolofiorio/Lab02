package it.polito.tdp.alien;

import java.util.ArrayList;
import java.util.List;

public class AlienDictionary {
	
	private List<Word> dictionary;

	public AlienDictionary() {
		dictionary= new ArrayList<Word>();
	}
	public void addWord(String alienWord, String translation) {
	
		//cerco nella lista se la parola è già presente
		for(Word w:dictionary) {
			if(w.compare(alienWord)) {
				//aggiorno la traduzione
				w.setTranslation(translation);
				return;
			}
			
		}
		Word w= new Word(alienWord,translation);
		dictionary.add(w);
		
	}
	public String translateWord(String alienWord) {
	
	//se ho la parola nel dizionario ritorno la traduzione altrimenti null
		for(Word w:dictionary) {
			if(w.compare(alienWord)) {
				return w.getTranslation();
			}}
		return null;
	
	}
	}

