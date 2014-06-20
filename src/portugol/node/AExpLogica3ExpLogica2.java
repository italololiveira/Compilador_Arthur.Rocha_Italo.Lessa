/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AExpLogica3ExpLogica2 extends PExpLogica2
{
    private PExpLogica3 _expLogica3_;

    public AExpLogica3ExpLogica2()
    {
        // Constructor
    }

    public AExpLogica3ExpLogica2(
        @SuppressWarnings("hiding") PExpLogica3 _expLogica3_)
    {
        // Constructor
        setExpLogica3(_expLogica3_);

    }

    @Override
    public Object clone()
    {
        return new AExpLogica3ExpLogica2(
            cloneNode(this._expLogica3_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpLogica3ExpLogica2(this);
    }

    public PExpLogica3 getExpLogica3()
    {
        return this._expLogica3_;
    }

    public void setExpLogica3(PExpLogica3 node)
    {
        if(this._expLogica3_ != null)
        {
            this._expLogica3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica3_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expLogica3_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expLogica3_ == child)
        {
            this._expLogica3_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expLogica3_ == oldChild)
        {
            setExpLogica3((PExpLogica3) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}