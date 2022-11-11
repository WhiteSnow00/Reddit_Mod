// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.n.z;
import java.util.LinkedHashSet;
import java.util.List;
import android.database.Cursor;
import kotlin.jvm.internal.n;
import java.util.ArrayList;
import java.util.Iterator;
import android.content.ContentValues;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.database.sqlite.SQLiteOpenHelper;

public final class 0fy extends SQLiteOpenHelper
{
    static {
        Covode.recordClassIndex(6164);
    }
    
    public 0fy(final Context context) {
        CTM.LIZ((Object)context);
        super(context, "live_composer.db", (SQLiteDatabase$CursorFactory)null, 3);
    }
    
    private final 0hK LIZ(final SQLiteDatabase p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: aconst_null    
        //     7: astore          4
        //     9: iconst_1       
        //    10: istore          5
        //    12: aload_1        
        //    13: ldc             "live_composer_node"
        //    15: aconst_null    
        //    16: ldc             "effect_id=?"
        //    18: iconst_1       
        //    19: anewarray       Ljava/lang/String;
        //    22: dup            
        //    23: iconst_0       
        //    24: aload_2        
        //    25: aastore        
        //    26: aconst_null    
        //    27: aconst_null    
        //    28: aconst_null    
        //    29: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    32: astore          6
        //    34: aload           6
        //    36: invokeinterface android/database/Cursor.moveToNext:()Z
        //    41: ifne            66
        //    44: aload           6
        //    46: invokeinterface android/database/Cursor.close:()V
        //    51: aload           6
        //    53: invokeinterface android/database/Cursor.close:()V
        //    58: sipush          4976
        //    61: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    64: aconst_null    
        //    65: areturn        
        //    66: aload           6
        //    68: aload           6
        //    70: ldc             "id"
        //    72: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //    77: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    82: astore          4
        //    84: aload_3        
        //    85: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    88: aload_3        
        //    89: ldc             "broadcast"
        //    91: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    94: istore          7
        //    96: iload           7
        //    98: ifne            104
        //   101: goto            117
        //   104: getstatic       X/0gZ.LIZLLL:Ljava/lang/String;
        //   107: astore_3       
        //   108: aload_3        
        //   109: ldc             ""
        //   111: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   114: goto            129
        //   117: aload_3        
        //   118: ldc             "guest_linkmic"
        //   120: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   123: ifeq            104
        //   126: ldc             "liveguestbeauty"
        //   128: astore_3       
        //   129: aload           6
        //   131: aload           6
        //   133: ldc             "effect_id"
        //   135: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   140: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   145: astore          8
        //   147: aload           6
        //   149: aload           6
        //   151: ldc             "path"
        //   153: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   158: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   163: astore          9
        //   165: aload           6
        //   167: aload           6
        //   169: ldc             "update_time"
        //   171: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   176: invokeinterface android/database/Cursor.getLong:(I)J
        //   181: lstore          10
        //   183: aload           6
        //   185: aload           6
        //   187: ldc             "use"
        //   189: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   194: invokeinterface android/database/Cursor.getInt:(I)I
        //   199: iconst_1       
        //   200: if_icmpne       242
        //   203: new             LX/0hK;
        //   206: astore_2       
        //   207: aload           8
        //   209: ldc             ""
        //   211: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   214: aload           9
        //   216: ldc             ""
        //   218: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   221: aload_2        
        //   222: aload_3        
        //   223: aload           8
        //   225: aload           9
        //   227: iconst_0       
        //   228: lload           10
        //   230: invokespecial   X/0hK.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V
        //   233: aload_2        
        //   234: iload           5
        //   236: putfield        X/0hK.LJII:Z
        //   239: goto            248
        //   242: iconst_0       
        //   243: istore          5
        //   245: goto            203
        //   248: aload           4
        //   250: ldc             ""
        //   252: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   255: goto            262
        //   258: astore_1       
        //   259: goto            281
        //   262: aload_0        
        //   263: aload_1        
        //   264: aload           4
        //   266: aload_2        
        //   267: aconst_null    
        //   268: invokespecial   X/0fy.LIZ:(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;LX/0hK;Ljava/util/ArrayList;)V
        //   271: goto            316
        //   274: astore_1       
        //   275: aconst_null    
        //   276: astore_2       
        //   277: goto            281
        //   280: astore_1       
        //   281: aload           6
        //   283: astore_3       
        //   284: goto            293
        //   287: astore_1       
        //   288: aconst_null    
        //   289: astore_2       
        //   290: aload           4
        //   292: astore_3       
        //   293: ldc             "LiveComposerSQLiteHelper"
        //   295: aload_1        
        //   296: invokestatic    X/0ba.LIZ:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   299: aload_2        
        //   300: astore_1       
        //   301: aload_3        
        //   302: ifnull          325
        //   305: aload_3        
        //   306: invokeinterface android/database/Cursor.close:()V
        //   311: aload_2        
        //   312: astore_1       
        //   313: goto            325
        //   316: aload           6
        //   318: invokeinterface android/database/Cursor.close:()V
        //   323: aload_2        
        //   324: astore_1       
        //   325: sipush          4976
        //   328: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   331: aload_1        
        //   332: areturn        
        //   333: astore_1       
        //   334: aload_3        
        //   335: ifnull          344
        //   338: aload_3        
        //   339: invokeinterface android/database/Cursor.close:()V
        //   344: sipush          4976
        //   347: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   350: aload_1        
        //   351: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  12     34     287    293    Any
        //  34     51     274    280    Any
        //  66     96     274    280    Any
        //  104    114    274    280    Any
        //  117    126    274    280    Any
        //  129    203    274    280    Any
        //  203    239    274    280    Any
        //  248    255    258    262    Any
        //  262    271    280    281    Any
        //  293    299    333    352    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0262:
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void LIZ(final SQLiteDatabase sqLiteDatabase, final 0hK 0hK) {
        MethodCollector.i(4839);
        sqLiteDatabase.beginTransaction();
        final Throwable t2;
        try {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("panel", 0hK.LIZ);
            contentValues.put("effect_id", 0hK.LIZIZ);
            contentValues.put("path", 0hK.LIZJ);
            contentValues.put("update_time", Long.valueOf(0hK.LJ));
            int n;
            if (0hK.LJII) {
                n = 1;
            }
            else {
                n = 0;
            }
            contentValues.put("use", Integer.valueOf(n));
            final long insertWithOnConflict = sqLiteDatabase.insertWithOnConflict("live_composer_node", (String)null, contentValues, 5);
            for (final 0hL 0hL : 0hK.LJI) {
                String s;
                if (0hL.LIZIZ.length() > 0) {
                    s = 0hL.LIZIZ;
                }
                else {
                    s = 0hK.LIZIZ;
                }
                final ContentValues contentValues2 = new ContentValues();
                contentValues2.put("tag", 0hL.LIZJ);
                contentValues2.put("value", 0hL.LIZ);
                contentValues2.put("resource_id", s);
                contentValues2.put("node_id", Long.valueOf(insertWithOnConflict));
                sqLiteDatabase.insertWithOnConflict("live_composer_tag_node", (String)null, contentValues2, 5);
            }
            sqLiteDatabase.setTransactionSuccessful();
            return;
        }
        finally {
            final String s2 = "LiveComposerSQLiteHelper";
            final Throwable t = t2;
            0ba.LIZ(s2, t);
        }
        try {
            final String s2 = "LiveComposerSQLiteHelper";
            final Throwable t = t2;
            0ba.LIZ(s2, t);
        }
        finally {
            sqLiteDatabase.endTransaction();
            MethodCollector.o(4839);
        }
    }
    
    private final void LIZ(SQLiteDatabase sqLiteDatabase, String string, final 0hK 0hK, final ArrayList<0hK> list) {
        MethodCollector.i(5052);
        Object string2 = null;
        try {
            final Cursor query = sqLiteDatabase.query("live_composer_tag_node", (String[])null, "node_id=?", new String[] { string }, (String)null, (String)null, (String)null);
            try {
            Label_0030:
                while (query.moveToNext()) {
                    string = query.getString(query.getColumnIndex("tag"));
                    final float float1 = query.getFloat(query.getColumnIndex("value"));
                    string2 = query.getString(query.getColumnIndex("resource_id"));
                    for (final 0hL next : 0hK.LJI) {
                        if (n.LIZ((Object)next.LIZJ, (Object)string)) {
                            if (next == null) {
                                break;
                            }
                            continue Label_0030;
                        }
                    }
                    final List<0hL> lji = 0hK.LJI;
                    n.LIZIZ((Object)string, "");
                    final 0hL 0hL = new 0hL(string);
                    0hL.LIZ = float1;
                    n.LIZIZ(string2, "");
                    0hL.LIZ((String)string2);
                    lji.add(0hL);
                }
                if (list != null) {
                    list.add(0hK);
                }
                query.close();
            }
            finally {}
        }
        finally {
            sqLiteDatabase = (SQLiteDatabase)string2;
        }
        try {
            final Throwable t;
            0ba.LIZ("LiveComposerSQLiteHelper", t);
            if (sqLiteDatabase != null) {
                ((Cursor)sqLiteDatabase).close();
                MethodCollector.o(5052);
                return;
            }
            MethodCollector.o(5052);
        }
        finally {
            if (sqLiteDatabase != null) {
                ((Cursor)sqLiteDatabase).close();
            }
            MethodCollector.o(5052);
        }
    }
    
    public final List<0hK> LIZ() {
        MethodCollector.i(4923);
        final ArrayList list = new ArrayList();
        final SQLiteDatabase readableDatabase = this.getReadableDatabase();
        Object o = null;
        Label_0316: {
            try {
                Object query = readableDatabase.query("live_composer_node", (String[])null, (String)null, (String[])null, (String)null, (String)null, "update_time asc");
                while (true) {
                    o = query;
                    if (!((Cursor)query).moveToNext()) {
                        break Label_0316;
                    }
                    o = query;
                    final String string = ((Cursor)query).getString(((Cursor)query).getColumnIndex("id"));
                    o = query;
                    final String string2 = ((Cursor)query).getString(((Cursor)query).getColumnIndex("panel"));
                    o = query;
                    final String string3 = ((Cursor)query).getString(((Cursor)query).getColumnIndex("effect_id"));
                    o = query;
                    final String string4 = ((Cursor)query).getString(((Cursor)query).getColumnIndex("path"));
                    o = query;
                    final long long1 = ((Cursor)query).getLong(((Cursor)query).getColumnIndex("update_time"));
                    o = query;
                    final int int1 = ((Cursor)query).getInt(((Cursor)query).getColumnIndex("use"));
                    boolean ljii = true;
                    Label_0282: {
                        if (int1 != 1) {
                            break Label_0282;
                        }
                        while (true) {
                            o = query;
                            o = query;
                            n.LIZIZ((Object)string2, "");
                            o = query;
                            n.LIZIZ((Object)string3, "");
                            o = query;
                            n.LIZIZ((Object)string4, "");
                            o = query;
                            final 0hK 0hK = new 0hK(string2, string3, string4, false, long1);
                            o = query;
                            0hK.LJII = ljii;
                            o = query;
                            n.LIZIZ((Object)readableDatabase, "");
                            o = query;
                            n.LIZIZ((Object)string, "");
                            try {
                                this.LIZ(readableDatabase, string, 0hK, list);
                                break;
                                ljii = false;
                            }
                            finally {
                                o = query;
                                query = string4;
                            }
                        }
                    }
                }
            }
            finally {}
            try {
                final Cursor cursor;
                0ba.LIZ("LiveComposerSQLiteHelper", (Throwable)cursor);
                while (true) {
                    if (o != null) {
                        ((Cursor)o).close();
                    }
                    readableDatabase.close();
                    0ba.LIZ(3, "EFFECT_QYH", "getComposerNodeList ".concat(String.valueOf(list)));
                    MethodCollector.o(4923);
                    return list;
                    o = cursor;
                    continue;
                }
            }
            finally {
                if (o != null) {
                    ((Cursor)o).close();
                }
                MethodCollector.o(4923);
            }
        }
    }
    
    public final List<0hK> LIZ(final String s) {
        MethodCollector.i(5566);
        CTM.LIZ((Object)s);
        final ArrayList list = new ArrayList();
        final SQLiteDatabase readableDatabase = this.getReadableDatabase();
        Object query;
        Object string = query = null;
        Label_0308: {
            try {
                CTM.LIZ((Object)s);
                query = string;
                String[] array;
                if ((array = 1JQ.a.LIZ.get(s)) == null) {
                    query = string;
                    array = new String[0];
                }
                query = string;
                final String s2 = (String)(query = (query = readableDatabase.query("live_composer_scene_use_node", (String[])null, "scene=?", array, (String)null, (String)null, (String)null)));
                final LinkedHashSet set = new LinkedHashSet();
                while (true) {
                    query = s2;
                    string = s2;
                    if (!((Cursor)s2).moveToNext()) {
                        break Label_0308;
                    }
                    query = s2;
                    string = ((Cursor)s2).getString(((Cursor)s2).getColumnIndex("resource_id_list"));
                    if (string == null) {
                        continue;
                    }
                    query = s2;
                    final Iterator iterator = z.LIZ((CharSequence)string, new String[] { ";" }, 0, 6).iterator();
                    while (true) {
                        query = s2;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        query = s2;
                        string = iterator.next();
                        query = s2;
                        if (set.contains(string)) {
                            continue;
                        }
                        query = s2;
                        n.LIZIZ((Object)readableDatabase, "");
                        query = s2;
                        final 0hK liz = this.LIZ(readableDatabase, (String)string, s);
                        if (liz != null) {
                            query = s2;
                            list.add(liz);
                        }
                        query = s2;
                        set.add(string);
                    }
                }
            }
            finally {
                try {
                    final Throwable t;
                    0ba.LIZ("LiveComposerSQLiteHelper", t);
                    if (query != null) {
                        string = query;
                        ((Cursor)string).close();
                    }
                    readableDatabase.close();
                    MethodCollector.o(5566);
                    return list;
                }
                finally {
                    if (query != null) {
                        ((Cursor)query).close();
                    }
                    MethodCollector.o(5566);
                }
            }
        }
    }
    
    public final void LIZ(final String s, final List<0hK> list) {
        MethodCollector.i(4750);
        CTM.LIZ((Object)s, (Object)list);
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        Label_0094: {
            final Throwable t2;
            try {
                writableDatabase.beginTransaction();
                writableDatabase.delete("live_composer_node", (String)null, (String[])null);
                writableDatabase.delete("sqlite_sequence", "name=?", new String[] { "live_composer_node" });
                writableDatabase.delete("live_composer_tag_node", (String)null, (String[])null);
                writableDatabase.delete("sqlite_sequence", "name=?", new String[] { "live_composer_tag_node" });
                writableDatabase.setTransactionSuccessful();
                break Label_0094;
            }
            finally {
                final String s2 = "LiveComposerSQLiteHelper";
                final Throwable t = t2;
                0ba.LIZ(s2, t);
            }
            try {
                final String s2 = "LiveComposerSQLiteHelper";
                final Throwable t = t2;
                0ba.LIZ(s2, t);
                writableDatabase.endTransaction();
                for (final 0hK 0hK : list) {
                    writableDatabase.beginTransaction();
                    Label_0192: {
                        final Throwable t4;
                        try {
                            final ContentValues contentValues = new ContentValues();
                            contentValues.put("use", Integer.valueOf(1));
                            writableDatabase.update("live_composer_node", contentValues, "effect_id=?", new String[] { 0hK.LIZIZ });
                            writableDatabase.setTransactionSuccessful();
                            break Label_0192;
                        }
                        finally {
                            final String s3 = "LiveComposerSQLiteHelper";
                            final Throwable t3 = t4;
                            0ba.LIZ(s3, t3);
                        }
                        try {
                            final String s3 = "LiveComposerSQLiteHelper";
                            final Throwable t3 = t4;
                            0ba.LIZ(s3, t3);
                            writableDatabase.endTransaction();
                            n.LIZIZ((Object)writableDatabase, "");
                            this.LIZ(writableDatabase, 0hK);
                            continue;
                        }
                        finally {
                            writableDatabase.endTransaction();
                            MethodCollector.o(4750);
                        }
                    }
                    break;
                }
                writableDatabase.beginTransaction();
                Label_0264: {
                    final Throwable t6;
                    try {
                        writableDatabase.delete("live_composer_scene_use_node", "scene=?", new String[] { s });
                        writableDatabase.setTransactionSuccessful();
                        break Label_0264;
                    }
                    finally {
                        final String s4 = "LiveComposerSQLiteHelper";
                        final Throwable t5 = t6;
                        0ba.LIZ(s4, t5);
                    }
                    try {
                        final String s4 = "LiveComposerSQLiteHelper";
                        final Throwable t5 = t6;
                        0ba.LIZ(s4, t5);
                        writableDatabase.endTransaction();
                        final ArrayList list2 = new ArrayList(6Jd.LIZ((Iterable)list, 10));
                        final Iterator<Object> iterator2 = list.iterator();
                        while (iterator2.hasNext()) {
                            list2.add(iterator2.next().LIZIZ);
                        }
                        final String liz = Qsi.LIZ((Iterable)list2, (CharSequence)";", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (SRS)null, 62);
                        writableDatabase.beginTransaction();
                        Label_0396: {
                            final Throwable t8;
                            try {
                                final ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("scene", s);
                                contentValues2.put("resource_id_list", liz);
                                writableDatabase.insertWithOnConflict("live_composer_scene_use_node", (String)null, contentValues2, 5);
                                writableDatabase.setTransactionSuccessful();
                                break Label_0396;
                            }
                            finally {
                                final String s5 = "LiveComposerSQLiteHelper";
                                final Throwable t7 = t8;
                                0ba.LIZ(s5, t7);
                            }
                            try {
                                final String s5 = "LiveComposerSQLiteHelper";
                                final Throwable t7 = t8;
                                0ba.LIZ(s5, t7);
                                writableDatabase.endTransaction();
                                writableDatabase.close();
                                MethodCollector.o(4750);
                            }
                            finally {
                                writableDatabase.endTransaction();
                                MethodCollector.o(4750);
                            }
                        }
                    }
                    finally {
                        writableDatabase.endTransaction();
                        MethodCollector.o(4750);
                    }
                }
            }
            finally {
                writableDatabase.endTransaction();
                MethodCollector.o(4750);
            }
        }
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        MethodCollector.i(4662);
        if (sqLiteDatabase != null) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_node (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,panel TEXT,effect_id TEXT,resource_id TEXT,path TEXT,update_time INTEGER,use INTEGER)");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_tag_node(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,tag TEXT,value REAL,node_id INTEGER,resource_id TEXT)");
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_scene_use_node(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,scene TEXT,resource_id_list TEXT)");
            MethodCollector.o(4662);
            return;
        }
        MethodCollector.o(4662);
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        MethodCollector.i(5616);
        if (sqLiteDatabase == null) {
            MethodCollector.o(5616);
            return;
        }
        sqLiteDatabase.execSQL("Drop Table if exists live_composer_node");
        sqLiteDatabase.execSQL("Drop Table if exists live_composer_tag_node");
        sqLiteDatabase.execSQL("Drop Table if exists live_composer_scene_use_node");
        this.onCreate(sqLiteDatabase);
        MethodCollector.o(5616);
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        MethodCollector.i(5605);
        if (n < 2 && sqLiteDatabase != null) {
            sqLiteDatabase.execSQL("ALTER TABLE live_composer_node ADD COLUMN resource_id TEXT DEFAULT \"\" NOT NULL;");
        }
        if (n < 3 && sqLiteDatabase != null) {
            sqLiteDatabase.execSQL("ALTER TABLE live_composer_tag_node ADD COLUMN resource_id TEXT DEFAULT \"\" NOT NULL;");
        }
        if (n < 3 && sqLiteDatabase != null) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_scene_use_node(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,scene TEXT,resource_id_list TEXT)");
            MethodCollector.o(5605);
            return;
        }
        MethodCollector.o(5605);
    }
}
