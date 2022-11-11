// 
// Decompiled by Procyon v0.6.0
// 

package s82;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.LinearLayout;
import x5.a;

public final class b implements a
{
    public final LinearLayout a;
    public final TextView b;
    public final Button c;
    
    public b(final LinearLayout a, final TextView b, final Button c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final View getRoot() {
        return (View)this.a;
    }
}
