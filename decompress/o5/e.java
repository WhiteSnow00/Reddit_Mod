// 
// Decompiled by Procyon v0.6.0
// 

package o5;

import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;

public final class e extends d implements n5.e
{
    public final SQLiteStatement g;
    
    public e(final SQLiteStatement g) {
        super((SQLiteProgram)g);
        this.g = g;
    }
    
    public final long executeInsert() {
        return this.g.executeInsert();
    }
    
    public final int executeUpdateDelete() {
        return this.g.executeUpdateDelete();
    }
}
