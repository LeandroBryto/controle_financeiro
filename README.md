Estrutura do Projeto

Modelo:
Expense.java: Classe que representa uma despesa.
Income.java: Classe que representa uma renda.
Balance.java: Classe que representa o balanço financeiro.

Repositório:
ExpenseRepository.java: Interface para operações de banco de dados relacionadas a despesas.
IncomeRepository.java: Interface para operações de banco de dados relacionadas a rendas.

Serviço:
FinanceService.java: Classe que contém a lógica de negócios.

Controlador:
FinanceController.java: Classe que gerencia as requisições HTTP e retorna as respostas.

Templates Thymeleaf:
index.html: Página inicial.
add-expense.html: Formulário para adicionar despesas.
add-income.html: Formulário para adicionar rendas.
balance.html: Página para exibir o balanço financeiro.
@Entity: Anotação que marca a classe como uma entidade JPA (Java Persistence API), permitindo que ela seja persistida no banco de dados.
@Id: Anotação que define a chave primária da entidade.
@GeneratedValue(strategy = GenerationType.AUTO): Especifica que o valor da chave primária será gerado automaticamente.
Long id: Identificador único para cada despesa.
String name: Nome da despesa.
double amount: Valor da despesa.
@Service: Anotação que marca a classe como um serviço, permitindo a injeção de dependência.
@Autowired: Injeção automática das dependências ExpenseRepository e IncomeRepository.
addExpense(Expense expense): Método que salva uma nova despesa no banco de dados.
addIncome(Income income): Método que salva uma nova renda no banco de dados.
getBalance(): Método que calcula o balanço financeiro, somando todas as rendas e despesas, e retorna um objeto Balance.
@Controller: Anotação que marca a classe como um controlador Spring MVC.
@Autowired: Injeção automática do serviço FinanceService.
@GetMapping("/"): Mapeia a URL raiz para o método index, que retorna a página inicial index.html.
@GetMapping("/add-expense"): Mapeia a URL para exibir o formulário de adicionar despesas.
@PostMapping("/api/finance/expense"): Mapeia a URL para adicionar uma despesa.
@GetMapping("/add-income"): Mapeia a URL para exibir o formulário de adicionar rendas.
@PostMapping("/api/finance/income"): Mapeia a URL para adicionar uma renda.
@GetMapping("/balance"): Mapeia a URL para exibir o balanço financeiro.

URL: http://localhost:8080
