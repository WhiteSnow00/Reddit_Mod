// 
// Decompiled by Procyon v0.6.0
// 

package o5;

import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteProgram;
import n5.c;

public class d implements c
{
    public final SQLiteProgram f;
    
    public d(final SQLiteProgram f) {
        this.f = f;
    }
    
    @Override
    public final void bindBlob(final int n, final byte[] array) {
        this.f.bindBlob(n, array);
    }
    
    @Override
    public final void bindDouble(final int n, final double n2) {
        this.f.bindDouble(n, n2);
    }
    
    @Override
    public final void bindLong(final int n, final long n2) {
        this.f.bindLong(n, n2);
    }
    
    @Override
    public final void bindNull(final int n) {
        this.f.bindNull(n);
    }
    
    @Override
    public final void bindString(final int n, final String s) {
        this.f.bindString(n, s);
    }
    
    @Override
    public final void close() {
        ((SQLiteClosable)this.f).close();
    }
}
