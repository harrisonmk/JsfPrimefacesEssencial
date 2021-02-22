
package com.projeto.jsfprimefacesessencial.servico;


import com.projeto.jsfprimefacesessencial.repositorio.EmpresaRepositorio;
import com.projeto.jsfprimefacesessencial.modelo.Empresa;
import com.projeto.jsfprimefacesessencial.util.Transacional;
import java.io.Serializable;

import javax.inject.Inject;



public class CadastroEmpresaServico implements Serializable {
    
    
    private static final long serialVersionUID = 1L;
	
	@Inject
	private EmpresaRepositorio empresas;
	
	@Transacional
	public void salvar(Empresa empresa) {
		empresas.salvar(empresa);
	}
	
	@Transacional
	public void excluir(Empresa empresa) {
		empresas.excluir(empresa);
	}
    
}
