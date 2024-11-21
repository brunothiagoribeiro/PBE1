DROP DATABASE IF EXISTS db_mh_sports;

CREATE DATABASE IF NOT EXISTS db_mh_sports;

USE db_mh_sports;

CREATE TABLE tb_cor (
    id_cor INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    taxa_extra DECIMAL(10, 2) DEFAULT 0.00
);

INSERT INTO tb_cor VALUES
(DEFAULT, 'Vermelho', 5.50),
(DEFAULT, 'Azul', 3.75),
(DEFAULT, 'Amarelo', DEFAULT),
(DEFAULT, 'Verde', 4.10),
(DEFAULT, 'Laranja', 6.80),
(DEFAULT, 'Roxo', 7.30),
(DEFAULT, 'Preto', 8.00),
(DEFAULT, 'Branco', DEFAULT),
(DEFAULT, 'Cinza', 3.20),
(DEFAULT, 'Rosa', 4.60);


CREATE TABLE tb_cliente (
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    primeiro_nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(50) NOT NULL,
    COR_id_cor_favorita INT,
    FOREIGN KEY (COR_id_cor_favorita) REFERENCES tb_cor(id_cor)
);

INSERT INTO tb_cliente VALUES
(DEFAULT, 'Ana', 'Silva', 1),
(DEFAULT, 'Carlos', 'Oliveira', 2),
(DEFAULT, 'Beatriz', 'Souza', 3),
(DEFAULT, 'Fernando', 'Almeida', 4),
(DEFAULT, 'Mariana', 'Ferreira', 5),
(DEFAULT, 'João', 'Pereira', 6),
(DEFAULT, 'Camila', 'Costa', 7),
(DEFAULT, 'Pedro', 'Nascimento', NULL),
(DEFAULT, 'Larissa', 'Lima', NULL),
(DEFAULT, 'Gabriel', 'Mendes', 10),
(DEFAULT, 'Tatiane', 'Ribeiro', 1),
(DEFAULT, 'Ricardo', 'Gonçalves', 2),
(DEFAULT, 'Renata', 'Martins', 3),
(DEFAULT, 'Luiz', 'Santos', 4),
(DEFAULT, 'Vanessa', 'Barbosa', 5),
(DEFAULT, 'Fábio', 'Monteiro', 6),
(DEFAULT, 'Juliana', 'Carvalho', 7),
(DEFAULT, 'Lucas', 'Rocha', 8),
(DEFAULT, 'Bruna', 'Vasconcelos', NULL),
(DEFAULT, 'Thiago', 'Azevedo', 10),
(DEFAULT, 'Patrícia', 'Duarte', 1),
(DEFAULT, 'André', 'Castro', 2),
(DEFAULT, 'Daniela', 'Pinto', 3),
(DEFAULT, 'Felipe', 'Moraes', 4),
(DEFAULT, 'Rafael', 'Batista', 5),
(DEFAULT, 'Cíntia', 'Cardoso', 6),
(DEFAULT, 'Marcelo', 'Farias', 7),
(DEFAULT, 'Aline', 'Cunha', 8),
(DEFAULT, 'Paulo', 'Teixeira', NULL),
(DEFAULT, 'Isabela', 'Guedes', 10);


CREATE TABLE tb_categoria (
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    CATEGORIA_id_categoria_pai INT,
    FOREIGN KEY (CATEGORIA_id_categoria_pai)
        REFERENCES tb_categoria (id_categoria)
);

INSERT INTO tb_categoria VALUES 
(DEFAULT, 'Roupas', NULL),
(DEFAULT, 'Calçados', NULL),
(DEFAULT, 'Acessórios', NULL),
(DEFAULT, 'Camisetas', 1),
(DEFAULT, 'Calças', 1),
(DEFAULT, 'Shorts', 1),
(DEFAULT, 'Tênis', 2),
(DEFAULT, 'Chinelos', 2),
(DEFAULT, 'Bonés', 3),
(DEFAULT, 'Luvas', 3);


CREATE TABLE tb_roupa (
    id_roupa INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    tamanho ENUM('S', 'M', 'L', 'XL', '2XL', '3XL') NOT NULL,
    preco DECIMAL(10, 2) NOT NULL,
    COR_id_cor INT,
    CATEGORIA_id_categoria INT,
    FOREIGN KEY (COR_id_cor) REFERENCES tb_cor(id_cor),
    FOREIGN KEY (CATEGORIA_id_categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_roupa VALUES
(DEFAULT, 'Camiseta Esportiva Básica', 'M', 49.90, 1, 4),
(DEFAULT, 'Camiseta Dry Fit', 'L', 59.90, 2, 4),
(DEFAULT, 'Camiseta Regata', 'S', 39.90, 3, 4),
(DEFAULT, 'Camiseta Manga Longa', 'XL', 69.90, 4, 4),
(DEFAULT, 'Shorts de Corrida', 'M', 45.90, 5, 6),
(DEFAULT, 'Shorts Térmico', 'L', 55.90, 6, 6),
(DEFAULT, 'Calça de Treino', 'XL', 79.90, 7, 5),
(DEFAULT, 'Calça Legging Feminina', 'M', 89.90, 8, 5),
(DEFAULT, 'Blusa Moletom Esportiva', 'L', 99.90, 9, 5),
(DEFAULT, 'Top Esportivo', 'S', 39.90, 10, 4),
(DEFAULT, 'Bermuda de Compressão', 'M', 59.90, 1, 6),
(DEFAULT, 'Jaqueta Corta-Vento', 'L', 149.90, 2, 5),
(DEFAULT, 'Regata Dry Fit Feminina', 'S', 49.90, 3, 4),
(DEFAULT, 'Camiseta UV Proteção', 'XL', 89.90, 4, 4),
(DEFAULT, 'Shorts Multiuso Masculino', 'L', 65.90, 5, 6),
(DEFAULT, 'Calça Jogger Masculina', 'M', 99.90, 6, 5),
(DEFAULT, 'Legging com Bolso', 'S', 89.90, 7, 5),
(DEFAULT, 'Moletom Canguru', 'XL', 109.90, 8, 5),
(DEFAULT, 'Vestido Esportivo Feminino', 'M', 79.90, 9, 4),
(DEFAULT, 'Blusa de Compressão', 'L', 69.90, 10, 5),
(DEFAULT, 'Shorts Feminino Básico', 'S', 49.90, 1, 6),
(DEFAULT, 'Top com Suporte', 'M', 59.90, 2, 4),
(DEFAULT, 'Calça Térmica Masculina', 'XL', 89.90, 3, 5),
(DEFAULT, 'Camiseta Polo Esportiva', 'L', 79.90, 4, 4),
(DEFAULT, 'Bermuda Tecido Leve', 'M', 55.90, 5, 6),
(DEFAULT, 'Blusa com Capuz Feminina', 'S', 99.90, 6, 5),
(DEFAULT, 'Regata Treino Avançado', 'XL', 49.90, 7, 4),
(DEFAULT, 'Camiseta Slim Fit', 'L', 59.90, 8, 4),
(DEFAULT, 'Shorts Moletom Masculino', 'M', 69.90, 9, 6),
(DEFAULT, 'Camiseta Casual Esportiva', 'S', 49.90, 10, 4);


CREATE TABLE tb_pedido_roupa (
    id_pedido INT PRIMARY KEY AUTO_INCREMENT,
    CLIENTE_id_cliente INT,
    ROUPA_id_roupa INT,
    quantidade INT NOT NULL,
    data_pedido DATE NOT NULL,
    FOREIGN KEY (CLIENTE_id_cliente) REFERENCES tb_cliente(id_cliente),
    FOREIGN KEY (ROUPA_id_roupa) REFERENCES tb_roupa(id_roupa)
);

INSERT INTO tb_pedido_roupa  VALUES
(Default, 1, 1, 2, '2024-11-01'),
(Default, 2, 2, 1, '2024-11-02'),
(Default, 3, 3, 3, '2024-11-03'),
(Default, 4, 4, 1, '2024-11-04'),
(Default, 5, 5, 2, '2024-11-05'),
(Default, 6, 6, 1, '2024-11-06'),
(Default, 7, 7, 4, '2024-11-07'),
(Default, 8, 8, 2, '2024-11-08'),
(Default, 9, 9, 1, '2024-11-09'),
(Default, 1, 10, 3, '2024-11-10'),
(Default, 2, 11, 2, '2024-11-11'),
(Default, 3, 12, 1, '2024-11-12'),
(Default, 4, 13, 3, '2024-11-13'),
(Default, 5, 14, 2, '2024-11-14'),
(Default, 6, 15, 4, '2024-11-15'),
(Default, 16, 4, 2, '2024-11-16'),
(Default, 17, 5, 1, '2024-11-17'),
(Default, 18, 6, 3, '2024-11-18'),
(Default, 19, 7, 1, '2024-11-19'),
(Default, 20, 8, 2, '2024-11-20');

-- Exercício 1: Listar todos os itens de vestuário | Exiba o nome dos itens de vestuário (nomeie a coluna como roupa), sua cor (nomeie a coluna como cor), e o sobrenome e o primeiro nome do(s) cliente(s) que comprou(aram) esse vestuário em sua cor favorita. Classifique as linhas de acordo com a cor, em ordem crescente.

SELECT 
    tb_roupa.nome AS roupa,
    tb_cor.nome AS cor,
    tb_cliente.primeiro_nome AS nome,
    tb_cliente.sobrenome
FROM
    tb_pedido_roupa
        JOIN tb_roupa ON 
			tb_roupa.id_roupa = tb_pedido_roupa.ROUPA_id_roupa
        JOIN tb_cor ON
			tb_cor.id_cor = tb_roupa.COR_id_cor
		JOIN tb_cliente ON
			tb_cliente.id_cliente = tb_pedido_roupa.CLIENTE_id_cliente
WHERE tb_cliente.COR_id_cor_favorita = tb_roupa.COR_id_cor
ORDER BY tb_cliente.primeiro_nome;

/* Explicação da Solução:
Queremos exibir valores de colunas de três tabelas diferentes (roupa, cor e cliente), incluindo informações sobre quais clientes pediram uma determinada roupa. Portanto, precisamos unir essas quatro tabelas em suas colunas relacionadas.
1.	Primeiro JOIN: Unimos a tabela pedido_roupa (pr) à tabela roupa (r) usando a coluna id_roupa de pedido_roupa e a coluna id de roupa.
2.	Segundo JOIN: Unimos a tabela cor (c) à tabela roupa (r) usando a coluna id_cor de roupa e a coluna id de cor.
3.	Terceiro JOIN: Unimos a tabela cliente (cl) à tabela pedido_roupa (pr) usando a coluna id_cliente de pedido_roupa e a coluna id de cliente.
4.	Condição no WHERE: Filtramos os resultados para incluir apenas as roupas cujas cores correspondem às cores favoritas dos clientes (cl.id_cor_favorita = r.id_cor).
5.	Ordenação: Ordenamos os resultados em ordem crescente de cor. */

-- Exercício 2: Obter todos os clientes que não estão comprando | Selecione o sobrenome e o primeiro nome dos clientes e o nome de sua cor favorita para clientes que ainda não realizaram nenhum pedido.
SELECT
	cl.primeiro_nome AS nome,
    cl.sobrenome,
    c.nome AS Cor_Favorita
FROM tb_cliente cl
	Join tb_cor c
		ON c.id_cor = cl.COR_id_cor_favorita
	LEFT JOIN tb_pedido_roupa pd
		ON pd.CLIENTE_id_cliente = cl.id_cliente
WHERE pd.CLIENTE_id_cliente IS NULL;

/* Explicação da Solução:
1.	Unimos as tabelas cliente e cor: Para obter o nome da cor favorita do cliente, unimos as tabelas cliente (cl) e cor (c) usando as colunas id_cor_favorita de cliente e id de cor.
2.	LEFT JOIN com pedido_roupa: Unimos as tabelas pedido_roupa (pr) e cliente (cl) usando as colunas id_cliente de pedido_roupa e id de cliente.
3.	Filtramos clientes sem pedidos: Usamos a condição pr.id_cliente IS NULL na cláusula WHERE para incluir apenas os clientes que não possuem registros na tabela pedido_roupa. */

-- Exercício 3: Selecionar todas as categorias principais e suas subcategorias | Selecione o nome das categorias principais (com NULL na coluna id_categoria_pai) e o nome de suas subcategorias diretas (se houver). Nomeie a categoria principal como categoria e a subcategoria como subcategoria.

SELECT
	c1.nome AS Categoria,
    c2.nome AS SubCategoria
FROM tb_categoria c1
LEFT JOIN tb_categoria c2
ON c1.id_categoria = c2.CATEGORIA_id_categoria_pai
WHERE c1.CATEGORIA_id_categoria_pai IS NULL;

/*1.	Self JOIN: A tabela categoria é unida a si mesma. Nomeamos as duas instâncias da tabela como c1 (categorias principais) e c2 (subcategorias).
2.	Condição de Subcategoria: Na cláusula ON, vinculamos c2.id_categoria_pai a c1.id, garantindo que as subcategorias correspondam às categorias principais.
3.	Filtragem: Limitamos os resultados para incluir apenas categorias principais (c1.id_categoria_pai IS NULL).
*/

/* 
Explicação da Solução:
Self JOIN: A tabela categoria é unida a si mesma. Nomeamos as duas instâncias da tabela como c1 (categorias principais) e c2 (subcategorias).
Condição de Subcategoria: Na cláusula ON, vinculamos c2.id_categoria_pai a c1.id, garantindo que as subcategorias correspondam às categorias principais.
Filtragem: Limitamos os resultados para incluir apenas categorias principais (c1.id_categoria_pai IS NULL).
*/

-- Exercício 4: Crie uma view chamada vw_detalhes_pedidos que exibe o nome completo do cliente (como nome_completo), o nome da roupa, a cor da roupa, a quantidade e a data do pedido.
CREATE VIEW vw_detalhes_pedidos AS 
SELECT 
	cliente.primeiro_nome AS nome,
    cliente.sobrenome AS sobrenome,
    roupa.nome AS nome_roupa,
	pedido.quantidade AS quantidade_pedido,
    pedido.data_pedido AS data_pedido
    FROM tb_clientes 
		JOIN tb_roupa 
        ON	roupa.COR_id_cor = tb_cor.id_cor
        JOIN tb_pedido_roupa 
        ON roupa.id_roupa = pd.ROUPA_id_roupa
        JOIN tb_pedido_roupa 
        ON cliente.id_cliente = pd.CLIENTE_id_cliente;
	SELECT * FROM vw_detalhes_pedidos;
-- Exercício 5: Usando a view vw_detalhes_pedidos, liste todos os pedidos de roupas na cor "Vermelho".

-- Exercício 6: Liste os nomes das categorias principais e suas respectivas roupas disponíveis. A saída deve conter o nome da categoria principal, o nome da subcategoria (se existir), e o nome da roupa.

-- Exercício 7: Crie uma view chamada vw_cores_populares que lista as cores com o total de roupas vendidas para cada uma.

-- Exercício 8: Usando a view vw_cores_populares, liste as cores que venderam mais de 10 itens no total.

-- Exercício 9:  Liste o nome completo dos clientes, o nome da roupa e a data do pedido para pedidos realizados entre "2024-11-01" e "2024-11-10".

-- Exercício 10: Liste o nome completo dos clientes, o nome da roupa comprada, e a categoria principal da roupa. Mostre apenas os pedidos feitos por clientes cuja cor favorita está disponível na roupa comprada.