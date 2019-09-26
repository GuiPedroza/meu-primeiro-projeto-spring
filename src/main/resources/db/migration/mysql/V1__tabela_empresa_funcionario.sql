CREATE TABLE `empresa` (
`id` bigint(20) NOT NULL,
`cnpj` varchar(255) NOT NULL,
`data_atualizacao` datetime NOT NULL,
`data_criacao` datetime NOT NULL,
`razao_social` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `empresa`
ADD PRIMARY KEY (`id`);

ALTER TABLE `empresa`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

CREATE TABLE `funcionario` (
  `id` bigint(20) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `cpf` varchar(255) NOT NULL,
  `valor_hora` double NOT NULL,
  `qtd_horas_trabalho_dia` float NOT NULL,
  `qtd_horas_almoco` float NOT NULL,
  `perfil` varchar(255) NOT NULL,
  `data_criacao` datetime NOT NULL,
  `data_atualizacao` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `funcionario`
	ADD PRIMARY KEY (`id`);
	
ALTER TABLE `funcionario`
	MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;