package controller;

import docarmo.ListaObject.ListaEncadeadaObj;
import model.music;

public class MusicController {

	public MusicController() {
		super();
	}
	
	public void addmusic(ListaEncadeadaObj l, String musica) {
		String [] vt = musica.split(";");
		music m = new music();
		
		if(l.isEmpty()) {
			l.addFirst(m);
		}else {
			try {
				l.addLast(m);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void removemusic(ListaEncadeadaObj l, int posicao) throws Exception {
		if(l.isEmpty()) {
			throw new Exception("A playlist esta vazia");
		}else {
			l.remove(posicao);
		}
	}
	
	public void execplaylist(ListaEncadeadaObj l) {
		System.out.println("PlayList de DoCarmo");
		int tamanho = l.size();
		for(int i = 0; i < tamanho; i++) {
			try {
				music m =(music) l.get(i);
				System.out.println(m);
				Thread.sleep(m.);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}

}
