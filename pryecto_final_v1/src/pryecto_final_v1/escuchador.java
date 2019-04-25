package pryecto_final_v1;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class escuchador {
	class Listener implements ActionListener
	
	{
		gamer juego = new gamer();
		 gamer d;
		 int rno,x1,y1;
		  int pc1,pc2;
		  int w;
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

			 d.dado1.setVisible(true);




	     }
		  public void actionPerformed(ActionEvent e)
		  {
			  if(e.getSource()==d.reset)
			  { d.partida[1].setBounds(140,650,20,52);
			    d.partida[2].setBounds(70,650,20,52);
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
	            r=d.tablero[pc1].getBounds();
			   y=r.getX();
				z=r.getY();
				 x1=(int)Math.round(y);
				 y1=(int)Math.round(z);
				d.partida[1].setBounds((x1+10),(y1+20),54,52);







	          //***************** verificando si hay una serpiente en tu posición o no *********************
				int a[]=new int[]{27,40,43,54,66,76,89,99};
				int b[]=new int[]{5,3,18,31,45,58,53,41};

				for(int i=0;i<8;i++)
				{
				if(pc1==a[i])
				{  r=d.tablero[b[i]].getBounds();
					  y=r.getX();
					  z=r.getY();
					   x1=(int)Math.round(y);
					   y1=(int)Math.round(z);
					  d.partida[1].setBounds((x1+10),(y1+17),20,52);
					  pc1=b[i];

				 }
			    }
			    //******** Aquí estamos comprobando la escalera ******************

			    int c[]=new int[]{4,13,33,42,50,62,74};
				int f[]=new int[]{25,46,49,63,69,81,92};
			    for(int i=0;i<7;i++)
				{
				if(pc1==c[i])
			    {  r=d.tablero[f[i]].getBounds();
				   y=r.getX();
				   z=r.getY();
				   x1=(int)Math.round(y);
				   y1=(int)Math.round(z);
				  d.partida[1].setBounds((x1+10),(y1+16),20,52);
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
	          r=d.tablero[pc2].getBounds();
			   y=r.getX();
			   z=r.getY();
				 x1=(int)Math.round(y);
				 y1=(int)Math.round(z);
			  d.partida[2].setBounds((x1+30),(y1+20),20,52);


				int a[]=new int[]{27,40,43,54,66,76,89,99};
				int b[]=new int[]{5,3,18,31,45,58,53,41};

				for(int i=0;i<8;i++)
				{
				if(pc2==a[i])
				{  r=d.tablero[b[i]].getBounds();
					  y=r.getX();
					  z=r.getY();
					   x1=(int)Math.round(y);
					   y1=(int)Math.round(z);
					  d.partida[2].setBounds((x1+30),(y1+17),20,52);
					  pc2=b[i];

				 }
			    }
			    int c[]=new int[]{4,13,33,42,50,62,74};
				int f[]=new int[]{25,46,49,63,69,81,92};
			    for(int i=0;i<7;i++)
				{
				if(pc2==c[i])
			    {  r=d.tablero[f[i]].getBounds();
				   y=r.getX();
				   z=r.getY();
				   x1=(int)Math.round(y);
				   y1=(int)Math.round(z);
				  d.partida[2].setBounds((x1+30),(y1+16),20,52);
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

}
