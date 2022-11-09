// 
// Decompiled by Procyon v0.6.0
// 

package n5;

import android.database.Cursor;
import android.database.SQLException;
import java.io.Closeable;

public interface a extends Closeable
{
    void E1(final String p0, final Object[] p1) throws SQLException;
    
    Cursor V1(final String p0);
    
    Cursor X1(final d p0);
    
    void beginTransaction();
    
    boolean c2();
    
    e compileStatement(final String p0);
    
    void endTransaction();
    
    void execSQL(final String p0) throws SQLException;
    
    boolean f2();
    
    void h1();
    
    boolean isOpen();
    
    void setTransactionSuccessful();
}
