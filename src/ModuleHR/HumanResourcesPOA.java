package ModuleHR;


/**
* ModuleHR/HumanResourcesPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ModuleHR.idl
* Monday, May 18, 2015 5:01:50 PM ALMT
*/

public abstract class HumanResourcesPOA extends org.omg.PortableServer.Servant
 implements ModuleHR.HumanResourcesOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("save", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // ModuleHR/HumanResources/save
       {
         String jsonApp = in.read_string ();
         String $result = null;
         $result = this.save (jsonApp);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ModuleHR/HumanResources:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public HumanResources _this() 
  {
    return HumanResourcesHelper.narrow(
    super._this_object());
  }

  public HumanResources _this(org.omg.CORBA.ORB orb) 
  {
    return HumanResourcesHelper.narrow(
    super._this_object(orb));
  }


} // class HumanResourcesPOA
