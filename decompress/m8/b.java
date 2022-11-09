// 
// Decompiled by Procyon v0.6.0
// 

package m8;

import com.bumptech.glide.h;
import l9.k;
import com.bumptech.glide.h$a;
import lr0.e;
import androidx.recyclerview.widget.RecyclerView;

public final class b<T> extends t
{
    public final a f;
    
    public b(final e e, final h$a h$a, final k k, final int n) {
        this.f = new a(new h(e, h$a, k, n));
    }
    
    @Override
    public final void onScrolled(final RecyclerView recyclerView, final int n, final int n2) {
        this.f.onScrolled(recyclerView, n, n2);
    }
}
