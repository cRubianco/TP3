package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.ClienteDTO;
import model.Cliente;
import repository.ClienteRepository;


@Service
public class ClientServiceImplem implements ClienteService{

	//atributos
	@Autowired
	private ClienteRepository clienteRepository;
	
	
//	@Autowired
//	private CuentaRepository cuentaRepository;
	
	public ClientServiceImplem() {
		// TODO Auto-generated constructor stub
	}

	// metodos
	@Override
	public ClienteDTO create(ClienteDTO clienteDTO) {
		Cliente cli1 = new Cliente(
				clienteDTO.getCodigo(),
				clienteDTO.getApellido(),
				clienteDTO.getNombre(),
				clienteDTO.getNumeroDeCuenta()
				);
		this.clienteRepository.save(cli1);
		return new ClienteDTO(cli1);
	}

	@Override
	public ClienteDTO finById(Long idCliente) {
		Cliente cliente = this.clienteRepository.findById(idCliente).orElse(null);
		ClienteDTO clienteDto = null;
		if(cliente !=null) {
			clienteDto = new ClienteDTO(cliente);
		}
		return clienteDto;
	}
	
//	@Override
//	public List<ClienteDTO> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ClienteDTO finById(Long idCliente) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ClienteDTO update(ClienteDTO clienteDTO) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void delete(Long idCliente) {
//		// TODO Auto-generated method stub
//		
//	}

}
