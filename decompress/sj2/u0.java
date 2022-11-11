// 
// Decompiled by Procyon v0.6.0
// 

package sj2;

import qj2.e;

public final class u0 extends m0
{
    public final String c;
    
    public u0(final e e) {
        sg2.e.f((Object)e, "primitive");
        super(e);
        final StringBuilder sb = new StringBuilder();
        sb.append(e.h());
        sb.append("Array");
        this.c = sb.toString();
    }
    
    public final String h() {
        return this.c;
    }
}
