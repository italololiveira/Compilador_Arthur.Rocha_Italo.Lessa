/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AExp2Exp3 extends PExp3
{
    private PExp4 _exp4_;
    private PMultDiv _multDiv_;
    private PExp3 _exp3_;

    public AExp2Exp3()
    {
        // Constructor
    }

    public AExp2Exp3(
        @SuppressWarnings("hiding") PExp4 _exp4_,
        @SuppressWarnings("hiding") PMultDiv _multDiv_,
        @SuppressWarnings("hiding") PExp3 _exp3_)
    {
        // Constructor
        setExp4(_exp4_);

        setMultDiv(_multDiv_);

        setExp3(_exp3_);

    }

    @Override
    public Object clone()
    {
        return new AExp2Exp3(
            cloneNode(this._exp4_),
            cloneNode(this._multDiv_),
            cloneNode(this._exp3_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExp2Exp3(this);
    }

    public PExp4 getExp4()
    {
        return this._exp4_;
    }

    public void setExp4(PExp4 node)
    {
        if(this._exp4_ != null)
        {
            this._exp4_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp4_ = node;
    }

    public PMultDiv getMultDiv()
    {
        return this._multDiv_;
    }

    public void setMultDiv(PMultDiv node)
    {
        if(this._multDiv_ != null)
        {
            this._multDiv_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multDiv_ = node;
    }

    public PExp3 getExp3()
    {
        return this._exp3_;
    }

    public void setExp3(PExp3 node)
    {
        if(this._exp3_ != null)
        {
            this._exp3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp3_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp4_)
            + toString(this._multDiv_)
            + toString(this._exp3_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp4_ == child)
        {
            this._exp4_ = null;
            return;
        }

        if(this._multDiv_ == child)
        {
            this._multDiv_ = null;
            return;
        }

        if(this._exp3_ == child)
        {
            this._exp3_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp4_ == oldChild)
        {
            setExp4((PExp4) newChild);
            return;
        }

        if(this._multDiv_ == oldChild)
        {
            setMultDiv((PMultDiv) newChild);
            return;
        }

        if(this._exp3_ == oldChild)
        {
            setExp3((PExp3) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
