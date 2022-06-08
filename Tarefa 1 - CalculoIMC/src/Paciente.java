public class Paciente {

    double peso;
    double altura;

    Paciente (double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        double valor = peso / (altura * altura);
        return valor;
    }
    public void diagnostico() {
        double result = calcularIMC();
        if(result < 16.00) {
            System.out.println("Baixo peso muito grave = IMC abaixo de 16 kg/m²");
        } else if (result >= 16.00 && result <= 16.99) {
            System.out.println("Baixo peso grave = IMC entre 16 e 16,99 kg/m²");
        } else if (result >= 17.00 && result <= 18.49) {
            System.out.println("Baixo peso = IMC entre 17 e 18,49 kg/m²");
        } else if (result >= 18.50 && result <= 24.99) {
            System.out.println("Peso normal = IMC entre 18,50 e 24,99 kg/m²");
        } else if (result >= 25.00 && result <= 29.99) {
            System.out.println("Sobrepeso = IMC entre 25 e 29,99 kg/m²");
        } else if (result >= 30.00 && result <= 34.99) {
            System.out.println("Obesidade grau I = IMC entre 30 e 34,99 kg/m²");
        } else if (result >= 35.00 && result <= 39.99) {
            System.out.println("Obesidade grau II = IMC entre 35 e 39,99 kg/m²");
        } else if (result >= 40.00) {
            System.out.println("Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²");
        }
    }

}
