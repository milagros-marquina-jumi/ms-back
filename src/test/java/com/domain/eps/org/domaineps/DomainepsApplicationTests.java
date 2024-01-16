package com.domain.eps.org.domaineps;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.lenient;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.domain.eps.org.domaineps.models.EpsDetail;
import com.domain.eps.org.domaineps.services.EpsService;

@SpringBootTest
class DomainepsApplicationTests {

	@Mock
	private EpsService epsService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateEps() {
		lenient().when(epsService.save(any())).thenReturn(new EpsDetail());
		EpsDetail eps = new EpsDetail();
		eps.setNombreEps("Sura");
		eps.setPorcentaje(0.12);
		eps.setComisionSobreRA(0.04);
		eps.setPrimaSeguro(0.005);
		EpsDetail epsCreated = epsService.save(eps);
		assertNotNull(epsCreated);
	}

	@Test
	public void testCreateEpsError() {
		lenient().when(epsService.save(any())).thenThrow(new RuntimeException());
		EpsDetail eps = new EpsDetail();
		eps.setNombreEps("Sura");
		eps.setPorcentaje(0.12);
		eps.setComisionSobreRA(0.04);
		eps.setPrimaSeguro(0.005);
		assertThrows(Exception.class, () -> epsService.save(eps));
	}
}
