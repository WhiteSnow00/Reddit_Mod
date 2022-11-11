// 
// Decompiled by Procyon v0.6.0
// 

package n5;

import android.database.Cursor;
import android.database.SQLException;
import java.io.Closeable;

public interface a extends Closeable
{
    void K1(final String p0, final Object[] p1) throws SQLException;
    
    String T0();
    
    void beginTransaction();
    
    e compileStatement(final String p0);
    
    Cursor d2(final String p0);
    
    void endTransaction();
    
    void execSQL(final String p0) throws SQLException;
    
    Cursor f2(final d p0);
    
    boolean isOpen();
    
    boolean k2();
    
    void l1();
    
    boolean n2();
    
    void setTransactionSuccessful();
}
