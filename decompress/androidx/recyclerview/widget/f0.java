// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.view.View;
import android.graphics.Rect;

public abstract class f0
{
    public final RecyclerView$o a;
    public int b;
    public final Rect c;
    
    public f0(final RecyclerView$o a) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = a;
    }
    
    public static f0 a(final RecyclerView$o recyclerView$o, final int n) {
        if (n == 0) {
            return (f0)new d0(recyclerView$o);
        }
        if (n == 1) {
            return (f0)new e0(recyclerView$o);
        }
        throw new IllegalArgumentException("invalid orientation");
    }
    
    public abstract int b(final View p0);
    
    public abstract int c(final View p0);
    
    public abstract int d(final View p0);
    
    public abstract int e(final View p0);
    
    public abstract int f();
    
    public abstract int g();
    
    public abstract int h();
    
    public abstract int i();
    
    public abstract int j();
    
    public abstract int k();
    
    public abstract int l();
    
    public final int m() {
        int n;
        if (Integer.MIN_VALUE == this.b) {
            n = 0;
        }
        else {
            n = this.l() - this.b;
        }
        return n;
    }
    
    public abstract int n(final View p0);
    
    public abstract int o(final View p0);
    
    public abstract void p(final int p0);
}
