// 
// Decompiled by Procyon v0.6.0
// 

package i72;

import com.bumptech.glide.h;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.widget.ImageView;
import mg.d0;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import android.view.View$OnClickListener;
import android.view.View;
import oq0.g;
import kotlin.Pair;
import java.util.ArrayList;
import dg2.m;
import androidx.recyclerview.widget.RecyclerView$f0;
import ng2.e;
import androidx.recyclerview.widget.n$f;
import androidx.recyclerview.widget.z;

public final class b extends z<d, b>
{
    public static final b$a m;
    public final c l;
    
    static {
        m = new n$f<d>() {
            public final boolean a(final Object o, final Object o2) {
                return e.a((Object)o, (Object)o2);
            }
            
            public final boolean b(final Object o, final Object o2) {
                final d d = (d)o;
                final d d2 = (d)o2;
                final n$f<d> m = b.m;
                String s;
                if ((s = d.a) == null) {
                    s = d.c;
                }
                String s2;
                if ((s2 = d2.a) == null) {
                    s2 = d2.c;
                }
                return e.a((Object)s, (Object)s2);
            }
        };
    }
    
    public b(final ht1.c l) {
        super((n$f)b.m);
        this.l = (c)l;
        ((RecyclerView$Adapter)this).setHasStableIds(true);
    }
    
    public final long getItemId(final int n) {
        final Object l = this.l(n);
        e.e(l, "getItem(position)");
        final d d = (d)l;
        String s;
        if ((s = d.a) == null) {
            s = d.c;
        }
        return s.hashCode();
    }
    
    public final void onBindViewHolder(final RecyclerView$f0 recyclerView$f0, int n) {
        final b b = (b)recyclerView$f0;
        e.f((Object)b, "holder");
        final d d = (d)this.l(n);
        e.e((Object)d, "trophy");
        b.g.setText((CharSequence)d.c);
        final boolean a = e.a((Object)d.b, (Object)"t6_bf");
        final int n2 = 1;
        if (a) {
            final String d2 = d.d;
            if (d2 != null) {
                final List g1 = kotlin.text.b.g1(2, 2, (CharSequence)d2, new char[] { '\u2022' });
                final ArrayList list = new ArrayList<String>(dg2.m.u4((Iterable)g1, 10));
                final Iterator iterator = g1.iterator();
                while (iterator.hasNext()) {
                    list.add(kotlin.text.b.u1((CharSequence)iterator.next()).toString());
                }
                Pair pair;
                if (list.isEmpty()) {
                    pair = new Pair((Object)d2, (Object)"");
                }
                else if (list.size() == 1) {
                    pair = new Pair((Object)list.get(0), (Object)"");
                }
                else {
                    final String value = list.get(0);
                    final StringBuilder t = a.t(" \u2022 ");
                    t.append(list.get(1));
                    pair = new Pair((Object)value, (Object)t.toString());
                }
                final String text = (String)pair.component1();
                final String s = (String)pair.component2();
                final TextView h = b.h;
                h.setText((CharSequence)text);
                ((View)h).post((Runnable)new androidx.lifecycle.d(22, (Object)h, (Object)s));
            }
        }
        else {
            b.h.setText((CharSequence)d.d);
        }
        ((h<Object>)ah0.b.M1(((View)b.i).getContext()).r(d.e)).into(b.i);
        final TextView h2 = b.h;
        final String d3 = d.d;
        n = n2;
        if (d3 != null) {
            if (d3.length() == 0) {
                n = n2;
            }
            else {
                n = 0;
            }
        }
        g.c((View)h2, (boolean)((n ^ 0x1) != 0x0));
        b.itemView.setOnClickListener((View$OnClickListener)new wt1.a((Object)b, 13));
    }
    
    public final RecyclerView$f0 onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        e.f((Object)viewGroup, "parent");
        return new b(d0.f0(viewGroup, 2131625532, false), this.l);
    }
    
    public static final class b extends RecyclerView$f0
    {
        public static final int j = 0;
        public final c f;
        public final TextView g;
        public final TextView h;
        public final ImageView i;
        
        public b(View viewById, final c f) {
            e.f((Object)f, "actions");
            super(viewById);
            this.f = f;
            final View viewById2 = viewById.findViewById(2131431916);
            e.e((Object)viewById2, "itemView.findViewById(R.id.trophy_title)");
            this.g = (TextView)viewById2;
            final View viewById3 = viewById.findViewById(2131431915);
            e.e((Object)viewById3, "itemView.findViewById(R.id.trophy_subtitle)");
            this.h = (TextView)viewById3;
            viewById = viewById.findViewById(2131431914);
            e.e((Object)viewById, "itemView.findViewById(R.id.trophy_icon)");
            this.i = (ImageView)viewById;
        }
    }
}
