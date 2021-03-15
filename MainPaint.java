// Copyright Eric Chauvin 2021.


// This is just some preliminary test stuff to
// draw something, anything, on the screen.


import java.awt.Graphics;
// import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;



public class MainPaint
  {
  private int[] xPoints;
  private int[] yPoints;
  private int[] yPoints2;


  public MainPaint()
    {
    xPoints = new int[1000];
    yPoints = new int[1000];
    yPoints2 = new int[1000];

    for( int count = 0; count < 1000; count++ )
      {
      float x = count;
      float y = (float)Math.sqrt( (x * x * x) -
                                (10.0f * x));

      // Scale it and translate it.
      y = y * 0.02f;
      xPoints[count] = count + 200;
      yPoints[count] = 300 - Math.round( y );
      }

    }


  public void paintIt( Graphics g )
    {
    // Graphics2D g2 = (Graphics2D)g;

    // This will have all of the objects to paint.

    g.setColor( Color.red );
    // x, y, width, height.
    g.fillRect( 100, 100, 40, 40 );

    g.setColor( Color.green );

    // g2.drawRect( 10, 400, 20, 200 );

    Font mainFont = new Font( Font.MONOSPACED,
                         Font.PLAIN,
                         45 );

    g.setFont( mainFont );

    // drawString( test, x, y );
    g.drawString( "Where does this line go?",
                             10, 250 );


   // drawLine(int x1, int y1, int x2, int y2)

    // g.drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
    // Draws a closed polygon defined by arrays of x and y coordinates.

    // fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
    // Fills a closed polygon defined by arrays of x and y coordinates.


    g.drawPolyline( xPoints, yPoints, 1000 );


    // current font.
    // FontMetrics getFontMetrics()
    // Gets the font metrics of the cur

    }


  }

