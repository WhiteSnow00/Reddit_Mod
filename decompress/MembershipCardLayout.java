// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed.widget;

import bn0.f;
import android.animation.TimeInterpolator;
import ga2.a;
import android.widget.TextView;
import android.view.View;
import android.widget.Space;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import sg2.e;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import java.util.List;
import pu1.b;
import kotlin.Metadata;
import androidx.constraintlayout.widget.ConstraintLayout;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/vault/feature/vault/feed/widget/MembershipCardLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "impl_release" }, k = 1, mv = { 1, 7, 1 })
public final class MembershipCardLayout extends ConstraintLayout
{
    public static final long[] i;
    public final b f;
    public final List<ImageView> g;
    public boolean h;
    
    static {
        i = new long[] { 2000L, 1600L, 2800L };
    }
    
    public MembershipCardLayout(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        this(context, set, 0);
    }
    
    public MembershipCardLayout(final Context context, final AttributeSet set, int n) {
        e.f((Object)context, "context");
        super(context, set, n);
        LayoutInflater.from(context).inflate(2131625566, (ViewGroup)this);
        n = 2131427352;
        final Space space = (Space)a92.b.G(2131427352, (View)this);
        if (space != null) {
            n = 2131427698;
            final ImageView imageView = (ImageView)a92.b.G(2131427698, (View)this);
            if (imageView != null) {
                n = 2131427803;
                final View g = a92.b.G(2131427803, (View)this);
                if (g != null) {
                    n = 2131428724;
                    final ImageView imageView2 = (ImageView)a92.b.G(2131428724, (View)this);
                    if (imageView2 != null) {
                        n = 2131428725;
                        final ImageView imageView3 = (ImageView)a92.b.G(2131428725, (View)this);
                        if (imageView3 != null) {
                            n = 2131428726;
                            final ImageView imageView4 = (ImageView)a92.b.G(2131428726, (View)this);
                            if (imageView4 != null) {
                                n = 2131429301;
                                final TextView textView = (TextView)a92.b.G(2131429301, (View)this);
                                if (textView != null) {
                                    n = 2131430862;
                                    final MembershipRaysDecorationView membershipRaysDecorationView = (MembershipRaysDecorationView)a92.b.G(2131430862, (View)this);
                                    if (membershipRaysDecorationView != null) {
                                        n = 2131430863;
                                        final MembershipRaysDecorationView membershipRaysDecorationView2 = (MembershipRaysDecorationView)a92.b.G(2131430863, (View)this);
                                        if (membershipRaysDecorationView2 != null) {
                                            n = 2131431540;
                                            final ImageView imageView5 = (ImageView)a92.b.G(2131431540, (View)this);
                                            if (imageView5 != null) {
                                                n = 2131431743;
                                                final TextView textView2 = (TextView)a92.b.G(2131431743, (View)this);
                                                if (textView2 != null) {
                                                    n = 2131432076;
                                                    final ImageView imageView6 = (ImageView)a92.b.G(2131432076, (View)this);
                                                    if (imageView6 != null) {
                                                        this.f = new b((View)this, space, imageView, g, imageView2, imageView3, imageView4, textView, membershipRaysDecorationView, membershipRaysDecorationView2, imageView5, textView2, imageView6);
                                                        this.g = lw0.b.s1((Object[])new ImageView[] { imageView2, imageView3, imageView4 });
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(((View)this).getResources().getResourceName(n)));
    }
    
    public final void n(final int n) {
        if (((View)this).getParent() == null) {
            return;
        }
        ((View)this.g.get(n)).animate().scaleXBy(-0.5f).scaleYBy(-0.5f).setDuration(MembershipCardLayout.i[n]).setInterpolator((TimeInterpolator)a.a).withEndAction((Runnable)new f(this, n));
    }
}
