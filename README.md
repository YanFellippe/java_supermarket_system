# Sistema de Vendas e Cadastro de Funcionários - Mercado

Este é um sistema desenvolvido em Java, utilizando o NetBeans IDE, para gerenciar vendas e o cadastro de funcionários em um mercado. O projeto inclui funcionalidades como controle de estoque, registro de vendas e cadastro/consulta de funcionários.

---

## 📋 Funcionalidades

1. **Gestão de Vendas**:
   - Registro de vendas.
   - Relatórios de vendas diárias, semanais e mensais.
   - Consulta de histórico de vendas.

2. **Cadastro de Funcionários**:
   - Adicionar, editar e excluir funcionários.
   - Gerenciar funções e permissões.

3. **Controle de Estoque**:
   - Adicionar e atualizar produtos.
   - Consulta de estoque disponível.
   - Alerta de produtos com baixa quantidade.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java SE 8+
- **IDE**: NetBeans IDE
- **Banco de Dados**: MySQL
- **Frameworks**: JDBC para integração com o banco de dados
- **Bibliotecas adicionais**: 
  - JasperReports para geração de relatórios
  - JCalendar para seleção de datas
  - JSwing para criação de interfaces gráficas para aplicações

---

## 🚀 Como Executar o Projeto

### Pré-requisitos:
- Java Development Kit (JDK) instalado.
- NetBeans IDE configurado.
- Servidor MySQL em execução.

### Configuração Inicial:
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/sistema-mercado.git
2. Abra o projeto no NetBeans.

3. Configure a conexão com o banco de dados:
  . Crie o banco de dados usando o arquivo database.sql fornecido na pasta db.
  . Atualize as credenciais de conexão no arquivo DBConnection.java:
  ```bash
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_mercado";
    private static final String USER = "seu_usuario";
    private static final String PASSWORD = "sua_senha";
  ```
4. Execute o projeto pressionando F6 ou clicando em Run Project.

src/
├── model/         # Classes que representam os dados (Produtos, Funcionários, Vendas)
├── controller/    # Lógica de negócio e integração com o banco de dados
├── view/          # Interfaces gráficas desenvolvidas com Swing
db/
└── database.sql   # Arquivo para criação do banco de dados

