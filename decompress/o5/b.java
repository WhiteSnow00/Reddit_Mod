// 
// Decompiled by Procyon v0.6.0
// 

package o5;

import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import android.content.Context;

public final class b implements n5.b
{
    public final Context f;
    public final String g;
    public final n5.b.a h;
    public final boolean i;
    public final Object j;
    public a k;
    public boolean l;
    
    public b(final Context f, final String g, final n5.b.a h, final boolean i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = new Object();
    }
    
    public final a b() {
        synchronized (this.j) {
            if (this.k == null) {
                final o5.a[] array = { null };
                if (this.g != null && this.i) {
                    this.k = new a(this.f, new File(this.f.getNoBackupFilesDir(), this.g).getAbsolutePath(), array, this.h);
                }
                else {
                    this.k = new a(this.f, this.g, array, this.h);
                }
                this.k.setWriteAheadLoggingEnabled(this.l);
            }
            return this.k;
        }
    }
    
    @Override
    public final void close() {
        this.b().close();
    }
    
    @Override
    public final String getDatabaseName() {
        return this.g;
    }
    
    @Override
    public final n5.a getWritableDatabase() {
        return this.b().b();
    }
    
    @Override
    public final void setWriteAheadLoggingEnabled(final boolean b) {
        synchronized (this.j) {
            final a k = this.k;
            if (k != null) {
                k.setWriteAheadLoggingEnabled(b);
            }
            this.l = b;
        }
    }
    
    public static final class a extends SQLiteOpenHelper
    {
        public final o5.a[] f;
        public final n5.b.a g;
        public boolean h;
        
        public a(final Context context, final String s, final o5.a[] f, final n5.b.a g) {
            super(context, s, (SQLiteDatabase$CursorFactory)null, g.a, (DatabaseErrorHandler)new DatabaseErrorHandler() {
                public final void onCorruption(final SQLiteDatabase p0) {
                    // 
                    // This method could not be decompiled.
                    // 
                    // Original Bytecode:
                    // 
                    //     1: getfield        o5/b$a$a.a:Ln5/b$a;
                    //     4: astore_2       
                    //     5: aload_0        
                    //     6: getfield        o5/b$a$a.b:[Lo5/a;
                    //     9: astore_3       
                    //    10: aload_3        
                    //    11: iconst_0       
                    //    12: aaload         
                    //    13: astore          4
                    //    15: aload           4
                    //    17: ifnull          43
                    //    20: aload           4
                    //    22: getfield        o5/a.f:Landroid/database/sqlite/SQLiteDatabase;
                    //    25: aload_1        
                    //    26: if_acmpne       35
                    //    29: iconst_1       
                    //    30: istore          5
                    //    32: goto            38
                    //    35: iconst_0       
                    //    36: istore          5
                    //    38: iload           5
                    //    40: ifne            54
                    //    43: aload_3        
                    //    44: iconst_0       
                    //    45: new             Lo5/a;
                    //    48: dup            
                    //    49: aload_1        
                    //    50: invokespecial   o5/a.<init>:(Landroid/database/sqlite/SQLiteDatabase;)V
                    //    53: aastore        
                    //    54: aload_3        
                    //    55: iconst_0       
                    //    56: aaload         
                    //    57: astore_3       
                    //    58: aload_2        
                    //    59: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
                    //    62: pop            
                    //    63: new             Ljava/lang/StringBuilder;
                    //    66: dup            
                    //    67: invokespecial   java/lang/StringBuilder.<init>:()V
                    //    70: astore_1       
                    //    71: aload_1        
                    //    72: ldc             "Corruption reported by sqlite on database: "
                    //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                    //    77: pop            
                    //    78: aload_1        
                    //    79: aload_3        
                    //    80: invokevirtual   o5/a.T0:()Ljava/lang/String;
                    //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                    //    86: pop            
                    //    87: ldc             "SupportSQLite"
                    //    89: aload_1        
                    //    90: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                    //    93: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
                    //    96: pop            
                    //    97: aload_3        
                    //    98: invokevirtual   o5/a.isOpen:()Z
                    //   101: ifne            114
                    //   104: aload_3        
                    //   105: invokevirtual   o5/a.T0:()Ljava/lang/String;
                    //   108: invokestatic    n5/b$a.a:(Ljava/lang/String;)V
                    //   111: goto            241
                    //   114: aconst_null    
                    //   115: astore_1       
                    //   116: aconst_null    
                    //   117: astore_2       
                    //   118: aload_3        
                    //   119: invokevirtual   o5/a.b:()Ljava/util/List;
                    //   122: astore          4
                    //   124: aload           4
                    //   126: astore_1       
                    //   127: goto            134
                    //   130: astore_1       
                    //   131: goto            143
                    //   134: aload_1        
                    //   135: astore_2       
                    //   136: aload_3        
                    //   137: invokevirtual   o5/a.close:()V
                    //   140: goto            193
                    //   143: aload_2        
                    //   144: ifnull          184
                    //   147: aload_2        
                    //   148: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
                    //   153: astore_2       
                    //   154: aload_2        
                    //   155: invokeinterface java/util/Iterator.hasNext:()Z
                    //   160: ifeq            191
                    //   163: aload_2        
                    //   164: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   169: checkcast       Landroid/util/Pair;
                    //   172: getfield        android/util/Pair.second:Ljava/lang/Object;
                    //   175: checkcast       Ljava/lang/String;
                    //   178: invokestatic    n5/b$a.a:(Ljava/lang/String;)V
                    //   181: goto            154
                    //   184: aload_3        
                    //   185: invokevirtual   o5/a.T0:()Ljava/lang/String;
                    //   188: invokestatic    n5/b$a.a:(Ljava/lang/String;)V
                    //   191: aload_1        
                    //   192: athrow         
                    //   193: aload_1        
                    //   194: ifnull          234
                    //   197: aload_1        
                    //   198: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
                    //   203: astore_1       
                    //   204: aload_1        
                    //   205: invokeinterface java/util/Iterator.hasNext:()Z
                    //   210: ifeq            241
                    //   213: aload_1        
                    //   214: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   219: checkcast       Landroid/util/Pair;
                    //   222: getfield        android/util/Pair.second:Ljava/lang/Object;
                    //   225: checkcast       Ljava/lang/String;
                    //   228: invokestatic    n5/b$a.a:(Ljava/lang/String;)V
                    //   231: goto            204
                    //   234: aload_3        
                    //   235: invokevirtual   o5/a.T0:()Ljava/lang/String;
                    //   238: invokestatic    n5/b$a.a:(Ljava/lang/String;)V
                    //   241: return         
                    //   242: astore_2       
                    //   243: goto            134
                    //   246: astore_2       
                    //   247: goto            193
                    //    Exceptions:
                    //  Try           Handler
                    //  Start  End    Start  End    Type                                     
                    //  -----  -----  -----  -----  -----------------------------------------
                    //  118    124    242    246    Landroid/database/sqlite/SQLiteException;
                    //  118    124    130    193    Any
                    //  136    140    246    250    Ljava/io/IOException;
                    //  136    140    130    193    Any
                    // 
                    // The error that occurred was:
                    // 
                    // java.lang.IllegalStateException: Expression is linked from several locations: Label_0143:
                    //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
                    //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
                    //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1151)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
            });
            this.g = g;
            this.f = f;
        }
        
        public final o5.a a(final SQLiteDatabase sqLiteDatabase) {
            final o5.a[] f = this.f;
            final o5.a a = f[0];
            if (a == null || a.f != sqLiteDatabase) {
                f[0] = new o5.a(sqLiteDatabase);
            }
            return f[0];
        }
        
        public final n5.a b() {
            synchronized (this) {
                this.h = false;
                final SQLiteDatabase writableDatabase = this.getWritableDatabase();
                if (this.h) {
                    this.close();
                    return this.b();
                }
                return this.a(writableDatabase);
            }
        }
        
        public final void close() {
            synchronized (this) {
                super.close();
                this.f[0] = null;
            }
        }
        
        public final void onConfigure(final SQLiteDatabase sqLiteDatabase) {
            final n5.b.a g = this.g;
            this.a(sqLiteDatabase);
            g.b();
        }
        
        public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
            this.g.c(this.a(sqLiteDatabase));
        }
        
        public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
            this.h = true;
            this.g.d(this.a(sqLiteDatabase), n, n2);
        }
        
        public final void onOpen(final SQLiteDatabase sqLiteDatabase) {
            if (!this.h) {
                this.g.e(this.a(sqLiteDatabase));
            }
        }
        
        public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
            this.h = true;
            this.g.f(this.a(sqLiteDatabase), n, n2);
        }
    }
}
