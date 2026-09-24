package model;

public class Carro{
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private String placa;
	private boolean ligado =  false;

	public Carro(String marca, String modelo, int ano){
		this.marca = marca;
		this.modelo= modelo;
		this.ano = ano;
	}
	public void Ligar(){
		if(ligado){
			System.out.println(this.modelo + " já está ligado");
		}else{
			System.out.println(this.modelo + " está ligando");
			ligado= true;
		}
	}
	public void Desligar(){
		if(!ligado){
			System.out.println(this.modelo + " já está desligado");
		}else{
			System.out.println(this.modelo + " está desligando");
			ligado = false;
		}
	}

	public void Buzinar(){
		System.out.println(this.modelo + " está buzinando");
	}
}
