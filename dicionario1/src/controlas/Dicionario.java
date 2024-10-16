package controlas;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import model.Palavra;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author artur
 */
public class Dicionario
{
    private ArrayList<Palavra> palavras = new ArrayList();
    private int serial = 0;

    public Dicionario()
    {
        carregaPalavras();
    }
    
    public int getProximoSerial()
    {
        return ++serial;
    }
    
    public void addPalavra( Palavra novoObjeto )
    {
        try
        {
            if ( consultarPalavraExata( novoObjeto.nome ) == null )
            {
                novoObjeto.codigo = getProximoSerial();
                palavras.add( novoObjeto );
                
                System.out.println( "Palavra cadastrada com sucesso!" );
            }
            
            else
            {
                System.out.println( "Palavra com o nome " + novoObjeto.nome + " já existe!");
            }
        }
        
        catch ( Exception ex )
        {
            Logger.getLogger( Dicionario.class.getName() ).log( Level.SEVERE, null, ex );
        }
    }
    
    public Palavra consultarPalavraPorCodigo( int codigo )
    {
        for ( Palavra palvaraDentroDoArray : palavras )
        {
            if ( palvaraDentroDoArray.codigo == codigo )
            {
                return palvaraDentroDoArray;
            }
        }
        
        return null;
    }
    
    public Palavra consultarPalavraExata( String textoParaBuscar )
    {
        for ( Palavra palvaraDentroDoArray : palavras )
        {
            if ( palvaraDentroDoArray.nome.equals( textoParaBuscar ) )
            {
                return palvaraDentroDoArray;
            }
        }
        
        return null;
    }
    
    public ArrayList<Palavra> consultarPalavra( String textoParaBuscar )
    {
        ArrayList<Palavra> palavrasFiltradas = new ArrayList();
        
        for ( Palavra palvaraDentroDoArray : palavras )
        {
            if ( palvaraDentroDoArray.nome.toLowerCase().contains( textoParaBuscar.toLowerCase() ) ||
                 palvaraDentroDoArray.significado.contains( textoParaBuscar ) )
            {
                palavrasFiltradas.add( palvaraDentroDoArray );
            }
        }
        
        return palavrasFiltradas;
    }
    
    public ArrayList<Palavra> getPalavras()
    {
        return palavras;
    }
    
    public void imprimeDicionario()
    {
        for ( Palavra p : palavras )
        {
            System.out.println( p.codigo + " " + p.nome + " " + p.significado );
        }
    }
    
    public void gravaPalavras()
    {
        try
        {
            String linhas = "";
            
            for ( Palavra palavraDentroDoArrayList : palavras )
            {
                linhas += palavraDentroDoArrayList.codigo + ";" +
                          palavraDentroDoArrayList.nome + ";" +
                          palavraDentroDoArrayList.significado +
                         "\n";
            }
            
            //escrever
            Files.write( Path.of( "/home/artur/Desktop/dicionario.txt" ),
                     linhas.getBytes(),
                     StandardOpenOption.CREATE,
                     StandardOpenOption.TRUNCATE_EXISTING );
        }
        
        catch ( IOException ex )
        {
            ex.printStackTrace();
        }
    }
    
    public void removePalavra( Palavra palavraParaRemover )
    {
        palavras.remove( palavraParaRemover );
    }
    
    public void carregaPalavras()
    {
        try
        {
            Path path = Path.of( "/home/artur/Desktop/dicionario.txt" );

            if ( Files.exists( path ) )
            {
                List<String> linhas  = Files.readAllLines( path );
                
                for ( String linha : linhas )
                {
                    String atributos [] = linha.split( ";" );
                    
                    Palavra novaPalavra = new Palavra();
                    novaPalavra.codigo = Integer.valueOf( atributos[0] );
                    novaPalavra.nome = atributos[1];
                    novaPalavra.significado = atributos[2];
                    
                    palavras.add( novaPalavra );
                    
                    if ( novaPalavra.codigo > serial )
                    {
                        serial = novaPalavra.codigo;
                    }
                }
            }
        }
        
        catch ( Exception e )
        {
            e.printStackTrace();
        }
  
    }
}
