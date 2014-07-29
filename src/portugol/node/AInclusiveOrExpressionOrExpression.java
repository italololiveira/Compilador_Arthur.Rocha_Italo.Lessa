/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AInclusiveOrExpressionOrExpression extends POrExpression
{
    private POrExpression _orExpression_;
    private TOr _or_;
    private PXorExpression _xorExpression_;

    public AInclusiveOrExpressionOrExpression()
    {
        // Constructor
    }

    public AInclusiveOrExpressionOrExpression(
        @SuppressWarnings("hiding") POrExpression _orExpression_,
        @SuppressWarnings("hiding") TOr _or_,
        @SuppressWarnings("hiding") PXorExpression _xorExpression_)
    {
        // Constructor
        setOrExpression(_orExpression_);

        setOr(_or_);

        setXorExpression(_xorExpression_);

    }

    @Override
    public Object clone()
    {
        return new AInclusiveOrExpressionOrExpression(
            cloneNode(this._orExpression_),
            cloneNode(this._or_),
            cloneNode(this._xorExpression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInclusiveOrExpressionOrExpression(this);
    }

    public POrExpression getOrExpression()
    {
        return this._orExpression_;
    }

    public void setOrExpression(POrExpression node)
    {
        if(this._orExpression_ != null)
        {
            this._orExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._orExpression_ = node;
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

    public PXorExpression getXorExpression()
    {
        return this._xorExpression_;
    }

    public void setXorExpression(PXorExpression node)
    {
        if(this._xorExpression_ != null)
        {
            this._xorExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._xorExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._orExpression_)
            + toString(this._or_)
            + toString(this._xorExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._orExpression_ == child)
        {
            this._orExpression_ = null;
            return;
        }

        if(this._or_ == child)
        {
            this._or_ = null;
            return;
        }

        if(this._xorExpression_ == child)
        {
            this._xorExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._orExpression_ == oldChild)
        {
            setOrExpression((POrExpression) newChild);
            return;
        }

        if(this._or_ == oldChild)
        {
            setOr((TOr) newChild);
            return;
        }

        if(this._xorExpression_ == oldChild)
        {
            setXorExpression((PXorExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}