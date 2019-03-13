package it.polito.tdp.alien;

public class Word {
	private String alienWord;
	private String translation;
	public Word(String alienWord) {
		super();
		this.alienWord = alienWord;
	}
	public Word(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
	}
	public String getAlienWord() {
		return alienWord;
	}
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	public boolean compare(String alien) {
		if (alien.equals(alienWord))
			return true;
		return false;
}
	public boolean equals (Object obj) {
	if(this==obj) {
		return true;
	}
	if(obj==null) {
		return false;
	}
	if (getClass() != obj.getClass())
		return false;
	Word second=(Word) obj;
	if (alienWord == null) {
		if (second.alienWord != null)
			return false;
	} else if (!alienWord.equals(second.alienWord))
	return false;
	
	
	return true;
		
		
	}

	
}
