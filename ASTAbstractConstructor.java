/* Generated By:JJTree: Do not edit this line. ASTAbstractConstructor.java */

public class ASTAbstractConstructor extends SimpleNode {
	
	ASTFormalParameters formalParameters;
	String abstractConstructorSignature;
	String constructorName;
	String constructorReturnType;
	InterfaceMethod abstractConstructorMethod;
	Token t;
  public ASTAbstractConstructor(int id) {
    super(id);
  }

  public ASTAbstractConstructor(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
