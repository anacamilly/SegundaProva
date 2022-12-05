# Segunda Prova - Programação para Dispositivos Móveis
![Badge em Concluido](http://img.shields.io/static/v1?label=STATUS&message=%20CONCLUIDO&color=GREEN&style=for-the-badge)

1 - Crie o aplicativo “SegundaProva” que deve funcionar para dispositivos com “Android KitKat” ou 
superior. Altere o layout da MainActivity para adicionar um NavHostFragment. Crie um fragment 
chamado HomeFragment. Crie o arquivo de navegação contendo o HomeFragment como destino 
inicial da aplicação.

2 - Defina a data class do seu tema. Lembre-se de criar pelo menos 6 atributos. Use pelo menos 2 
tipos diferentes (Strings, Inteiros, Long etc.). Implemente o uso de banco de dados utilizando a 
biblioteca ROOM. Você deve implementar métodos para: cadastrar, editar, listar todos, listar por ID,
excluir, excluir todos. Você deve implementar Coroutines para realizar suas buscas. Utilize o tipo de 
dados Flow quando necessário.

3 - Adicione a biblioteca do Hilt e utilize Injeção de dependências para Repositórios e ViewModels. 
Ative o uso de Data Binding e utilize sempre que possível. 

4 - Adicione um RecyclerView ao HomeFragment. Implemente o respectivo 
ListAdapter(androidx.recyclerview.widget.ListAdapter) e RecyclerView.ViewHolder. Os dados que 
deverão ser adaptados devem ser obtidos através de uma busca no banco (listar todos). Implemente 
o binding do adapter utilizando Data Binding. Você deve adicionar um ViewModel ao HomeFragment
e os dados deverão ser adicionados ao adapter através de um Observer para LiveData. Lembre-se 
do uso das Coroutines para a realização das buscas. 

5 - Crie um fragment chamado CadastraFragment e seu respectivo ViewModel que possui um 
formulário para cadastro de registros. Os dados do formulário (objeto da sua classe do tema 
escolhido) devem estar no ViewModel desse fragment. Adicione um botão “Cadastrar” que deve 
salvar o registro no banco de dados. Utilize Data Binding e twoway-databinding no XML. Após o 
cadastro navegue para o HomeFragment exibindo um Toast que informa que o cadastro foi realizado 
com sucesso. 

6 - Crie um fragment chamado AlteraFragment e seu respectivo ViewModel que recebe como 
parâmetro um ID e possui um formulário. Carregue os dados do banco através de uma busca por ID
para preencher o formulário. Adicione um botão “Confirmar” que deve atualizar o registro no banco de 
dados. Utilize Data Binding e twoway-databinding no XML. Após a alteração navegue para o 
HomeFragment exibindo um Toast que informa que a alteração foi realizada com sucesso. 

7 - Crie um fragment chamado DetalhesFragment e seu respectivo ViewModel que recebe como 
parâmetro um ID e possui textViews com os dados do registro. Carregue os dados do banco através 
de uma busca por ID. 

8 - Implemente um RecyclerView.OnItemTouchListener para que com um toque simples a aplicação 
navegue para o DetalhesFragment e com o toque longo a aplicação navegue para o AlteraFragment.

9 - Crie um fragment chamado SobreFragment que mantem informações estáticas sobre o 
desenvolvedor do aplicativo. Adicione ao seu aplicativo uma NavigationDrawer que deve apresentar
um layout de header (com pelo menos uma imagem e o nome do tema) e links de navegação para o 
CadastraFragment e o SobreFragment. 

## Colaboradores:
| [<img src="https://avatars.githubusercontent.com/u/90116902?v=4" width=115><br><sub>Ana Camilly Guedes</sub>](https://github.com/anacamilly) | [<img src="https://avatars.githubusercontent.com/u/93331493?v=4" width=115><br><sub>Lucas Barros Pelinca</sub>](https://github.com/lucasbpc2002) | [<img src="https://avatars.githubusercontent.com/u/97137396?v=4" width=115><br><sub>Tiago Barros Silva</sub>](https://github.com/tiagobarrossilva) |
| :---: | :---: | :---: |
