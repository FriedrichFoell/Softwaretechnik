import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class Verm�genTest {

	Verm�gen v;

	@Test
	void testverm�genNachGehalt() {
		Steuern KB = mock(Steuern.class); // dyn Proxy

		when(KB.Steuerrechner(2000)).thenReturn(1000);// DSL(Domain Specific Language)

		v = new Verm�gen(KB);//�bergebe Mock
		
		assertEquals(1100, v.verm�genNachGehalt(100));

	}

}
