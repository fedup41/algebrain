package com.obdobion.algebrain;

import java.util.Stack;

/**
 * @author Chris DeGreef
 * 
 */
public class TokLiteral extends TokOperand
{
    private int delims;

    public TokLiteral()
    {
        super();
        setDelims(0);
    }

    @Override
    public boolean accepts (final char s)
    {
        return getDelims() != 2;
    }

    public int getDelims ()
    {
        return delims;
    }

    @Override
    public void put (final char c)
    {
        if (c != '\'')
            super.put(c);
        else
            setDelims(getDelims() + 1);
    }

    @Override
    public void resolve (final Stack<Object> values) throws Exception
    {
        values.push(getValue().toString());
    }

    public void setDelims (final int newDelims)
    {
        delims = newDelims;
    }

    @Override
    public String toString ()
    {
        return "lit(" + super.toString() + ")";
    }
}
