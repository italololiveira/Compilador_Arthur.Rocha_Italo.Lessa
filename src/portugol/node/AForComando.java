/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import java.util.*;
import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AForComando extends PComando
{
    private TFor _for_;
    private PVar _var_;
    private TOf _of_;
    private TNInt _begin_;
    private TUntil _until_;
    private TNInt _end_;
    private TDo _do_;
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();
    private TEndFor _endFor_;
    private TSemicolon _semicolon_;

    public AForComando()
    {
        // Constructor
    }

    public AForComando(
        @SuppressWarnings("hiding") TFor _for_,
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") TOf _of_,
        @SuppressWarnings("hiding") TNInt _begin_,
        @SuppressWarnings("hiding") TUntil _until_,
        @SuppressWarnings("hiding") TNInt _end_,
        @SuppressWarnings("hiding") TDo _do_,
        @SuppressWarnings("hiding") List<?> _comando_,
        @SuppressWarnings("hiding") TEndFor _endFor_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setFor(_for_);

        setVar(_var_);

        setOf(_of_);

        setBegin(_begin_);

        setUntil(_until_);

        setEnd(_end_);

        setDo(_do_);

        setComando(_comando_);

        setEndFor(_endFor_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AForComando(
            cloneNode(this._for_),
            cloneNode(this._var_),
            cloneNode(this._of_),
            cloneNode(this._begin_),
            cloneNode(this._until_),
            cloneNode(this._end_),
            cloneNode(this._do_),
            cloneList(this._comando_),
            cloneNode(this._endFor_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAForComando(this);
    }

    public TFor getFor()
    {
        return this._for_;
    }

    public void setFor(TFor node)
    {
        if(this._for_ != null)
        {
            this._for_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._for_ = node;
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

    public TOf getOf()
    {
        return this._of_;
    }

    public void setOf(TOf node)
    {
        if(this._of_ != null)
        {
            this._of_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._of_ = node;
    }

    public TNInt getBegin()
    {
        return this._begin_;
    }

    public void setBegin(TNInt node)
    {
        if(this._begin_ != null)
        {
            this._begin_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._begin_ = node;
    }

    public TUntil getUntil()
    {
        return this._until_;
    }

    public void setUntil(TUntil node)
    {
        if(this._until_ != null)
        {
            this._until_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._until_ = node;
    }

    public TNInt getEnd()
    {
        return this._end_;
    }

    public void setEnd(TNInt node)
    {
        if(this._end_ != null)
        {
            this._end_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._end_ = node;
    }

    public TDo getDo()
    {
        return this._do_;
    }

    public void setDo(TDo node)
    {
        if(this._do_ != null)
        {
            this._do_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._do_ = node;
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    public TEndFor getEndFor()
    {
        return this._endFor_;
    }

    public void setEndFor(TEndFor node)
    {
        if(this._endFor_ != null)
        {
            this._endFor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._endFor_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._for_)
            + toString(this._var_)
            + toString(this._of_)
            + toString(this._begin_)
            + toString(this._until_)
            + toString(this._end_)
            + toString(this._do_)
            + toString(this._comando_)
            + toString(this._endFor_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._for_ == child)
        {
            this._for_ = null;
            return;
        }

        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._of_ == child)
        {
            this._of_ = null;
            return;
        }

        if(this._begin_ == child)
        {
            this._begin_ = null;
            return;
        }

        if(this._until_ == child)
        {
            this._until_ = null;
            return;
        }

        if(this._end_ == child)
        {
            this._end_ = null;
            return;
        }

        if(this._do_ == child)
        {
            this._do_ = null;
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        if(this._endFor_ == child)
        {
            this._endFor_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._for_ == oldChild)
        {
            setFor((TFor) newChild);
            return;
        }

        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        if(this._of_ == oldChild)
        {
            setOf((TOf) newChild);
            return;
        }

        if(this._begin_ == oldChild)
        {
            setBegin((TNInt) newChild);
            return;
        }

        if(this._until_ == oldChild)
        {
            setUntil((TUntil) newChild);
            return;
        }

        if(this._end_ == oldChild)
        {
            setEnd((TNInt) newChild);
            return;
        }

        if(this._do_ == oldChild)
        {
            setDo((TDo) newChild);
            return;
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._endFor_ == oldChild)
        {
            setEndFor((TEndFor) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
