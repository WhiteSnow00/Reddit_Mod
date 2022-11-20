// 
// Decompiled by Procyon v0.6.0
// 

package f5;

import a4.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;

public final class e extends h0
{
    public final RecyclerView b;
    public final a c;
    public final e$a d;
    
    public e(final RecyclerView b) {
        super(b);
        this.c = super.getItemDelegate();
        this.d = new e$a(this);
        this.b = b;
    }
    
    public final a getItemDelegate() {
        return (a)this.d;
    }
}
