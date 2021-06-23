package br.edu.insper.desagil.backend.model;

import java.util.HashMap;
import java.util.Map;

public class Media {
	private String name;
	private int duration;
	private Map<String, Integer> ratings;
	
	public Media(String name, int duration) {
		super();
		this.name = name;
		this.duration = duration;
		this.ratings = new HashMap<>();
	}

	public String getName() {
		return name;
	}


	public int getDuration() {
		return duration;
	}
	
	public String getDurationString() {
		int duracao = this.duration;
		int hora = 0;
		int min = 0;
		while (duracao >= 3600) {
			if (duracao >= 3600) {
				duracao -= 3600;
				hora += 1;
			}
		}
		while (duracao >= 60) {
			if (duracao >= 60) {
				duracao -= 60;
				min += 1;
			}
		}
		if(duracao<10 && min<10) {
			return hora+":"+"0"+min+":"+"0"+duracao;
		}
		if (duracao<10) {
			return hora+":"+min+":"+"0"+duracao;
		}
		if (min<10) {
			return hora+":"+"0"+min+":"+duracao;
		}else {
			return hora+":"+min+":"+duracao;
		}
	}
	
	public void putRating(String nome, int avaliacao) {
		ratings.put(nome, avaliacao);
		
	}
	
	public void numberRatings() {
		this.ratings.size();
	}
	
	public double averageRatings() {
		double total = 0.0;
		for (int nota: this.ratings.values()) {
			total+=nota;
		}
		if (ratings.size() != 0) {
			total = total/this.ratings.size();
			return total;
		}else {
			return 0.0;
		}
		
	}

	
	
	

}
