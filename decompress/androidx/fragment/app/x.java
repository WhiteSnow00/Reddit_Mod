// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.view.LayoutInflater;
import mj2.c0;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;

public abstract class x<E> extends t
{
    public final Activity f;
    public final Context g;
    public final Handler h;
    public final e0 i;
    
    public x(final r r) {
        final Handler h = new Handler();
        this.i = new e0();
        c0.s((Object)(this.f = (Activity)r), "context == null");
        this.g = (Context)r;
        this.h = h;
    }
    
    public abstract r d();
    
    public abstract LayoutInflater e();
    
    public abstract boolean f(final String p0);
    
    public abstract void g();
}
