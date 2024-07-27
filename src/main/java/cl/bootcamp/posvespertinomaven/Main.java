package cl.bootcamp.posvespertinomaven;

public class Main {
    
    public static void main(String[] args) {
        
        Pos maquinaPos = new Pos();
        
        Persona titular1 = new Persona(
                123456789, 
                "Tom", 
                "Shelby", 
                "56998232423", 
                "tomas@gmail.com"
        );
        
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito(
                "Banco Chile", 
                EntidadFinanciera.VISA, 
                "12346567676", 
                150000, 
                titular1
        );
        
        System.out.println("TARJETA ANTES DE SER USADA");
        System.out.println(tarjeta1);
        System.out.println("------------------------------------------");
        
        System.out.println(" ");
        
        System.out.println("GENERANDO TICKET...");
        Ticket ticketDePago = maquinaPos.efectuarPago(
                tarjeta1, 
                150000, 
                1);
        
        System.out.println(ticketDePago);
        
        System.out.println("------------------------------------------");
        
        System.out.println(" ");
        System.out.println("TARJETA DESPUES DE SER USADA");
        System.out.println(tarjeta1);
        
    }
    
}
