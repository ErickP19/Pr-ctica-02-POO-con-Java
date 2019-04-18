/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vistas;

import ec.ups.edu.clases.EntrenadorPersonal;
import ec.ups.edu.clases.EntrenadorPsicologico;
import ec.ups.edu.controladores.ControladorEntrenadorPersonal;
import ec.ups.edu.controladores.ControladorEntrenadorPsicologico;
import ec.ups.edu.controladores.ControladorJugadorExtra;
import ec.ups.edu.controladores.ControladorJugadorProfesional;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author erics
 */
public class Inicio {
    
    public static void main(String[] args) {
        
    
    
      Scanner s = new Scanner(System.in);
        boolean salir = false;
        boolean salir1 = false;

        ControladorEntrenadorPersonal controladorEntrenador = new ControladorEntrenadorPersonal();
        ControladorEntrenadorPsicologico controladorEntrenador1 = new ControladorEntrenadorPsicologico();
        ControladorJugadorProfesional controladorJugador = new ControladorJugadorProfesional();
        ControladorJugadorExtra controladorJugador2 = new ControladorJugadorExtra();
        int op, opcion;
        System.out.println("Bienvenido al proyecto Restaurante");
        while (!salir1) {
            System.out.println("1. CRUD Entrenador Personal");
            System.out.println("1. CRUD Entrenador Psicologico");
            System.out.println("1. CRUD Jugador Profesional");
            System.out.println("1. CRUD Jugador Extra");
            System.out.println("3. Salir");

            System.out.println("Elija una opcion");
            op = s.nextInt();
            System.out.println("\n");
            Scanner dato = new Scanner(System.in);

            switch (op) {
                case 1:
                    System.out.println("A elegido la opcion Entrenador Personal \n");

                    while (!salir) {

                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Dalete");
                        System.out.println("5. Regresar");

                        System.out.println("Elija una opcion");
                        opcion = s.nextInt();
                        System.out.println("\n");
                        EntrenadorPersonal entre = new EntrenadorPersonal();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create' ");
                                System.out.println("\n");
                                
                                System.out.println("Ingrese el titulo que tiene el Entrenador Personal  ");
                                String nombre = dato.next();
                                entre.setNombre(nombre);
                                System.out.println("\n");

                                System.out.println("Ingrese el idioma del Entrenador ");
                                String nomC = dato.next();
                                entre.setTipoIdioma(nomC);
                                System.out.println("\n");

                                System.out.println("Ingrese rutina del entrenador ");
                                String ru = dato.next();
                                entre.setRutina(ru);
                                System.out.println("\n");

                                System.out.println("Ingrese la edad del Entrenador");
                                int ed = dato.nextInt();
                                entre.setEdad(ed);
                                System.out.println("\n");

                                System.out.println("ingrese las recomendaciones del entrenador ");
                                String re = dato.next();
                                entre.setRecomendaciones(re);
                                System.out.println("\n");

                                System.out.println("Ingrese codigo entrenador");
                                String co = dato.nextLine();
                                entre.setCodigo(ed);
                                System.out.println("\n");

                                System.out.println("Ingrese nombre del entrenador");
                                String no = dato.next();
                                entre.setNombre(no);
                                System.out.println("\n");

                                System.out.println("Ingrese cedula del entrenador");
                                String ce = dato.next();
                                entre.setCedula(ce);
                                System.out.println("\n");

                                System.out.println("Ingrese el telefono ");
                                int te = dato.nextInt();
                                entre.setTelefono(te);
                                System.out.println("\n");

                                System.out.println("Ingrese direccion ");
                                String di = dato.nextLine();
                                entre.setDireccion(di);
                                System.out.println("\n");

                                System.out.println("Ingresse correo electronico ");
                                String c = dato.next();
                                entre.setCorreo(co);
                                System.out.println("\n");
                                controladorEntrenador.create(entre);
                                
                                
                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");
                                System.out.println("Ingrese el usuario a leer");
                                int codigo = dato.nextInt();
                                System.out.println(controladorEntrenador.read(codigo));
                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");
                                  System.out.println("Ingrese el titulo que tiene el Entrenador Personal  ");
                                String nombre1 = dato.next();
                                entre.setNombre(nombre1);
                                System.out.println("\n");

                                System.out.println("Ingrese el idioma del Entrenador ");
                                String nomC1 = dato.next();
                                entre.setTipoIdioma(nomC1);
                                System.out.println("\n");

                                System.out.println("Ingrese rutina del entrenador ");
                                String ru1 = dato.next();
                                entre.setRutina(ru1);
                                System.out.println("\n");

                                System.out.println("Ingrese la edad del Entrenador");
                                int ed1 = dato.nextInt();
                                entre.setEdad(ed1);
                                System.out.println("\n");

                                System.out.println("ingrese las recomendaciones del entrenador ");
                                String re1 = dato.next();
                                entre.setRecomendaciones(re1);
                                System.out.println("\n");

                                System.out.println("Ingrese codigo entrenador");
                                String co1 = dato.nextLine();
                                entre.setCodigo(ed1);
                                System.out.println("\n");

                                System.out.println("Ingrese nombre del entrenador");
                                String no1 = dato.next();
                                entre.setNombre(no1);
                                System.out.println("\n");

                                System.out.println("Ingrese cedula del entrenador");
                                String ce1= dato.next();
                                entre.setCedula(ce1);
                                System.out.println("\n");

                                System.out.println("Ingrese el telefono ");
                                int te1 = dato.nextInt();
                                entre.setTelefono(te1);
                                System.out.println("\n");

                                System.out.println("Ingrese direccion ");
                                String di1 = dato.nextLine();
                                entre.setDireccion(di1);
                                System.out.println("\n");

                                System.out.println("Ingresse correo electronico ");
                                String c1 = dato.next();
                                entre.setCorreo(co1);
                                System.out.println("\n");

                                controladorEntrenador.update(entre);
                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Ingrese el codigo a eliminar");
                                codigo = dato.nextInt();
                                controladorEntrenador.delete(codigo);
                                break;
                            case 5:
                                System.out.println("Has seleccionado la opción Regresar");

                                salir1 = true;
                                break;
                            default:
                                System.out.println("Solo digite números entre 1 y 5");
                        }
                    }
                    break;

                case 2:
                    System.out.println("A elegido la opcion Entrenador Psicologico \n");

                    while (!salir) {

                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Dalete");
                        System.out.println("5. Regresar");

                        System.out.println("Elija una opcion");
                        opcion = s.nextInt();
                        System.out.println("\n");
                        //Scanner dato = new Scanner(System.in);
                        EntrenadorPsicologico entre1 = new EntrenadorPsicologico();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create'");

                                System.out.println("\n");

                                System.out.println("Ingrese el titulo que tiene el Entrenador Psicologico  ");
                                String ti = dato.next();
                                entre1.setNombre(ti);
                                System.out.println("\n");

                                System.out.println("Ingrese el titulo de las charlas que dara ");
                                String t = dato.next();
                                entre1.setTituloCharlas(t);
                                System.out.println("\n");

                                System.out.println("Ingrese la fecha de contratacion");
                                Date ru = dato.
                                entre1.setFechaContratacion(ru);
                                System.out.println("\n");

                                System.out.println("Ingrese sueldo del Entrenador psicologico");
                                double ed = dato.nextInt();
                                entre1.setSueldo(ed);
                                System.out.println("\n");

                                System.out.println("ingrese la edad del entrenador ");
                                int re = dato.nextInt();
                                entre1.setEdad(re);
                                System.out.println("\n");

                                System.out.println("Ingrese  las recomendaciones que tiene el entrenador");
                                String co = dato.next();
                                entre1.setRecomendaciones(co);
                                System.out.println("\n");

                                System.out.println("Ingrese codigo del entrenador");
                                int c = dato.nextInt();
                                entre1.setCodigo(c);
                                System.out.println("\n");

                                System.out.println("Ingrese nombre del entrenador");
                                String nom = dato.next();
                                entre1.setNombre(nom);
                                System.out.println("\n");

                                System.out.println("Ingrese cedula del entrenador");
                                String ce1= dato.next();
                                entre1.setCedula(ce1);
                                System.out.println("\n");

                                System.out.println("Ingrese el telefono ");
                                int te1 = dato.nextInt();
                                entre1.setTelefono(te1);
                                System.out.println("\n");

                                System.out.println("Ingrese direccion ");
                                String di1 = dato.nextLine();
                                entre1.setDireccion(di1);
                                System.out.println("\n");

                                System.out.println("Ingresse correo electronico ");
                                String c1 = dato.next();
                                entre1.setCorreo(c1);
                                System.out.println("\n");
                                controladorEntrenador1.create(entre1);
                                
                                
                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");
                                System.out.println("Ingrese el usuario a leer");
                                int codigo = dato.nextInt();
                                System.out.println(controladorEntrenador.read(codigo));
                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");
                                
                                System.out.println("Ingrese el titulo que tiene el Entrenador Personal  ");
                                String ti1 = dato.next();
                                entre1.setNombre(ti1);
                                System.out.println("\n");

                                System.out.println("Ingrese el titulo de las charlas que dara ");
                                String t1 = dato.next();
                                entre1.setTituloCharlas(t1);
                                System.out.println("\n");

                                System.out.println("Ingrese la fecha de contratacion");
                                Date ru1 = dato.
                                entre1.setFechaContratacion(ru1);
                                System.out.println("\n");

                                System.out.println("Ingrese sueldo del Entrenador psicologico");
                                double ed1= dato.nextInt();
                                entre1.setSueldo(ed1);
                                System.out.println("\n");

                                System.out.println("ingrese la edad del entrenador ");
                                int re1 = dato.nextInt();
                                entre1.setEdad(re1);
                                System.out.println("\n");

                                System.out.println("Ingrese  las recomendaciones que tiene el entrenador");
                                String co1 = dato.next();
                                entre1.setRecomendaciones(co1);
                                System.out.println("\n");

                                System.out.println("Ingrese codigo del entrenador");
                                int c2 = dato.nextInt();
                                entre1.setCodigo(c2);
                                System.out.println("\n");

                                System.out.println("Ingrese nombre del entrenador");
                                String nom1 = dato.next();
                                entre1.setNombre(nom1);
                                System.out.println("\n");

                                System.out.println("Ingrese cedula del entrenador");
                                String ce11= dato.next();
                                entre1.setCedula(ce11);
                                System.out.println("\n");

                                System.out.println("Ingrese el telefono ");
                                int te11 = dato.nextInt();
                                entre1.setTelefono(te11);
                                System.out.println("\n");

                                System.out.println("Ingrese direccion ");
                                String di11 = dato.nextLine();
                                entre1.setDireccion(di11);
                                System.out.println("\n");

                                System.out.println("Ingresse correo electronico ");
                                String c11 = dato.next();
                                entre1.setCorreo(c11);
                                System.out.println("\n");

                                controladorEntrenador1.create(entre1);

                                break;
                                
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");
                                System.out.println("Ingrese el usuario a leer");
                                int codigo = dato.nextInt();
                                System.out.println(controladorEntrenador1.read(codigo));
                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");
                                //Lagarto lagarto = new Lagarto();

                                System.out.println("\n");

                                System.out.println("Ingrese en nombre del lagarto");
                                String nombre1 = dato.next();
                                //System.out.println("nombre "+nombre);
                                lagarto.setNombre(nombre1);
                                System.out.println("\n");

                                System.out.println("Ingrese el tipo de sangre 'fria o caliente'");
                                String tipoS1 = dato.next();
                                lagarto.setSangre(tipoS1);
                                System.out.println("\n");

                                System.out.println("Ingrese los años de vida");
                                int aVida1 = dato.nextInt();
                                lagarto.setAñosVida(aVida1);
                                System.out.println("\n");

                                System.out.println("Ingrese el tipo de piel ");
                                String tiPiel1 = dato.next();
                                lagarto.setTipoPiel(tiPiel1);
                                System.out.println("\n");

                                System.out.println("ingrese el modo de defensa ");
                                String def1 = dato.next();
                                lagarto.setModoDefensa(def1);
                                System.out.println("\n");

                                System.out.println("¿Cambia de color? \n Ingrese valores de 'true' o 'false'");
                                boolean camColor1 = dato.nextBoolean();
                                lagarto.setCambiaColor(camColor1);
                                System.out.println("\n");

                                System.out.println("Tiene extremidades \n Ingrese valores de 'true' o 'false'");
                                boolean ext1 = dato.nextBoolean();
                                lagarto.setExtremidades(ext1);
                                System.out.println("\n");

                                System.out.println("¿Cuantos huevos tiene?");
                                int numHu1 = dato.nextInt();
                                lagarto.setNumHuevos(numHu1);
                                System.out.println("\n");

                                System.out.println("¿Como se desplaza");
                                String des1 = dato.nextLine();
                                lagarto.setDesplazamiento(des1);
                                System.out.println("\n");

                                System.out.println("Ingrese el sexo");
                                String sex1 = dato.nextLine();
                                lagarto.setSexo(sex1);
                                System.out.println("\n");

                                System.out.println("Ingresse el color del lagarto");
                                String colorL1 = dato.nextLine();
                                lagarto.setColor(colorL1);
                                System.out.println("\n");

                                controladorLagarto.update(lagarto);
                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Ingrese el codigo a eliminar");
                                codigo = dato.nextInt();
                                controladorLagarto.delete(codigo);
                                break;
                            case 5:
                                System.out.println("Has seleccionado la opción Regresar");
                                salir1 = true;
                                break;

                            default:
                                System.out.println("Solo digite números entre 1 y 5");
                        }
                    }

                    break;

                case 3:
                    System.out.println("A elegido la opcion Perro \n");

                    while (!salir) {

                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Dalete");
                        System.out.println("5. Regresar");

                        System.out.println("Elija una opcion");
                        opcion = sn.nextInt();
                        Perro perro = new Perro();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create'");
                                
                                //Scanner dato = new Scanner(System.in);
                                System.out.println("\n");

                                System.out.println("Ingrese en nombre del perro ");
                                String nombre = dato.next();
                                //System.out.println("nombre "+nombre);
                                perro.setNombre(nombre);
                                System.out.println("\n");

                                System.out.println("Ingrese la raza");
                                String razaP = dato.next();
                                perro.setRaza(razaP);
                                System.out.println("\n");

                                System.out.println("Ingrese la audicion");
                                double peso = dato.nextDouble();
                                perro.setAudicion(peso);
                                System.out.println("\n");

                                System.out.println("Ingrese la temperatura corporal");
                                String temp = dato.next();
                                perro.setTempCorporal(temp);
                                System.out.println("\n");

                                System.out.println("ingrese el sexo ");
                                String sex = dato.next();
                                perro.setSexo(sex);
                                System.out.println("\n");

                                System.out.println("Ingrese el color ");
                                String col = dato.nextLine();
                                perro.setColor(col);
                                System.out.println("\n");

                                System.out.println("Ingrese la edad del perro");
                                int edadP = dato.nextInt();
                                perro.setEdad(edadP);
                                System.out.println("\n");

                                System.out.println("Ingrese el numero de huesos ");
                                int numH = dato.nextInt();
                                perro.setNumHueso(numH);
                                System.out.println("\n");

                                System.out.println("Tiene pelo? \n Ingrese valores de 'true' o 'false' ");
                                boolean pel = dato.nextBoolean();
                                perro.setPelo(pel);
                                System.out.println("\n");

                                System.out.println("Ingrese que come el perro ");
                                String comida = dato.nextLine();
                                perro.setComida(comida);
                                System.out.println("\n");

                                System.out.println("Ingresse su habitat ");
                                String hab = dato.nextLine();
                                perro.setHabitat(hab);
                                System.out.println("\n");
                                controladorPerro.create(perro);

                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");
                                System.out.println("Ingrese el usuario a leer");
                                int codigo = dato.nextInt();
                                System.out.println(controladorPerro.read(codigo));
                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");
                                System.out.println("Ingrese en nombre del perro ");
                                String nombre1 = dato.next();
                                //System.out.println("nombre "+nombre);
                                perro.setNombre(nombre1);
                                System.out.println("\n");

                                System.out.println("Ingrese la raza");
                                String razaP1 = dato.next();
                                perro.setRaza(razaP1);
                                System.out.println("\n");

                                System.out.println("Ingrese la audicion");
                                double peso1 = dato.nextDouble();
                                perro.setAudicion(peso1);
                                System.out.println("\n");

                                System.out.println("Ingrese la temperatura corporal");
                                String temp1 = dato.next();
                                perro.setTempCorporal(temp1);
                                System.out.println("\n");

                                System.out.println("ingrese el sexo ");
                                String sex1 = dato.next();
                                perro.setSexo(sex1);
                                System.out.println("\n");

                                System.out.println("Ingrese el color ");
                                String col1 = dato.nextLine();
                                perro.setColor(col1);
                                System.out.println("\n");

                                System.out.println("Ingrese la edad del perro");
                                int edadP1 = dato.nextInt();
                                perro.setEdad(edadP1);
                                System.out.println("\n");

                                System.out.println("Ingrese el numero de huesos ");
                                int numH1 = dato.nextInt();
                                perro.setNumHueso(numH1);
                                System.out.println("\n");

                                System.out.println("Tiene pelo? \n Ingrese valores de 'true' o 'false' ");
                                boolean pel1 = dato.nextBoolean();
                                perro.setPelo(pel1);
                                System.out.println("\n");

                                System.out.println("Ingrese que come el perro ");
                                String comida1 = dato.nextLine();
                                perro.setComida(comida1);
                                System.out.println("\n");

                                System.out.println("Ingresse su habitat ");
                                String hab1 = dato.nextLine();
                                perro.setHabitat(hab1);
                                System.out.println("\n");

                                controladorPerro.update(perro);
                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Ingrese el codigo a eliminar");
                                codigo = dato.nextInt();
                                controladorPerro.delete(codigo);
                                break;
                            case 5:
                                System.out.println("Has seleccionado la opción Regresar");

                                salir1 = true;
                                break;
                            default:
                                System.out.println("Solo digite números entre 1 y 5");
                        }
                    }
                    break;
                case 4:
                    System.out.println("A elegido la opcion Serpiente \n");

                    while (!salir) {

                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Dalete");
                        System.out.println("5. Regresar");

                        System.out.println("Elija una opcion");
                        opcion = sn.nextInt();
                        Serpiente serpiente = new Serpiente();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create'");

                                //Scanner dato = new Scanner(System.in);
                                System.out.println("\n");

                                System.out.println("Ingrese en nombre de la serpiente");
                                String nombre = dato.next();
                                //System.out.println("nombre "+nombre);
                                serpiente.setNombre(nombre);
                                System.out.println("\n");

                                System.out.println("Ingrese el tipo de sangre 'fria o caliente'");
                                String tipoS = dato.next();
                                System.out.println("\n");

                                System.out.println("Ingrese la especie");
                                double aVida = dato.nextDouble();
                                System.out.println("\n");

                                System.out.println("Ingrese la descripcion");
                                String desc = dato.next();
                                System.out.println("\n");

                                System.out.println("ingrese la alimentacion");
                                String ali = dato.next();
                                System.out.println("\n");

                                System.out.println("¿Es venenosa? \n Ingrese valores de 'true' o 'false'");
                                boolean veneno = dato.nextBoolean();
                                System.out.println("\n");

                                System.out.println("Tiene extremidades \n Ingrese valores de 'true' o 'false'");
                                boolean ext = dato.nextBoolean();
                                System.out.println("\n");

                                System.out.println("¿Cuantos huevos tiene?");
                                int numHu = dato.nextInt();
                                System.out.println("\n");

                                System.out.println("¿Como se desplaza");
                                String des = dato.nextLine();
                                System.out.println("\n");

                                System.out.println("Ingrese el sexo");
                                String sex = dato.nextLine();
                                System.out.println("\n");

                                System.out.println("Ingresse el color de la serpiente");
                                String colorL = dato.nextLine();
                                System.out.println("\n");
                                controladorSerpiente.create(serpiente);

                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");
                                System.out.println("Ingrese el usuario a leer");
                                int codigo = dato.nextInt();
                                System.out.println(controladorSerpiente.read(codigo));
                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");
                                System.out.println("Ingrese en nombre de la serpiente");
                                String nombre1 = dato.next();
                                //System.out.println("nombre "+nombre);
                                serpiente.setNombre(nombre1);
                                System.out.println("\n");

                                System.out.println("Ingrese el tipo de sangre 'fria o caliente'");
                                String tipoS1 = dato.next();
                                serpiente.setSangre(tipoS1);
                                System.out.println("\n");
                                /*
                                 System.out.println("Ingrese la especie");
                                 double aVida1 = dato.nextDouble();
                                 serpiente.s
                                 System.out.println("\n");*/

                                System.out.println("Ingrese la descripcion");
                                String desc1 = dato.next();
                                serpiente.setDescripcion(desc1);
                                System.out.println("\n");

                                System.out.println("ingrese la alimentacion");
                                String ali1 = dato.next();
                                serpiente.setAlimentacion(ali1);
                                System.out.println("\n");

                                System.out.println("¿Es venenosa? \n Ingrese valores de 'true' o 'false'");
                                boolean veneno1 = dato.nextBoolean();
                                serpiente.setVenenosa(veneno1);
                                System.out.println("\n");

                                System.out.println("Tiene extremidades \n Ingrese valores de 'true' o 'false'");
                                boolean ext1 = dato.nextBoolean();
                                serpiente.setExtremidades(ext1);
                                System.out.println("\n");

                                System.out.println("¿Cuantos huevos tiene?");
                                int numHu1 = dato.nextInt();
                                serpiente.setNumHuevos(numHu1);
                                System.out.println("\n");

                                System.out.println("¿Como se desplaza");
                                String des1 = dato.nextLine();
                                serpiente.setDesplazamiento(des1);
                                System.out.println("\n");

                                System.out.println("Ingrese el sexo");
                                String sex1 = dato.nextLine();
                                serpiente.setSexo(sex1);
                                System.out.println("\n");

                                System.out.println("Ingresse el color de la serpiente");
                                String colorL1 = dato.nextLine();
                                serpiente.setColor(colorL1);
                                System.out.println("\n");

                                controladorSerpiente.update(serpiente);
                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Ingrese el codigo a eliminar");
                                codigo = dato.nextInt();
                                controladorSerpiente.delete(codigo);
                                break;
                            case 5:
                                System.out.println("Has seleccionado la opción Regresar");

                                salir1 = true;
                                break;
                            default:
                                System.out.println("Solo digite números entre 1 y 5");
                        }
                    }
                    break;
            }
        }
    }
}
