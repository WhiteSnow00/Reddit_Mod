// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import j5.w;
import androidx.work.b;
import j5.e;
import androidx.room.RoomDatabase;

public final class p implements o
{
    public final RoomDatabase a;
    public final p$a b;
    public final p$b c;
    public final p$c d;
    
    public p(final RoomDatabase a) {
        this.a = a;
        this.b = new e<n>(a) {
            public final String b() {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final n n = (n)o;
                final String a = n.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                final byte[] d = androidx.work.b.d(n.b);
                if (d == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindBlob(2, d);
                }
            }
        };
        this.c = new w(a) {
            public final String b() {
                return "DELETE from WorkProgress where work_spec_id=?";
            }
        };
        this.d = new w(a) {
            public final String b() {
                return "DELETE FROM WorkProgress";
            }
        };
    }
    
    public final void a(final String s) {
        this.a.b();
        final n5.e a = this.c.a();
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
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
        final n5.e a = this.d.a();
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
