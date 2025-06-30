import 'dart:io';

import '../controller/controllerTarefa.dart';

void menu(ControllerTarefa controllerTarefa){
  _mostrarMenu();
  var opicao = 0;

  do {
    print("\nDigite a opção desejada: ");
    opicao = int.parse(stdin.readLineSync()!);

    switch (opicao) {
      case 1:
        print("Digite o título da tarefa: ");
        String titulo = stdin.readLineSync()!;
        print("Digite a descrição da tarefa (opcional): ");
        String? descricao = stdin.readLineSync();
        controllerTarefa.adicionar(titulo, descricao);
        break;
      case 2:
        print("Digite o título da tarefa a ser removida: ");
        String tituloRemover = stdin.readLineSync()!;
        controllerTarefa.remover(tituloRemover);
        break;
      case 3:
        print("Digite o título da tarefa a ser concluída: ");
        String tituloConcluir = stdin.readLineSync()!;
        controllerTarefa.concluir(tituloConcluir);
        break;
      case 4:
        print("Digite o título da tarefa a ser retomada: ");
        String tituloRetomar = stdin.readLineSync()!;
        controllerTarefa.retomar(tituloRetomar);
        break;
      case 5:
        print("Digite o título da tarefa a ser editada: ");
        String tituloEditar = stdin.readLineSync()!;
        print("Digite a nova descrição da tarefa: ");
        String novaDescricao = stdin.readLineSync()!;
        controllerTarefa.editarDescricao(tituloEditar, novaDescricao);
        break;
      case 6:
        print(controllerTarefa.listar());
        break;
      case 7:
        _mostrarMenu();
        break;
      case 8:
        print("Saindo do menu...");
        break;
      default:
        print("Opção inválida. Tente novamente.\n7. Opções do Menu");
    }
  } while (opicao != 8);
}

void _mostrarMenu(){
  print("\nMenu de Opções:");
  print("1. Adicionar Tarefa");
  print("2. Remover Tarefa");
  print("3. Concluir Tarefa");
  print("4. Retomar Tarefa");
  print("5. Editar Descrição da Tarefa");
  print("6. Listar Tarefas");
  print("7. Opções do Menu");
  print("8. Sair");
}