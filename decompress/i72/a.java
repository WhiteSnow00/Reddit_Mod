// 
// Decompiled by Procyon v0.6.0
// 

package i72;

import com.bumptech.glide.h;
import java.util.List;
import mg.d0;
import android.view.ViewGroup;
import android.view.View;
import androidx.appcompat.widget.b1;
import android.view.View$OnClickListener;
import ah0.b;
import android.widget.ImageView;
import ng2.e;
import androidx.recyclerview.widget.RecyclerView$f0;
import kotlin.collections.EmptyList;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class a extends RecyclerView$Adapter<a>
{
    public EmptyList k;
    
    public a() {
        this.k = EmptyList.INSTANCE;
    }
    
    public final int getItemCount() {
        return ((List)this.k).size();
    }
    
    public final void onBindViewHolder(final RecyclerView$f0 recyclerView$f0, final int n) {
        final a a = (a)recyclerView$f0;
        e.f((Object)a, "holder");
        final d d = ((List<d>)this.k).get(n);
        final View itemView = a.itemView;
        e.d((Object)itemView, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView = (ImageView)itemView;
        ((h<Object>)b.M1(((View)a.itemView).getContext()).r(d.e).v(2131232522)).into(imageView);
        ((View)imageView).setContentDescription((CharSequence)d.c);
        ((View)imageView).setOnClickListener((View$OnClickListener)new a((Object)this, n, 2));
        b1.a((View)imageView, d.c);
    }
    
    public final RecyclerView$f0 onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        e.f((Object)viewGroup, "parent");
        return new a(d0.f0(viewGroup, 2131625082, false));
    }
    
    public final class a extends RecyclerView$f0
    {
        public a(final View view) {
            super(view);
        }
    }
}
