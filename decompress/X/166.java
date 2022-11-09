// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.database.sqlite.SQLiteProgram;

public class 166 implements 0Ck
{
    public final SQLiteProgram LIZ;
    
    static {
        Covode.recordClassIndex(1323);
    }
    
    public 166(final SQLiteProgram liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final int n) {
        this.LIZ.bindNull(n);
    }
    
    @Override
    public final void LIZ(final int n, final double n2) {
        this.LIZ.bindDouble(n, n2);
    }
    
    @Override
    public final void LIZ(final int n, final long n2) {
        this.LIZ.bindLong(n, n2);
    }
    
    @Override
    public final void LIZ(final int n, final String s) {
        this.LIZ.bindString(n, s);
    }
    
    @Override
    public final void LIZ(final int n, final byte[] array) {
        this.LIZ.bindBlob(n, array);
    }
    
    @Override
    public void close() {
        this.LIZ.close();
    }
}
