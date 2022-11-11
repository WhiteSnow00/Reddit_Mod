// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import com.google.android.gms.internal.measurement.zzko;
import com.google.android.gms.internal.measurement.zzjd;

public class j6
{
    public volatile z6 a;
    public volatile zzjd b;
    
    static {
        p5.a();
    }
    
    public final zzjd a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = zzjd.zzb;
            }
            else {
                this.b = this.a.d();
            }
            return this.b;
        }
    }
    
    public final void b(final z6 z6) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = z6;
                    this.b = zzjd.zzb;
                }
                catch (final zzko zzko) {
                    this.a = z6;
                    this.b = zzjd.zzb;
                }
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof j6)) {
            return false;
        }
        final j6 j6 = (j6)o;
        final z6 a = this.a;
        final z6 a2 = j6.a;
        if (a == null && a2 == null) {
            return this.a().equals((Object)j6.a());
        }
        if (a != null && a2 != null) {
            return a.equals(a2);
        }
        if (a != null) {
            j6.b((z6)((a7)a).e());
            return a.equals(j6.a);
        }
        this.b((z6)((a7)a2).e());
        return this.a.equals(a2);
    }
    
    @Override
    public final int hashCode() {
        return 1;
    }
}
