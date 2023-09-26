package br.ucsal.lab.tarefas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TarefaPrazo extends Tarefa {

    private static DateTimeFormatter formatter	= DateTimeFormatter.ofPattern("dd/MM/yyyy");	
    
    private LocalDate data;
    
    public TarefaPrazo(String titulo,String descricao,LocalDate data) {
    		
    	
    }
    public TarefaPrazo(String titulo,String descricao,LocalDate data) {
       this(titulo,descricao,LocalDate.parse(data, formatter));
		
	}
    public LocalDate getData() {
return data;
}
    public void setData(LocalDate data){  
    	this.data=data;
}}
