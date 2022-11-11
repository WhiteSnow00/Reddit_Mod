// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.Pair;
import java.util.List;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import android.database.sqlite.SQLiteDatabase;

public final class 163 implements 0Ce
{
    public static final String[] LIZ;
    public final SQLiteDatabase LIZIZ;
    
    static {
        Covode.recordClassIndex(1317);
        LIZ = new String[0];
    }
    
    public 163(final SQLiteDatabase liziz) {
        this.LIZIZ = liziz;
    }
    
    @Override
    public final 168 LIZ(final String s) {
        return new 1gD(this.LIZIZ.compileStatement(s));
    }
    
    @Override
    public final Cursor LIZ(final 0Cl 0Cl) {
        public final class 0Cb implements SQLiteDatabase$CursorFactory
        {
            public final /* synthetic */ 0Cl LIZ;
            
            static {
                Covode.recordClassIndex(1318);
            }
            
            public 0Cb(final 0Cl liz) {
                this.LIZ = liz;
            }
            
            public final Cursor newCursor(final SQLiteDatabase sqLiteDatabase, final SQLiteCursorDriver sqLiteCursorDriver, final String s, final SQLiteQuery sqLiteQuery) {
                this.LIZ.LIZ(new 166((SQLiteProgram)sqLiteQuery));
                return (Cursor)new SQLiteCursor(sqLiteCursorDriver, s, sqLiteQuery);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/163.LIZIZ:Landroid/database/sqlite/SQLiteDatabase;
        //     4: new             LX/0Cb;
        //     7: dup            
        //     8: aload_1        
        //     9: invokespecial   X/0Cb.<init>:(LX/0Cl;)V
        //    12: aload_1        
        //    13: invokeinterface X/0Cl.LIZIZ:()Ljava/lang/String;
        //    18: getstatic       X/163.LIZ:[Ljava/lang/String;
        //    21: aconst_null    
        //    22: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQueryWithFactory:(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    25: areturn        
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
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
    
    @Override
    public final void LIZ() {
        this.LIZIZ.beginTransaction();
    }
    
    @Override
    public final Cursor LIZIZ(final String s) {
        return this.LIZ(new 167(s, (byte)0));
    }
    
    @Override
    public final void LIZIZ() {
        this.LIZIZ.endTransaction();
    }
    
    @Override
    public final void LIZJ() {
        this.LIZIZ.setTransactionSuccessful();
    }
    
    @Override
    public final void LIZJ(final String s) {
        this.LIZIZ.execSQL(s);
    }
    
    @Override
    public final boolean LIZLLL() {
        return this.LIZIZ.inTransaction();
    }
    
    @Override
    public final boolean LJ() {
        return this.LIZIZ.isOpen();
    }
    
    @Override
    public final String LJFF() {
        return this.LIZIZ.getPath();
    }
    
    @Override
    public final List<Pair<String, String>> LJI() {
        return this.LIZIZ.getAttachedDbs();
    }
    
    @Override
    public final void close() {
        this.LIZIZ.close();
    }
}
