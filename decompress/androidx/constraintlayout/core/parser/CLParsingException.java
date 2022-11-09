// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.core.parser;

import b3.a;

public class CLParsingException extends Exception
{
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;
    
    public CLParsingException(final String mReason, final a a) {
        this.mReason = mReason;
        this.mElementClass = "unknown";
        this.mLineNumber = 0;
    }
    
    public String reason() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.mReason);
        sb.append(" (");
        sb.append(this.mElementClass);
        sb.append(" at line ");
        return d.l(sb, this.mLineNumber, ")");
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CLParsingException (");
        k.append(this.hashCode());
        k.append(") : ");
        k.append(this.reason());
        return k.toString();
    }
}
