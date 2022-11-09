// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl;

import l6.v;
import l6.r;
import l6.o;
import l6.l;
import l6.i;
import l6.e;
import l6.b;
import java.util.concurrent.TimeUnit;
import androidx.room.RoomDatabase;

public abstract class WorkDatabase extends RoomDatabase
{
    public static final long m;
    
    static {
        m = TimeUnit.DAYS.toMillis(1L);
    }
    
    public abstract b s();
    
    public abstract e t();
    
    public abstract i u();
    
    public abstract l v();
    
    public abstract o w();
    
    public abstract r x();
    
    public abstract v y();
}
