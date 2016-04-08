package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC02ConsultarEmpresa {

	static Empresa empresa = new Empresa();
	static EmpresaDAO empresaDAO = new EmpresaDAO();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresa.setNomeDaEmpresa("empresax");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresax");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("222");
	
	}
	
	/**
	 * obj - verificar o comportamento do sistema na consulta de empresa com sucesso
	 */
	
	
	@Test
	public void CT01UFBConsutarEmpresa_com_sucesso() {
		empresaDAO.adiciona(empresa);
		assertTrue(empresa.equals(empresaDAO.consultaEmpresa("89424232000180")));
		empresaDAO.exclui("89424232000180");
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	@Test
	public void CT02UC02A1ConsultarEmpresa_cnpj_invalido(){
		assertNull(empresaDAO.consultaEmpresa("111111"));
	}
	
	

	

	/**
	 * obj - verificar empresa nao cadastrada
	 * 
	 */
	@Test
	public void CT03UC02A1ConsultarEmpresa_cnpj_invalido(){
		assertNull(empresaDAO.consultaEmpresa(""));
	}
	
	/**
	 * obj - verificar empresa nao cadastrada
	 * 
	 */
	@Test
	public void CT04UC02A1ConsultarEmpresa_cnpj_invalido(){
		assertNull(empresaDAO.consultaEmpresa("%"));
	}

	/**
	 * obj - 
	 * 
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	empresaDAO.exclui("89424232000180");
	}
	
	
	
}
