INSERT INTO `flyway`.`empresa` (`id`, `cnpj`, `data_atualizacao`, `data_criacao`, `razao_social`) 
VALUES (NULL, '456', CURRENT_DATE(), CURRENT_DATE(), 'Uni-FACEF Centro Universitário');

INSERT INTO `flyway`.`funcionario` (`id`, `nome`, `email`, `senha`, `cpf`, `valor_hora`, `qtd_horas_trabalho_dia`, `qtd_horas_almoco`, `perfil`, `data_criacao`, `data_atualizacao`)
VALUES (NULL, 'Guilherme Pedroza', 'guipedrosa198@gmail.com', '123', '999999999-99', 150.05, 6, 1, 'ROLE_ADMIN', CURRENT_DATE(), CURRENT_DATE());