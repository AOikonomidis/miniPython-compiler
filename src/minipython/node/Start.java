/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class Start extends Node
{
    private PGoal _pGoal_;
    private EOF _eof_;

    public Start()
    {
    }

    public Start(
        PGoal _pGoal_,
        EOF _eof_)
    {
        setPGoal(_pGoal_);
        setEOF(_eof_);
    }

    public Object clone()
    {
        return new Start(
            (PGoal) cloneNode(_pGoal_),
            (EOF) cloneNode(_eof_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseStart(this);
    }

    public PGoal getPGoal()
    {
        return _pGoal_;
    }

    public void setPGoal(PGoal node)
    {
        if(_pGoal_ != null)
        {
            _pGoal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pGoal_ = node;
    }

    public EOF getEOF()
    {
        return _eof_;
    }

    public void setEOF(EOF node)
    {
        if(_eof_ != null)
        {
            _eof_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _eof_ = node;
    }

    void removeChild(Node child)
    {
        if(_pGoal_ == child)
        {
            _pGoal_ = null;
            return;
        }

        if(_eof_ == child)
        {
            _eof_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_pGoal_ == oldChild)
        {
            setPGoal((PGoal) newChild);
            return;
        }

        if(_eof_ == oldChild)
        {
            setEOF((EOF) newChild);
            return;
        }
    }

    public String toString()
    {
        return "" +
            toString(_pGoal_) +
            toString(_eof_);
    }
}
