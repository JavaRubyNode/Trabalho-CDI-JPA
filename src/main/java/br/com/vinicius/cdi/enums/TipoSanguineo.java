package br.com.vinicius.cdi.enums;

public enum TipoSanguineo {

	O_positivo("O+"),
    O_negativo("O-"),
    A_negativo("A-"),
    A_positivo("A+"),
    AB_negativo("AB-"),
    AB_positivo("AB+");



    private String sangue;

    private TipoSanguineo(String tipoSanguineo){
        this.sangue = tipoSanguineo;
    }

    public String getSangue() {
        return sangue;
    }
	
}
