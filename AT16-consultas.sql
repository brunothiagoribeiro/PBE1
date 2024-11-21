DROP DATABASE IF EXISTS SENAIdev_db;

CREATE DATABASE SENAIdev_db;

USE SENAIdev_db;

CREATE TABLE funcionarios (
    Codigo VARCHAR(10) PRIMARY KEY,
    PrimeiroNome VARCHAR(50),
    SegundoNome VARCHAR(50),
    UltimoNome VARCHAR(50),
    DataNasci DATE,
    CPF VARCHAR(14),
    RG VARCHAR(10),
    Endereco VARCHAR(100),
    CEP VARCHAR(10),
    Cidade VARCHAR(50),
    Fone VARCHAR(20),
    Funcao VARCHAR(50),
    Salario DECIMAL(10, 2)
);

INSERT INTO Funcionarios (Codigo, PrimeiroNome, SegundoNome, UltimoNome, DataNasci, CPF, RG, Endereco, CEP, Cidade, Fone, Funcao, Salario)
VALUES
('COD001', 'João', 'Silva', 'Santos', '1980-10-05', '123.456.789-00', '12345678-9', 'Rua A', '12345-678', 'São Paulo', '(11) 1234-5678', 'Gerente', 5000.00),
('COD002', 'Maria', 'Oliveira', 'Souza', '1995-08-15', '987.654.321-00', '98765432-1', 'Av. B', '54321-098', 'Rio de Janeiro', '(21) 9876-5432', 'Analista', 3500.00),
('COD003', 'Carlos', 'Pereira', 'Lima', '1988-03-20', '456.789.012-00', '45678901-2', 'Rua C', '98765-432', 'Belo Horizonte', '(31) 6543-2109', 'Desenvolvedor', 4000.00),
('COD004', 'Ana', 'Santos', 'Costa', '1976-05-11', '654.321.098-00', '65432109-8', 'Av. D', '34567-890', 'Salvador', '(71) 8901-2345', 'Analista', 3800.00),
('COD005', 'Luiz', 'Oliveira', 'Rodrigues', '1990-09-25', '234.567.890-00', '23456789-0', 'Rua E', '45678-901', 'Recife', '(81) 5678-1234', 'Analista', 3700.00),
('COD006', 'Fernanda', 'Santos', 'Almeida', '1985-06-30', '543.210.987-00', '54321098-7', 'Av. F', '67890-123', 'Brasília', '(61) 4321-0987', 'Designer', 3200.00),
('COD007', 'Ricardo', 'Lima', 'Oliveira', '1993-04-17', '789.012.345-00', '78901234-6', 'Rua G', '78901-234', 'Porto Alegre', '(51) 2109-8765', 'Analista', 3600.00),
('COD008', 'Juliana', 'Almeida', 'Costa', '1982-12-22', '901.234.567-00', '90123456-5', 'Av. H', '89012-345', 'Curitiba', '(41) 9876-5432', 'Gerente', 5200.00),
('COD009', 'Marcos', 'Costa', 'Silva', '1979-08-07', '345.678.901-00', '34567890-3', 'Rua I', '45678-012', 'Fortaleza', '(85) 6543-2109', 'Desenvolvedor', 4100.00),
('COD010', 'Vanessa', 'Rodrigues', 'Oliveira', '1998-12-02', '678.901.234-00', '67890123-4', 'Av. J', '56789-123', 'Manaus', '(92) 3210-9876', 'Analista', 3800.00),
('COD011', 'Pedro', 'Souza', 'Lima', '1984-10-29', '890.123.456-00', '89012345-6', 'Rua K', '45678-234', 'São Luís', '(98) 8765-4321', 'Analista', 3700.00),
('COD012', 'Amanda', 'Oliveira', 'Santos', '1991-03-14', '012.345.678-00', '01234567-8', 'Av. L', '56789-345', 'Vitória', '(27) 5432-1098', 'Designer', 3300.00),
('COD013', 'Gabriel', 'Almeida', 'Pereira', '1987-05-18', '567.890.123-00', '56789012-3', 'Rua M', '67890-456', 'Natal', '(84) 7654-3210', 'Desenvolvedor', 4200.00),
('COD014', 'Renata', 'Silva', 'Oliveira', '1977-08-23', '901.234.567-00', '90123456-7', 'Av. N', '78901-234', 'João Pessoa', '(83) 5432-1098', 'Gerente', 5100.00),
('COD015', 'Thiago', 'Costa', 'Rodrigues', '1983-06-01', '234.567.890-00', '23456789-1', 'Rua O', '89012-345', 'Florianópolis', '(48) 8765-4321', 'Analista', 3600.00),
('COD016', 'Mariana', 'Lima', 'Oliveira', '1996-11-09', '678.901.234-00', '67890123-5', 'Av. P', '12345-678', 'Campo Grande', '(67) 3210-9876', 'Analista', 3800.00),
('COD017', 'André', 'Oliveira', 'Souza', '1981-07-27', '890.123.456-00', '89012345-8', 'Rua Q', '23456-789', 'Teresina', '(86) 6543-2109', 'Desenvolvedor', 4100.00),
('COD018', 'Camila', 'Santos', 'Costa', '1992-03-04', '012.345.678-00', '01234567-9', 'Av. R', '45678-901', 'Maceió', '(82) 9876-5432', 'Analista', 3700.00),
('COD019', 'Lucas', 'Costa', 'Silva', '1986-09-12', '345.678.901-00', '34567890-4', 'Rua S', '78901-234', 'Porto Velho', '(69) 2109-8765', 'Analista', 3700.00),
('COD020', 'Isabela', 'Rodrigues', 'Lima', '1990-02-19', '678.901.234-00', '67890123-6', 'Av. T', '01234-567', 'Cuiabá', '(65) 6543-2109', 'Designer', 3400.00),
('COD021', 'Rafael', 'Almeida', 'Oliveira', '1984-06-26', '901.234.567-00', '90123456-8', 'Rua U', '23456-789', 'Natal', '(84) 3210-9876', 'Analista', 3800.00),
('COD022', 'Bruna', 'Lima', 'Pereira', '1978-01-10', '234.567.890-00', '23456789-2', 'Av. V', '45678-901', 'Vitória', '(27) 5432-1098', 'Gerente', 5200.00),
('COD023', 'Guilherme', 'Oliveira', 'Santos', '1994-07-12', '567.890.123-00', '56789012-4', 'Rua W', '78901-234', 'Curitiba', '(41) 8765-4321', 'Desenvolvedor', 4100.00),
('COD024', 'Larissa', 'Almeida', 'Costa', '1989-11-13', '890.123.456-00', '89012345-9', 'Av. X', '01234-567', 'Belém', '(91) 3210-9876', 'Analista', 3800.00),
('COD025', 'Gustavo', 'Costa', 'Oliveira', '1985-02-08', '012.345.678-00', '01234567-0', 'Rua Y', '23456-789', 'Manaus', '(92) 5432-1098', 'Designer', 3300.00),
('COD026', 'Patricia', 'Silva', 'Lima', '1980-03-28', '345.678.901-00', '34567890-5', 'Av. Z', '56789-012', 'Goiânia', '(62) 9876-5432', 'Analista', 3600.00),
('COD027', 'Marcos', 'Oliveira', 'Santos', '1987-04-09', '678.901.234-00', '67890123-7', 'Rua AA', '01234-567', 'Florianópolis', '(48) 6543-2109', 'Analista', 3800.00),
('COD028', 'Amanda', 'Santos', 'Oliveira', '1982-10-07', '901.234.567-00', '90123456-9', 'Av. BB', '23456-789', 'Recife', '(81) 3210-9876', 'Desenvolvedor', 4200.00),
('COD029', 'Felipe', 'Costa', 'Lima', '1993-05-16', '123.456.789-00', '12345678-1', 'Rua CC', '56789-012', 'São Paulo', '(11) 5432-1098', 'Analista', 3700.00),
('COD030', 'Marina', 'Lima', 'Oliveira', '1988-08-21', '654.321.098-00', '65432109-0', 'Av. DD', '01234-567', 'Brasília', '(61) 8765-4321', 'Analista', 3800.00);

SELECT * FROM Funcionarios;

-- 1. Selecione o número de funcionários que têm CPF cadastrado e cujo salário seja superior a 4000.
	SELECT codigo, cpf
    FROM funcionarios
    WHERE Salario > 4000.00;
-- 2. Selecione o salário máximo entre os funcionários que nasceram entre 1980 e 1990.//
SELECT MAX(Salario)
FROM funcionarios
WHERE DataNasci >= 1980 OR DataNasci <=1990;
-- 3. Selecione a média de salários dos funcionários que trabalham como Analista.
SELECT AVG (Salario)
FROM funcionarios
WHERE funcao = "Analista";
-- 4. Selecione o número de funcionários que têm "Oliveira" em seu sobrenome.
SELECT COUNT(Codigo)
FROM funcionarios
WHERE SegundoNome = "Oliveira"OR UltimoNome ="Oliveira";
-- 5. Selecione o salário médio dos funcionários que trabalham em São Paulo.
SELECT AVG(Salario)
FROM funcionarios
WHERE cidade = "São Paulo";
-- 6. Selecione o número de funcionários que têm um salário diferente de 3800.
SELECT COUNT(Salario)
FROM funcionarios
WHERE salario != 3000.00;
-- 7. Selecione o salário-mínimo entre os funcionários que não têm CPF cadastrado.
SELECT MIN(Salario)
FROM funcionarios
WHERE cpf  IS NULL;
-- 8. Selecione a soma dos salários dos funcionários que nasceram depois de 1990.
SELECT SUM(Salario)
FROM funcionarios
WHERE DataNasci > 1990;
-- 9. Selecione o número de funcionários que trabalham como Gerente E têm salário igual a 5000.
SELECT COUNT(Codigo)
FROM funcionarios
WHERE funcao = "Gerente" AND Salario = 5000.00;
-- 10. Selecione o salário máximo entre os funcionários que nasceram antes de 1985 E têm CPF cadastrado.
SELECT MAX(Salario)
FROM funcionarios
WHERE DataNasci < 1985 OR CPF IS NOT NULL;

-- 11. Selecione a média de salários dos funcionários que trabalham como Desenvolvedor OU têm salário superior a 4200.
SELECT AVG(Salario)
FROM funcionarios
WHERE funcao = "Desenvolvedor" OR Salario > 4200.00;
-- 12. Selecione o número de funcionários que têm "Almeida" como parte do nome do endereço OU têm salário inferior a 3500.
SELECT COUNT(Codigo)
FROM funcionarios
WHERE SegundoNome = "Almeida" AND UltimoNome = "Almeida" OR Salario < 3500.00;
-- 13. Selecione o salário-mínimo entre os funcionários que trabalham como Designer E têm CPF cadastrado.
SELECT MIN(Salario)
FROM funcionarios
WHERE funcao = "Designer" AND cpf IS NOT NULL;

-- 14. Selecione a soma dos salários dos funcionários que trabalham como Analista OU têm salário acima de 4000.
SELECT SUM(Salario)
FROM funcionarios
WHERE funcao = "Analista" OR salario >= 4000.00;
-- 15. Selecione o número de funcionários que têm um salário igual a 3600 OU trabalham em Curitiba.
SELECT COUNT(Codigo)
FROM funcionarios
WHERE salario = 3600 or Cidade = "Curitiba";