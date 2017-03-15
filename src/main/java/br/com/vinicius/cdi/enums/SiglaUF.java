package br.com.vinicius.cdi.enums;

public enum SiglaUF {
	
	Acre("AC"),	 
	Alagoas("AL"),	 
	Amapá("AP"),	 
	Amazonas("AM"),	 
	Bahia("BA"),	 
	Ceará("CE"),	 
	DistritoFederal("DF"),
	EspíritoSanto("ES"),	 
	Goiás("GO"),	 
	Maranhão("MA"),
	MatoGrosso	("MT"),	 
	MatoGrossodoSul	("MS"),	 
	MinasGerais	("MG"),
	Pará("PA"),	 
	Paraíba("PB"),	 
	Paraná("PR"),	 
	Pernambuco("PE"),	 
	Piauí("PI"),	 
	RiodeJaneiro("RJ"),	 
	RioGrandedoNorte("RN"),	 
	RioGrandedoSul("RS"), 
	Rondônia("RO"),	 
	Roraima("RR"),	 
	SantaCatarina("SC"),
	SãoPaulo("SP"),	 
	Sergipe	("SE"),	 
	Tocantins("TO");
	
	private String uf;

	public String getUf() {return uf;}

	private SiglaUF(String uf) {this.uf = uf;}
	
	

}
