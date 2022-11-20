// 
// Decompiled by Procyon v0.6.0
// 

package com.caverock.androidsvg;

public final class PreserveAspectRatio
{
    public static final PreserveAspectRatio c;
    public static final PreserveAspectRatio d;
    public Alignment a;
    public Scale b;
    
    static {
        c = new PreserveAspectRatio(Alignment.none, null);
        d = new PreserveAspectRatio(Alignment.xMidYMid, Scale.meet);
        final Alignment none = Alignment.none;
        final Alignment none2 = Alignment.none;
        final Alignment none3 = Alignment.none;
        final Alignment none4 = Alignment.none;
        final Scale meet = Scale.meet;
    }
    
    public PreserveAspectRatio(final Alignment a, final Scale b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (PreserveAspectRatio.class != o.getClass()) {
            return false;
        }
        final PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio)o;
        if (this.a != preserveAspectRatio.a || this.b != preserveAspectRatio.b) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        sb.append(this.b);
        return sb.toString();
    }
    
    public enum Alignment
    {
        private static final Alignment[] $VALUES;
        
        none, 
        xMaxYMax, 
        xMaxYMid, 
        xMaxYMin, 
        xMidYMax, 
        xMidYMid, 
        xMidYMin, 
        xMinYMax, 
        xMinYMid, 
        xMinYMin;
    }
    
    public enum Scale
    {
        private static final Scale[] $VALUES;
        
        meet, 
        slice;
    }
}
