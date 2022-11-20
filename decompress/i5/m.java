// 
// Decompiled by Procyon v0.6.0
// 

package i5;

import af2.f;
import ff2.a;
import java.util.Set;
import af2.i;
import androidx.room.RoomDatabase;
import af2.j;

public final class m implements j<Object>
{
    public final String[] f;
    public final RoomDatabase g;
    
    public m(final RoomDatabase g, final String[] f) {
        this.f = f;
        this.g = g;
    }
    
    public final void subscribe(final i<Object> i) throws Exception {
        final g$c g$c = new g$c(this.f, i) {
            public final i b;
            
            public final void a(final Set<String> set) {
                if (!this.b.isCancelled()) {
                    ((f)this.b).onNext(q.a);
                }
            }
        };
        if (!i.isCancelled()) {
            this.g.e.a((g$c)g$c);
            i.setDisposable(io.reactivex.disposables.a.b((a)new a(this, g$c) {
                public final g$c f;
                public final m g;
                
                public final void run() throws Exception {
                    this.g.g.e.d(this.f);
                }
            }));
        }
        if (!i.isCancelled()) {
            ((f)i).onNext(q.a);
        }
    }
}
