package pryecto_final_v1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

public class gamer {

	
	JFrame f = new JFrame("serpientes y escaleras Univalle");
	JLabel lado,dado1,tablero[],partida[],icono;  // lado es el nombre del juego , dado1 es el dado, tablero es la variable donde ira la ubicacion del juego, partida es el inicio del juego, icono es el simbolo de una nivalle
	JTextField jugador1,jugador2;  				    // estos son los campos de texto para el jugador 1 y 2
	JButton boton_dado;   							// botón Dado es la que va dar la funcion del numero 1 al 6
	JButton acerca,reset,start;                 //acerca es la ventana de como se debe jugar,reset es la funcionalidad de volver desde el inicio todo, start es la posicion original de la partidad
	JTextField turnos;                           // turnos es el que permite y lleva el contador del jugador que le sigue
	JLabel cantidad_dado =new JLabel(" ");       //es el numer que dice cuando debe lazar o mover el jugador
	escuchador o = new escuchador(this);            //los escuchadores son los que te dan el aviso de cada evento que se presenta

	 gamer()
	 {
		


		 JWindow window = new JWindow(); //ventana window para presentacion del proyecto univalle
	

		 	window.getContentPane().add(  new JLabel("", new ImageIcon(".\\titulo.jpg"), SwingConstants.LEFT));
		 	window.setBounds(0, 0, 1600, 747);
		 	window.setVisible(true);
		 			try {
		 			    Thread.sleep(2000);
		 			} catch (InterruptedException e) {
		 			    e.printStackTrace();
		 			}
		 			Dimension intro = Toolkit.getDefaultToolkit().getScreenSize();
	  window.setSize(intro.width, intro.height);
		 			        window.pack();



	        window.dispose();

	       	tablero=new JLabel[101];     //Etiquetas para tablero de serpientes y escaleras.
			partida=new JLabel[6];	   //Etiqueta para los jugadores  o punto de partida.





	//******************** Punto de partida de los jugadores  .*****************

	        partida[1]=new JLabel();
		     partida[1].setBounds(140,650,54,52);
		     partida[1].setIcon(new ImageIcon(".//player2.gif"));
		     f.add(partida[1]);

			 partida[2]=new JLabel();
		     partida[2].setBounds(70,650,20,52);
			 partida[2].setIcon(new ImageIcon(".//player1.gif"));
			 f.add(partida[2]);


	partida[4]=new JLabel();
		     partida[4].setBounds(5,290,54,52);
		     partida[4].setIcon(new ImageIcon(".//player2.gif"));
		     f.add(partida[4]);

			 partida[5]=new JLabel();
		    partida[5].setBounds(5,340,20,52);
			 partida[5].setIcon(new ImageIcon(".//player1.gif"));
			 f.add(partida[5]);

			partida[3]=new JLabel();
			partida[3].setBounds(50,570,150,150);
			partida[3].setIcon(new ImageIcon(".//start.jpg"));
			f.add(partida[3]);


//		Las etiquetas para las casillas de  100-90, 80-70, 60-50, 40-30, 20-10 son las siguientes ***************************************


			int j=0;
				for(int i=100;i>90;i--)
				{
					tablero[i]=new JLabel();
				    tablero[i].setBounds((200+j*70),0,70,70);
				   tablero[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
	          	    f.add(tablero[i]);
	          		j++;
				}

				j=0;
				for(int i=80;i>70;i--)
				{
				   tablero[i]=new JLabel();
				   tablero[i].setBounds((200+j*70),140,70,70);
				   tablero[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
				   f.add(tablero[i]);
				    j++;
				}

				j=0;
				for(int i=60;i>50;i--)
				{
					tablero[i]=new JLabel();
					 tablero[i].setBounds((200+j*70),280,70,70);
				    tablero[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
				    f.add(tablero[i]);
				    j++;
				}

				j=0;
				for(int i=40;i>30;i--)
				{
					tablero[i]=new JLabel();
				   tablero[i].setBounds((200+j*70),420,70,70);
				   tablero[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
				    f.add(tablero[i]);
				    j++;
				}

				j=0;
				for(int i=20;i>10;i--)
				{
					tablero[i]=new JLabel();
				    tablero[i].setBounds((200+j*70),560,70,70);
				   tablero[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
				     f.add(tablero[i]);
		    		  j++;
				}

	// Las etiquetas para casillas de tablero RESTANTE son las siguientes  ********************************************************

			j=0;
				for(int i=81;i<91;i++)
				{
					tablero[i]=new JLabel();
				   tablero[i].setBounds((200+j*70),70,70,70);
				   tablero[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
				   f.add(tablero[i]);
				   j++;
				}

				j=0;
				for(int i=61;i<71;i++)
				{
						tablero[i]=new JLabel();
					    tablero[i].setBounds((200+j*70),210,70,70);
						 tablero[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
						 f.add(tablero[i]);
						  j++;
				}

				j=0;
				for(int i=41;i<51;i++)
			 	{
					tablero[i]=new JLabel();
					tablero[i].setBounds((200+j*70),350,70,70);
					tablero[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
				     f.add(tablero[i]);
					j++;
				}

				j=0;
				for(int i=21;i<31;i++)
				{
					tablero[i]=new JLabel();
					 tablero[i].setBounds((200+j*70),490,70,70);
					 tablero[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
					  f.add(tablero[i]);
					  j++;
				}





				j=0;
				for(int i=1;i<11;i++)
				{
					tablero[i]=new JLabel();
				    tablero[i].setBounds((200+j*70),630,70,70);
					 tablero[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
				     f.add(tablero[i]);
					 j++;
				}



			lado=new JLabel(); // la ubicacion de la imagen del nombre del juego
			lado.setBounds(920,0,37,663);
			lado.setIcon(new ImageIcon(".//lado.png"));
			f.add(lado);


			icono=new JLabel();   //ubicacion del icono de la univalle
					icono.setBounds(0,0,200,100);
					icono.setIcon(new ImageIcon(".//uni.jpg"));
			f.add(icono);


			 turnos= new JTextField("Tirar Dados"); //la ubicacion del texto de cambio de turno
			turnos.setBounds(25,250,150,40);
			turnos.setBackground(Color.BLACK);
			turnos.setForeground(Color.GREEN);
			f.add(turnos);

			jugador1=new JTextField(); // la ubicacion del player 1
			jugador1.setBounds(25,310,150,35);
			jugador1.setText("Player 1 ");
			f.add(jugador1);
			jugador1.setBackground(Color.RED);

			jugador2=new JTextField(); // la ubicacion del player 2
			jugador2.setBounds(25,350,150,35);
			jugador2.setText("Player 2");
			f.add(jugador2);
			jugador2.setBackground(Color.BLUE);





			dado1=new JLabel(); // la ubicacion del dado 
			dado1.setBounds(50,400,100,100);
			dado1.setText("");
			dado1.setIcon(new ImageIcon(".//Dado.gif"));


			f.add(dado1);

	    	boton_dado=new JButton(); // la ubicacion del boton del dado
			boton_dado.setBounds(25,490,150,40);
			boton_dado.setText("Dados");
			boton_dado.addActionListener(o);
			f.add(boton_dado);

	cantidad_dado =new JLabel(" ");  //la ubicacion del numero de cantidad del movimiento que se debe mover el jugador
	cantidad_dado.setForeground(Color.RED);
			 cantidad_dado.setBounds(120,400,100,100);
			  f.add(cantidad_dado);

		//	fuentes de letra
			Font fondo = new Font("Book Antiqua", Font.BOLD,20);
			Font fondo1 = new Font("Tecton Pro", Font.BOLD,26);
			Font fondo2=new Font("Comic Sans MS",Font.BOLD,18);
			Font fondo3=new Font("forte",Font.BOLD,30);

			lado.setFont(fondo1);
			jugador1.setFont(fondo);
			turnos.setFont(fondo2);
			jugador2.setFont(fondo);
			cantidad_dado.setFont(fondo3);

			dado1.setFont(fondo1);
			boton_dado.setFont(fondo3);
		    f.setLayout(null);







	     acerca=new JButton(); // la ubicacion de la ventana informacion 
	     acerca.setIcon(new ImageIcon(".//informacion.png"));
	     acerca.addActionListener(o);
		    acerca.setBounds(40,120,120,40);
	    f.add(acerca);

	      reset=new JButton("reset"); //la ubicacion del boton reset
	      reset.addActionListener(o);
			    reset.setBounds(40,170,120,40);
	reset.setIcon(new ImageIcon(".//reset.png"));
	    f.add(reset);


	// ****************   fondo de las imagenes *****************************


		f.setLayout(null);
		f.setLayout(null);
	    f.setVisible(true);
		f.setResizable(false);

		f.setSize(990,735);


		f.getContentPane().setBackground(new Color(0,0,0));

	}



	
	}
	
