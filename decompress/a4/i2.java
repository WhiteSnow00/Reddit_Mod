// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.os.Build$VERSION;
import android.view.View;
import android.view.Window;

public final class i2
{
    public final e a;
    
    public i2(final Window window, final View view) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30) {
            this.a = (e)new i2.i2$d(window);
        }
        else if (sdk_INT >= 26) {
            this.a = (e)new c(window, view);
        }
        else {
            this.a = (e)new b(window, view);
        }
    }
    
    public static class b extends i2$a
    {
        public b(final Window window, final View view) {
            super(window, view);
        }
        
        public final boolean b() {
            return (super.a.getDecorView().getSystemUiVisibility() & 0x2000) != 0x0;
        }
        
        public final void c(final boolean b) {
            if (b) {
                super.a.clearFlags(67108864);
                super.a.addFlags(Integer.MIN_VALUE);
                this.f(8192);
            }
            else {
                this.g(8192);
            }
        }
    }
    
    public static final class c extends b
    {
        public c(final Window window, final View view) {
            super(window, view);
        }
    }
    
    public static class e
    {
        public void a() {
            throw null;
        }
        
        public boolean b() {
            throw null;
        }
        
        public void c(final boolean b) {
            throw null;
        }
        
        public void d() {
            throw null;
        }
        
        public void e() {
            throw null;
        }
    }
}
