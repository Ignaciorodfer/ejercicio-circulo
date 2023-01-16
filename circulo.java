public class circulo {
    private double radio;


    
    public circulo(double radio) {
        if (radio < 0) {
            this.radio = 0;
        } else {
            this.radio = radio;
        }
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return radio * radio * Math.PI;
    }
    public static void main(String[] args) {
        circulo c = new circulo(3);
        System.out.println("Radio del círculo: " + c.getRadio());
        System.out.println("Área del círculo: " + c.getArea());
    
        cilindro cl = new cilindro(5, 7);
        System.out.println("Radio del cilindro: " + cl.getRadio());
        System.out.println("Altura del cilindro: " + cl.getAltura());
        System.out.println("Volumen del cilindro: " + cl.getVolume());
    }
    
}

