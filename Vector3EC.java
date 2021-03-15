// Copyright Eric Chauvin 2021.



// This 3D vector is for objects that
// have data saved in files.
// Like with toString() and fromString().


public class Vector3EC
  {
  private double x = 0;
  private double y = 0;
  private double z = 0;



  public Vector3EC()
    {
    makeZero();
    }

  public double getX()
    {
    return x;
    }

  public double getY()
    {
    return y;
    }

  public double getZ()
    {
    return z;
    }


  public void makeZero()
    {
    x = 0;
    y = 0;
    z = 0;
    }


  public void setFromString( String in )
    {
    try
    {
    String[] values = in.split( "\t" );
    if( values.length < 3 )
      return;

    String valS = values[0];
    if( valS == null )
      return;

    x = Double.parseDouble( valS );
    y = Double.parseDouble( valS );
    z = Double.parseDouble( valS );

    }
    catch( Exception e )
      {
      // status += "something";
      }
    }


  public String makeString()
    {
    return "" + x + "\t" +
                y + "\t" +
                z;

    }



  }
