/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class TEndWhile extends Token
{
    public TEndWhile()
    {
        super.setText("fim enquanto");
    }

    public TEndWhile(int line, int pos)
    {
        super.setText("fim enquanto");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEndWhile(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEndWhile(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEndWhile text.");
    }
}
