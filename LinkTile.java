import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.*;
import java.awt.event.*;

public class LinkTile extends Applet implements MouseListener{

	public static int[][] b= {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}


			};


    static Frame f;
    int flag=2;
    static int fn;


	static int sn;


	int gn;

	int count=0;


	int n;


	int x;


	int y;
    Graphics g;


  //  TextField firstNum, secondNum;
    public LinkTile()
    {



       f=new Frame("ENTER 5 FOR LinkTile5");
       f.setUndecorated(true);

       // Confirm the current decorated state
       boolean undecorated = f.isUndecorated();

       f.setLayout(null);
       f.setVisible(true);
       f.setSize(600,600);
       f.addMouseListener(this);




		 n=5;
		 x=25;
		 y =25;
		 fn = 25;
		 sn = 25;





	}
   public void mouseEntered(MouseEvent e)

    {
	   Graphics g=f.getGraphics();
       for(int n = 0;n<=600;n = n+(600/fn))
       {
       	g.drawLine(n,0,n,600);
       }

       for(int m = 0;m<=600;m = m+(600/sn))
       {

       	g.drawLine(0,m,600,m);
       }
    }

    public void mouseClicked(MouseEvent e)
    {

        Graphics g=f.getGraphics();
        for(int n = 0;n<=600;n = n+(600/fn))
        {
        	g.drawLine(n,0,n,600);
        }

        for(int m = 0;m<=600;m = m+(600/sn))
        {

        	g.drawLine(0,m,600,m);
        }
        flag--;


   // -------------------------------
    //-----------main code here ------------





		int chance1,chance2;

		chance1 = (e.getX()/(600/fn));
		chance2 = (e.getY()/(600/sn));

		int k=0,j=0;

		j = chance1;
		k = chance2;




//--------------------------------------


        if(flag==1)
        {

        	if(b[j][k]==0){
        		b[j][k] = n+1;
        				g.setColor(Color.red);
        				g.drawRect(j*(600/fn),k*(600/fn),600/fn,600/fn);
        				g.fillRect(j*(600/fn),k*(600/fn),600/fn,600/fn);
        				count++;
        	}


        }

        if(flag==0)
        {



        	if(b[j][k]==0)
        	{
        		b[j][k]=1;
                    g.setColor(Color.blue);
                    g.drawRect(j*(600/fn),k*(600/fn),600/fn,600/fn);
    				g.fillRect(j*(600/fn),k*(600/fn),600/fn,600/fn);
    				count++;
        	}
            flag=flag+2;
        }
        check(b,n,x,y);

    }


 void check(int[][] b, int n,int x,int y) {
		// TODO Auto-generated method stub

		int l,m;
		//checking for column
		for(l = (n-1)/2;l<=x-(n-1)/2;l++)
		{
			for(m=0;m<=y-1;m++)
			{
				int row_sum = 0;
				for(int a = -(n-1)/2;a<=(n-1)/2;a++)
				{
					row_sum += b[l+a][m];
				}

				if(row_sum == n || row_sum == n*(n+1))
				{
					if(row_sum == n)
					{
                          win();

					}
					else
						win();
				}
			}
		}

	//checking for row
		for(l=0;l<=x-1;l++)
		{
			for(m = (n-1)/2;m<=y-(n-1)/2;m++)
			{
				int col_sum = 0;
				for(int a = -(n-1)/2;a<=(n-1)/2;a++)
				 {
					col_sum += b[l][m+a];
				 }


			if(col_sum == n || col_sum == n*(n+1))
			{
				if(col_sum == n)
					{
					win();
					}
				else
					{
					win();
					}

			}
			}
		}

		//check for fdiagonal

		for(l = (n-1)/2;l<=x-(n-1)/2;l++)
		{
			for(m = (n-1)/2;m<=y-(n-1)/2;m++)
			{
				int fd_sum = 0;

				for(int a = -(n-1)/2;a<=(n-1)/2;a++)
				{
					fd_sum += b[l+a][m+a];
				}

				if(fd_sum == n || fd_sum == n*(n+1))
				{
					if(fd_sum == n)
					{
						win();
					}
					else
					{
						win();
					}
				}
			}

		}

		//check for bdiagonal

		for(l= (n-1)/2;l<=x-(n-1)/2;l++)
		{
			for(m = (n-1)/2;m<=y-(n-1)/2;m++)
			{
				int bd_sum = 0;

				for(int a= -(n-1)/2;a<=(n-1)/2;a++)
				{
					bd_sum += b[l-a][m+a];
				}
				if(bd_sum == n || bd_sum == n*(n+1))
				{
					if(bd_sum == n)
					{
						win();
					}

				else
				{
					win();
				}
			}
			}
		}

		if(count == 625)
		{
			draw();
		}



	}
//-----------------



    public Frame win()
    {

        Frame m=new Frame("Result");
        Label l=new Label("YOU WIN");
        m.setLayout(null);
        m.add(l);
        l.setBounds(20,30,100,100);
        m.setVisible(true);
        m.setSize(200,200);
        return m;
    }


    public Frame draw()
    {

        Frame m=new Frame("Result");
        Label l=new Label("MATCH DRAW");
        m.setLayout(null);
        m.add(l);
        l.setBounds(20,30,100,100);
        m.setVisible(true);
        m.setSize(200,200);
        return m;
    }


    public void mouseReleased(MouseEvent e)
    {
        System.out.print("");
    }





    public void mouseExited(MouseEvent e)
    {
        System.out.print("");
    }
    public void mousePressed(MouseEvent e)
    {
        System.out.print("");
    }

    public static void main(String args [])
    {
        new LinkTile();

    }







}
