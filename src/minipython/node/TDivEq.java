/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class TDivEq extends Token
{
    public TDivEq()
    {
        super.setText("/=");
    }

    public TDivEq(int line, int pos)
    {
        super.setText("/=");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TDivEq(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDivEq(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TDivEq text.");
    }
}
