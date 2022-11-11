// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2.database;

import nd2.a;
import androidx.room.h;
import androidx.room.b;
import androidx.room.RoomDatabase;
import java.util.HashMap;
import j5.g;
import nd2.f;

public final class DownloadDatabase_Impl extends DownloadDatabase
{
    public volatile f m;
    
    public final g g() {
        return new g((RoomDatabase)this, new HashMap(0), new HashMap(0), new String[] { "requests" });
    }
    
    public final n5.b h(final b b) {
        final h c = new h(b, (h.a)new DownloadDatabase_Impl$a(this), "460643a974555d792b8f5a6e1a5d323c", "946eca6b182e63ebe50cf82e483715bf");
        final n5.b.b.a a = new n5.b.b.a(b.b);
        a.b = b.c;
        a.c = (n5.b.a)c;
        return b.a.a(a.a());
    }
    
    public final a s() {
        if (this.m != null) {
            return (a)this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new f((DownloadDatabase)this);
            }
            return (a)this.m;
        }
    }
}
