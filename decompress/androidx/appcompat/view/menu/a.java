// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.content.Context;

public abstract class a implements i
{
    public Context f;
    public Context g;
    public MenuBuilder h;
    public LayoutInflater i;
    public i$a j;
    public int k;
    public int l;
    public j m;
    public int n;
    
    public a(final Context f) {
        this.f = f;
        this.i = LayoutInflater.from(f);
        this.k = 2131623989;
        this.l = 2131623988;
    }
    
    public final boolean d(final g g) {
        return false;
    }
    
    public final void g(final i$a j) {
        this.j = j;
    }
    
    public final int getId() {
        return this.n;
    }
    
    public final boolean i(final g g) {
        return false;
    }
}
