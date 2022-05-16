package br.edu.ifce.code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;


import br.edu.ifce.Utils.JPAUtil;
import br.edu.ifce.Utils.ReadLob;
import br.edu.ifce.model.Aluno;
import br.edu.ifce.model.Endereco;
import br.edu.ifce.model.Telefone;

public class JpaAluno {

	public static void main(String args[]) throws IOException {

		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		
		byte[] foto = new ReadLob().getFoto("\\coisas\\imagens\\berk");
		Calendar c = Calendar.getInstance();
		c.set(2020, 07, 07);
		
		Endereco e = new Endereco();
		e.setLogradouro("Rua II");
		e.setBairro("Timbó");
		e.setCep("60000-000");
		e.setNumero("50");
				
		Aluno a = new Aluno();
		a.setNome("Fulano de Tal");
		a.setRG("9999999999");
		a.setCPF("777.777.777-77");
		
		a.setEndereco(e);
		
		Telefone t1 = new Telefone();
		t1.setTelefone("99999-9999");
		t1.setTipo("Celular");
		
		Telefone t2 = new Telefone();
		t2.setTelefone("34959816");
		t2.setTipo("Fixo");
		
		a.getTelefone().add(t1);
		a.getTelefone().add(t2);
		
	
		a.setIra(9.82);
		a.setFotografia(foto);
		a.setNascimento(c);
		
		manager.persist(t1);
		manager.persist(t2);
		manager.persist(a);
		
		
		manager.getTransaction().commit();
		manager.close();
		
		
	}

}
