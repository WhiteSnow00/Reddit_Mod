// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import android.os.Handler;
import android.content.Intent;
import java.util.Iterator;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import he.e;
import android.os.Looper;
import android.app.Activity;
import java.util.Collections;
import j0.b;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Map;
import java.lang.ref.WeakReference;
import androidx.fragment.app.r;
import java.util.WeakHashMap;
import androidx.fragment.app.Fragment;

public final class h2 extends Fragment implements h
{
    public static final WeakHashMap<r, WeakReference<h2>> i;
    public final Map<String, LifecycleCallback> f;
    public int g;
    public Bundle h;
    
    static {
        i = new WeakHashMap<r, WeakReference<h2>>();
    }
    
    public h2() {
        this.f = Collections.synchronizedMap((Map<String, LifecycleCallback>)new b());
        this.g = 0;
    }
    
    public final void a0(final String s, final LifecycleCallback lifecycleCallback) {
        if (!this.f.containsKey(s)) {
            this.f.put(s, lifecycleCallback);
            if (this.g > 0) {
                ((Handler)new e(Looper.getMainLooper())).post((Runnable)new g2((Object)this, 0, (Object)lifecycleCallback, (Object)s));
            }
            return;
        }
        throw new IllegalArgumentException(a.i(new StringBuilder(s.length() + 59), "LifecycleCallback with tag ", s, " already added to this fragment."));
    }
    
    public final void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        final Iterator<LifecycleCallback> iterator = this.f.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a(s, fileDescriptor, printWriter, array);
        }
    }
    
    public final LifecycleCallback h(final Class clazz, final String s) {
        return clazz.cast(this.f.get(s));
    }
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        final Iterator<LifecycleCallback> iterator = this.f.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().d(n, n2, intent);
        }
    }
    
    public final void onCreate(final Bundle h) {
        super.onCreate(h);
        this.g = 1;
        this.h = h;
        for (final Map.Entry<K, LifecycleCallback> entry : this.f.entrySet()) {
            final LifecycleCallback lifecycleCallback = entry.getValue();
            Bundle bundle;
            if (h != null) {
                bundle = h.getBundle((String)entry.getKey());
            }
            else {
                bundle = null;
            }
            lifecycleCallback.e(bundle);
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.g = 5;
        final Iterator<LifecycleCallback> iterator = this.f.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().getClass();
        }
    }
    
    public final void onResume() {
        super.onResume();
        this.g = 3;
        final Iterator<LifecycleCallback> iterator = this.f.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (final Map.Entry<K, LifecycleCallback> entry : this.f.entrySet()) {
            final Bundle bundle2 = new Bundle();
            entry.getValue().g(bundle2);
            bundle.putBundle((String)entry.getKey(), bundle2);
        }
    }
    
    public final void onStart() {
        super.onStart();
        this.g = 2;
        final Iterator<LifecycleCallback> iterator = this.f.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().h();
        }
    }
    
    public final void onStop() {
        super.onStop();
        this.g = 4;
        final Iterator<LifecycleCallback> iterator = this.f.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().i();
        }
    }
}
