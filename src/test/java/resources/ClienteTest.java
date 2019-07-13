package resources;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.crud.CrTp3Application;

import dto.ClienteDTO;
import service.ClienteService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CrTp3Application.class)
//@TestPropertySource(locations="classpath:test.properties")
//@Sql("/test-mysql.sql")
public class ClienteTest {
	
	@Autowired
	private ClienteService clienteService;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void createClientes() {
//		String codigo, String apellido, String nombre, String numeroDeCuenta
		ClienteDTO cli1 = new ClienteDTO("J01","Perez","Juan","J001");
		cli1 = this.clienteService.create(cli1);
		
		ClienteDTO cliente1 = this.clienteService.finById(cli1.getId());
		Assert.assertNotNull(cliente1.getId());
		Assert.assertNotNull(cliente1.getApellido());
		
	}
	
	
}
