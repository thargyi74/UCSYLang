/* Generated By:JJTree: Do not edit this line. ASTContinueStatement.java */

public class ASTContinueStatement extends ParentStatement {
  public ASTContinueStatement(int id) {
    super(id);
  }

  public ASTContinueStatement(UCSY p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(UCSYVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}