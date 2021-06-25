import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class VermögenTest {

	Vermögen v;

	@Test
	void testvermögenNachGehalt() {
		Steuern KB = mock(Steuern.class); // dyn Proxy

		when(KB.Steuerrechner(2000)).thenReturn(1000);// DSL(Domain Specific Language)

		v = new Vermögen(KB);//Übergebe Mock
		
		assertEquals(1100, v.vermögenNachGehalt(100));

	}

}
