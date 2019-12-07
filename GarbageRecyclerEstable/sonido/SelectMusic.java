package sonido;

import javafx.scene.media.AudioClip;

class SelectMusic {
	public static AudioClip music;
	int seleccion = 0;		
	public AudioClip  seleccionM() {
		seleccion = (int) Math.floor(Math.random() * 1);
		if (seleccion == 0)
			try {					
		//music = new AudioClip(this.getClass().getResource("Hymn - Scott Buckley [Vlog No Copyright Music].wav").toString());				
			}
		catch (Exception tipoerror) 
		{
			System.out.println("" + tipoerror);
		}
		return music;							
	}
}