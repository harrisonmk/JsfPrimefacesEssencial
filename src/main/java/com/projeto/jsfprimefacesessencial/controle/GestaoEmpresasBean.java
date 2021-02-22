package com.projeto.jsfprimefacesessencial.controle;

import com.projeto.jsfprimefacesessencial.modelo.Empresa;
import com.projeto.jsfprimefacesessencial.modelo.TipoEmpresa;
import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Empresa empresa = new Empresa();

    public Empresa getEmpresa() {

        return empresa;

    }

    public TipoEmpresa[] getTiposEmpresa() {

        return TipoEmpresa.values();

    }

    public void salvar() {

        System.out.println("Razao Social: " + empresa.getRazaoSocial() + "\nNome Fantasia: " + empresa.getNomeFantasia() + "\nTipo: " + empresa.getTipo());

    }

    public String ajuda() {
        return "AjudaGestaoEmpresas?faces-redirect=true";
    }

}
