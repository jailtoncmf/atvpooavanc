package br.ucsal.lab.tarefas;



public class Programa{
	
	public static void main(String[] args) {

	Lista listaTarefas = new Lista();
	listaTarefas.adicionarTarefa("Estudar 00", "Devo estudar 00");	
	listaTarefas.adicionarTarefa("Tomar Café", "Tomar Café", true);			
	listaTarefas.adicionarTarefa("Ouvir musica","Ouvir Rock", true);			
    
	TarefaPrazo tarefaPrazo = new TarefaPrazo("Viagem","Para Aracaju","10/10/2020");
	listaTarefas.adicionarTarefa(tarefaPrazo);
	
	for(Tarefa tarefa : listaTarefas.getTarefas()) {
		System.out.println(tarefa);
		
	}
	
	// new InterfaceGrafica(listaTarefas);
			}
	}

