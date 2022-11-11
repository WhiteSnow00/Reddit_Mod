// 
// Decompiled by Procyon v0.6.0
// 

package f92;

import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$f0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import java.util.LinkedHashSet;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class c extends RecyclerView$Adapter<l>
{
    public final c.c$a k;
    public LinkedHashSet l;
    public d m;
    
    public c(final g k) {
        this.k = (c.c$a)k;
        this.l = new LinkedHashSet();
        this.m = new d(this);
    }
    
    public final int getItemCount() {
        return this.k.a().size();
    }
    
    public final int getItemViewType(int n) {
        final e e = this.k.a().get(n);
        if (e instanceof m) {
            n = 0;
        }
        else {
            if (!(e instanceof a)) {
                throw new NoWhenBranchMatchedException();
            }
            n = 1;
        }
        return n;
    }
    
    public final void onAttachedToRecyclerView(final RecyclerView recyclerView) {
        sg2.e.f((Object)recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener((RecyclerView.t)this.m);
    }
    
    public final void onBindViewHolder(final RecyclerView$f0 recyclerView$f0, final int n) {
        final l l = (l)recyclerView$f0;
        sg2.e.f((Object)l, "holder");
        final e e = this.k.a().get(n);
        if (l instanceof n) {
            final n n2 = (n)l;
            sg2.e.d((Object)e, "null cannot be cast to non-null type com.reddit.vault.feature.intro.TitleItem");
            final m m = (m)e;
            ((TextView)n2.f.d).setText(m.a);
            ((TextView)n2.f.c).setText((CharSequence)m.b);
        }
        else if (l instanceof b) {
            final b b = (b)l;
            sg2.e.d((Object)e, "null cannot be cast to non-null type com.reddit.vault.feature.intro.BannerItem");
            final a a = (a)e;
            ((LottieAnimationView)b.f.c).setAnimation(a.a);
            ((TextView)b.f.d).setText(a.b);
            ((TextView)b.f.e).setText(a.c);
        }
    }
    
    public final RecyclerView$f0 onCreateViewHolder(final ViewGroup viewGroup, int n) {
        sg2.e.f((Object)viewGroup, "parent");
        final LayoutInflater from = LayoutInflater.from(((View)viewGroup).getContext());
        if (n == 0) {
            final View inflate = from.inflate(2131624632, viewGroup, false);
            n = 2131431547;
            final TextView textView = (TextView)a92.b.G(2131431547, inflate);
            if (textView != null) {
                n = 2131431743;
                final TextView textView2 = (TextView)a92.b.G(2131431743, inflate);
                if (textView2 != null) {
                    final Object o = new n(new zv0.b(7, (View)inflate, (View)textView, (View)textView2));
                    return (RecyclerView$f0)o;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(n)));
        }
        if (n == 1) {
            final View inflate2 = from.inflate(2131624631, viewGroup, false);
            n = 2131427848;
            final TextView textView3 = (TextView)a92.b.G(2131427848, inflate2);
            if (textView3 != null) {
                n = 2131427911;
                final TextView textView4 = (TextView)a92.b.G(2131427911, inflate2);
                if (textView4 != null) {
                    n = 2131429451;
                    final LottieAnimationView lottieAnimationView = (LottieAnimationView)a92.b.G(2131429451, inflate2);
                    if (lottieAnimationView != null) {
                        final Object o = new b(new fw.c((ViewGroup)inflate2, textView3, textView4, (View)lottieAnimationView, 6));
                        return (RecyclerView$f0)o;
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(n)));
        }
        throw new IllegalStateException(d.h("Invalid viewType: ", n));
    }
    
    public final void onDetachedFromRecyclerView(final RecyclerView recyclerView) {
        sg2.e.f((Object)recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.removeOnScrollListener((RecyclerView.t)this.m);
    }
    
    public final void onViewAttachedToWindow(final RecyclerView$f0 recyclerView$f0) {
        final l l = (l)recyclerView$f0;
        sg2.e.f((Object)l, "holder");
        super.onViewAttachedToWindow((RecyclerView$f0)l);
        if (l instanceof b) {
            this.l.add(l);
        }
    }
    
    public final void onViewDetachedFromWindow(final RecyclerView$f0 recyclerView$f0) {
        final l l = (l)recyclerView$f0;
        sg2.e.f((Object)l, "holder");
        super.onViewDetachedFromWindow((RecyclerView$f0)l);
        if (l instanceof b) {
            this.l.remove(l);
        }
    }
}
