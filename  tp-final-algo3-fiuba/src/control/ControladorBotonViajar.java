package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vistas.sonidos.Audios;
import vistas.sonidos.Sonidos;
import vistas.VistaPartida;

public class ControladorBotonViajar implements ActionListener{
	private VistaPartida vista;
	private Sonidos sonidos;
	
	public ControladorBotonViajar(VistaPartida vista) {
		this.vista = vista;
		this.sonidos = Sonidos.ObtenerSonidos();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		vista.MostrarPaisesParaViajar();
		sonidos.reproducirSonido(Audios.COMUN);
		
	}

}
