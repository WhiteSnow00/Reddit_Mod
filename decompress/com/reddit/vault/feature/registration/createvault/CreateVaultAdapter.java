// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.createvault;

import android.widget.CompoundButton;
import android.widget.LinearLayout;
import java.math.BigInteger;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$LayoutParams;
import java.util.Iterator;
import n92.t;
import android.widget.CompoundButton$OnCheckedChangeListener;
import tk1.k;
import android.widget.CheckBox;
import com.reddit.vault.util.LegalUtilKt;
import n92.b;
import android.view.View$OnClickListener;
import android.widget.Button;
import rg2.l;
import n92.x;
import n92.w;
import n92.p$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import xc.c;
import com.airbnb.lottie.LottieAnimationView;
import n92.p$a;
import android.widget.TextView;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import n92.r;
import androidx.recyclerview.widget.RecyclerView$f0;
import rg2.p;
import com.reddit.vault.widget.SizeListenerRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import n92.a;
import n92.j;
import n92.u;
import sg2.e;
import n92.s;
import n92.v;
import n92.o;
import n92.f;
import n92.d;
import java.util.List;
import n92.m;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class CreateVaultAdapter extends RecyclerView$Adapter<m>
{
    public final boolean k;
    public final CreateVaultAdapter.CreateVaultAdapter$a l;
    public final CreateVaultAdapter.CreateVaultAdapter$b m;
    public List<? extends d> n;
    public int o;
    public int p;
    public List<? extends m> q;
    
    public CreateVaultAdapter(final boolean k, final f l, final f m) {
        this.k = k;
        this.l = (CreateVaultAdapter.CreateVaultAdapter$a)l;
        this.m = (CreateVaultAdapter.CreateVaultAdapter$b)m;
        this.n = ((CreateVaultAdapter.CreateVaultAdapter$a)l).a();
    }
    
    public final int getItemCount() {
        return this.n.size();
    }
    
    public final int getItemViewType(int n) {
        final d d = (d)this.n.get(n);
        if (d instanceof o) {
            n = 0;
        }
        else if (d instanceof v) {
            n = 1;
        }
        else if (e.a((Object)d, (Object)s.a)) {
            n = 2;
        }
        else if (d instanceof u) {
            n = 3;
        }
        else if (e.a((Object)d, (Object)j.a)) {
            n = 4;
        }
        else {
            if (!e.a((Object)d, (Object)a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            n = 5;
        }
        return n;
    }
    
    public final void onAttachedToRecyclerView(final RecyclerView recyclerView) {
        e.f((Object)recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.o = ((View)recyclerView).getWidth();
        this.p = ((View)recyclerView).getHeight();
        ((SizeListenerRecyclerView)recyclerView).setSizeListener((p)new CreateVaultAdapter$onAttachedToRecyclerView$1(this));
    }
    
    public final void onBindViewHolder(final RecyclerView$f0 recyclerView$f0, int n) {
        final m m = (m)recyclerView$f0;
        e.f((Object)m, "holder");
        final d d = this.l.a().get(n);
        final boolean b = m instanceof r;
        final int n2 = 0;
        final int n3 = 0;
        boolean p2 = false;
        n = 1;
        final int n4 = 1;
        if (b) {
            final r r = (r)m;
            e.d((Object)d, "null cannot be cast to non-null type com.reddit.vault.feature.registration.createvault.HeaderItem");
            final o o = (o)d;
            final int o2 = this.o;
            final int p3 = this.p;
            if (r.h != o2 || r.i != p3) {
                r.h = o2;
                r.i = p3;
                final Iterator iterator = r.g.iterator();
                n = 0;
                while (iterator.hasNext()) {
                    final m i = (m)iterator.next();
                    final ViewGroup$LayoutParams layoutParams = ((RecyclerView$f0)i).itemView.getLayoutParams();
                    e.d((Object)layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                    ((RecyclerView$f0)i).itemView.measure(View$MeasureSpec.makeMeasureSpec(o2 - viewGroup$MarginLayoutParams.getMarginStart() - viewGroup$MarginLayoutParams.getMarginEnd(), 1073741824), 0);
                    n += ((RecyclerView$f0)i).itemView.getMeasuredHeight() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
                }
                r.j = p3 - n;
            }
            final ConstraintLayout d2 = r.f.d();
            e.e((Object)d2, "binding.root");
            final ViewGroup$LayoutParams layoutParams2 = ((View)d2).getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = r.j;
            ((View)d2).setLayoutParams(layoutParams2);
            ((TextView)r.f.e).setText(o.a);
            final TextView textView = (TextView)r.f.e;
            e.e((Object)textView, "binding.createTitle");
            if (o.b != null) {
                n = 1;
            }
            else {
                n = 0;
            }
            final int n5 = 4;
            if (n != 0) {
                n = 4;
            }
            else {
                n = 0;
            }
            ((View)textView).setVisibility(n);
            final Integer b2 = o.b;
            if (b2 != null) {
                n = b2.intValue();
                ((TextView)r.f.c).setText(n);
            }
            final TextView textView2 = (TextView)r.f.c;
            e.e((Object)textView2, "binding.generateTitle");
            if (o.b == null) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                n = 4;
            }
            else {
                n = 0;
            }
            ((View)textView2).setVisibility(n);
            final Integer c = o.c;
            if (c != null) {
                n = c.intValue();
                ((TextView)r.f.d).setText(n);
            }
            final TextView textView3 = (TextView)r.f.d;
            e.e((Object)textView3, "binding.body");
            if (o.c == null) {
                n = n4;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                n = n5;
            }
            else {
                n = 0;
            }
            ((View)textView3).setVisibility(n);
            final n92.p d3 = o.d;
            if (d3 instanceof p$a) {
                final boolean a = ((p$a)d3).a;
                ((LottieAnimationView)r.f.f).setRepeatCount(-1);
                ((LottieAnimationView)r.f.f).n.g.removeAllListeners();
                ((LottieAnimationView)r.f.f).i();
                if (!e.a((Object)r.k, (Object)"create_your_vault.json")) {
                    r.k = "create_your_vault.json";
                    ((LottieAnimationView)r.f.f).setAnimation("create_your_vault.json");
                }
                if (a) {
                    ((LottieAnimationView)r.f.f).setMaxFrame(135);
                    ((LottieAnimationView)r.f.f).n.g.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new c((Object)r, 3));
                }
                else {
                    ((LottieAnimationView)r.f.f).n.q(0, 30);
                }
                final View f = r.f.f;
                final c7.d g = ((LottieAnimationView)f).n.g;
                if (g != null) {
                    p2 = g.p;
                }
                if (!p2) {
                    ((LottieAnimationView)f).h();
                }
            }
            else if (d3 instanceof p$b) {
                final p$b p$b = (p$b)d3;
                final l a2 = p$b.a;
                final rg2.a b3 = p$b.b;
                ((LottieAnimationView)r.f.f).setRepeatCount(-1);
                if (!e.a((Object)r.k, (Object)"generating_vault.json")) {
                    r.k = "generating_vault.json";
                    ((LottieAnimationView)r.f.f).setAnimation("generating_vault.json");
                }
                ((LottieAnimationView)r.f.f).n.q(0, 105);
                ((LottieAnimationView)r.f.f).n.g.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new cx0.v((Object)r, 2));
                final View f2 = r.f.f;
                final c7.d g2 = ((LottieAnimationView)f2).n.g;
                int p4;
                if (g2 == null) {
                    p4 = n2;
                }
                else {
                    p4 = (g2.p ? 1 : 0);
                }
                if (p4 == 0) {
                    ((LottieAnimationView)f2).h();
                }
                a2.invoke(new HeaderViewHolder$loopGeneratingVaultIllustration$2(r, b3));
            }
        }
        else if (m instanceof w) {
            final w w = (w)m;
            e.d((Object)d, "null cannot be cast to non-null type com.reddit.vault.feature.registration.createvault.StatusItem");
            final v v = (v)d;
            ((TextView)w.f.c).setText(v.a);
            final Integer b4 = v.b;
            if (b4 != null) {
                ((TextView)w.f.d).setText(b4.intValue());
            }
            final TextView textView4 = (TextView)w.f.d;
            e.e((Object)textView4, "binding.statusText2");
            if (v.b == null) {
                n = 0;
            }
            if (n != 0) {
                n = n3;
            }
            else {
                n = 8;
            }
            ((View)textView4).setVisibility(n);
        }
        else if (m instanceof x) {
            final x x = (x)m;
            e.d((Object)d, "null cannot be cast to non-null type com.reddit.vault.feature.registration.createvault.RestoreVaultItem");
            x.R0((u)d, (l)new CreateVaultAdapter$onBindViewHolder$1(this.m));
        }
        else if (m instanceof n92.c) {
            ((View)((n92.c)m).f.b).setOnClickListener((View$OnClickListener)new yp1.d((rg2.a)new CreateVaultAdapter$onBindViewHolder$2(this.m), 6));
        }
        else if (m instanceof b) {
            final b b5 = (b)m;
            final CreateVaultAdapter$onBindViewHolder$3 createVaultAdapter$onBindViewHolder$3 = new CreateVaultAdapter$onBindViewHolder$3(this.m);
            final CreateVaultAdapter$onBindViewHolder$4 createVaultAdapter$onBindViewHolder$4 = new CreateVaultAdapter$onBindViewHolder$4(this.m);
            final CreateVaultAdapter$onBindViewHolder$5 createVaultAdapter$onBindViewHolder$5 = new CreateVaultAdapter$onBindViewHolder$5(this.m);
            final TextView textView5 = (TextView)b5.f.c;
            e.e((Object)textView5, "binding.acceptTermsText");
            LegalUtilKt.b(textView5, 0, 0, 15);
            ((View)b5.f.c).setOnClickListener((View$OnClickListener)new m42.a((Object)b5, 5));
            ((CompoundButton)b5.f.e).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new k(1, (Object)createVaultAdapter$onBindViewHolder$3, (Object)b5));
            ((View)b5.f.d).setOnClickListener((View$OnClickListener)new yk0.c((rg2.a)createVaultAdapter$onBindViewHolder$4, 9));
            ((View)b5.f.f).setOnClickListener((View$OnClickListener)new qn0.d((rg2.a)createVaultAdapter$onBindViewHolder$5, 6));
        }
        else {
            final boolean b6 = m instanceof t;
        }
    }
    
    public final RecyclerView$f0 onCreateViewHolder(final ViewGroup viewGroup, int n) {
        e.f((Object)viewGroup, "parent");
        final LayoutInflater from = LayoutInflater.from(((View)viewGroup).getContext());
        if (n == 0) {
            final View inflate = from.inflate(2131624470, viewGroup, false);
            n = 2131427911;
            final TextView textView = (TextView)a92.b.G(2131427911, inflate);
            if (textView != null) {
                n = 2131428545;
                final TextView textView2 = (TextView)a92.b.G(2131428545, inflate);
                if (textView2 != null) {
                    n = 2131429185;
                    final TextView textView3 = (TextView)a92.b.G(2131429185, inflate);
                    if (textView3 != null) {
                        n = 2131429984;
                        final LottieAnimationView lottieAnimationView = (LottieAnimationView)a92.b.G(2131429984, inflate);
                        if (lottieAnimationView != null) {
                            final fw.a a = new fw.a((ConstraintLayout)inflate, textView, textView2, textView3, lottieAnimationView);
                            if (this.q == null) {
                                final LayoutInflater from2 = LayoutInflater.from(((View)viewGroup).getContext());
                                List q;
                                if (this.k) {
                                    final t t = new t(qk1.a.b(from2, viewGroup));
                                    final x x = new x(e81.b.b(from2, viewGroup));
                                    final BigInteger zero = BigInteger.ZERO;
                                    e.e((Object)zero, "ZERO");
                                    x.R0(new u(new x82.a(zero), "subtitle", true), (l)CreateVaultAdapter$getDummyFooterViews$1$1.INSTANCE);
                                    final hg2.j a2 = hg2.j.a;
                                    q = lw0.b.s1((Object[])new m[] { (m)t, (m)x, (m)new n92.c(qk1.a.c(from2, viewGroup)) });
                                }
                                else {
                                    q = lw0.b.r1((Object)new b(j00.c.d(from2, viewGroup)));
                                }
                                this.q = q;
                            }
                            final List<? extends m> q2 = this.q;
                            e.c((Object)q2);
                            final Object o = new r(a, (List)q2);
                            return (RecyclerView$f0)o;
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(n)));
        }
        if (n == 1) {
            final View inflate2 = from.inflate(2131624472, viewGroup, false);
            n = 2131431429;
            final TextView textView4 = (TextView)a92.b.G(2131431429, inflate2);
            if (textView4 != null) {
                n = 2131431430;
                final TextView textView5 = (TextView)a92.b.G(2131431430, inflate2);
                if (textView5 != null) {
                    final Object o = new w(new dz.a(12, (View)inflate2, (View)textView4, (View)textView5));
                    return (RecyclerView$f0)o;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(n)));
        }
        Object o;
        if (n != 2) {
            if (n != 3) {
                if (n != 4) {
                    if (n != 5) {
                        throw new IllegalStateException(d.h("Invalid viewType: ", n));
                    }
                    o = new b(j00.c.d(from, viewGroup));
                }
                else {
                    o = new n92.c(qk1.a.c(from, viewGroup));
                }
            }
            else {
                o = new x(e81.b.b(from, viewGroup));
            }
        }
        else {
            o = new t(qk1.a.b(from, viewGroup));
        }
        return (RecyclerView$f0)o;
    }
    
    public final void onDetachedFromRecyclerView(final RecyclerView recyclerView) {
        e.f((Object)recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        ((SizeListenerRecyclerView)recyclerView).setSizeListener((p)null);
    }
}
