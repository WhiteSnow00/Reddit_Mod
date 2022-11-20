// 
// Decompiled by Procyon v0.6.0
// 

package i5;

import af2.f;
import ff2.a;
import java.util.Set;
import af2.v;
import androidx.room.RoomDatabase;
import af2.w;

public final class o implements w<Object>
{
    public final String[] f;
    public final RoomDatabase g;
    
    public o(final RoomDatabase g, final String[] f) {
        this.f = f;
        this.g = g;
    }
    
    public final void b(final v<Object> v) throws Exception {
        final g$c g$c = new g$c(this.f, v) {
            public final v b;
            
            public final void a(final Set<String> set) {
                ((f)this.b).onNext(q.a);
            }
        };
        this.g.e.a((g$c)g$c);
        v.setDisposable(io.reactivex.disposables.a.b((a)new a(this, g$c) {
            public final g$c f;
            public final o g;
            
            public final void run() throws Exception {
                this.g.g.e.d(this.f);
            }
        }));
        ((f)v).onNext(q.a);
    }
}
