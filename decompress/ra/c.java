// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import android.view.ViewGroup;
import android.net.NetworkInfo;
import rp0.a;
import android.view.View;
import android.content.Context;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import android.net.ConnectivityManager;
import ta.a$a;
import c40.k;
import java.util.Objects;
import xp0.d;
import com.reddit.ui.TooltipPopupWindow$TailType;
import com.reddit.ui.TooltipPopupWindow;
import ng2.e;
import xp0.b;
import com.reddit.frontpage.ui.flair.FlairView;

public final class c implements Runnable
{
    public final int f;
    public final int g;
    public final Object h;
    public final Object i;
    public final Object j;
    
    public c(final Object h, final Object i, final int g, final Object j, final int f) {
        this.f = f;
        this.h = h;
        this.i = i;
        this.g = g;
        this.j = j;
    }
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final FlairView flairView = (FlairView)this.h;
                final String s = (String)this.i;
                final int g = this.g;
                final b b = (b)this.j;
                final int k = FlairView.k;
                e.f((Object)flairView, "this$0");
                e.f((Object)s, "$tooltipText");
                e.f((Object)b, "$flair");
                if (((View)flairView).isAttachedToWindow()) {
                    final Context context = ((View)flairView).getContext();
                    e.e((Object)context, "context");
                    final TooltipPopupWindow tooltipPopupWindow = new TooltipPopupWindow(context, s, (Integer)null, false, (Integer)null, 60);
                    final View child = ((ViewGroup)flairView.i).getChildAt(g);
                    e.e((Object)child, "linearLayout.getChildAt(position)");
                    tooltipPopupWindow.b(child, 8388659, TooltipPopupWindow$TailType.TOP);
                    d d;
                    if (b instanceof d) {
                        d = (d)b;
                    }
                    else {
                        d = null;
                    }
                    if (d != null) {
                        final a g2 = flairView.g;
                        if (g2 != null) {
                            g2.Nm(b, g, s);
                        }
                    }
                }
                return;
            }
            case 0: {
                final j j = (j)this.h;
                final com.google.android.datatransport.runtime.c c = (com.google.android.datatransport.runtime.c)this.i;
                final int g3 = this.g;
                final Runnable runnable = (Runnable)this.j;
                j.getClass();
                try {
                    try {
                        final ta.a f = j.f;
                        final sa.d c2 = j.c;
                        Objects.requireNonNull(c2);
                        f.a((a$a)new k((Object)c2, 1));
                        final NetworkInfo activeNetworkInfo = ((ConnectivityManager)j.a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            j.f.a((a$a)new ra.d(j, c, g3));
                        }
                        j.a(c, g3);
                    }
                    finally {}
                }
                catch (final SynchronizationException ex) {
                    final com.google.android.datatransport.runtime.c c3;
                    j.d.b(c3, g3 + 1);
                }
                runnable.run();
                return;
                runnable.run();
                break;
            }
        }
    }
}
