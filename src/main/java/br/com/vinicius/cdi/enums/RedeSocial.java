package br.com.vinicius.cdi.enums;

public enum RedeSocial {
	
	FACEBOOK("face"),GOOGLE("google+"),INSTAGRAM("instagram"),TELEGRAN("telegram");
	
	private String redesocial;

	public String getRedesocial() {
		return redesocial;
	}

	private RedeSocial(String redesocial) {
		this.redesocial = redesocial;
	}

	
	

}
