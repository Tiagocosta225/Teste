package br.com.agenda.aplicacao;

import java.sql.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class main {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Maria");
		contato.setIdade(25);
		contato.setDataCadastro(new Date(0));
		
		ContatoDAO contatoDao = new ContatoDAO();
		
		contatoDao.save(contato);

		
	}

}
