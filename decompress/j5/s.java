// 
// Decompiled by Procyon v0.6.0
// 

package j5;

import ff2.f;
import kf2.a;
import java.util.Set;
import ff2.v;
import androidx.room.RoomDatabase;
import ff2.w;

public final class s implements w<Object>
{
    public final /* synthetic */ String[] f;
    public final /* synthetic */ RoomDatabase g;
    
    public s(final RoomDatabase g, final String[] f) {
        this.f = f;
        this.g = g;
    }
    
    public final void B(final v<Object> v) throws Exception {
        final g$c g$c = new g$c(this.f) {
            public final void a(final Set<String> set) {
                ((f)v).onNext(u.a);
            }
        };
        this.g.e.a((g$c)g$c);
        v.setDisposable(io.reactivex.disposables.a.b((a)new a() {
            public final void run() throws Exception {
                s.this.g.e.d(g$c);
            }
        }));
        ((f)v).onNext(u.a);
    }
}
