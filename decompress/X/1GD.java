// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.database.sqlite.SQLiteProgram;
import com.bytedance.covode.number.Covode;
import android.database.sqlite.SQLiteStatement;

public final class 1gD extends 166 implements 168
{
    public final SQLiteStatement LIZ;
    
    static {
        Covode.recordClassIndex(1324);
    }
    
    public 1gD(final SQLiteStatement liz) {
        super((SQLiteProgram)liz);
        this.LIZ = liz;
    }
    
    @Override
    public final int LIZ() {
        return this.LIZ.executeUpdateDelete();
    }
    
    @Override
    public final long LIZIZ() {
        return this.LIZ.executeInsert();
    }
}
