/* Generated By:JJTree: Do not edit this line. ASTArguments.java */

public class ASTArguments extends ParentExpression {
	ASTArgumentsList argumentsList;
	Method method;
  public ASTArguments(int id) {
    super(id);
  }

  public ASTArguments(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}