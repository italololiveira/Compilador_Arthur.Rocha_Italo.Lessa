/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AExpLogicaExp2 extends PExp2
{
    private PExpLogica1 _expLogica1_;

    public AExpLogicaExp2()
    {
        // Constructor
    }

    public AExpLogicaExp2(
        @SuppressWarnings("hiding") PExpLogica1 _expLogica1_)
    {
        // Constructor
        setExpLogica1(_expLogica1_);

    }

    @Override
    public Object clone()
    {
        return new AExpLogicaExp2(
            cloneNode(this._expLogica1_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpLogicaExp2(this);
    }

    public PExpLogica1 getExpLogica1()
    {
        return this._expLogica1_;
    }

    public void setExpLogica1(PExpLogica1 node)
    {
        if(this._expLogica1_ != null)
        {
            this._expLogica1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica1_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expLogica1_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expLogica1_ == child)
        {
            this._expLogica1_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expLogica1_ == oldChild)
        {
            setExpLogica1((PExpLogica1) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
