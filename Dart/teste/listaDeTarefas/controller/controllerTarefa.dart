import 'dart:io';

import '../model/tarefa.dart';

class ControllerTarefa {
  List<Tarefa> tarefas = [];

  bool _verificarExistencia(String titulo) {
    return tarefas.any((tarefa) => tarefa.titulo == titulo);
  }

  void adicionar(String titulo, [String? descricao]) {
    try {
      if(titulo.isEmpty) throw Exception("Título da tarefa não pode ser vazio.");
      if(titulo.length >= 15) throw Exception("Limite de caracteres do título atingido.");
      if(_verificarExistencia(titulo)) throw Exception("Tarefa com este título já existe.");

      tarefas.add(Tarefa(titulo, descricao));
    } catch (e) {
      stderr.writeln("Erro ao adicionar tarefa: $e");
    }
  }

  void remover(String tarefa) {
    try {
      if(tarefas.length <= 0) throw Exception("Lista de tarefas está vazia.");
      if(!_verificarExistencia(tarefa)) throw Exception("Tarefa não encontrada na lista.");

      tarefas.remove(tarefa);
    } catch (e) {
      stderr.writeln("Erro ao remover tarefa: $e");
    }
  }

  void concluir(String titulo){
    try {
      if(!_verificarExistencia(titulo)) throw Exception("Tarefa não encontrada na lista.");

      Tarefa tarefa = tarefas.firstWhere((t) => t.titulo == titulo);
      tarefa.concluir();
    } catch (e) {
      stderr.writeln("Erro ao concluir tarefa: $e");
    }
  }

  void retomar(String titulo) {
    try {
      if(!_verificarExistencia(titulo)) throw Exception("Tarefa não encontrada na lista.");

      Tarefa tarefa = tarefas.firstWhere((t) => t.titulo == titulo);
      tarefa.desmarcarConcluida();
    } catch (e) {
      stderr.writeln("Erro ao retomar tarefa: $e");
    }
  }

  void editarDescricao(String titulo, String novaDescricao) {
    try {
      if(!_verificarExistencia(titulo)) throw Exception("Tarefa não encontrada na lista.");
      if(novaDescricao.isEmpty) throw Exception("Descrição não pode ser vazia.");

      Tarefa tarefa = tarefas.firstWhere((t) => t.titulo == titulo);
      tarefa.descricao = novaDescricao;
    } catch (e) {
      stderr.writeln("Erro ao editar descrição: $e");
    }
  }

  void editarTitulo(String tituloAntigo, String tituloNovo) {
    try {
      if(!_verificarExistencia(tituloAntigo)) throw Exception("Tarefa não encontrada na lista.");
      if(tituloNovo.isEmpty) throw Exception("Título não pode ser vazio.");
      if(tituloNovo.length >= 15) throw Exception("Limite de caracteres do título atingido.");
      if(_verificarExistencia(tituloNovo)) throw Exception("Já existe uma tarefa com este título.");

      Tarefa tarefa = tarefas.firstWhere((t) => t.titulo == tituloAntigo);
      tarefa.titulo = tituloNovo;
    } catch (e) {
      stderr.writeln("Erro ao editar título: $e");
    }
  }

  String buscar(String titulo){
    try {
      if(!_verificarExistencia(titulo)) throw Exception("Tarefa não encontrada na lista.");

      return tarefas.firstWhere((t) => t.titulo == titulo).mostrar();
    } catch (e) {
      stderr.writeln("Erro ao buscar tarefa: $e");
      rethrow;
    }
  }

  String listar() {
    if (tarefas.isEmpty) {
      return "Nenhuma tarefa cadastrada.";
    }

    StringBuffer buffer = StringBuffer();
    for (var tarefa in tarefas) {
      buffer.writeln(tarefa.mostrar() + "\n");
    }
    return buffer.toString();
  }
}
