/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class TRead extends Token
{
    public TRead()
    {
        super.setText("leia");
    }

    public TRead(int line, int pos)
    {
        super.setText("leia");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRead(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRead(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRead text.");
    }
}