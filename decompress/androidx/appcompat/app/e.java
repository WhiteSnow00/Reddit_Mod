// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.LinearLayout$LayoutParams;
import android.app.Dialog;
import android.view.KeyEvent;
import android.widget.ListAdapter;
import a4.t1;
import java.util.WeakHashMap;
import a4.q0$j;
import a4.q0;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.appcompat.widget.LinearLayoutCompat$a;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.util.TypedValue;
import android.content.Context;
import h.n;

public final class e extends n
{
    public final AlertController j;
    
    public e(final Context context, final int n) {
        super(context, x(n, context));
        this.j = new AlertController(((Dialog)this).getContext(), (n)this, ((Dialog)this).getWindow());
    }
    
    public static int x(final int n, final Context context) {
        if ((n >>> 24 & 0xFF) >= 1) {
            return n;
        }
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968627, typedValue, true);
        return typedValue.resourceId;
    }
    
    @Override
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final AlertController j = this.j;
        int contentView;
        if (j.K == 0) {
            contentView = j.J;
        }
        else {
            contentView = j.J;
        }
        j.b.setContentView(contentView);
        final View viewById = j.c.findViewById(2131430385);
        final View viewById2 = viewById.findViewById(2131431829);
        final View viewById3 = viewById.findViewById(2131428456);
        final View viewById4 = viewById.findViewById(2131428032);
        final ViewGroup viewGroup = (ViewGroup)viewById.findViewById(2131428600);
        View view = j.h;
        final int n = false ? 1 : 0;
        if (view == null) {
            if (j.i != 0) {
                view = LayoutInflater.from(j.a).inflate(j.i, viewGroup, false);
            }
            else {
                view = null;
            }
        }
        final boolean b = view != null;
        if (!b || !AlertController.a(view)) {
            j.c.setFlags(131072, 131072);
        }
        if (b) {
            final FrameLayout frameLayout = (FrameLayout)j.c.findViewById(2131428599);
            ((ViewGroup)frameLayout).addView(view, new ViewGroup$LayoutParams(-1, -1));
            if (j.n) {
                ((View)frameLayout).setPadding(j.j, j.k, j.l, j.m);
            }
            if (j.g != null) {
                ((LinearLayout$LayoutParams)((View)viewGroup).getLayoutParams()).weight = 0.0f;
            }
        }
        else {
            ((View)viewGroup).setVisibility(8);
        }
        final View viewById5 = ((View)viewGroup).findViewById(2131431829);
        final View viewById6 = ((View)viewGroup).findViewById(2131428456);
        final View viewById7 = ((View)viewGroup).findViewById(2131428032);
        final ViewGroup c = AlertController.c(viewById5, viewById2);
        final ViewGroup c2 = AlertController.c(viewById6, viewById3);
        final ViewGroup c3 = AlertController.c(viewById7, viewById4);
        ((View)(j.A = (NestedScrollView)j.c.findViewById(2131431094))).setFocusable(false);
        j.A.setNestedScrollingEnabled(false);
        final TextView f = (TextView)((View)c2).findViewById(16908299);
        if ((j.F = f) != null) {
            final CharSequence f2 = j.f;
            if (f2 != null) {
                f.setText(f2);
            }
            else {
                ((View)f).setVisibility(8);
                ((ViewGroup)j.A).removeView((View)j.F);
                if (j.g != null) {
                    final ViewGroup viewGroup2 = (ViewGroup)((View)j.A).getParent();
                    final int indexOfChild = viewGroup2.indexOfChild((View)j.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView((View)j.g, indexOfChild, new ViewGroup$LayoutParams(-1, -1));
                }
                else {
                    ((View)c2).setVisibility(8);
                }
            }
        }
        ((View)(j.o = (Button)((View)c3).findViewById(16908313))).setOnClickListener((View$OnClickListener)j.R);
        int n2;
        if (TextUtils.isEmpty(j.p) && j.r == null) {
            ((View)j.o).setVisibility(8);
            n2 = 0;
        }
        else {
            ((TextView)j.o).setText(j.p);
            final Drawable r = j.r;
            if (r != null) {
                final int d = j.d;
                r.setBounds(0, 0, d, d);
                ((TextView)j.o).setCompoundDrawables(j.r, (Drawable)null, (Drawable)null, (Drawable)null);
            }
            ((View)j.o).setVisibility(0);
            n2 = 1;
        }
        ((View)(j.s = (Button)((View)c3).findViewById(16908314))).setOnClickListener((View$OnClickListener)j.R);
        if (TextUtils.isEmpty(j.t) && j.v == null) {
            ((View)j.s).setVisibility(8);
        }
        else {
            ((TextView)j.s).setText(j.t);
            final Drawable v = j.v;
            if (v != null) {
                final int d2 = j.d;
                v.setBounds(0, 0, d2, d2);
                ((TextView)j.s).setCompoundDrawables(j.v, (Drawable)null, (Drawable)null, (Drawable)null);
            }
            ((View)j.s).setVisibility(0);
            n2 |= 0x2;
        }
        ((View)(j.w = (Button)((View)c3).findViewById(16908315))).setOnClickListener((View$OnClickListener)j.R);
        if (TextUtils.isEmpty(j.x) && j.z == null) {
            ((View)j.w).setVisibility(8);
        }
        else {
            ((TextView)j.w).setText(j.x);
            final Drawable z = j.z;
            if (z != null) {
                final int d3 = j.d;
                z.setBounds(0, 0, d3, d3);
                ((TextView)j.w).setCompoundDrawables(j.z, (Drawable)null, (Drawable)null, (Drawable)null);
            }
            ((View)j.w).setVisibility(0);
            n2 |= 0x4;
        }
        final Context a = j.a;
        final TypedValue typedValue = new TypedValue();
        a.getTheme().resolveAttribute(2130968625, typedValue, true);
        if (typedValue.data != 0) {
            if (n2 == 1) {
                AlertController.b(j.o);
            }
            else if (n2 == 2) {
                AlertController.b(j.s);
            }
            else if (n2 == 4) {
                AlertController.b(j.w);
            }
        }
        if (n2 == 0) {
            ((View)c3).setVisibility(8);
        }
        if (j.G != null) {
            c.addView(j.G, 0, new ViewGroup$LayoutParams(-1, -2));
            j.c.findViewById(2131431767).setVisibility(8);
        }
        else {
            j.D = (ImageView)j.c.findViewById(16908294);
            if ((TextUtils.isEmpty(j.e) ^ true) && j.P) {
                (j.E = (TextView)j.c.findViewById(2131427604)).setText(j.e);
                final int b2 = j.B;
                if (b2 != 0) {
                    j.D.setImageResource(b2);
                }
                else {
                    final Drawable c4 = j.C;
                    if (c4 != null) {
                        j.D.setImageDrawable(c4);
                    }
                    else {
                        j.E.setPadding(((View)j.D).getPaddingLeft(), ((View)j.D).getPaddingTop(), ((View)j.D).getPaddingRight(), ((View)j.D).getPaddingBottom());
                        j.D.setVisibility(8);
                    }
                }
            }
            else {
                j.c.findViewById(2131431767).setVisibility(8);
                j.D.setVisibility(8);
                ((View)c).setVisibility(8);
            }
        }
        final boolean b3 = ((View)viewGroup).getVisibility() != 8;
        final boolean b4 = c != null && ((View)c).getVisibility() != 8;
        final boolean b5 = ((View)c3).getVisibility() != 8;
        if (!b5) {
            final View viewById8 = ((View)c2).findViewById(2131431657);
            if (viewById8 != null) {
                viewById8.setVisibility(0);
            }
        }
        if (b4) {
            final NestedScrollView a2 = j.A;
            if (a2 != null) {
                ((ViewGroup)a2).setClipToPadding(true);
            }
            View viewById9;
            if (j.f == null && j.g == null) {
                viewById9 = null;
            }
            else {
                viewById9 = ((View)c).findViewById(2131431744);
            }
            if (viewById9 != null) {
                viewById9.setVisibility(0);
            }
        }
        else {
            final View viewById10 = ((View)c2).findViewById(2131431658);
            if (viewById10 != null) {
                viewById10.setVisibility(0);
            }
        }
        final AlertController$RecycleListView g = j.g;
        if (g instanceof AlertController$RecycleListView) {
            if (b5 && b4) {
                g.getClass();
            }
            else {
                final int paddingLeft = ((View)g).getPaddingLeft();
                int n3;
                if (b4) {
                    n3 = ((View)g).getPaddingTop();
                }
                else {
                    n3 = g.f;
                }
                final int paddingRight = ((View)g).getPaddingRight();
                int n4;
                if (b5) {
                    n4 = ((View)g).getPaddingBottom();
                }
                else {
                    n4 = g.g;
                }
                ((View)g).setPadding(paddingLeft, n3, paddingRight, n4);
            }
        }
        if (!b3) {
            Object o = j.g;
            if (o == null) {
                o = j.A;
            }
            if (o != null) {
                int n5 = n;
                if (b5) {
                    n5 = 2;
                }
                final View viewById11 = j.c.findViewById(2131431093);
                final View viewById12 = j.c.findViewById(2131431092);
                final WeakHashMap<View, t1> a3 = q0.a;
                q0$j.d((View)o, (b4 ? 1 : 0) | n5, 3);
                if (viewById11 != null) {
                    c2.removeView(viewById11);
                }
                if (viewById12 != null) {
                    c2.removeView(viewById12);
                }
            }
        }
        final AlertController$RecycleListView g2 = j.g;
        if (g2 != null) {
            final ListAdapter h = j.H;
            if (h != null) {
                ((ListView)g2).setAdapter(h);
                final int i = j.I;
                if (i > -1) {
                    ((AbsListView)g2).setItemChecked(i, true);
                    ((ListView)g2).setSelection(i);
                }
            }
        }
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final NestedScrollView a = this.j.A;
        return (a != null && a.d(keyEvent)) || super.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        final NestedScrollView a = this.j.A;
        return (a != null && a.d(keyEvent)) || super.onKeyUp(n, keyEvent);
    }
    
    @Override
    public final void setTitle(final CharSequence text) {
        super.setTitle(text);
        final AlertController j = this.j;
        j.e = text;
        final TextView e = j.E;
        if (e != null) {
            e.setText(text);
        }
    }
    
    public final Button w(final int n) {
        final AlertController j = this.j;
        Button button;
        if (n != -3) {
            if (n != -2) {
                if (n != -1) {
                    j.getClass();
                    button = null;
                }
                else {
                    button = j.o;
                }
            }
            else {
                button = j.s;
            }
        }
        else {
            button = j.w;
        }
        return button;
    }
}
