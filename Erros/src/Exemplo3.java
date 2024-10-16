/**
 *
 * @author artur
 */
public class Exemplo3
{
     public static void main( String[] args )
    {
        Forma f1 = new Forma( "triangulo" );
        f1.setCor( "blue" );
        
        Forma f2 = new Forma( "retangulo" );
        f2.setCor( "amaralelo" );
        
        //tem que ser igual "trinagulo"
        System.out.println( f1 );
        
        //tem que ser igual "retangulo"
        System.out.println( f2 );
    }
}
