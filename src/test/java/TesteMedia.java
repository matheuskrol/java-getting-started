import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Media;

public class TesteMedia {
  
  @Test
  public void Teste1(){
    Media m = new Media();
    assertEquals(7, m.media(6, 8));
  }
  @Test
  public void Teste2(){
    Media m = new Media();
    assertEquals(2, m.media(1, 3));
  }
  @Test
  public void Teste3(){
    Media m = new Media();
    assertEquals(10, m.media(13, 7));
  }
}