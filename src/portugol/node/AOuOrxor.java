/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AOuOrxor extends POrxor
{
    private TOr _or_;

    public AOuOrxor()
    {
        // Constructor
    }

    public AOuOrxor(
        @SuppressWarnings("hiding") TOr _or_)
    {
        // Constructor
        setOr(_or_);

    }

    @Override
    public Object clone()
    {
        return new AOuOrxor(
            cloneNode(this._or_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOuOrxor(this);
    }

    public TOr getOr()
    {
        return this._or_;
    }

    public void setOr(TOr node)
    {
        if(this._or_ != null)
        {
            this._or_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._or_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._or_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._or_ == child)
        {
            this._or_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._or_ == oldChild)
        {
            setOr((TOr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
