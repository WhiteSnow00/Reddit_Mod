// 
// Decompiled by Procyon v0.6.0
// 

package s82;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import x5.a;

public final class b0 implements a
{
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final Button c;
    public final FrameLayout d;
    public final TextView e;
    public final ImageView f;
    public final RecyclerView g;
    
    public b0(final ConstraintLayout a, final LinearLayout b, final Button c, final FrameLayout d, final TextView e, final ImageView f, final RecyclerView g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final View getRoot() {
        return (View)this.a;
    }
}
