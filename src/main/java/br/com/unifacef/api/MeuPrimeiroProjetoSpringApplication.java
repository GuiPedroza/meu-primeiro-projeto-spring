package br.com.unifacef.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.unifacef.api.entities.Empresa;

//import br.com.unifacef.api.utils.SenhaUtils;

@SpringBootApplication
public class MeuPrimeiroProjetoSpringApplication {
	@Autowired
	private EmpresaRepository empresaRepository;//chamar metodos da classe sem instancia-la

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoSpringApplication.class, args);
		//System.out.println("Esta é uma alteração no projeto.");
		//System.out.println("Foi adicionada uma nova linha no application.properties");
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			//String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			//System.out.println("Senha encoded: " + senhaEncoded);
			///senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			//System.out.println("Senha encoded novamente:" + senhaEncoded);
			//System.out.println("Senha válida: " + SenhaUtils.senhaValida("123456", senhaEncoded));
			
			Empresa empresa = new Empresa();
			empresa.setRazaoSocial("Kazale IT");
			empresa.setCnpj("74645215000104");
			this.empresaRepository.save(empresa); //metodo pronto do jpa sobe no banco
			List<Empresa> empresas = empresaRepository.findAll(); //query select
			empresas.forEach(System.out::println);
			
			Empresa empresaDb = empresaRepository.findById(1L).orElse(null); //query select
			System.out.println("Empresa por ID: " + empresaDb);
			empresaDb.setRazaoSocial("Kazale IT Web");
			this.empresaRepository.save(empresaDb);//se ja existe update
			
			Empresa empresaCnpj = empresaRepository.findByCnpj("74645215000104");
			System.out.println("Empresa por CNPJ: " + empresaCnpj);
			
			this.empresaRepository.delete(empresaCnpj);
			empresas = empresaRepository.findAll();
			System.out.println("Empresas: " + empresas.size());
		};
	}

}
