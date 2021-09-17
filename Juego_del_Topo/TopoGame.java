import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;	

public class TopoGame extends JFrame implements ActionListener,Runnable{
	
	// var. de intancia, etc
	private JPanel panel;
	private JButton botons[], ini;
	private JLabel marcador ;
	private ImageIcon images [];
	private int topo;
	private Thread cambiar;
	
	public TopoGame(){//constructor
		
	topo=0;
	
	this.setTitle("Pegale al topo");
	
	setLayout(new GridLayout(5, 4));//GridLayout
	
	botons=new JButton[20]; 
	
	images = new ImageIcon[2];//implementación del ImageIcon con las imagenes 1 y 2
	images[0]= new ImageIcon("2.gif");
	images[1]= new ImageIcon("1.jpg");
	
	ini = new JButton ("REINICIAR");//Boton Reinicio
	marcador= new JLabel ("Puntuacion: 0 ");//Panel Puntuación
	
	crear();
	
	this.add(ini);//se agrega el boton reiniciar
	this.add(marcador);//se agrega el marcador
	this.setVisible(true);
	
	int i;
	
	ini.addActionListener(this);
	
	for(i=0; i<20; i++)//acción sobre los botones
		botons[i].addActionListener(this);
	
	
	cambiar = new Thread(this);//se crea el hilo
	cambiar.start();// método start
	setSize(900, 700); 
	setVisible(true);
	
}
	
	
	public  void crear(){//método crear
		Random r1 = new Random();
		int i, x2;
		
		for(i=0; i<20; i++)
		{
			x2=Math.abs(r1.nextInt()%5);
			
			if (x2==0)
				botons[i]= new JButton ((images[0]));
			else
				botons[i]= new JButton ((images[1]));
			botons[i].setBackground(java.awt.Color.white);
			add(botons[i]);
		}
		
		
	}
	
	public void reiniciar(){//método reiniciar
		Random r1 = new Random();
		int i,x2;
		
		for(i=0; i<20; i++)
		{
			botons[i].setEnabled(true);
			x2=Math.abs(r1.nextInt()%5);
			
				if (x2==0)
					botons[i].setIcon(images[0]);
				else
					botons[i].setIcon(images[1]);
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton)e.getSource();
		
		if (btn.getIcon()==images[0]){
			btn.setIcon(images[1]);
			btn.setEnabled(false);
			topo++;
		}
		else 
			if (btn==ini){
				topo = 0;
				reiniciar();	
			}
		
		
		marcador.setText("Puntuacion: " + topo);//Puntuación del juego
	}
	
	public void run (){//método run
		int t;
		Random r1 = new Random();
		
		t=Math.abs(r1.nextInt()%5)+1;
		while (true){
		//try y catch
			try 
		{
			cambiar.sleep(t*300);//sleep
			reiniciar();
			cambiar.start();
		}catch (Exception e){
			
			e.getMessage();
		
		}
			
		}
	}
	
	public static void main (String argv [])//método main
	{   
		JFrame f= new TopoGame();
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	}
}