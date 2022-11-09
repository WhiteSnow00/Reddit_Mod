// 
// Decompiled by Procyon v0.6.0
// 

package j5;

import nf2.f;
import sf2.a;
import java.util.Set;
import nf2.i;
import androidx.room.RoomDatabase;
import nf2.j;

public final class q implements j<Object>
{
    public final /* synthetic */ String[] f;
    public final /* synthetic */ RoomDatabase g;
    
    public q(final RoomDatabase g, final String[] f) {
        this.f = f;
        this.g = g;
    }
    
    public final void subscribe(final i<Object> i) throws Exception {
        final g$c g$c = new g$c(this.f) {
            public final void a(final Set<String> set) {
                if (!i.isCancelled()) {
                    ((f)i).onNext(u.a);
                }
            }
        };
        if (!i.isCancelled()) {
            this.g.e.a((g$c)g$c);
            i.setDisposable(io.reactivex.disposables.a.b((a)new a() {
                public final void run() throws Exception {
                    q.this.g.e.d(g$c);
                }
            }));
        }
        if (!i.isCancelled()) {
            ((f)i).onNext(u.a);
        }
    }
}
