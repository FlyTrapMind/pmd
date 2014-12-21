/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

/* Generated By:JJTree: Do not edit this line. ASTArguments.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package net.sourceforge.pmd.lang.plsql.ast;

public class ASTArguments extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode{
  public ASTArguments(int id) {
    super(id);
  }

  public ASTArguments(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public int getArgumentCount() {
    if (this.jjtGetNumChildren() == 0) {
      return 0;
    }
    return this.jjtGetChild(0).jjtGetNumChildren();
  }
}
/* JavaCC - OriginalChecksum=ac664fde2b2da90710e74c7e9413f59d (do not edit this line) */