// 
// Decompiled by Procyon v0.6.0
// 

package ca;

import ej2.c0;
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
        this.g = c0.Y2(new b[] { d, c });
    }
    
    @Override
    public final b a() {
        return this.c;
    }
    
    @Override
    public final b b() {
        return this.e;
    }
    
    @Override
    public final CalculatedWindowInsetsType c() {
        return this.g;
    }
    
    @Override
    public final b d() {
        return this.d;
    }
}
