import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    Vehiculo v1 = new Vehiculo("YYYHHH", 4.5, 1999);
    Vehiculo v2 = new Batmovil("GFHFGH", 8.0, 1998, 4);
    Vehiculo v3 = new Batmovil("234WDGG", 10.0, 2001, 6);
    Vehiculo v4 = new PatineteVolador("3FDSGF", 2.0, 2006, 25);
    Vehiculo v5 = new PatineteVolador("JJVBGM", 1.50, 2017, 30);

    Alquiler a1 = new Alquiler("Antonio Montero", "123456789X", 5, v1);
    Alquiler a2 = new Alquiler("Manuel Morales", "987654321A", 4, v2);
    Alquiler a3 = new Alquiler("Daniel Torrijas", "123474678C", 7, v3);
    Alquiler a4 = new Alquiler("Carlos Martínez", "1827631986B", 8, v4);
    Alquiler a5 = new Alquiler("Antonio García", "81273898D", 1, v5);

    Alquiler[] listado = new Alquiler[5];
    listado[0] =



    Integer opcion = 0;
    System.out.println("Hola usuario bienvenido");
    System.out.println("1. Mostrar todo lo recaudado");
    System.out.println("2. Mostrar todos los vehículos");
    System.out.println("3. Calcular el precio de un vehículo en especial");

    Scanner sc = new Scanner(System.in);

    if(opcion == 1){

    }else if(opcion == 2){

    }else{

    }





}
