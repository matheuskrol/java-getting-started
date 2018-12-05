import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Media;

public class TesteMedia {
  
  @Test
  public void Teste1(){
    Media m = new Media();
    assertEquals(7.0, m.media(6.0, 8.0));
  }
  @Test
  public void Teste2(){
    Media m = new Media();
    assertEquals(3.0, m.media(1.0, 5.0));
  }
  @Test
  public void Teste3(){
    Media m = new Media();
    assertEquals(10.0, m.media(13.0, 7.0));
  }
}