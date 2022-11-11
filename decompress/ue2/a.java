// 
// Decompiled by Procyon v0.6.0
// 

package ue2;

import sg2.e;
import q0.j;

public final class a extends c
{
    public final j a;
    
    public a(final j a) {
        e.f((Object)a, "lazyListItem");
        this.a = a;
    }
    
    public final int a() {
        return this.a.getIndex();
    }
    
    public final int b() {
        return this.a.getOffset();
    }
    
    public final int c() {
        return this.a.getSize();
    }
}
