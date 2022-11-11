// 
// Decompiled by Procyon v0.6.0
// 

package s82;

import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import zm1.p;
import b01.c;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import x5.a;

public final class a0 implements a
{
    public final ConstraintLayout a;
    public final View b;
    public final c c;
    public final p d;
    public final RecyclerView e;
    public final ImageButton f;
    public final ImageButton g;
    public final SwipeRefreshLayout h;
    public final ImageView i;
    
    public a0(final ConstraintLayout a, final View b, final c c, final p d, final RecyclerView e, final ImageButton f, final ImageButton g, final SwipeRefreshLayout h, final ImageView i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final View getRoot() {
        return (View)this.a;
    }
}
