// 
// Decompiled by Procyon v0.6.0
// 

package n5;

import android.text.TextUtils;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import android.util.Log;
import java.io.Closeable;

public interface b extends Closeable
{
    void close();
    
    String getDatabaseName();
    
    n5.a getWritableDatabase();
    
    void setWriteAheadLoggingEnabled(final boolean p0);
    
    public abstract static class a
    {
        public final int a;
        
        public a(final int a) {
            this.a = a;
        }
        
        public static void a(final String s) {
            if (!s.equalsIgnoreCase(":memory:")) {
                if (s.trim().length() != 0) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("deleting the database file: ");
                    sb.append(s);
                    Log.w("SupportSQLite", sb.toString());
                    try {
                        SQLiteDatabase.deleteDatabase(new File(s));
                    }
                    catch (final Exception ex) {
                        Log.w("SupportSQLite", "delete failed: ", (Throwable)ex);
                    }
                }
            }
        }
        
        public abstract void b();
        
        public abstract void c(final o5.a p0);
        
        public abstract void d(final o5.a p0, final int p1, final int p2);
        
        public abstract void e(final o5.a p0);
        
        public abstract void f(final o5.a p0, final int p1, final int p2);
    }
    
    public static final class b
    {
        public final Context a;
        public final String b;
        public final n5.b.a c;
        public final boolean d;
        
        public b(final Context a, final String b, final n5.b.a c, final boolean d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public static final class a
        {
            public Context a;
            public String b;
            public n5.b.a c;
            public boolean d;
            
            public a(final Context a) {
                this.a = a;
            }
            
            public final b a() {
                if (this.c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.d && TextUtils.isEmpty((CharSequence)this.b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.a, this.b, this.c, this.d);
            }
        }
    }
    
    public interface c
    {
        b a(final b p0);
    }
}
