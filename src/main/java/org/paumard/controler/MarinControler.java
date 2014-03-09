package org.paumard.controler;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.paumard.ejb.MarinEJB;
import org.paumard.model.Marin;

@SuppressWarnings("serial")
@Named("marinControler")
@SessionScoped
public class MarinControler implements Serializable {
	
	@Inject
	private transient MarinEJB marinEJB ;
	
	private Marin marin = new Marin() ;

	public void create() {
		Long id = marinEJB.createMarin(marin) ;
		System.out.println("Marin persisté : " + id) ;
	}
	
	public Marin getMarin() {
		return marin;
	}

	public void setMarin(Marin marin) {
		this.marin = marin;
	}
	public void delete() {
		
		marins= marinEJB.deleteByName(marin);
		System.out.println("Marin persisté : " + marin.getNom()) ;
		
	}
	public void retreaveById() {
	
 	marinEJB.retreaveMarin(marin.getId_rech());
 	
 	System.out.println("Marin recherché : " + marin.getNom()) ;
	
 }
}
