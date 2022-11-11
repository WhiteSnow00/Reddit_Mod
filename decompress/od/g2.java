// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.os.Bundle;
import java.util.Iterator;
import ng.h;
import lg.c;
import android.content.Intent;
import android.net.Uri;
import gg.q0;
import java.io.File;
import java.util.List;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import ng.a;

public final class g2 implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g = g;
    public final /* synthetic */ Object h = h;
    public final /* synthetic */ Object i = i;
    
    public g2(final h2 i, final LifecycleCallback g, final String h) {
        this.f = 0;
        this.i = i;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        switch (this.f) {
            default: {
                final a a = (a)this.g;
                final List list = (List)this.h;
                final List list2 = (List)this.i;
                a.getClass();
                final ArrayList list3 = new ArrayList();
                final ArrayList list4 = new ArrayList();
                for (final File file : list) {
                    final String a2 = q0.a(file);
                    final Uri fromFile = Uri.fromFile(file);
                    final Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(fromFile, a.b.getContentResolver().getType(fromFile));
                    intent.addFlags(1);
                    intent.putExtra("module_name", a2.split("\\.config\\.", 2)[0]);
                    intent.putExtra("split_id", a2);
                    list3.add(intent);
                    list4.add(q0.a(file).split("\\.config\\.", 2)[0]);
                }
                final c c = a.k.get();
                if (c != null) {
                    a.h.execute((Runnable)new h(c.i(), a, list3, list4, list2));
                }
                return;
            }
            case 0: {
                final h2 h2 = (h2)this.i;
                if (h2.g > 0) {
                    final LifecycleCallback lifecycleCallback = (LifecycleCallback)this.g;
                    final Bundle h3 = h2.h;
                    Bundle bundle;
                    if (h3 != null) {
                        bundle = h3.getBundle((String)this.h);
                    }
                    else {
                        bundle = null;
                    }
                    lifecycleCallback.e(bundle);
                }
                if (((h2)this.i).g >= 2) {
                    ((LifecycleCallback)this.g).h();
                }
                if (((h2)this.i).g >= 3) {
                    ((LifecycleCallback)this.g).f();
                }
                if (((h2)this.i).g >= 4) {
                    ((LifecycleCallback)this.g).i();
                }
                if (((h2)this.i).g >= 5) {
                    this.g.getClass();
                }
            }
        }
    }
}
