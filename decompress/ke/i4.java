// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import j0.i;
import android.os.StrictMode$ThreadPolicy;
import java.util.Collections;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.os.Binder;
import dg.k;
import android.os.StrictMode;
import java.util.Iterator;
import j0.h$e;
import android.database.ContentObserver;
import java.util.ArrayList;
import java.util.Map;
import android.net.Uri;
import android.content.ContentResolver;
import j0.b;

public final class i4
{
    public static final b h;
    public static final String[] i;
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public final h4 d;
    public final Object e;
    public volatile Map f;
    public final ArrayList g;
    
    static {
        h = new b();
        i = new String[] { "key", "value" };
    }
    
    public i4(final ContentResolver a, final Uri b, final Runnable c) {
        final h4 d = new h4(this);
        this.d = d;
        this.e = new Object();
        this.g = new ArrayList();
        a.getClass();
        b.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        a.registerContentObserver(b, false, (ContentObserver)d);
    }
    
    public static i4 a(final ContentResolver p0, final Uri p1, final Runnable p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: getstatic       ke/i4.h:Lj0/b;
        //     6: astore_3       
        //     7: aload_3        
        //     8: aload_1        
        //     9: aconst_null    
        //    10: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    13: checkcast       Lke/i4;
        //    16: astore          4
        //    18: aload           4
        //    20: astore          5
        //    22: aload           4
        //    24: ifnonnull       48
        //    27: new             Lke/i4;
        //    30: astore          5
        //    32: aload           5
        //    34: aload_0        
        //    35: aload_1        
        //    36: aload_2        
        //    37: invokespecial   ke/i4.<init>:(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)V
        //    40: aload_3        
        //    41: aload_1        
        //    42: aload           5
        //    44: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    47: pop            
        //    48: ldc             Lke/i4;.class
        //    50: monitorexit    
        //    51: aload           5
        //    53: areturn        
        //    54: astore_0       
        //    55: ldc             Lke/i4;.class
        //    57: monitorexit    
        //    58: aload_0        
        //    59: athrow         
        //    60: astore_0       
        //    61: aload           4
        //    63: astore          5
        //    65: goto            48
        //    68: astore_0       
        //    69: goto            48
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  3      18     54     60     Any
        //  27     40     60     68     Ljava/lang/SecurityException;
        //  27     40     54     60     Any
        //  40     48     68     72     Ljava/lang/SecurityException;
        //  40     48     54     60     Any
        //  48     51     54     60     Any
        //  55     58     54     60     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 41, Size: 41
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void c() {
        synchronized (i4.class) {
            for (final i4 i4 : (h$e)i4.h.values()) {
                i4.a.unregisterContentObserver((ContentObserver)i4.d);
            }
            ((i)i4.h).clear();
        }
    }
    
    public final Map b() {
        Map f;
        if ((f = this.f) == null) {
            synchronized (this.e) {
                Label_0123: {
                    if (this.f == null) {
                        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        Label_0117: {
                            try {
                                final k k = new k((Object)this);
                                try {
                                    final Object o = k.f();
                                }
                                catch (final SecurityException ex) {
                                    final long clearCallingIdentity = Binder.clearCallingIdentity();
                                    try {
                                        final Object o = k.f();
                                        Binder.restoreCallingIdentity(clearCallingIdentity);
                                        final Map map = (Map)o;
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                    }
                                    finally {
                                        Binder.restoreCallingIdentity(clearCallingIdentity);
                                    }
                                }
                            }
                            catch (final SecurityException | SQLiteException | IllegalStateException ex2) {
                                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                f = null;
                            }
                            finally {
                                break Label_0117;
                            }
                            this.f = f;
                            break Label_0123;
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
            }
        }
        if (f != null) {
            return f;
        }
        return Collections.emptyMap();
    }
}
