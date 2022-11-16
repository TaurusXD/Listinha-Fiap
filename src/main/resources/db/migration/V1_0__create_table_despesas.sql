CREATE TABLE tb_despesas (
  id INT AUTO_INCREMENT NOT NULL,
   name VARCHAR(255),
   categoria VARCHAR(255),
   status VARCHAR(255),
   valor DECIMAL(10,2),
   data_vencimento TIMESTAMP,
   descricao VARCHAR(255),
   created_date TIMESTAMP NOT NULL,
   last_modified_date TIMESTAMP NOT NULL,
   CONSTRAINT pk_tb_despesas PRIMARY KEY (id)
);