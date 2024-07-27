package cl.bootcamp.posvespertinomaven;

public class Ticket {
    
    private String nombreCompleto;
    private double montoTotal;
    private double montoPorCuotas;
    
    public Ticket() {};
    
    public Ticket(
            String nombreCompleto,
            double montoTotal,
            double montoPorCuotas
    ) {
        this.nombreCompleto = nombreCompleto;
        this.montoTotal = montoTotal;
        this.montoPorCuotas = montoPorCuotas;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getMontoPorCuotas() {
        return montoPorCuotas;
    }

    public void setMontoPorCuotas(double montoPorCuotas) {
        this.montoPorCuotas = montoPorCuotas;
    }

    @Override
    public String toString() {
        return "Ticket{" 
                + "nombreCompleto=" + nombreCompleto 
                + ", montoTotal=" + montoTotal 
                + ", montoPorCuotas=" + montoPorCuotas 
                + '}';
    }
    
    
    
}
