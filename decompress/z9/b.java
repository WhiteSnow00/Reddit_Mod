// 
// Decompiled by Procyon v0.6.0
// 

package z9;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import w5.a;

public final class b implements a
{
    public final ConstraintLayout a;
    public final ImageView b;
    public final View c;
    public final RecyclerView d;
    public final TextView e;
    public final TextView f;
    
    public b(final ConstraintLayout a, final ImageView b, final View c, final RecyclerView d, final TextView e, final TextView f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final View getRoot() {
        return (View)this.a;
    }
}
