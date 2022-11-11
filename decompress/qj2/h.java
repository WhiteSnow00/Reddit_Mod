// 
// Decompiled by Procyon v0.6.0
// 

package qj2;

import sg2.e;

public abstract class h
{
    @Override
    public final int hashCode() {
        return this.toString().hashCode();
    }
    
    @Override
    public final String toString() {
        final String o = sg2.h.a((Class)this.getClass()).o();
        e.c((Object)o);
        return o;
    }
    
    public static final class a extends h
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends h
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
}
