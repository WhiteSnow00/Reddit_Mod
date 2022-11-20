// 
// Decompiled by Procyon v0.6.0
// 

package k6;

import m5.d;
import m5.f;
import i5.s;
import androidx.room.RoomDatabase;

public final class p implements o
{
    public final RoomDatabase a;
    public final p$a b;
    public final p$b c;
    public final p$c d;
    
    public p(final RoomDatabase a) {
        this.a = a;
        this.b = new p$a(a);
        this.c = new s(a) {
            public final String b() {
                return "DELETE from WorkProgress where work_spec_id=?";
            }
        };
        this.d = new s(a) {
            public final String b() {
                return "DELETE FROM WorkProgress";
            }
        };
    }
    
    public final void a(final String s) {
        this.a.b();
        final f a = this.c.a();
        if (s == null) {
            ((d)a).bindNull(1);
        }
        else {
            ((d)a).bindString(1, s);
        }
        this.a.c();
        try {
            a.executeUpdateDelete();
            this.a.q();
        }
        finally {
            this.a.m();
            this.c.c(a);
        }
    }
    
    public final void b() {
        this.a.b();
        final f a = this.d.a();
        this.a.c();
        try {
            a.executeUpdateDelete();
            this.a.q();
        }
        finally {
            this.a.m();
            this.d.c(a);
        }
    }
}
