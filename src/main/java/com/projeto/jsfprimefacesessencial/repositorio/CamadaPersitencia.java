
package com.projeto.jsfprimefacesessencial.repositorio;

import com.projeto.jsfprimefacesessencial.repositorio.EmpresaRepositorio;
import com.projeto.jsfprimefacesessencial.repositorio.RamoAtividadeRepositorio;
import com.projeto.jsfprimefacesessencial.modelo.Empresa;
import com.projeto.jsfprimefacesessencial.modelo.Empresa;
import com.projeto.jsfprimefacesessencial.modelo.RamoAtividade;
import com.projeto.jsfprimefacesessencial.modelo.RamoAtividade;
import com.projeto.jsfprimefacesessencial.modelo.TipoEmpresa;
import com.projeto.jsfprimefacesessencial.modelo.TipoEmpresa;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CamadaPersitencia {
    
    
    	public static void main(String[] args) {		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlgaWorksPU");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//Declarando os repositórios
		RamoAtividadeRepositorio ramoAtividades = new RamoAtividadeRepositorio(em);
		EmpresaRepositorio empresas = new EmpresaRepositorio(em);
		
		//Buscando as informações do banco
		List<RamoAtividade> listaDeRamoAtividades = ramoAtividades.pesquisarPorDescricao("");
		List<Empresa> listaDeEmpresas = empresas.pesquisar("");
		System.out.println(listaDeEmpresas);
		
		//Criando uma empresa
		Empresa empresa = new Empresa();		
		empresa.setNomeFantasia("João da Silva");
		empresa.setCnpj("41.952.519/0001-57");
		empresa.setRazaoSocial("João da Silva 41952519000157");
		empresa.setTipo(TipoEmpresa.MEI);
		empresa.setDataFundacao(new Date());
		empresa.setRamoAtividade(listaDeRamoAtividades.get(0));
		
		//Salvando a empresa
		empresas.salvar(empresa);
		
		em.getTransaction().commit();
		
		//Verificando se a inserção funcionou
		List<Empresa> listaDeEmpresas2 = empresas.pesquisar("");
		System.out.println(listaDeEmpresas2);
		
		
		em.close();
		emf.close();
	}
    
}
