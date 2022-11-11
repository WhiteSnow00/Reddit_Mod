// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 164 implements 0Cj
{
    public final a LIZ;
    
    static {
        Covode.recordClassIndex(1319);
    }
    
    public 164(final Context context, final String s, final 0Cj.a a) {
        this.LIZ = new a(context, s, new 163[1], a);
    }
    
    @Override
    public final String LIZ() {
        return this.LIZ.getDatabaseName();
    }
    
    @Override
    public final void LIZ(final boolean writeAheadLoggingEnabled) {
        this.LIZ.setWriteAheadLoggingEnabled(writeAheadLoggingEnabled);
    }
    
    @Override
    public final 0Ce LIZIZ() {
        return this.LIZ.LIZ();
    }
    
    public static final class a extends SQLiteOpenHelper
    {
        public final 163[] LIZ;
        public final 0Cj.a LIZIZ;
        public boolean LIZJ;
        
        static {
            Covode.recordClassIndex(1320);
        }
        
        public a(final Context context, final String s, final 163[] liz, final 0Cj.a liziz) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: aload_1        
            //     2: aload_2        
            //     3: aconst_null    
            //     4: aload           4
            //     6: getfield        X/0Cf.LIZ:I
            //     9: new             LX/0Cc;
            //    12: dup            
            //    13: aload_3        
            //    14: aload           4
            //    16: invokespecial   X/0Cc.<init>:([LX/163;LX/0Cf;)V
            //    19: invokespecial   android/database/sqlite/SQLiteOpenHelper.<init>:(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V
            //    22: aload_0        
            //    23: aload           4
            //    25: putfield        X/0Cd.LIZIZ:LX/0Cf;
            //    28: aload_0        
            //    29: aload_3        
            //    30: putfield        X/0Cd.LIZ:[LX/163;
            //    33: return         
            // 
            // The error that occurred was:
            // 
            // java.lang.NullPointerException
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
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
        
        private 163 LIZ(final SQLiteDatabase sqLiteDatabase) {
            if (this.LIZ[0] == null) {
                this.LIZ[0] = new 163(sqLiteDatabase);
            }
            return this.LIZ[0];
        }
        
        public final 0Ce LIZ() {
            synchronized (this) {
                this.LIZJ = false;
                final SQLiteDatabase writableDatabase = super.getWritableDatabase();
                if (this.LIZJ) {
                    this.close();
                    return this.LIZ();
                }
                return this.LIZ(writableDatabase);
            }
        }
        
        public final void close() {
            synchronized (this) {
                super.close();
                this.LIZ[0] = null;
            }
        }
        
        public final void onConfigure(final SQLiteDatabase sqLiteDatabase) {
            this.LIZ(sqLiteDatabase);
        }
        
        public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
            this.LIZIZ.LIZ(this.LIZ(sqLiteDatabase));
        }
        
        public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
            this.LIZJ = true;
            this.LIZIZ.LIZIZ(this.LIZ(sqLiteDatabase), n, n2);
        }
        
        public final void onOpen(final SQLiteDatabase sqLiteDatabase) {
            if (!this.LIZJ) {
                this.LIZIZ.LIZIZ(this.LIZ(sqLiteDatabase));
            }
        }
        
        public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
            this.LIZJ = true;
            this.LIZIZ.LIZ(this.LIZ(sqLiteDatabase), n, n2);
        }
    }
}
