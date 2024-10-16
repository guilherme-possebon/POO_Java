
/**
 *
 * @author art
 */
public class Carro {

    private String marca;
    private String cor;
    private String modelo;
    private int quantidadePortas;
    private double potencia;
    private double velocidade;
    private double velocidadeMaxima;
    private boolean ligado;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void buzinar() {
        System.out.println("BIBI");
    }

    public String getMarcha() {
        if (this.velocidade == 0) {
            return "Ponto morto";
        } else if (this.velocidade > 0 && this.velocidade <= 20) {
            return "1°";
        } else if (this.velocidade > 20 && this.velocidade <= 40) {
            return "2°";
        } else if (this.velocidade > 40 && this.velocidade <= 75) {
            return "3°";
        } else if (this.velocidade > 75 && this.velocidade <= 100) {
            return "4°";
        } else if (this.velocidade > 100 && this.velocidade <= this.velocidadeMaxima) {
            return "5°";
        }

        return "Ré";
    }

    public void ligar() {
        if (ligado) {
            System.out.println("Carro já está ligado!");
        } else {
            ligado = true;
            System.out.println("Vrruuummm, Carro ligado!");
        }
    }

    public void desligar() {
        if (ligado) {
            if (this.velocidade == 0) {
                ligado = false;
                System.out.println("Carro desligado!");
            } else {
                System.out.println("Pare o carro para desligar!");
            }
        } else {
            System.out.println("Carro já está desligado!");
        }
    }

    public void acelerar() {
        this.acelerar(10);
    }

    //sobre carga de método
    public void acelerar(double value) {
        if (this.ligado) {
            if (this.velocidade < this.velocidadeMaxima) {
                if (value > 0) {
                    if (this.velocidade + value > this.velocidadeMaxima) {
                        this.velocidade = this.velocidadeMaxima;

                        System.out.println("Velocidade máxima atingida!");
                        System.out.println("Velocidade alterada para: " + this.velocidade + "!");
                        System.out.println("marcha atual: " + this.getMarcha() + "!");
                    } else {
                        this.velocidade += value;

                        System.out.println("Velocidade alterada para: " + this.velocidade + "!");
                        System.out.println("marcha atual: " + this.getMarcha() + "!");
                    }
                } else {
                    System.out.println("Velocidade não pode ser negativa!");
                }
            } else {
                System.out.println("Carro  já está na velocidade máxima!");
            }
        } else {
            System.out.println("Carro desligado, não é possível acelerar!");
        }
    }

    public void frear() {
        this.frear(10);
    }

    public void frear(double value) {
        if (this.ligado) {
            if (this.velocidade > 0) {
                if (value > 0) {
                    if (this.velocidade - value < 0) {
                        this.velocidade = 0;

                        System.out.println("Carro parado!");
                        System.out.println("Velocidade alterada para: " + this.velocidade + "!");
                        System.out.println("marcha atual: " + this.getMarcha() + "!");
                    } else {
                        this.velocidade -= value;

                        System.out.println("Velocidade alterada para: " + this.velocidade + "!");
                        System.out.println("marcha atual: " + this.getMarcha() + "!");
                    }
                } else {
                    System.out.println("Velocidade não pode ser negativa!");
                }
            } else {
                System.out.println("Carro já está parado!");
            }
        } else {
            System.out.println("Carro desligado, não é possível frear!");
        }
    }
}
