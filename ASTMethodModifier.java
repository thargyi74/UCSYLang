/* Generated By:JJTree: Do not edit this line. ASTMethodModifier.java */

public class ASTMethodModifier extends SimpleNode {
	int modifier;
  public ASTMethodModifier(int id) {
    super(id);
  }

  public ASTMethodModifier(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
