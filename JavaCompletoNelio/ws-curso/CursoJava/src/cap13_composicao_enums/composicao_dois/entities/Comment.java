package cap13_composicao_enums.composicao_dois.entities;

public class Comment {
	
	private String text;
	
	public Comment() {
		
	}

	public Comment(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
