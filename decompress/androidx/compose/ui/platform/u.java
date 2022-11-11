// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import java.util.Iterator;
import java.util.Map;
import java.lang.ref.WeakReference;
import g2.b$a;
import sg2.e;
import g2.b;
import android.content.res.Configuration;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.content.ComponentCallbacks2;

public final class u implements ComponentCallbacks2
{
    public final /* synthetic */ Ref$ObjectRef<Configuration> f;
    public final /* synthetic */ b g;
    
    public u(final Ref$ObjectRef<Configuration> f, final b g) {
        this.f = f;
        this.g = g;
    }
    
    public final void onConfigurationChanged(final Configuration element) {
        e.f((Object)element, "configuration");
        final Configuration configuration = (Configuration)this.f.element;
        int update;
        if (configuration != null) {
            update = configuration.updateFrom(element);
        }
        else {
            update = -1;
        }
        final Iterator iterator = this.g.a.entrySet().iterator();
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            e.e(next, "it.next()");
            final b$a b$a = ((Map.Entry<K, WeakReference>)next).getValue().get();
            if (b$a == null || Configuration.needNewResources(update, b$a.b)) {
                iterator.remove();
            }
        }
        this.f.element = element;
    }
    
    public final void onLowMemory() {
        this.g.a.clear();
    }
    
    public final void onTrimMemory(final int n) {
        this.g.a.clear();
    }
}
