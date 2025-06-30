import '../controller/controllerTarefa.dart';

void main(){
  // Criação de uma instância do ControllerTarefa
  final controller = ControllerTarefa();

  print('\n--- TESTE: Adicionar tarefa válida ---');
  controller.adicionar('Estudar', 'Revisar Dart');
  assert(controller.tarefas.length == 1);
  print('✅ Passou\n');

  print('--- TESTE: Adicionar tarefa duplicada ---');
  controller.adicionar('Estudar', 'Duplicada');
  assert(controller.tarefas.length == 1); // Não adiciona duplicada
  print('✅ Passou\n');

  print('--- TESTE: Adicionar tarefa com título vazio ---');
  controller.adicionar('', 'Sem título');
  assert(controller.tarefas.length == 1); // Não adiciona
  print('✅ Passou\n');

  print('--- TESTE: Adicionar tarefa com título longo ---');
  controller.adicionar('123456789012345', 'Muito longa'); // 15+ caracteres
  assert(controller.tarefas.length == 1); // Não adiciona
  print('✅ Passou\n');

  print('--- TESTE: Buscar tarefa existente ---');
  final tarefaEncontrada = controller.buscar('Estudar');
  assert(tarefaEncontrada.contains('Estudar'));
  print('✅ Passou\n');

  print('--- TESTE: Buscar tarefa inexistente ---');
  try {
    controller.buscar('Nada');
    print('❌ Erro: deveria lançar exceção');
  } catch (e) {
    print('✅ Passou: $e\n');
  }

  print('--- TESTE: Concluir tarefa ---');
  controller.concluir('Estudar');
  assert(controller.tarefas[0].verificarConcluida() == true);
  print('✅ Passou\n');

  print('--- TESTE: Retomar tarefa ---');
  controller.retomar('Estudar');
  assert(controller.tarefas[0].verificarConcluida() == false);
  print('✅ Passou\n');

  print('--- TESTE: Editar descrição ---');
  controller.editarDescricao('Estudar', 'Nova descrição');
  assert(controller.tarefas[0].descricao == 'Nova descrição');
  print('✅ Passou\n');

  print('--- TESTE: Editar título para novo válido ---');
  controller.editarTitulo('Estudar', 'Ler');
  assert(controller.tarefas[0].titulo == 'Ler');
  print('✅ Passou\n');

  print('--- TESTE: Editar título para duplicado ---');
  controller.adicionar('Novo', 'teste');
  controller.editarTitulo('Ler', 'Novo'); // Já existe
  assert(controller.tarefas[0].titulo == 'Ler'); // Não alterou
  print('✅ Passou\n');

  print('--- TESTE: Remover tarefa existente ---');
  controller.remover('Novo');
  assert(controller.tarefas.length == 1);
  print('✅ Passou\n');

  print('--- TESTE: Remover tarefa inexistente ---');
  controller.remover('Nada');
  assert(controller.tarefas.length == 1); // Não remove
  print('✅ Passou\n');

  print('--- TESTE: Listar tarefas ---');
  final lista = controller.listar();
  assert(lista.contains('Ler'));
  print('✅ Passou\n');

  print('--- TODOS OS TESTES FORAM EXECUTADOS ✅ ---');
}