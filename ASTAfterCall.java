/* Generated By:JJTree: Do not edit this line. ASTAfterCall.java */


public class ASTAfterCall extends BeforeOrAfterClause {
	
	ASTMethodSignature methodSignature;	
	ASTMethodCall      methodCall;
	UCSYMethod         method;
  public ASTAfterCall(int id) {
    super(id);
  }

  public ASTAfterCall(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
