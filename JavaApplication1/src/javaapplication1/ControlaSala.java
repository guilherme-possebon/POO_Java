package javaapplication1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlaSala
{
    private int serial = 1;
    private ArrayList <Sala> salas = new ArrayList();
    
    public void addSala ( Sala novaSala )
    {
        novaSala.setIdSalaEPredio(serial++);
        salas.add(novaSala);
        
        JOptionPane.showMessageDialog(null, "Sala cadastrada com sucesso:");
    }
    
    public ArrayList <Sala> getSalas()
    {
        return salas;
    }
    
    public Sala getSalasPorCodigo ( int codigo )
    {
        for (Sala sala : salas)
        {
            if (sala.getIdSalaEPredio() == codigo)
            {
                return sala;
            }
        }
        return null;
    }
    
    public String imprimeSalas ()
    {
        
        for (Sala sala : salas)
        {
            
            return sala.getIdSalaEPredio() + ";" + sala.getSala() +
                   ";" + sala.getPredio();
        }
        
        return null;
        
    }
}
