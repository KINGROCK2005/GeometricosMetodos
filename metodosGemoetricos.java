import java.util.Scanner;


public class metodosGeometricos{
    public static Scanner lector = new Scanner(System.in);
    public static int opc, intentos = 0, intentosMaximos = 3, intentosRestantes;
    public static boolean comparar, again = true;
            public static char Calagain;
    
            public static void mostrarmenu(){
                System.out.println("Ingrese la figura geometrica a realizar: ");

                System.out.println("Ingrese qué ejercicio desea que se ejecute: \n 1.Prisma \n 2.Cilindro \n 3.Pirámide \n 4.Cono \n 5.Esfera \n" +
                " 6.Tronco de Cono \n 7.Tronco de Pirámide \n 8.Huso Esférico  \n 9. Cuña Esférica \n 10.Tetraedro \n 11.Hexaedro \n 12.Octaedro \n 13.Dodecaedro" +
                " 14.Icosaedro \n 15.Ortoedro\n 16.Zona Esférica y Casquete Esférico");
        opc = lector.nextInt();
         while (intentos < intentosMaximos) 
         {

        if (opc >= 1 && opc <= 16) {
            System.out.println("Ha seleccionado la opción " + opc);
            break; 
        } else {
            intentos++;
            intentosRestantes = intentosMaximos - intentos;
            System.out.println("Ingreso inválido. Intentos restantes: " + intentosRestantes);
        }
        opc = lector.nextInt();
        if (intentos == intentosMaximos) {
        System.out.println("Intentos máximos alcanzados. Reinicie el programa.");

            }

            
        }
        
    }
    //Metodo sobrecargao
    public static void figura(double aL, double aT, double voL, double h,double aB, double pB, double apo , double lonLad, int canLad){
         
        System.out.println("Ingrese la altura: ");
        while (h <= 0 && intentos < 3) {
            intentos++;
            System.out.println("Digite la altura de nuevo");
            h = lector.nextByte();
        }
        if (intentos == 3) {
            System.out.println("Ha intentado muchas veces, regresa mas tarde");
            return;
        }
        System.out.println("Ingrese la cantidad de lados: ");
        while (canLad <= 0 && intentos < 3) {
            intentos++;
            System.out.println("Digite numeros positivos de nuevo");
            canLad = lector.nextByte();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
        System.out.println("Ingrese la longitud de los lados: ");
        while (lonLad <= 0 && intentos < 3) {
            intentos++;
            System.out.println("Digite numeros positivos de nuevo");
            lonLad = lector.nextByte();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
        

        pB = (canLad * lonLad);
        aL =(pB * h) ;
        double alfa = (Math.PI/180) * (360/canLad);
        apo =lonLad / (2 * Math.tan((alfa)/2));
        aB = (pB * apo)/2;
        aT = (aL + 2 * aB);
        voL = (aB * h);

        System.out.println("Area lateral: " + aL + " unidades cuadradas.");
        System.out.println("Area total: " + aT + " unidades cuadradas.");
        System.out.println("Volumen: " + voL + " unidades cubicas.");

    }
        public static void figura(double aL, double aT, double voL,double h ,double aB,double pB, double r){
            
            System.out.println("Ingrese la altura: ");
            while (h <= 0 && intentos < 3) {
            intentos++;
            System.out.println("Digite la altura de nuevo");
            h = lector.nextByte();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
        System.out.println("Ingrese el radio: ");
        while (r <= 0 && intentos < 3) {
            intentos++;
            System.out.println("Digite el radio de nuevo");
            r = lector.nextByte();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }

        aB= (  Math.PI * (r * r) );
        pB= ((2 * Math.PI) * r);
        aL = pB * h;
        aT = (aL * (2 * aB));
        voL = aB * h;
        System.out.println("Su area lateral es: " + aL);
        System.out.println("Su area Total es: " + aT);
        System.out.println("Su volumen es: " + voL);

        

        }

        public static void figura(double aL, double aT, double voL, double h ,double aB,double pB, double r, int canLad, double lonLad, double apPir, double apo){

            System.out.println("Ingrese el radio: ");
            while (r <= 0 && intentos < 3) {
            intentos++;
            System.out.println("Digite el radio de nuevo");
            r = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Ha intentado muchas veces, regresa mas tarde");
            return;
        }
        System.out.println("Ingrese la altura: ");
        while (h <= 0 && intentos < 3) {
            intentos++;
            System.out.println("Digite la altura de nuevo");
            h = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
        System.out.println("Ingrese la longitud de los lados: ");
        while (lonLad <= 0 && intentos < 3) {
            intentos++;
            System.out.println("Digite numeros positivos de nuevo");
            lonLad = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
        System.out.println("ingrese la cantidad de lados: ");
        while (canLad <= 0 && intentos < 3) {
            intentos++;
            System.out.println("Digite numeros positivos de nuevo");
            canLad = lector.nextInt();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }

        double alfa = (Math.PI/180) * (360/canLad);
        pB = ((2 * Math.PI) * r); 
        aB= (Math.PI * (r * r));
        apo = (lonLad / (2 * Math.tan(alfa)));
        apPir = (h * h + (apo * apo));
        aL = pB * apPir / 2;
        aT= aL + aB;
        voL = aB * h / 3;

        System.out.println("Su area lateral es: "  + aL);
        System.out.println("Su area Total es: " + aT);
        System.out.println("Su volumen es:" + voL);

        }


        public static void figura(double aL, double aT, double voL, double h ,double aB,double pB, double r, int canLad, double g){

            System.out.println("Ingrese la altura: ");
            while (h <= 0 && intentos < 3) {
            intentos++;
            System.out.println("Digite la altura de nuevo");
            h = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
            System.out.println("Ingrese el radio: ");
            while (r <= 0 && intentos < 3) {
            intentos++;
            System.out.println("Digite el radio de nuevo");
            r = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
            
        pB= (2 * (Math.PI * r));
        aB = (Math.PI * (r * r));
        g = (Math.sqrt(h * h + ( r * r)));
        aL = pB * g /2;
        aT = aL + aB;
        voL = aB * h /3;
            
        System.out.println("Su generatriz es: " + g);
        System.out.println("Su area lateral es: " + aL);
        System.out.println("Su area total es: " + aT);
        System.out.println("Su volumen es: " + voL);

        }

        public static void figura( double aT, double voL, double r){//5
            System.out.println("Ingrese el radio: ");
            while (r <= 0 && intentos < 3) {
            intentos++;
            System.out.println("Digite el radio de nuevo");
            r = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }

        aT = 4 * (Math.PI * (r * r));
        voL = 4 * (double)(Math.PI *  Math.pow(r, 3)) / 3 ;

        System.out.println("Su area total es: " + aT);
         System.out.println("Su volumen es: " + voL);

        }

        public static void figura2(double areaTot,double areaLat,double  areaBM, double rM, double rm,double h,double areaBm,double vol,double g){
            System.out.println("Ingrese la altura: ");
            while (h <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite la altura de nuevo");
                h = lector.nextDouble();
            }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
        System.out.println("Ingrese el radio menor: ");
        while (rm <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite la altura de nuevo");
                rm = lector.nextDouble();
            }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
        System.out.println("Ingrese el radio Mayor: ");
        while (rm <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite la altura de nuevo");
                rm = lector.nextDouble();
            }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
         areaBM = Math.PI * (rM * rM);
         areaBm = Math.PI * (rm * rm);
         g = (Math.sqrt(h * h + ( rM * rM)));
         areaLat = (double) (Math.PI * g * (rM * rm));
         areaTot = areaLat +  areaBM + areaBm; 
         vol = 1 * Math.PI * h *(rM * rM + (rm * rm) + rM + rm )/3;

         System.out.println("Su area lateral es: " + areaLat);
         System.out.println("Su area Total es: " + areaTot);
         System.out.println("Su volumen es: " + vol);

        }

         public static void figura2(double areaTot,double areaLat, int canLad ,double  areaBM,double areaBm, double pBM, double pbm,double h,double aP,double vol,double g, double zx, double xz){
            System.out.println("Ingrese la altura: ");
            while (h <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite la altura de nuevo");
                h = lector.nextDouble();
            }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
        System.out.println("Ingrese el area base mayor en mtrs cuadrados: ");
        while (areaBM <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite numeros positivos. Intente de nuevo");
                areaBM = lector.nextDouble();
            }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
        System.out.println("Ingrese el area base menor en mtrs cuadrados: ");
        while (areaBm <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite numeros positivos. Intente de nuevo");
                areaBm = lector.nextDouble();
            }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }

        System.out.println("Ingrese la cantidad de lados: ");
        while (canLad <= 0 && intentos < 3) {
                intentos++;
                System.out.println("Digite numeros positivos. Intente de nuevo");
                canLad = lector.nextInt();
            }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }

        areaBM =(float) Math.sqrt(areaBM);
        areaBm=(float) Math.sqrt(areaBm);
        pBM = (areaBM * canLad);
        pbm = (areaBm * canLad);
        zx =(float) Math.sqrt(areaBM)/2 - (float) Math.sqrt(areaBm)/2;
        aP =(float) (Math.pow(zx, 2) + Math.pow(h, 2));
        xz =(float) (Math.sqrt(aP));
        areaLat= ((pBM + pbm) * (xz/2));
        areaTot= (areaLat + areaBM + areaBm);
        vol =(float)  (h/3 * (areaBM + areaBm) + (float)  (Math.sqrt(areaBM + areaBm)));

        }

        public static void figura3(double area, double ngrados, double r){//8

            System.out.println("Ingrese el radio: ");
            while (r <= 0 && intentos < 3) {
            intentos++;
            System.out.println("Digite el radio de nuevo");
            r = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
        System.out.println("Ingrese los grados: ");
        while (ngrados <= 0 || ngrados >= 360 && intentos < 3) {
            intentos++;
            System.out.println("Ingreso invalido. Intente de nuevo");
            ngrados = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
        area = (4 * Math.PI )* (Math.pow(r, 2) * ngrados)/ 360;
        System.out.println("El area total es: " + area + " cm. ");

        }

        public static void figura4( double ngrados, double r, double vol){
            System.out.println("Ingrese el radio: ");
            while (r <= 0 && intentos < 3) {
            intentos++;
            System.out.println("Digite el radio de nuevo");
            r = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }
            System.out.println("Ingrese los grados de la esfera: ");
            while (ngrados <= 0 || ngrados >= 360 && intentos < 3) {
            intentos++;
            System.out.println("Ingreso invalido. Intente de nuevo");
            ngrados = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }

        vol= (float) (Math.PI * Math.pow(r, 3) * ngrados) / 270;

        }
        
        public static void figura3(double arista, double h, double vertice, double aTotal){//10
            System.out.println("Ingreese la arista: ");
            while (arista <= 0  && intentos < 3) {
            intentos++;
            System.out.println("Ingreso invalido. Intente de nuevo");
            arista = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }

        aTotal = Math.pow(arista, 2) * (Math.sqrt (3));
        vertice = (Math.sqrt(2) * (Math.pow(arista, 3)) /12);
        h= arista * (Math.sqrt(6))/3;

        }

        public static void figura4(double arista, double vol, double diametro, double aTotal){

            System.out.println("Ingrese la arista: ");
            while (arista <= 0  && intentos < 3) {
            intentos++;
            System.out.println("Ingreso invalido. Intente de nuevo");
            arista = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }

        aTotal = 6 * (Math.pow(arista,2));
        vol = Math.pow(arista, 3);
        diametro =arista * (Math.sqrt(3));

        }

        
        public static void figura1(double arista, double vol, double aTotal){
            System.out.println("Ingrese la arista: ");
            while (arista <= 0  && intentos < 3) {
            intentos++;
            System.out.println("Ingreso invalido. Intente de nuevo");
            arista = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }

        aTotal = 2 * (Math.pow(arista,2)* (Math.sqrt(3)));
        vol = (Math.sqrt(2) * Math.pow(arista,3))/3;
        }

        public static void figura0(double arista, double vol, double aTotal){
            while (arista <= 0  && intentos < 3) {
            intentos++;
            System.out.println("Ingreso invalido. Intente de nuevo");
            arista = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }

        aTotal = (double)3 * (arista * arista) * (Math.sqrt(25 + 10) * Math.sqrt(5));
        vol = (double)(15 +  (7 *Math.sqrt(5))) * Math.pow(arista,3)/4;

        }

            public static void figura14(double arista, double vol, double aTotal){

                System.out.println("Ingrese la arista");
                while (arista <= 0  && intentos < 3) {
            intentos++;
            System.out.println("Ingreso invalido. Intente de nuevo");
            arista = lector.nextDouble();
        }
        if (intentos == 3) {
            System.out.println("Intentos maximos realizados. Intente luego");
            return;
        }

        aTotal = 5 * (Math.pow(arista,2))*(Math.sqrt(3));
        vol = 5 * (3 + Math.sqrt(5) *Math.pow(arista, 3)/12) ;

            }

            
            public static void figura15(double diagonal, double vertice, double aTotal, double a, double b, double c, double angTot){

                System.out.println("Ingrese el lado mayor: ");
                 while (a <= 0  && intentos < 3) {
                    intentos++;
                    System.out.println("Ingreso invalido. Intente de nuevo");
                    a = lector.nextDouble();
                }
                if (intentos == 3) {
                    System.out.println("Intentos maximos realizados. Intente luego");
                    return;
                }

                System.out.println("Ingrese el lado menor: ");
                while (b <= 0  && intentos < 3) {
                    intentos++;
                    System.out.println("Ingreso invalido. Intente de nuevo");
                    b = lector.nextDouble();
                }
                if (intentos == 3) {
                    System.out.println("Intentos maximos realizados. Intente luego");
                    return;
                }

                System.out.println("Ingresela altura de la cara");
                while (c <= 0  && intentos < 3) {
                    intentos++;
                    System.out.println("Ingreso invalido. Intente de nuevo");
                    c = lector.nextDouble();
                }
                if (intentos == 3) {
                    System.out.println("Intentos maximos realizados. Intente luego");
                    return;
                }

                angTot = 2 * ((a * b) + (a * c) + (b * c));
                diagonal = (Math.sqrt((a * a) + (b * b) + (c * c)));
                vertice =  a * b *c;

            }

            public static void figura16(double  volZonaEsf,double areazonaEsf,double rmen,double h, double volCasEsf,double areaCasEsf,double rMay){

                System.out.println("Ingrese el radio menor: ");
                while (rmen <= 0  && intentos < 3) {
                    intentos++;
                    System.out.println("Ingreso invalido. Intente de nuevo");
                    rmen = lector.nextDouble();
                }
                if (intentos == 3) {
                    System.out.println("Intentos maximos realizados. Intente luego");
                    return;
                }
                System.out.println("Ingrese el radio mayor: ");
                while (rMay <= 0  && intentos < 3) {
                    intentos++;
                    System.out.println("Ingreso invalido. Intente de nuevo");
                    rMay = lector.nextDouble();
                }
                if (intentos == 3) {
                    System.out.println("Intentos maximos realizados. Intente luego");
                    return;
                }

                System.out.println("Ingrese la altura: ");
                while (h <= 0  && intentos < 3) {
                    intentos++;
                    System.out.println("Ingreso invalido. Intente de nuevo");
                    h = lector.nextDouble();
                }
                if (intentos == 3) {
                    System.out.println("Intentos maximos realizados. Intente luego");
                    return;
                }

                areazonaEsf = 2 * (Math.PI * (rMay * h));
                volZonaEsf = (Math.PI * h * ((h * h) + (3 * (rmen * rmen) + (3 * (rmen * rmen))))) / 6;
                areaCasEsf = 2 * (Math.PI * (rMay * h));
                volCasEsf = (Math.PI * (h * h) * (3 * rMay) - h)/3; 

            }


    public static void problems(){

        mostrarmenu();

        switch(opc){
            case 1->{
                figura(double aL, double aT, double voL, double h,double aB, double pB, double apo , double lonLad, int canLad);
            break;
            }

        }

        
        }
    
    public static void main(String[] args) {

    while(again){
            miCodigo();
    
         System.out.println("Dese volver a ejecutar el codigo?  (Si/No)");
         Calagain = lector.next().charAt(0);

         if(Calagain == 's'){
            again = true;
            }
            else{
                again = false;

            }
        }
    }
}
