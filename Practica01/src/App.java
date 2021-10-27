import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner datos = new Scanner(System.in);
        
        System.out.println("\tBienvenido\n");
        System.out.println("Comenzaremos con el registro\n");
        Usuario datosusuario = new Usuario();

        System.out.println("Ingrese su apellido paterno: ");
        datosusuario.setPaterno(datos.nextLine());
        
        System.out.println("Ingrese su apellido materno: ");
        datosusuario.setMaterno(datos.nextLine());
        
        System.out.println("Ingrese sus nombres: ");
        datosusuario.setNombres(datos.nextLine());

        System.out.println("Ingrese el tipo de documento:");
        datosusuario.setTipod(datos.nextLine());
        
        System.out.println("Ingrese el número de documento: ");
        datosusuario.setDocumento(datos.nextLine());

        System.out.println("\n\t Registro de tarjeta\n");
        Tarjeta datotarjeta = new Tarjeta();

        System.out.println("Ingrrese el número de tarjeta(4 digitos):");
        datotarjeta.setNumero(datos.nextInt());
        
        System.out.println("Ingrese el saldo a depositar: ");
        datotarjeta.setSaldo(datos.nextFloat());
        
        datotarjeta.setPrecio(20);

        datos.close();
        
        System.out.println("\n\t REGISTRO COMPLETO");
        System.out.println("\nNombre: "+datosusuario.getPaterno() +" " +datosusuario.getMaterno()+", " +datosusuario.getNombres());
        System.out.println("Tipo de documento: "+datosusuario.getTipod());
        System.out.println("Número de documento: "+datosusuario.getDocumento());
        System.out.println("El número de la tarjeta es: "+datotarjeta.getNumero());
        System.out.println("El saldo depositado es de "+datotarjeta.getSaldo()+" soles");
        System.out.println("El precio de la tarjeta es de "+datotarjeta.getPrecio()+" soles");
    }
}
