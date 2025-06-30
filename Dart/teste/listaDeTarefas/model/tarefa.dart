class Tarefa{
  String titulo;
  String? descricao;
  bool _concluida = false;
  DateTime dataCriacao = DateTime.now();

  Tarefa(this.titulo, [this.descricao]);
  
  String mostrar() {
    return 'Tarefa {\n  titulo: $titulo, \n  descricao: $descricao, \n  concluida: $_concluida ,\n   dataCriacao: $dataCriacao\n}';
  }

  void concluir(){
    _concluida = true;
  }
  void desmarcarConcluida() {
    _concluida = false;
  }
  
  bool verificarConcluida() {
    return _concluida;
  }
}