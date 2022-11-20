// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity.result;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.q;
import f.a;
import androidx.lifecycle.o;

class ActivityResultRegistry$1 implements o
{
    public final String f;
    public final b g;
    public final a h;
    public final f i;
    
    public ActivityResultRegistry$1(final f i, final String f, final b g, final a h) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void f(final q q, final Lifecycle$Event lifecycle$Event) {
        if (Lifecycle$Event.ON_START.equals(lifecycle$Event)) {
            this.i.f.put(this.f, new f$a(this.h, this.g));
            if (this.i.g.containsKey(this.f)) {
                final Object value = this.i.g.get(this.f);
                this.i.g.remove(this.f);
                this.g.b(value);
            }
            final androidx.activity.result.a a = (androidx.activity.result.a)this.i.h.getParcelable(this.f);
            if (a != null) {
                this.i.h.remove(this.f);
                this.g.b(this.h.c(a.f, a.g));
            }
        }
        else if (Lifecycle$Event.ON_STOP.equals(lifecycle$Event)) {
            this.i.f.remove(this.f);
        }
        else if (Lifecycle$Event.ON_DESTROY.equals(lifecycle$Event)) {
            this.i.f(this.f);
        }
    }
}
