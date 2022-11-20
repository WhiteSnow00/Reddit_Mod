// 
// Decompiled by Procyon v0.6.0
// 

package jb2;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import q.j;

public final class b extends j
{
    public final WeakReference<c> g;
    
    public b(final a a) {
        this.g = new WeakReference<c>((c)a);
    }
    
    public final void a(final j.j$a h) {
        final c c = this.g.get();
        if (c != null) {
            c.b(h);
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        final c c = this.g.get();
        if (c != null) {
            c.a();
        }
    }
}
