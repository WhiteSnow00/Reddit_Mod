// 
// Decompiled by Procyon v0.6.0
// 

package i8;

import android.os.BaseBundle;
import dg2.w;
import tg2.g;
import android.view.View;
import java.util.WeakHashMap;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import a4.l0$e;
import a4.l0;
import com.bluelinelabs.conductor.ChangeHandlerFrameLayout;
import androidx.recyclerview.widget.RecyclerView$f0;
import androidx.viewpager2.widget.ViewPager2$e;
import java.util.Iterator;
import com.reddit.screen.BaseScreen;
import com.reddit.feature.fullbleedplayer.pager.PageableFullBleedScreen$b;
import com.bluelinelabs.conductor.Controller$e;
import android.view.ViewGroup;
import android.os.Parcelable;
import tg2.h;
import tg2.i;
import java.util.List;
import cg.d;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import dg2.m;
import android.view.ViewParent;
import androidx.viewpager2.widget.ViewPager2;
import androidx.recyclerview.widget.RecyclerView;
import ng2.e;
import com.bluelinelabs.conductor.Router;
import android.util.SparseArray;
import java.util.ArrayList;
import android.os.Bundle;
import android.util.LongSparseArray;
import com.bluelinelabs.conductor.Controller;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public abstract class a extends RecyclerView$Adapter<b> implements a
{
    public final Controller k;
    public LongSparseArray<Bundle> l;
    public ArrayList m;
    public int n;
    public final SparseArray<Router> o;
    public int p;
    public a q;
    
    public a(final Controller k) {
        e.f((Object)k, "host");
        this.k = k;
        this.l = (LongSparseArray<Bundle>)new LongSparseArray();
        this.m = new ArrayList();
        this.n = Integer.MAX_VALUE;
        this.o = (SparseArray<Router>)new SparseArray();
        super.setHasStableIds(true);
    }
    
    public static ViewPager2 o(final RecyclerView recyclerView) {
        final ViewParent parent = ((View)recyclerView).getParent();
        ViewPager2 viewPager2;
        if (parent instanceof ViewPager2) {
            viewPager2 = (ViewPager2)parent;
        }
        else {
            viewPager2 = null;
        }
        if (viewPager2 != null) {
            return viewPager2;
        }
        throw new IllegalStateException(e.l((Object)((View)recyclerView).getParent(), "Expected ViewPager2 instance. Got: ").toString());
    }
    
    public final a$b D() {
        final i w1 = zd.b.w1(0, this.o.size());
        final ArrayList list = new ArrayList<Integer>(dg2.m.u4((Iterable)w1, 10));
        final h f = ((g)w1).f();
        while (f.h) {
            list.add(this.o.keyAt(((w)f).nextInt()));
        }
        final ArrayList j5 = CollectionsKt___CollectionsKt.J5((Collection)list);
        while (j5.isEmpty() ^ true) {
            final int intValue = j5.remove(d.R2((List)j5)).intValue();
            final long itemId = this.getItemId(intValue);
            final Object value = this.o.get(intValue);
            e.e(value, "visibleRouters[lastPosition]");
            this.s(itemId, (Router)value);
            if (j5.isEmpty() ^ true) {
                final int intValue2 = j5.remove(0).intValue();
                final long itemId2 = this.getItemId(intValue2);
                final Object value2 = this.o.get(intValue2);
                e.e(value2, "visibleRouters[firstPosition]");
                this.s(itemId2, (Router)value2);
            }
        }
        final i w2 = zd.b.w1(0, this.l.size());
        final ArrayList list2 = new ArrayList<Long>(dg2.m.u4((Iterable)w2, 10));
        final h f2 = ((g)w2).f();
        while (f2.h) {
            list2.add(this.l.keyAt(((w)f2).nextInt()));
        }
        final i w3 = zd.b.w1(0, this.l.size());
        final ArrayList list3 = new ArrayList<Object>(dg2.m.u4((Iterable)w3, 10));
        final h f3 = ((g)w3).f();
        while (f3.h) {
            list3.add(this.l.valueAt(((w)f3).nextInt()));
        }
        return new a$b(this.n, list2, list3, this.m);
    }
    
    public final void E(final Parcelable parcelable) {
        e.f((Object)parcelable, "state");
        if (!(parcelable instanceof a$b)) {
            return;
        }
        this.l = (LongSparseArray<Bundle>)new LongSparseArray();
        final a$b a$b = (a$b)parcelable;
        final h f = ((g)d.P2((Collection)a$b.f)).f();
        while (f.h) {
            final int nextInt = ((w)f).nextInt();
            this.l.put(((Number)a$b.f.get(nextInt)).longValue(), a$b.g.get(nextInt));
        }
        this.m = CollectionsKt___CollectionsKt.J5((Collection)a$b.h);
        this.n = a$b.i;
    }
    
    public abstract long getItemId(final int p0);
    
    public final void l(final b b, final int n) {
        final long itemId = this.getItemId(n);
        final com.bluelinelabs.conductor.d sa = this.k.SA((ViewGroup)b.f, String.valueOf(itemId), false);
        e.c((Object)sa);
        if (!e.a((Object)sa, (Object)b.g)) {
            final Router g = b.g;
            if (g != null) {
                this.k.vB(g);
            }
        }
        b.g = sa;
        b.i = itemId;
        if (!sa.n()) {
            final Bundle bundle = (Bundle)this.l.get(itemId);
            if (bundle != null) {
                sa.N(bundle);
                this.l.remove(itemId);
                this.m.remove(itemId);
            }
        }
        sa.J();
        final wp0.b b2 = (wp0.b)this;
        BaseScreen u;
        if (!sa.n()) {
            u = b2.u(n);
            ((Controller)u).HA((Controller$e)new wp0.a());
            ((BaseBundle)((Controller)u).f).putBoolean("suppress_screen_view_events", b2 instanceof PageableFullBleedScreen$b ^ true);
            sa.Q(c8.e.a.a((Controller)u));
        }
        else {
            final Controller a = sa.e().get(0).a;
            e.d((Object)a, "null cannot be cast to non-null type com.reddit.screen.BaseScreen");
            u = (BaseScreen)a;
        }
        b2.t(u);
        if (n != this.p) {
            final Iterator iterator = sa.e().iterator();
            while (iterator.hasNext()) {
                ((c8.e)iterator.next()).a.DB(true);
            }
        }
        this.o.put(n, (Object)sa);
        b.j = true;
    }
    
    public final void m(final b b) {
        if (!b.j) {
            return;
        }
        final Router g = b.g;
        if (g != null) {
            g.G();
            this.s(b.i, g);
            if (e.a(this.o.get(b.h), (Object)g)) {
                this.o.remove(b.h);
            }
        }
        b.j = false;
    }
    
    public final void n() {
        while (this.l.size() > this.n) {
            this.l.remove(this.m.remove(0).longValue());
        }
    }
    
    public final void onAttachedToRecyclerView(final RecyclerView recyclerView) {
        e.f((Object)recyclerView, "recyclerView");
        final ViewPager2 o = o(recyclerView);
        final a q = new a();
        o.a((ViewPager2$e)q);
        this.q = q;
    }
    
    public final void onBindViewHolder(final RecyclerView$f0 recyclerView$f0, final int h) {
        final b b = (b)recyclerView$f0;
        e.f((Object)b, "holder");
        this.l(b, b.h = h);
    }
    
    public final RecyclerView$f0 onCreateViewHolder(final ViewGroup viewGroup, int k) {
        e.f((Object)viewGroup, "parent");
        k = b.k;
        final Context context = ((View)viewGroup).getContext();
        e.e((Object)context, "parent.context");
        final ChangeHandlerFrameLayout changeHandlerFrameLayout = new ChangeHandlerFrameLayout(context);
        final WeakHashMap a = l0.a;
        ((View)changeHandlerFrameLayout).setId(l0$e.a());
        ((View)changeHandlerFrameLayout).setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
        ((View)changeHandlerFrameLayout).setSaveEnabled(false);
        return new b(changeHandlerFrameLayout);
    }
    
    public final void onDetachedFromRecyclerView(final RecyclerView recyclerView) {
        e.f((Object)recyclerView, "recyclerView");
        final ViewPager2 o = o(recyclerView);
        final a q = this.q;
        if (q != null) {
            o.h.a.remove(q);
        }
        this.q = null;
    }
    
    public final boolean onFailedToRecycleView(final RecyclerView$f0 recyclerView$f0) {
        e.f((Object)recyclerView$f0, "holder");
        return true;
    }
    
    public /* bridge */ void onViewAttachedToWindow(final RecyclerView$f0 recyclerView$f0) {
        this.p((b)recyclerView$f0);
    }
    
    public /* bridge */ void onViewDetachedFromWindow(final RecyclerView$f0 recyclerView$f0) {
        this.q((b)recyclerView$f0);
    }
    
    public /* bridge */ void onViewRecycled(final RecyclerView$f0 recyclerView$f0) {
        this.r((b)recyclerView$f0);
    }
    
    public void p(final b b) {
        e.f((Object)b, "holder");
        super.onViewAttachedToWindow((RecyclerView$f0)b);
        if (!b.j) {
            this.l(b, b.h);
        }
    }
    
    public void q(final b b) {
        e.f((Object)b, "holder");
        super.onViewDetachedFromWindow((RecyclerView$f0)b);
        this.m(b);
        ((ViewGroup)b.f).removeAllViews();
    }
    
    public void r(final b b) {
        e.f((Object)b, "holder");
        super.onViewRecycled((RecyclerView$f0)b);
        this.m(b);
        final Router g = b.g;
        if (g != null) {
            this.k.vB(g);
            b.g = null;
        }
    }
    
    public final void s(final long n, final Router router) {
        final Bundle bundle = new Bundle();
        router.O(bundle);
        this.l.put(n, (Object)bundle);
        this.m.remove(n);
        this.m.add(n);
        this.n();
    }
    
    public final void setHasStableIds(final boolean b) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly");
    }
    
    public final class a extends ViewPager2$e
    {
        public final i8.a a;
        
        public a(final i8.a a) {
            e.f((Object)a, "this$0");
            this.a = a;
        }
        
        public final void c(final int p) {
            final Router router = (Router)this.a.o.get(p);
            final i8.a a = this.a;
            final int p2 = a.p;
            if (p != p2) {
                final Router router2 = (Router)a.o.get(p2);
                if (router2 != null) {
                    final Iterator iterator = router2.e().iterator();
                    while (iterator.hasNext()) {
                        ((c8.e)iterator.next()).a.DB(true);
                    }
                }
                if (router != null) {
                    final Iterator iterator2 = router.e().iterator();
                    while (iterator2.hasNext()) {
                        ((c8.e)iterator2.next()).a.DB(false);
                    }
                }
                this.a.p = p;
            }
        }
    }
}
