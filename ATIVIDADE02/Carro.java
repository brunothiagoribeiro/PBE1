package novoProjeto;

public class Carro {
//atributos 
String marca;
String modelo;
int velocidade;
//construtores
public Carro(){
	
}
public Carro(String marca, String modelo, int velocidade) {
this.marca = marca;	
this.modelo = modelo;
this.velocidade = velocidade;
}

//getters e setters

public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public int getVelocidade() {
	
	return velocidade;
}
public void setVelocidade(int velocidade) {
	if (velocidade < 0) {
		System.out.println("Velocidade não pode ser negativa");
		this.velocidade = 0;
	}
	else {
	this.velocidade = velocidade;
	}
}


//metodos
void acelerar(int acelerar) {
	velocidade += acelerar;
}
void frear(int frear) {
	velocidade -= frear;
	}
void buzinar() {
	System.out.println("bibi fonfon");
}


}
