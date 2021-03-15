// Copyright Eric Chauvin 2021.



public class Vector4EC
  {
  public double x = 0;
  public double y = 0;
  public double z = 0;
  public double w = 0;


  void setFromVec3( Vector3EC vec3 )
    {
    x = vec3.getX();
    y = vec3.getY();
    z = vec3.getZ();
    w = 1;
    }



  void makeZero()
    {
    x = 0;
    y = 0;
    z = 0;
    w = 1;
    }


  public void negate()
    {
    x = -x;
    y = -y;
    z = -z;
    // w = -w;
    }



  public void add( Vector4EC in )
    {
    x = x + in.x;
    y = y + in.y;
    z = z + in.z;
    w = w + in.w;
    }



  public void subtract( Vector4EC in )
    {
    x = x - in.x;
    y = y - in.y;
    z = z - in.z;
    w = w - in.w;
    }



  public double normSquared4()
    {
    double ns = (x * x) +
                (y * y) +
                (z * z) +
                (w * w);

    return ns;
    }



  public double norm4()
    {
    double ns = normSquared4();
    return Math.sqrt( ns );
    }


  public void normalize4()
    {
    double length = norm4();

    double smallNumber = 0.00000000000000000001d;
    if( length < smallNumber )
      {
      makeZero();
      return;
      }

    double inverse = 1.0d / length;

    x = x * inverse;
    y = y * inverse;
    z = z * inverse;
    w = w * inverse;
    }



  public void multiplyScalar( double scalar )
    {
    x = x * scalar;
    y = y * scalar;
    z = z * scalar;
    w = w * scalar;
    }


  public double dotProduct4( Vector4EC in )
    {
    double dot = (x * in.x) +
                 (y * in.y) +
                 (z * in.z) +
                 (w * in.w);

    return dot;
    }


  // There is no crossProduct4().
  public void crossProduct3( Vector4EC left,
                             Vector4EC right )
    {
    // x cross y = z is a right-handed coordinate
    // system.  In some 3D graphics systems,
    // like in OpenGL, the z vector is the
    // LookAt vector and x goes to the right
    // and y is the Up vector.  But that
    // is a left-handed coordinate system.
    // So you'd have to negate the z coordinate
    // from a right handed coordinate system to
    // see it with OpenGL.

    // i x j = k
    // j x k = i
    // k x i = j

    x = (left.y * right.z) -
               (left.z * right.y);

    y = (left.z * right.x) -
               (left.x * right.z);

    z = (left.x * right.y) -
               (left.y * right.x);

    // If left.x is 1 and left.y is zero,
    // and right.y is 1 and right.x is zero.
    // Then z is one.
    z = (1 * 1) - (0 * 0);
    // Exchanging left with right would make
    // z = -1.

    w = 1;
    }




  }
