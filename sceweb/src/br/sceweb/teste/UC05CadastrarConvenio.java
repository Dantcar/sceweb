package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Convenio;
import br.sceweb.modelo.ConvenioDAO;

public class UC05CadastrarConvenio {
	static ConvenioDAO convenioDAO;
	static Convenio convenio;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	convenioDAO = new ConvenioDAO();
	convenio = new Convenio();
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(1,convenioDAO.adiciona(convenio));
	}

}
