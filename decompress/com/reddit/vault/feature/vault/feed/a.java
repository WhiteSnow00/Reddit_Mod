// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed;

import android.content.Context;
import x82.n0;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import com.reddit.screen.RedditComposeView;
import ea2.d;
import java.math.BigInteger;
import x82.l0;
import kotlin.Pair;
import hk1.p0;
import com.reddit.vault.widget.CustomCropImageView;
import android.widget.ImageButton;
import xa2.a$a;
import xa2.a$b;
import com.reddit.vault.feature.vault.feed.widget.MembershipRaysDecorationView;
import java.util.Locale;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.content.res.ColorStateList;
import a4.a0;
import android.graphics.Color;
import cj2.j;
import com.reddit.vault.feature.vault.feed.widget.MembershipCardLayout;
import ea2.l;
import androidx.cardview.widget.CardView;
import java.text.DecimalFormat;
import fb2.u;
import android.view.View;
import ea2.h;
import com.reddit.vault.util.PointsFormat;
import ea2.q;
import android.widget.ProgressBar;
import android.widget.ImageView;
import ea2.n;
import android.view.View$OnClickListener;
import android.widget.TextView;
import a92.b;
import android.widget.Button;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import ea2.p;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ea2.g;
import ea2.s;
import sg2.e;
import androidx.recyclerview.widget.RecyclerView$f0;
import kotlin.NoWhenBranchMatchedException;
import ea2.c;
import ea2.t;
import ea2.i;
import ea2.k;
import ea2.o;
import ea2.f;
import ea2.r;
import ea2.w;
import ea2.v;
import java.util.List;
import ea2.f0;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class a extends RecyclerView$Adapter<f0>
{
    public final a.a$a k;
    public final a.a$b l;
    public List<? extends v> m;
    
    public a(final w k, final w l) {
        this.k = (a.a$a)k;
        this.l = (a.a$b)l;
        this.m = ((VaultFeedPresenter)k).A;
    }
    
    public final int getItemCount() {
        return this.m.size();
    }
    
    public final int getItemViewType(int n) {
        final v v = (v)this.m.get(n);
        if (v instanceof r) {
            n = 0;
        }
        else if (v instanceof f) {
            n = 1;
        }
        else if (v instanceof o) {
            n = 2;
        }
        else if (v instanceof ea2.a) {
            n = 3;
        }
        else if (v instanceof k) {
            n = 4;
        }
        else if (v instanceof i) {
            n = 5;
        }
        else if (v instanceof t) {
            n = 6;
        }
        else {
            if (!(v instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            n = 7;
        }
        return n;
    }
    
    public final void onBindViewHolder(final RecyclerView$f0 recyclerView$f0, int i) {
        final f0 f0 = (f0)recyclerView$f0;
        e.f((Object)f0, "holder");
        final v v = (v)this.m.get(i);
        if (f0 instanceof s) {
            final s s = (s)f0;
            e.d((Object)v, "null cannot be cast to non-null type com.reddit.vault.feature.vault.feed.TitleItem");
            s.f.c.setText(((r)v).a);
        }
        else {
            final boolean b = f0 instanceof g;
            boolean b2 = false;
            i = 0;
            if (b) {
                final g g = (g)f0;
                e.d((Object)v, "null cannot be cast to non-null type com.reddit.vault.feature.vault.feed.DividerItem");
                final f f2 = (f)v;
                final View root = g.f.getRoot();
                e.e((Object)root, "binding.root");
                final ViewGroup$LayoutParams layoutParams = root.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                final ViewGroup$MarginLayoutParams layoutParams2 = (ViewGroup$MarginLayoutParams)layoutParams;
                if (f2.a) {
                    i = (int)((RecyclerView$f0)g).itemView.getResources().getDimension(2131165670);
                }
                layoutParams2.bottomMargin = i;
                root.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            }
            else if (f0 instanceof p) {
                final p p2 = (p)f0;
                e.d((Object)v, "null cannot be cast to non-null type com.reddit.vault.feature.vault.feed.PointsItem");
                final o o = (o)v;
                ((ViewGroup)p2.f.b).removeAllViews();
                final LayoutInflater from = LayoutInflater.from(((RecyclerView$f0)p2).itemView.getContext());
                if (o.b) {
                    final LinearLayout linearLayout = (LinearLayout)p2.f.b;
                    final View inflate = from.inflate(2131624637, (ViewGroup)linearLayout, false);
                    ((ViewGroup)linearLayout).addView(inflate);
                    if (inflate == null) {
                        throw new NullPointerException("rootView");
                    }
                    final LinearLayout linearLayout2 = (LinearLayout)inflate;
                }
                else {
                    if (o.a.isEmpty()) {
                        final LinearLayout linearLayout3 = (LinearLayout)p2.f.b;
                        final View inflate2 = from.inflate(2131624635, (ViewGroup)linearLayout3, false);
                        ((ViewGroup)linearLayout3).addView(inflate2);
                        i = 2131429027;
                        final Button button = (Button)a92.b.G(2131429027, inflate2);
                        if (button != null) {
                            i = 2131431715;
                            if (a92.b.G(2131431715, inflate2) != null) {
                                final LinearLayout linearLayout4 = (LinearLayout)inflate2;
                                ((View)button).setOnClickListener((View$OnClickListener)new t32.e((Object)p2, 9));
                                return;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i)));
                    }
                    for (final n n : o.a) {
                        final View inflate3 = from.inflate(2131624634, (ViewGroup)p2.f.b, false);
                        final TextView textView = (TextView)a92.b.G(2131430484, inflate3);
                        if (textView != null) {
                            final ImageView imageView = (ImageView)a92.b.G(2131430492, inflate3);
                            if (imageView != null) {
                                final TextView textView2 = (TextView)a92.b.G(2131430496, inflate3);
                                if (textView2 != null) {
                                    final ProgressBar progressBar = (ProgressBar)a92.b.G(2131430787, inflate3);
                                    if (progressBar != null) {
                                        final ImageView imageView2 = (ImageView)a92.b.G(2131431541, inflate3);
                                        if (imageView2 != null) {
                                            final LinearLayout linearLayout5 = (LinearLayout)inflate3;
                                            if (n instanceof q) {
                                                final q q = (q)n;
                                                final a.a$b g2 = p2.g;
                                                fb2.g.c(imageView2, q.a);
                                                fb2.g.a(imageView, q.a);
                                                textView2.setText((CharSequence)q.a.x);
                                                textView.setText((CharSequence)PointsFormat.b(q.b, false));
                                                ((View)textView).setVisibility(0);
                                                ((View)imageView).setVisibility(0);
                                                if (q.c) {
                                                    i = 0;
                                                }
                                                else {
                                                    i = 8;
                                                }
                                                ((View)progressBar).setVisibility(i);
                                                ((View)linearLayout5).setOnClickListener((View$OnClickListener)new rl1.a(19, (Object)g2, (Object)q));
                                            }
                                            else if (n instanceof h) {
                                                final h h = (h)n;
                                                final a.a$b g3 = p2.g;
                                                com.bumptech.glide.c.f((View)imageView2).clear((View)imageView2);
                                                com.bumptech.glide.c.f((View)imageView).clear((View)imageView);
                                                final String b3 = h.b;
                                                if (b3 == null) {
                                                    textView2.setText(h.e);
                                                }
                                                else {
                                                    textView2.setText((CharSequence)b3);
                                                }
                                                fb2.g.b(imageView2, h.c, 2131231558);
                                                final BigInteger d = h.d;
                                                if (d != null) {
                                                    final String string = ((View)textView).getResources().getString(2131954659, new Object[] { u.a(d, (DecimalFormat)null, false, 6) });
                                                    e.e((Object)string, "points.resources.getStri\u2026er.format(balance),\n    )");
                                                    textView.setText((CharSequence)string);
                                                }
                                                if (h.d != null) {
                                                    i = 1;
                                                }
                                                else {
                                                    i = 0;
                                                }
                                                if (i != 0) {
                                                    i = 0;
                                                }
                                                else {
                                                    i = 8;
                                                }
                                                ((View)textView).setVisibility(i);
                                                if (h.d == null) {
                                                    i = 1;
                                                }
                                                else {
                                                    i = 0;
                                                }
                                                if (i != 0) {
                                                    i = 0;
                                                }
                                                else {
                                                    i = 8;
                                                }
                                                ((View)progressBar).setVisibility(i);
                                                ((View)linearLayout5).setOnClickListener((View$OnClickListener)new cs1.f(9, (Object)g3, (Object)h));
                                            }
                                            ((ViewGroup)p2.f.b).addView((View)linearLayout5);
                                            continue;
                                        }
                                        i = 2131431541;
                                    }
                                    else {
                                        i = 2131430787;
                                    }
                                }
                                else {
                                    i = 2131430496;
                                }
                            }
                            else {
                                i = 2131430492;
                            }
                        }
                        else {
                            i = 2131430484;
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i)));
                    }
                }
            }
            else if (f0 instanceof ea2.b) {
                final ea2.b b4 = (ea2.b)f0;
                e.d((Object)v, "null cannot be cast to non-null type com.reddit.vault.feature.vault.feed.AirdroppingPointsItem");
                final ea2.a a = (ea2.a)v;
                final w51.a f3 = b4.f;
                ((TextView)f3.b).setText((CharSequence)((View)f3.c).getResources().getString(2131954622, new Object[] { a.a }));
                ((View)b4.f.d).setOnClickListener((View$OnClickListener)new om1.a(16, (Object)b4, (Object)a));
            }
            else if (f0 instanceof l) {
                final l l = (l)f0;
                e.d((Object)v, "null cannot be cast to non-null type com.reddit.vault.feature.vault.feed.MembershipAvailableItem");
                final k k = (k)v;
                final MembershipCardLayout membershipCardLayout = (MembershipCardLayout)l.f.d;
                final n0 a2 = k.a;
                final x82.h b5 = k.b;
                final x82.i c = k.c;
                final x82.k d2 = k.d;
                membershipCardLayout.getClass();
                e.f((Object)a2, "user");
                e.f((Object)b5, "community");
                e.f((Object)c, "communityMembershipInfo");
                String g4;
                if (d2 != null) {
                    g4 = d2.g;
                }
                else {
                    g4 = null;
                }
                if (g4 != null && !j.H0((CharSequence)g4)) {
                    i = 0;
                }
                else {
                    i = 1;
                }
                if (i == 0) {
                    e.c((Object)d2);
                    i = Color.parseColor(d2.g);
                }
                else {
                    final String j = b5.k;
                    if (j != null && !cj2.j.H0((CharSequence)j)) {
                        i = 0;
                    }
                    else {
                        i = 1;
                    }
                    if (i == 0) {
                        i = Color.parseColor(b5.k);
                    }
                    else {
                        final Context context = ((View)membershipCardLayout).getContext();
                        e.e((Object)context, "context");
                        i = a0.L(context, 2130969589, 255);
                    }
                }
                String h2;
                if (d2 != null) {
                    h2 = d2.h;
                }
                else {
                    h2 = null;
                }
                if (h2 == null || j.H0((CharSequence)h2)) {
                    b2 = true;
                }
                int n2;
                if (!b2) {
                    e.c((Object)d2);
                    n2 = Color.parseColor(d2.h);
                }
                else {
                    final Context context2 = ((View)membershipCardLayout).getContext();
                    e.e((Object)context2, "context");
                    n2 = a0.L(context2, 2130969600, 255);
                }
                int n3;
                if (q3.e.e(i) > 0.5) {
                    n3 = n3.a.getColor(((View)membershipCardLayout).getContext(), 2131100581);
                }
                else {
                    n3 = n3.a.getColor(((View)membershipCardLayout).getContext(), 2131100582);
                }
                String f4;
                if (d2 != null) {
                    f4 = d2.f;
                }
                else {
                    f4 = null;
                }
                int n4;
                if (f4 != null && !j.H0((CharSequence)f4)) {
                    e.c((Object)d2);
                    n4 = Color.parseColor(d2.f);
                }
                else {
                    final Context context3 = ((View)membershipCardLayout).getContext();
                    e.e((Object)context3, "context");
                    n4 = a0.L(context3, 2130969589, 255);
                }
                final Iterator<Object> iterator2 = membershipCardLayout.g.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().setImageTintList(ColorStateList.valueOf(n4));
                }
                membershipCardLayout.f.d.setBackground((Drawable)new GradientDrawable(GradientDrawable$Orientation.TOP_BOTTOM, new int[] { i, n2 }));
                ((TextView)membershipCardLayout.f.i).setTextColor(n3);
                ((TextView)membershipCardLayout.f.m).setTextColor(n3);
                final ImageView imageView3 = (ImageView)membershipCardLayout.f.n;
                e.e((Object)imageView3, "binding.userAvatar");
                fb2.g.d(imageView3, a2.h);
                final ImageView imageView4 = (ImageView)membershipCardLayout.f.l;
                e.e((Object)imageView4, "binding.subredditIcon");
                fb2.g.c(imageView4, b5);
                ((TextView)membershipCardLayout.f.i).setText((CharSequence)c.h);
                ((TextView)membershipCardLayout.f.m).setText((CharSequence)((View)membershipCardLayout).getContext().getString(2131957502, new Object[] { b5.x }));
                String s2;
                if (((View)membershipCardLayout.f.c).getResources().getDisplayMetrics().density >= 3.0f) {
                    s2 = "@3x";
                }
                else {
                    s2 = "@2x";
                }
                final com.bumptech.glide.j f5 = com.bumptech.glide.c.f((View)membershipCardLayout.f.c);
                final StringBuilder sb = new StringBuilder();
                final String w = b5.w;
                final StringBuilder r = a.r("https://www.redditstatic.com/desktop2x/img/memberships/paywall/");
                final Locale root2 = Locale.ROOT;
                e.e((Object)root2, "ROOT");
                final String lowerCase = w.toLowerCase(root2);
                e.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
                r.append(lowerCase);
                r.append("/membership_frame");
                sb.append(r.toString());
                sb.append(s2);
                sb.append(".png");
                f5.load(sb.toString()).into(membershipCardLayout.f.c);
                if (!membershipCardLayout.h) {
                    membershipCardLayout.h = true;
                    for (i = 0; i < 3; ++i) {
                        membershipCardLayout.n(i);
                    }
                    final pu1.b f6 = membershipCardLayout.f;
                    final MembershipRaysDecorationView membershipRaysDecorationView = (MembershipRaysDecorationView)f6.j;
                    final MembershipRaysDecorationView membershipRaysDecorationView2 = (MembershipRaysDecorationView)f6.k;
                    for (i = 0; i < 2; ++i) {
                        (new MembershipRaysDecorationView[] { membershipRaysDecorationView, membershipRaysDecorationView2 })[i].setLineColor(q3.e.h(n4, 120));
                    }
                    ((MembershipRaysDecorationView)membershipCardLayout.f.j).a(true);
                    ((MembershipRaysDecorationView)membershipCardLayout.f.k).a(false);
                }
                ((View)l.f.c).setOnClickListener((View$OnClickListener)new tn1.i(14, (Object)l, (Object)k));
            }
            else if (f0 instanceof ea2.j) {
                final ea2.j m = (ea2.j)f0;
                e.d((Object)v, "null cannot be cast to non-null type com.reddit.vault.feature.vault.feed.InfoNoticeCardItem");
                final i i2 = (i)v;
                final Context context4 = ((RecyclerView$f0)m).itemView.getContext();
                final Integer k2 = i2.a.k;
                if (k2 != null) {
                    i = n3.a.getColor(context4, k2);
                }
                else {
                    final Context context5 = ((RecyclerView$f0)m).itemView.getContext();
                    e.e((Object)context5, "itemView.context");
                    i = a0.L(context5, 2130969593, 255);
                }
                final CardView cardView = (CardView)m.f.e;
                e.e((Object)cardView, "binding.card");
                final xa2.a g5 = i2.a.g;
                if (g5 instanceof a$b) {
                    cardView.setCardBackgroundColor(n3.a.getColor(((View)cardView).getContext(), ((a$b)g5).f));
                }
                else if (g5 instanceof a$a) {
                    final Context context6 = ((View)cardView).getContext();
                    e.e((Object)context6, "context");
                    cardView.setCardBackgroundColor(a0.L(context6, ((a$a)g5).f, 255));
                }
                ((View)m.f.f).setOnClickListener((View$OnClickListener)new rl1.a(18, (Object)m, (Object)i2));
                ((TextView)m.f.h).setText((CharSequence)context4.getString(i2.a.h));
                final TextView textView3 = (TextView)m.f.d;
                final Integer j2 = i2.a.j;
                String string2;
                if (j2 != null) {
                    string2 = context4.getString(j2.intValue());
                }
                else {
                    string2 = null;
                }
                textView3.setText((CharSequence)string2);
                final TextView textView4 = (TextView)m.f.d;
                e.e((Object)textView4, "binding.body");
                int visibility;
                if (i2.a.j != null) {
                    visibility = 0;
                }
                else {
                    visibility = 8;
                }
                ((View)textView4).setVisibility(visibility);
                ((TextView)m.f.i).setText((CharSequence)context4.getString(i2.a.i));
                ((TextView)m.f.h).setTextColor(i);
                ((TextView)m.f.i).setTextColor(i);
                ((TextView)m.f.d).setTextColor(i);
                ((View)m.f.h).setTransitionName(context4.getString(2131957961, new Object[] { i2.a.f }));
                ((View)m.f.i).setTransitionName(context4.getString(2131957963, new Object[] { i2.a.f }));
                ((View)m.f.g).setTransitionName(context4.getString(2131957962, new Object[] { i2.a.f }));
                final CustomCropImageView customCropImageView = (CustomCropImageView)m.f.c;
                e.e((Object)customCropImageView, "binding.backgroundImage");
                if (i2.a.m.f) {
                    i = 0;
                }
                else {
                    i = 8;
                }
                ((View)customCropImageView).setVisibility(i);
                final ImageView imageView5 = (ImageView)m.f.g;
                e.e((Object)imageView5, "binding.contentImage");
                if (i2.a.m.f) {
                    i = 8;
                }
                else {
                    i = 0;
                }
                ((View)imageView5).setVisibility(i);
                if (i2.a.m.f) {
                    final CustomCropImageView customCropImageView2 = (CustomCropImageView)m.f.c;
                    e.e((Object)customCropImageView2, "binding.backgroundImage");
                    fb2.g.f((ImageView)customCropImageView2, i2.a.l);
                }
                else {
                    final ImageView imageView6 = (ImageView)m.f.g;
                    e.e((Object)imageView6, "binding.contentImage");
                    fb2.g.f(imageView6, i2.a.l);
                }
                final ImageButton imageButton = (ImageButton)m.f.f;
                e.e((Object)imageButton, "binding.closeButton");
                if (i2.a.n) {
                    i = 0;
                }
                else {
                    i = 8;
                }
                ((View)imageButton).setVisibility(i);
                ((View)m.f.e).setOnClickListener((View$OnClickListener)new p0(19, (Object)m, (Object)i2));
            }
            else if (f0 instanceof ea2.u) {
                final ea2.u u = (ea2.u)f0;
                e.d((Object)v, "null cannot be cast to non-null type com.reddit.vault.feature.vault.feed.TransactionsItem");
                final t t = (t)v;
                ((ViewGroup)u.f.b).removeAllViews();
                final LayoutInflater from2 = LayoutInflater.from(((RecyclerView$f0)u).itemView.getContext());
                for (final Pair pair : t.a) {
                    final x82.h h3 = (x82.h)pair.component1();
                    final l0 l2 = (l0)pair.component2();
                    final View inflate4 = from2.inflate(2131624641, (ViewGroup)u.f.b, false);
                    i = 2131428663;
                    final TextView textView5 = (TextView)a92.b.G(2131428663, inflate4);
                    if (textView5 != null) {
                        i = 2131430485;
                        final TextView textView6 = (TextView)a92.b.G(2131430485, inflate4);
                        if (textView6 != null) {
                            final ImageView imageView7 = (ImageView)a92.b.G(2131430489, inflate4);
                            if (imageView7 != null) {
                                final ProgressBar progressBar2 = (ProgressBar)a92.b.G(2131430787, inflate4);
                                if (progressBar2 != null) {
                                    final ImageView imageView8 = (ImageView)a92.b.G(2131431876, inflate4);
                                    if (imageView8 != null) {
                                        final LinearLayout linearLayout6 = (LinearLayout)inflate4;
                                        if (l2.p.isEthTransaction()) {
                                            imageView8.setImageResource(2131231558);
                                            imageView7.setImageTintList((ColorStateList)null);
                                            imageView7.setImageResource(2131231557);
                                            if (l2.o == null) {
                                                i = 1;
                                            }
                                            else {
                                                i = 0;
                                            }
                                            if (i != 0) {
                                                i = 0;
                                            }
                                            else {
                                                i = 8;
                                            }
                                            ((View)imageView7).setVisibility(i);
                                            textView5.setText((CharSequence)l2.i);
                                            if (l2.o != null) {
                                                i = 1;
                                            }
                                            else {
                                                i = 0;
                                            }
                                            if (i != 0) {
                                                i = 0;
                                            }
                                            else {
                                                i = 8;
                                            }
                                            ((View)progressBar2).setVisibility(i);
                                            final BigInteger g6 = l2.g;
                                            if (g6 != null) {
                                                if (g6.compareTo(BigInteger.ZERO) > 0) {
                                                    i = n3.a.getColor(((View)linearLayout6).getContext(), 2131100573);
                                                }
                                                else {
                                                    final Context context7 = ((View)linearLayout6).getContext();
                                                    e.e((Object)context7, "pointView.root.context");
                                                    i = a0.L(context7, 2130969593, 255);
                                                }
                                                textView6.setTextColor(i);
                                                textView6.setText((CharSequence)((View)textView6).getResources().getString(2131954659, new Object[] { fb2.u.a(g6, (DecimalFormat)null, true, 2) }));
                                            }
                                            final int n5 = 0;
                                            if (l2.o == null) {
                                                i = 1;
                                            }
                                            else {
                                                i = 0;
                                            }
                                            if (i != 0) {
                                                i = n5;
                                            }
                                            else {
                                                i = 8;
                                            }
                                            ((View)textView6).setVisibility(i);
                                        }
                                        else {
                                            fb2.g.c(imageView8, h3);
                                            String n6;
                                            if (h3 != null) {
                                                n6 = h3.n;
                                            }
                                            else {
                                                n6 = null;
                                            }
                                            fb2.g.b(imageView7, n6, 2131231702);
                                            textView5.setText((CharSequence)l2.i);
                                            if (l2.o != null) {
                                                i = 1;
                                            }
                                            else {
                                                i = 0;
                                            }
                                            if (i != 0) {
                                                i = 0;
                                            }
                                            else {
                                                i = 8;
                                            }
                                            ((View)progressBar2).setVisibility(i);
                                            if (l2.f.compareTo(BigInteger.ZERO) > 0) {
                                                textView6.setTextColor(n3.a.getColor(((View)linearLayout6).getContext(), 2131100573));
                                            }
                                            else {
                                                final Context context8 = ((View)linearLayout6).getContext();
                                                e.e((Object)context8, "pointView.root.context");
                                                textView6.setTextColor(a0.L(context8, 2130969593, 255));
                                            }
                                            textView6.setText((CharSequence)PointsFormat.b(l2.f, true));
                                        }
                                        ((View)linearLayout6).setOnClickListener((View$OnClickListener)new k00.f((Object)u, 3, (Object)l2, (Object)h3));
                                        ((ViewGroup)u.f.b).addView((View)linearLayout6);
                                        continue;
                                    }
                                    i = 2131431876;
                                }
                                else {
                                    i = 2131430787;
                                }
                            }
                            else {
                                i = 2131430489;
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i)));
                }
            }
            else if (f0 instanceof d) {
                final d d3 = (d)f0;
                e.d((Object)v, "null cannot be cast to non-null type com.reddit.vault.feature.vault.feed.CollectibleAvatarsItem");
                ((RedditComposeView)d3.f.c).setContent((rg2.p)aa1.a.S((Lambda)new CollectibleAvatarsViewHolder$bind$1((c)v, d3), -862720291, true));
            }
        }
    }
    
    public final RecyclerView$f0 onCreateViewHolder(final ViewGroup viewGroup, int n) {
        e.f((Object)viewGroup, "parent");
        final LayoutInflater from = LayoutInflater.from(((View)viewGroup).getContext());
        int n2 = 2131431743;
        Object o = null;
        switch (n) {
            default: {
                throw new IllegalStateException(d.h("Invalid viewType: ", n));
            }
            case 7: {
                final View inflate = from.inflate(2131625554, viewGroup, false);
                if (inflate != null) {
                    final RedditComposeView redditComposeView = (RedditComposeView)inflate;
                    o = new d(new zm1.p((View)redditComposeView, (View)redditComposeView, 3), this.l);
                    break;
                }
                throw new NullPointerException("rootView");
            }
            case 6: {
                o = new ea2.u(lg1.d.a(from, viewGroup), this.l);
                break;
            }
            case 5: {
                final View inflate2 = from.inflate(2131624630, viewGroup, false);
                n = 2131427799;
                final CustomCropImageView customCropImageView = (CustomCropImageView)b.G(2131427799, inflate2);
                if (customCropImageView != null) {
                    n = 2131427911;
                    final TextView textView = (TextView)b.G(2131427911, inflate2);
                    if (textView != null) {
                        final CardView cardView = (CardView)inflate2;
                        n = 2131428288;
                        final ImageButton imageButton = (ImageButton)b.G(2131428288, inflate2);
                        if (imageButton != null) {
                            n = 2131428463;
                            final ImageView imageView = (ImageView)b.G(2131428463, inflate2);
                            if (imageView != null) {
                                final TextView textView2 = (TextView)b.G(2131429301, inflate2);
                                if (textView2 != null) {
                                    final TextView textView3 = (TextView)b.G(2131431743, inflate2);
                                    n = n2;
                                    if (textView3 != null) {
                                        o = new ea2.j(new b61.a(cardView, (View)customCropImageView, textView, (View)cardView, (ImageView)imageButton, imageView, textView2, textView3, 2), this.l);
                                        break;
                                    }
                                }
                                else {
                                    n = 2131429301;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(n)));
            }
            case 4: {
                final View inflate3 = from.inflate(2131624633, viewGroup, false);
                final CardView cardView2 = (CardView)inflate3;
                final MembershipCardLayout membershipCardLayout = (MembershipCardLayout)b.G(2131430066, inflate3);
                if (membershipCardLayout != null) {
                    o = new l(new rt0.b((View)cardView2, (Object)cardView2, (View)membershipCardLayout, 6), this.l);
                    break;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(2131430066)));
            }
            case 3: {
                final View inflate4 = from.inflate(2131624627, viewGroup, false);
                final CardView cardView3 = (CardView)inflate4;
                final TextView textView4 = (TextView)b.G(2131429301, inflate4);
                if (textView4 != null) {
                    final TextView textView5 = (TextView)b.G(2131431743, inflate4);
                    if (textView5 != null) {
                        o = new ea2.b(new w51.a((View)cardView3, (View)cardView3, (View)textView4, (View)textView5, 3), this.l);
                        break;
                    }
                }
                else {
                    n2 = 2131429301;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(n2)));
            }
            case 2: {
                o = new p(lg1.d.a(from, viewGroup), this.l);
                break;
            }
            case 1: {
                final View inflate5 = from.inflate(2131624629, viewGroup, false);
                if (inflate5 != null) {
                    o = new g(new dt1.a(inflate5, inflate5, 2));
                    break;
                }
                throw new NullPointerException("rootView");
            }
            case 0: {
                final View inflate6 = from.inflate(2131624640, viewGroup, false);
                if (inflate6 != null) {
                    final TextView textView6 = (TextView)inflate6;
                    o = new s(new s82.a(textView6, textView6, 0));
                    break;
                }
                throw new NullPointerException("rootView");
            }
        }
        return (RecyclerView$f0)o;
    }
}
