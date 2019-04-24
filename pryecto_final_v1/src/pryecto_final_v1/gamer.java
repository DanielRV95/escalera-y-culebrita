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
	JLabel tf,a3,x,l[],m[],dc[],z,k,a1,a2;  // En el encabezado "Serpiente y escalera", a1 y a2 son las etiquetas de jugador 1 y 2 a3 es lugar de dados
	JTextField tf1,tf2;  				    // estos son los campos de texto para el jugador 1 y 2
	JButton b1;   							// botón Dado
	JButton au,reset,start;
	JTextField screen;
	JLabel miImagen =new JLabel(" ");
	Listener o = new Listener(this);

	 gamer()
	 {
		 JLabel color_fondo=new JLabel(new ImageIcon(""));
		 f.setBounds(0,0,0,735);


		 JWindow window = new JWindow();
	

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

	       	l=new JLabel[101];     //Etiquetas para tablero de serpientes y escaleras.
			m=new JLabel[6];	   //Etiqueta para los jugadores  o punto de partida.





	//******************** Punto de partida con la etiqueta .*****************

	         m[1]=new JLabel();
		     m[1].setBounds(140,650,54,52);
		     m[1].setIcon(new ImageIcon(".//player2.gif"));
		     f.add(m[1]);

			 m[2]=new JLabel();
		     m[2].setBounds(70,650,20,52);
			 m[2].setIcon(new ImageIcon(".//player1.gif"));
			 f.add(m[2]);


	m[4]=new JLabel();
		     m[4].setBounds(5,290,54,52);
		     m[4].setIcon(new ImageIcon(".//player2.gif"));
		     f.add(m[4]);

			 m[5]=new JLabel();
		     m[5].setBounds(5,340,20,52);
			 m[5].setIcon(new ImageIcon(".//player1.gif"));
			 f.add(m[5]);

			m[3]=new JLabel();
			m[3].setBounds(50,570,150,150);
			m[3].setIcon(new ImageIcon(".//start.jpg"));
			f.add(m[3]);


//		Las etiquetas para las casillas de  100-90, 80-70, 60-50, 40-30, 20-10 son las siguientes ***************************************


			int j=0;
				for(int i=100;i>90;i--)
				{
					l[i]=new JLabel();
				    l[i].setBounds((200+j*70),0,70,70);
				    l[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
	          	    f.add(l[i]);
	          		j++;
				}

				j=0;
				for(int i=80;i>70;i--)
				{
				   l[i]=new JLabel();
				   l[i].setBounds((200+j*70),140,70,70);
				   l[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
				   f.add(l[i]);
				    j++;
				}

				j=0;
				for(int i=60;i>50;i--)
				{
					l[i]=new JLabel();
					 l[i].setBounds((200+j*70),280,70,70);
				    l[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
				    f.add(l[i]);
				    j++;
				}

				j=0;
				for(int i=40;i>30;i--)
				{
					l[i]=new JLabel();
				    l[i].setBounds((200+j*70),420,70,70);
				    l[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
				    f.add(l[i]);
				    j++;
				}

				j=0;
				for(int i=20;i>10;i--)
				{
					l[i]=new JLabel();
				    l[i].setBounds((200+j*70),560,70,70);
				    l[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
				     f.add(l[i]);
		    		  j++;
				}

	// Las etiquetas para casillas de tablero RESTANTE son las siguientes  ********************************************************

			j=0;
				for(int i=81;i<91;i++)
				{
					l[i]=new JLabel();
				   l[i].setBounds((200+j*70),70,70,70);
				   l[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
				   f.add(l[i]);
				   j++;
				}

				j=0;
				for(int i=61;i<71;i++)
				{
						l[i]=new JLabel();
					    l[i].setBounds((200+j*70),210,70,70);
						 l[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
						 f.add(l[i]);
						  j++;
				}

				j=0;
				for(int i=41;i<51;i++)
			 	{
					l[i]=new JLabel();
					l[i].setBounds((200+j*70),350,70,70);
					l[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
				     f.add(l[i]);
					j++;
				}

				j=0;
				for(int i=21;i<31;i++)
				{
					l[i]=new JLabel();
					 l[i].setBounds((200+j*70),490,70,70);
					 l[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
					  f.add(l[i]);
					  j++;
				}





				j=0;
				for(int i=1;i<11;i++)
				{
					l[i]=new JLabel();
				    l[i].setBounds((200+j*70),630,70,70);
					 l[i].setIcon(new ImageIcon(".//tablero/"+i+".jpg"));
				     f.add(l[i]);
					 j++;
				}



			tf=new JLabel();
			tf.setBounds(920,0,37,663);
			tf.setIcon(new ImageIcon(".//lado.png"));
			f.add(tf);


			z=new JLabel();
					z.setBounds(0,0,200,100);
					z.setIcon(new ImageIcon(".//uni.jpg"));
			f.add(z);


			 screen= new JTextField("Tirar Dados");
			screen.setBounds(25,250,150,40);
			screen.setBackground(Color.BLACK);
			screen.setForeground(Color.GREEN);
			f.add(screen);

			tf1=new JTextField();
			tf1.setBounds(25,310,150,35);
			tf1.setText("Player 1 ");
			f.add(tf1);
			tf1.setBackground(Color.RED);

			tf2=new JTextField();
			tf2.setBounds(25,350,150,35);
			tf2.setText("Player 2");
			f.add(tf2);
			tf2.setBackground(Color.BLUE);

	    k=new JLabel();
	k.setBounds(60,400,100,100);
			f.add(k);



			a3=new JLabel();
			a3.setBounds(50,400,100,100);
			a3.setText("");
			a3.setIcon(new ImageIcon(".//Dado.gif"));


			f.add(a3);

	    	b1=new JButton();
			b1.setBounds(25,490,150,40);
			b1.setText("Dados");
			b1.addActionListener(o);
			f.add(b1);

	miImagen =new JLabel(" ");
	miImagen.setForeground(Color.RED);
			 miImagen.setBounds(120,400,100,100);
			  f.add(miImagen);

		//	fondos
			Font fondo = new Font("Book Antiqua", Font.BOLD,20);
			Font fondo1 = new Font("Tecton Pro", Font.BOLD,26);
			Font fondo2=new Font("Comic Sans MS",Font.BOLD,18);
			Font fondo3=new Font("forte",Font.BOLD,30);

			tf.setFont(fondo1);
			tf1.setFont(fondo);
			screen.setFont(fondo2);
			tf2.setFont(fondo);
			 miImagen.setFont(fondo3);

			a3.setFont(fondo1);
			b1.setFont(fondo3);
		    f.setLayout(null);







	     au=new JButton();
	     au.setIcon(new ImageIcon(".//informacion.png"));
	     au.addActionListener(o);
		    au.setBounds(40,120,120,40);
	    f.add(au);

	      reset=new JButton("reset");
	      reset.addActionListener(o);
			    reset.setBounds(40,170,120,40);
	reset.setIcon(new ImageIcon(".//reset.png"));
	    f.add(reset);


	// ****************   dices images *****************************

	//dc[]=new JLbel[7];

		f.setLayout(null);
		f.setLayout(null);
	    f.setVisible(true);
		f.setResizable(false);
	 f.add(color_fondo);

		f.setSize(990,735);


		f.getContentPane().setBackground(new Color(0,0,0));

	}



		public static void main(String []s)
		{
			new gamer();
		}
	}
	//********************** clase oyente  ************************

	class Listener implements ActionListener
	{
		 gamer d;
		 int rno,x1,y1;
		 static int pc1,pc2;
		 static int w;
		 Rectangle r=new Rectangle();
		 double y,z;




		 Listener(gamer d)
		 {
			  this.d=d;
		  }
		//****************************************  CLASE ESCUCHAR dando el número al azar *************************************
		  void randomNumber()
		  {
			  Random generator = new Random();
			  rno = generator.nextInt(6) + 1;                // guarda el numer aleatorio

			 d.miImagen.setText(String.valueOf(rno));

			 d.a3.setVisible(true);




	     }
		  public void actionPerformed(ActionEvent e)
		  {
			  if(e.getSource()==d.reset)
			  { d.m[1].setBounds(140,650,20,52);
			    d.m[2].setBounds(70,650,20,52);
			    d.miImagen.setText(" ");
			    pc1=0;
			    w=0;
			    pc2=0;

			  }
			  else if(e.getSource()==d.au)
			  {
				  JFrame jn=new JFrame("informacion");
				  jn.setBounds(20,20,900,562);
				  jn.setSize(900,600);
				  jn.setVisible(true);

				  JLabel 	a4=new JLabel();
				  		a4.setBounds(0,0,900,562);
				  		a4.setText("");
				  		a4.setIcon(new ImageIcon(".//acerca.jpg"));
			jn.add(a4);
			  }
	             else if(e.getSource()==d.b1)
	             {

				     randomNumber();




	//*********************************  esto si el bucle es para el jugador 1  w es el número y este bucle solo funciona cuando w es par aún el número par es para el jugador1
	//*********************************   y pc1 contiene todos los movimientos movidos por player1 ******************************************
	if(w%2==0)
	  {d.screen.setText("Player 2 turno");


		  w++;

	          if((pc1+rno)<101)                                 // verificando si el valor del jugador 1 no excede más de 100 mientras se juega
	          {
				  //********* Aquí agregaremos el movimiento del jugador 1 y cambiaremos su posición de acuerdo con los dados (rno) **********
				  pc1=pc1+rno;
	            r=d.l[pc1].getBounds();
			   y=r.getX();
				z=r.getY();
				 x1=(int)Math.round(y);
				 y1=(int)Math.round(z);
				d.m[1].setBounds((x1+10),(y1+20),54,52);







	          //***************** verificando si hay una serpiente en tu posición o no *********************
				int a[]=new int[]{27,40,43,54,66,76,89,99};
				int b[]=new int[]{5,3,18,31,45,58,53,41};

				for(int i=0;i<8;i++)
				{
				if(pc1==a[i])
				{  r=d.l[b[i]].getBounds();
					  y=r.getX();
					  z=r.getY();
					   x1=(int)Math.round(y);
					   y1=(int)Math.round(z);
					  d.m[1].setBounds((x1+10),(y1+17),20,52);
					  pc1=b[i];

				 }
			    }
			    //******** Aquí estamos comprobando la escalera ******************

			    int c[]=new int[]{4,13,33,42,50,62,74};
				int f[]=new int[]{25,46,49,63,69,81,92};
			    for(int i=0;i<7;i++)
				{
				if(pc1==c[i])
			    {  r=d.l[f[i]].getBounds();
				   y=r.getX();
				   z=r.getY();
				   x1=(int)Math.round(y);
				   y1=(int)Math.round(z);
				  d.m[1].setBounds((x1+10),(y1+16),20,52);
				  pc1=f[i];

				 }
			    }

	}

	}
	//*****************este bucle es para el jugador 2 si w es impar, entonces player2 se mueve a la siguiente posición y pc2 contiene todos los movimientos del jugador 2 y todos los
	 //****************  El resto de las condiciones es igual que el bucle anterior. **********************
	else
	   {d.screen.setText("Player 1 turno");

		   w++;

	          if((pc2+rno)<101)
	          {pc2=pc2+rno;
	          r=d.l[pc2].getBounds();
			   y=r.getX();
			   z=r.getY();
				 x1=(int)Math.round(y);
				 y1=(int)Math.round(z);
			  d.m[2].setBounds((x1+30),(y1+20),20,52);


				int a[]=new int[]{27,40,43,54,66,76,89,99};
				int b[]=new int[]{5,3,18,31,45,58,53,41};

				for(int i=0;i<8;i++)
				{
				if(pc2==a[i])
				{  r=d.l[b[i]].getBounds();
					  y=r.getX();
					  z=r.getY();
					   x1=(int)Math.round(y);
					   y1=(int)Math.round(z);
					  d.m[2].setBounds((x1+30),(y1+17),20,52);
					  pc2=b[i];

				 }
			    }
			    int c[]=new int[]{4,13,33,42,50,62,74};
				int f[]=new int[]{25,46,49,63,69,81,92};
			    for(int i=0;i<7;i++)
				{
				if(pc2==c[i])
			    {  r=d.l[f[i]].getBounds();
				   y=r.getX();
				   z=r.getY();
				   x1=(int)Math.round(y);
				   y1=(int)Math.round(z);
				  d.m[2].setBounds((x1+30),(y1+16),20,52);
				  pc2=f[i];

				 }
			    }



	}
	}
	if(pc1==100)
	    d.screen.setText("Player 1 gana");
	 else if(pc2==100)
	     d.screen.setText("Player 2 gana");
	}
	}
	}

