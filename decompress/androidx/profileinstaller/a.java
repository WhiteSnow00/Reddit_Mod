// 
// Decompiled by Procyon v0.6.0
// 

package androidx.profileinstaller;

import java.io.Serializable;
import h5.j;
import android.os.Build$VERSION;
import java.io.File;
import java.util.concurrent.Executor;
import android.content.res.AssetManager;

public final class a
{
    public final AssetManager a;
    public final Executor b;
    public final b.c c;
    public final byte[] d;
    public final File e;
    public boolean f;
    public h5.b[] g;
    public byte[] h;
    
    public a(final AssetManager a, final Executor b, final b.c c, final String s, final File e) {
        this.f = false;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        byte[] d = null;
        switch (Build$VERSION.SDK_INT) {
            default: {
                d = null;
                break;
            }
            case 31: {
                d = j.a;
                break;
            }
            case 28:
            case 29:
            case 30: {
                d = j.b;
                break;
            }
            case 27: {
                d = j.c;
                break;
            }
            case 26: {
                d = j.d;
                break;
            }
            case 24:
            case 25: {
                d = j.e;
                break;
            }
        }
        this.d = d;
    }
    
    public final void a(final int n, final Serializable s) {
        this.b.execute((Runnable)new h5.a(n, 0, (Object)this, (Object)s));
    }
}
