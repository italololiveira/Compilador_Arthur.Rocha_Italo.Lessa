/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AVarElem extends PElem
{
    private PVar _var_;

    public AVarElem()
    {
        // Constructor
    }

    public AVarElem(
        @SuppressWarnings("hiding") PVar _var_)
    {
        // Constructor
        setVar(_var_);

    }

    @Override
    public Object clone()
    {
        return new AVarElem(
            cloneNode(this._var_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarElem(this);
    }

    public PVar getVar()
    {
        return this._var_;
    }

    public void setVar(PVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._var_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
