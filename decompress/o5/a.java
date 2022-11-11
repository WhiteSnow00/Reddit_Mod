// 
// Decompiled by Procyon v0.6.0
// 

package o5;

import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteCursor;
import n5.c;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import n5.d;
import android.database.Cursor;
import n5.e;
import java.io.IOException;
import android.util.Pair;
import java.util.List;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public final class a implements n5.a
{
    public static final String[] g;
    public final SQLiteDatabase f;
    
    static {
        g = new String[0];
    }
    
    public a(final SQLiteDatabase f) {
        this.f = f;
    }
    
    @Override
    public final void K1(final String s, final Object[] array) throws SQLException {
        this.f.execSQL(s, array);
    }
    
    @Override
    public final String T0() {
        return this.f.getPath();
    }
    
    public final List<Pair<String, String>> b() {
        return this.f.getAttachedDbs();
    }
    
    @Override
    public final void beginTransaction() {
        this.f.beginTransaction();
    }
    
    @Override
    public final void close() throws IOException {
        ((SQLiteClosable)this.f).close();
    }
    
    @Override
    public final e compileStatement(final String s) {
        return (e)new o5.e(this.f.compileStatement(s));
    }
    
    @Override
    public final Cursor d2(final String s) {
        return this.f2((d)new te2.e(s));
    }
    
    @Override
    public final void endTransaction() {
        this.f.endTransaction();
    }
    
    @Override
    public final void execSQL(final String s) throws SQLException {
        this.f.execSQL(s);
    }
    
    @Override
    public final Cursor f2(final d d) {
        return this.f.rawQueryWithFactory((SQLiteDatabase$CursorFactory)new SQLiteDatabase$CursorFactory() {
            public final Cursor newCursor(final SQLiteDatabase sqLiteDatabase, final SQLiteCursorDriver sqLiteCursorDriver, final String s, final SQLiteQuery sqLiteQuery) {
                d.c(new o5.d((SQLiteProgram)sqLiteQuery));
                return (Cursor)new SQLiteCursor(sqLiteCursorDriver, s, sqLiteQuery);
            }
        }, d.b(), a.g, (String)null);
    }
    
    @Override
    public final boolean isOpen() {
        return this.f.isOpen();
    }
    
    @Override
    public final boolean k2() {
        return this.f.inTransaction();
    }
    
    @Override
    public final void l1() {
        this.f.beginTransactionNonExclusive();
    }
    
    @Override
    public final boolean n2() {
        return this.f.isWriteAheadLoggingEnabled();
    }
    
    @Override
    public final void setTransactionSuccessful() {
        this.f.setTransactionSuccessful();
    }
}
