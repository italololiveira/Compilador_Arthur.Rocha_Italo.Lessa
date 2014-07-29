/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AExclusiveOrExpressionOrExpression extends POrExpression
{
    private PXorExpression _xorExpression_;

    public AExclusiveOrExpressionOrExpression()
    {
        // Constructor
    }

    public AExclusiveOrExpressionOrExpression(
        @SuppressWarnings("hiding") PXorExpression _xorExpression_)
    {
        // Constructor
        setXorExpression(_xorExpression_);

    }

    @Override
    public Object clone()
    {
        return new AExclusiveOrExpressionOrExpression(
            cloneNode(this._xorExpression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExclusiveOrExpressionOrExpression(this);
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
            + toString(this._xorExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
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
        if(this._xorExpression_ == oldChild)
        {
            setXorExpression((PXorExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
