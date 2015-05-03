package com.obdobion.algebrain;

import java.util.Stack;

/**
 * @author Chris DeGreef
 * 
 */
public class OpComma extends Operator
{
    public OpComma()
    {
        super();
    }

    public OpComma(final EquPart opTok)
    {
        super(opTok);
    }

    @Override
    protected boolean includeInRpn ()
    {
        return false;
    }

    @Override
    protected int precedence ()
    {
        return 999;
    }

    @Override
    public void resolve (final Stack<Object> values) throws Exception
    {
        throw new Exception("WHAT! " + toString());
    }

    @Override
    public String toString ()
    {
        return "op(comma)";
    }
}
