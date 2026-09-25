package model;

public class Carro{
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private String placa;

    private float gasolina;
    private float capacidadeTanque;

	private boolean ligado =  false;

	public Carro(String marca, String modelo, int ano, String cor, String placa, float gasolina, float capacidadeTanque ){
		this.marca = marca;
		this.modelo= modelo;
		this.ano = ano;
        this.cor = cor;
        this.placa = placa;

        if (capacidadeTanque < 0)
            capacidadeTanque = 0;

        if (gasolina < 0 )
            gasolina = 0;

        if (gasolina > capacidadeTanque)
            gasolina = capacidadeTanque;

        this.gasolina = gasolina;
        this.capacidadeTanque = capacidadeTanque;
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
    
    public void quantidadeRestante() {
        System.out.println("Faltam " + (capacidadeTanque - gasolina) + "L de gasolina!");
    }
    
    public void valorRestante(float preco) {
        if (preco <= 0) {
            System.out.println("Insira um preço válido!");
            return;
        }

        float total = (capacidadeTanque - gasolina) * preco;

        System.out.println("Custará $" + total + " para encher o tanque!");
    }

    public void encher(float valor) {
        if (valor <= 0) {
            System.out.println("Insira uma quantidae válida para encher!");
            return;
        }
        if (valor > capacidadeTanque || valor > (capacidadeTanque - gasolina)) {
            System.out.println("Não é possível encher mais que a capacidade! " + (capacidadeTanque - gasolina) + " Restantes." );
            return;
        }

        gasolina+= valor;

    }

    //Setters

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //Getters

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }
    public String getPlaca() {
        return placa;
    }
    public boolean getLigado() {
        return ligado;
    }
    public float getGasolina() {
        return gasolina;
    }
    public float getCapacidadeTanque() {
        return capacidadeTanque;
    }
}
