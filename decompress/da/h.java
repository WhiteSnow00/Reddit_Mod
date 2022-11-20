// 
// Decompiled by Procyon v0.6.0
// 

package da;

import dg.l0;
import com.google.accompanist.insets.CalculatedWindowInsetsType;
import com.google.accompanist.insets.MutableWindowInsetsType;

public final class h implements k
{
    public final MutableWindowInsetsType b;
    public final MutableWindowInsetsType c;
    public final MutableWindowInsetsType d;
    public final MutableWindowInsetsType e;
    public final MutableWindowInsetsType f;
    public final CalculatedWindowInsetsType g;
    
    public h() {
        this.b = new MutableWindowInsetsType();
        final MutableWindowInsetsType c = new MutableWindowInsetsType();
        this.c = c;
        final MutableWindowInsetsType d = new MutableWindowInsetsType();
        this.d = d;
        this.e = new MutableWindowInsetsType();
        this.f = new MutableWindowInsetsType();
        this.g = l0.a0(new k.b[] { (k.b)d, (k.b)c });
    }
    
    public final k.b a() {
        return (k.b)this.c;
    }
    
    public final k.b b() {
        return (k.b)this.e;
    }
    
    public final CalculatedWindowInsetsType c() {
        return this.g;
    }
    
    public final k.b d() {
        return (k.b)this.d;
    }
}
