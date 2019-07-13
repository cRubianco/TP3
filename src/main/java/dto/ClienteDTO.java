package dto;

import model.Cliente;

public class ClienteDTO {

	private Long id;
	private String codigo;
	private String apellido;
	private String nombre;
	private Long idCuenta;
	private String numeroDeCuenta;
	
	// constructores
	public ClienteDTO(String codigo, String apellido, String nombre, String numeroDeCuenta) {
		super();
		this.codigo = codigo;
		this.apellido = apellido;
		this.nombre = nombre;
		this.numeroDeCuenta = numeroDeCuenta;
		
	}
	public ClienteDTO(Cliente cliente) {
		this(cliente.getCodigo(),
			 cliente.getApellido(),
			 cliente.getNombre(),
			 cliente.getCuenta().getNumero());
		this.id = cliente.getId();
		this.idCuenta = cliente.getCuenta().getId();
	}
	

	// get y set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	
	
}
