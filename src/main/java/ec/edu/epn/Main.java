package ec.edu.epn;

public class Main {

    public static void main(String[] args) {

        Administrador administradores[] = new Administrador[5];

        administradores[0] = new Administrador("1725996365", "Billy Proaño", "El condado", "0983333483", "billy97proano@hotmail.com");
        administradores[1] = new Administrador("1725969503", "Nathaly Mafla", "La macahal", "0983974092", "nathaly@hotmail.com");
        administradores[2] = new Administrador("1708394000", "Cecilia Morales", "Carcelen", "0987143826", "cecilia@hotmail.com");
        administradores[3] = new Administrador("1709492159", "Luis Proaño", "El Inca", "0984951424", "luis@hotmail.com");
        administradores[4] = new Administrador("1720540879", "Omar Proaño", "Calderoon", "0984276934", "omar@hotmail.com");

        System.out.println("\n ADMINISTRADORES \n ");

        for (int i = 0; i< administradores.length; i++){
            System.out.println("Datos de Administrador ->" +administradores[i].toString());
        }

     //-------------------------------------- CLINETES -----------------------------------------------------------------------
        Cliente clientes[] = new Cliente[5];

        clientes[0] = new Cliente("1725969502", "Juan Perozo", "El Inca",
                "0989765641", "juan@homail.com");
        clientes[1] = new Cliente("1725960987", "Maria Perez", "El Condado",
                "0989765621", "maria@homail.com");
        clientes[2] = new Cliente("1725969512", "Caren Navarrete", "Carcelen",
                "0989765612", "carmne@homail.com");
        clientes[3] = new Cliente("1725969598", "Cristian Campos", "Colinas del norte",
                "0989765341", "cristian@homail.com");
        clientes[4] = new Cliente("1725543502", "Alexander Morales", "La Roldos",
                "0989765324", "alexander@homail.com");

        System.out.println("\n CLIENTES \n");
        for (int i = 0; i< administradores.length; i++){
            System.out.println("Datos de Cliente ->" +clientes[i].toString());
        }

    //--------------------------------- LUGARES TURISTICOS ---------------------------------------------------------------

        LugarTuristico lugares[] = new LugarTuristico[5];
        String [] medidasLugar1 = {"bioseguridad", "distanciamiento", "aforo limite de personas"};
        String [] medidasLugar2 = {"bioseguridad", "distanciamiento", "aforo limite de personas"};
        String [] medidasLugar3 = {"bioseguridad", "distanciamiento", "aforo limite de personas", "Aforo limite en restaurante", "actividades restringidas"};
        String [] medidasLugar4 = {"bioseguridad", "distanciamiento", "aforo limite de personas", "Aforo limite en restaurante", "actividades restringidas" };
        String [] medidasLugar5 = {"bioseguridad", "distanciamiento", "aforo limite de personas", "Actividades restringidas"};

        lugares[0] = new LugarTuristico("Salinas",
                "Playa",
                "24 Horas",
                "Domingo a Domingo",
                "Manabi",
                (float) 4.8,
                medidasLugar1,
                "Una de las mejores playas que he visitado");

        lugares[1] = new LugarTuristico("Atacames",
                "Playa",
                "24 Horas",
                "Domingo a Domingo",
                "Esmeraldas",
                (float) 4.3,
                medidasLugar2,
                "Playa muy linda, pero un poco descuidad");

        lugares[2] = new LugarTuristico("Chachimbiro",
                "Piscina",
                "8 - 18",
                "Martes a Domingo",
                "Ibarra",
                (float) 4.5,
                medidasLugar3,
                "Excelentes piscinas variedad de actividades");

        lugares[3] = new LugarTuristico("Papallacta",
                "Piscinas",
                "9 - 17",
                "Martes a Domingo",
                "Oriente",
                (float) 4.8,
                medidasLugar4,
                "Excelente lugar aguas termaales fantasticas, el clima demasiado frío");

        lugares[4] = new LugarTuristico("Pailon de diablo",
                "Cascada",
                "7 - 22",
                "Domingo a Domingo",
                "Baños",
                (float) 4.7,
                medidasLugar5,
                "Una de las mejores playas que he visitado");

        System.out.println("\n LUGARES TURISTICOS  \n");
        for (int i = 0; i< administradores.length; i++){
            System.out.println("Informacion del Lugar ->" + lugares[i].toString());
        }


        System.out.println("-------------------- CAMBIOS REALIZADOS ------------------ ");

        Administrador administrador = new Administrador();
        System.out.println("NUEVO ADMINISTRADOR \n");
        administrador.registrarAdministrador("1725996332", "Pedro Perez", "El condado", "0983333432", "pedro@hotmail.com");
        System.out.println("Nuevo administrador -> " + administrador.toString());

        Cliente cliente = new Cliente();
        System.out.println(" NUEVO CLIENTE \n ");
        cliente.registrarCliente("1725969502", "Juan Perozo", "El Inca",
                "0989765641", "juan@homail.com");
        System.out.println("Nuevo cliente -> " + cliente.toString());


        LugarTuristico lugar =  new LugarTuristico();
        System.out.println(" NUEVO LUGAR TURISTICO \n ");
        lugar.registrarLugarTuristico("Molinuco",
                "cascadas",
                "8 - 20",
                "martes -domingo",
                "Sur de Quito",
                (float) 4.9,
                medidasLugar5,
                "Excelente lugar buenas medidas de bioseguridad demasiado entretenido");

        System.out.println("Nuevo Lugar -> " + lugar.toString());
    }





}
