package service;

import org.springframework.stereotype.Service;

import dto.ClienteDTO;

@Service
public interface ClienteService {

	public ClienteDTO create(ClienteDTO clienteDTO);
	
	public ClienteDTO finById(Long idCliente);
	
	
	//public List<ClienteDTO> findAll();
	//
	//public ClienteDTO update(ClienteDTO clienteDTO);
	//
	//public void delete(Long idCliente);


}
