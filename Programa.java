package br.ucsal.lab.tarefas;



public class Programa{
	
	public static void main(String[] args) {

	Lista listaTarefas = new Lista();
	listaTarefas.adicionarTarefa("Estudar 00", "Devo estudar 00");	
	listaTarefas.adicionarTarefa("Tomar Café", "Tomar Café", true);			
	listaTarefas.adicionarTarefa("Ouvir musica","Ouvir Rock", true);			
    new InterfaceGrafica(listaTarefas);
			}
	}


