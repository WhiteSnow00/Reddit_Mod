// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import j5.e;
import androidx.room.RoomDatabase;

public final class m implements l
{
    public final RoomDatabase a;
    public final m$a b;
    
    public m(final RoomDatabase a) {
        this.a = a;
        this.b = new e<k>(a) {
            public final String b() {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final k k = (k)o;
                final String a = k.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                final String b = k.b;
                if (b == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindString(2, b);
                }
            }
        };
    }
}
