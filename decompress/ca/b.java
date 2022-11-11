// 
// Decompiled by Procyon v0.6.0
// 

package ca;

import ej2.c0;
import sg2.e;
import com.google.accompanist.insets.CalculatedWindowInsetsType;

public final class b implements k
{
    public final k.b b;
    public final k.b c;
    public final k.b d;
    public final k.b e;
    public final k.b f;
    public final CalculatedWindowInsetsType g;
    
    public b() {
        final k.b.a b = k.b.b;
        b.getClass();
        final c b2 = k.b.a.b;
        b.getClass();
        b.getClass();
        b.getClass();
        b.getClass();
        sg2.e.f((Object)b2, "systemGestures");
        sg2.e.f((Object)b2, "navigationBars");
        sg2.e.f((Object)b2, "statusBars");
        sg2.e.f((Object)b2, "ime");
        sg2.e.f((Object)b2, "displayCutout");
        this.b = b2;
        this.c = b2;
        this.d = b2;
        this.e = b2;
        this.f = b2;
        this.g = c0.Y2(new k.b[] { b2, b2 });
    }
    
    @Override
    public final k.b a() {
        return this.c;
    }
    
    @Override
    public final k.b b() {
        return this.e;
    }
    
    @Override
    public final CalculatedWindowInsetsType c() {
        return this.g;
    }
    
    @Override
    public final k.b d() {
        return this.d;
    }
}
