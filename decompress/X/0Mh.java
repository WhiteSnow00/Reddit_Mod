// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 0Mh
{
    public static long LIZ;
    public static List<String> LIZIZ;
    
    static {
        Covode.recordClassIndex(2750);
    }
    
    public static a LIZ(final File file, final a a, final b b) {
        if (file == null || !file.exists()) {
            return null;
        }
        int i = 0;
        if (!file.isFile()) {
            final List<String> liziz = 0Mh.LIZIZ;
            if (liziz == null || !liziz.contains(file.getName())) {
                String s;
                if (a == null) {
                    s = b.name();
                }
                else {
                    s = file.getName();
                }
                final a a2 = new a(s, 0Mi.LIZ(file), a);
                if (a != null) {
                    a.LIZ(a2);
                }
                if (file.isFile()) {
                    return null;
                }
                if (file.isDirectory()) {
                    final File[] listFiles = file.listFiles();
                    if (listFiles != null && listFiles.length > 0) {
                        while (i < listFiles.length) {
                            LIZ(listFiles[i], a2, b);
                            ++i;
                        }
                    }
                }
                return a2;
            }
        }
        return null;
    }
    
    public static a LIZ(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: new             Ljava/io/File;
        //     9: dup            
        //    10: aload_0        
        //    11: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    14: astore_1       
        //    15: aload_1        
        //    16: invokevirtual   java/io/File.exists:()Z
        //    19: istore_2       
        //    20: aconst_null    
        //    21: astore_0       
        //    22: iload_2        
        //    23: ifne            34
        //    26: sipush          18837
        //    29: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    32: aconst_null    
        //    33: areturn        
        //    34: new             Ljava/io/FileInputStream;
        //    37: astore_3       
        //    38: aload_3        
        //    39: aload_1        
        //    40: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    43: aload_3        
        //    44: astore_0       
        //    45: aload_3        
        //    46: invokevirtual   java/io/FileInputStream.available:()I
        //    49: newarray        B
        //    51: astore          4
        //    53: aload_3        
        //    54: astore_0       
        //    55: aload_3        
        //    56: aload           4
        //    58: invokevirtual   java/io/FileInputStream.read:([B)I
        //    61: pop            
        //    62: aload_3        
        //    63: astore_0       
        //    64: new             Ljava/lang/String;
        //    67: astore_1       
        //    68: aload_3        
        //    69: astore_0       
        //    70: aload_1        
        //    71: aload           4
        //    73: ldc             "utf-8"
        //    75: invokespecial   java/lang/String.<init>:([BLjava/lang/String;)V
        //    78: aload_3        
        //    79: astore_0       
        //    80: new             Lorg/json/JSONObject;
        //    83: astore          4
        //    85: aload_3        
        //    86: astore_0       
        //    87: aload           4
        //    89: aload_1        
        //    90: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    93: aload_3        
        //    94: astore_0       
        //    95: aload           4
        //    97: aconst_null    
        //    98: invokestatic    X/0Mf.LIZ:(Lorg/json/JSONObject;LX/0Mf;)LX/0Mf;
        //   101: astore_1       
        //   102: aload_3        
        //   103: invokevirtual   java/io/FileInputStream.close:()V
        //   106: goto            114
        //   109: astore_0       
        //   110: aload_0        
        //   111: invokestatic    X/0II.LIZ:(Ljava/lang/Exception;)V
        //   114: sipush          18837
        //   117: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   120: aload_1        
        //   121: areturn        
        //   122: astore_1       
        //   123: goto            141
        //   126: astore_1       
        //   127: goto            157
        //   130: astore_1       
        //   131: goto            173
        //   134: astore_3       
        //   135: goto            200
        //   138: astore_1       
        //   139: aconst_null    
        //   140: astore_3       
        //   141: aload_3        
        //   142: astore_0       
        //   143: aload_1        
        //   144: invokestatic    X/0II.LIZ:(Ljava/lang/Exception;)V
        //   147: aload_3        
        //   148: invokevirtual   java/io/FileInputStream.close:()V
        //   151: goto            191
        //   154: astore_1       
        //   155: aconst_null    
        //   156: astore_3       
        //   157: aload_3        
        //   158: astore_0       
        //   159: aload_1        
        //   160: invokestatic    X/0II.LIZ:(Ljava/lang/Exception;)V
        //   163: aload_3        
        //   164: invokevirtual   java/io/FileInputStream.close:()V
        //   167: goto            191
        //   170: astore_1       
        //   171: aconst_null    
        //   172: astore_3       
        //   173: aload_3        
        //   174: astore_0       
        //   175: aload_1        
        //   176: invokestatic    X/0II.LIZ:(Ljava/lang/Exception;)V
        //   179: aload_3        
        //   180: invokevirtual   java/io/FileInputStream.close:()V
        //   183: goto            191
        //   186: astore_0       
        //   187: aload_0        
        //   188: invokestatic    X/0II.LIZ:(Ljava/lang/Exception;)V
        //   191: sipush          18837
        //   194: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   197: aconst_null    
        //   198: areturn        
        //   199: astore_3       
        //   200: aload_0        
        //   201: invokevirtual   java/io/FileInputStream.close:()V
        //   204: goto            212
        //   207: astore_0       
        //   208: aload_0        
        //   209: invokestatic    X/0II.LIZ:(Ljava/lang/Exception;)V
        //   212: sipush          18837
        //   215: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   218: aload_3        
        //   219: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  34     43     170    173    Ljava/io/FileNotFoundException;
        //  34     43     154    157    Ljava/io/IOException;
        //  34     43     138    141    Ljava/lang/Exception;
        //  34     43     134    138    Any
        //  45     53     130    134    Ljava/io/FileNotFoundException;
        //  45     53     126    130    Ljava/io/IOException;
        //  45     53     122    126    Ljava/lang/Exception;
        //  45     53     199    200    Any
        //  55     62     130    134    Ljava/io/FileNotFoundException;
        //  55     62     126    130    Ljava/io/IOException;
        //  55     62     122    126    Ljava/lang/Exception;
        //  55     62     199    200    Any
        //  64     68     130    134    Ljava/io/FileNotFoundException;
        //  64     68     126    130    Ljava/io/IOException;
        //  64     68     122    126    Ljava/lang/Exception;
        //  64     68     199    200    Any
        //  70     78     130    134    Ljava/io/FileNotFoundException;
        //  70     78     126    130    Ljava/io/IOException;
        //  70     78     122    126    Ljava/lang/Exception;
        //  70     78     199    200    Any
        //  80     85     130    134    Ljava/io/FileNotFoundException;
        //  80     85     126    130    Ljava/io/IOException;
        //  80     85     122    126    Ljava/lang/Exception;
        //  80     85     199    200    Any
        //  87     93     130    134    Ljava/io/FileNotFoundException;
        //  87     93     126    130    Ljava/io/IOException;
        //  87     93     122    126    Ljava/lang/Exception;
        //  87     93     199    200    Any
        //  95     102    130    134    Ljava/io/FileNotFoundException;
        //  95     102    126    130    Ljava/io/IOException;
        //  95     102    122    126    Ljava/lang/Exception;
        //  95     102    199    200    Any
        //  102    106    109    114    Ljava/lang/Exception;
        //  143    147    199    200    Any
        //  147    151    186    191    Ljava/lang/Exception;
        //  159    163    199    200    Any
        //  163    167    186    191    Ljava/lang/Exception;
        //  175    179    199    200    Any
        //  179    183    186    191    Ljava/lang/Exception;
        //  200    204    207    212    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0114:
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
    
    public static void LIZ(a a, a a2, final List<a> list) {
        if (a != null && a2 != null && list != null) {
            if (a2.LIZ - a.LIZ > 0Mh.LIZ) {
                list.add(a2);
            }
            final List<a> liziz = a2.LIZIZ;
            if (liziz != null) {
                if (!liziz.isEmpty()) {
                    final List<a> liziz2 = a.LIZIZ;
                    if (liziz2 != null && !liziz2.isEmpty()) {
                        final Iterator iterator = liziz.iterator();
                        while (iterator.hasNext()) {
                            a2 = (a)iterator.next();
                            if (a2 != null) {
                                final Iterator iterator2 = liziz2.iterator();
                                int n = 0;
                                while (iterator2.hasNext()) {
                                    final a a3 = (a)iterator2.next();
                                    if (a3 != null && a2.LIZIZ().equals(a3.LIZIZ())) {
                                        LIZ(a3, a2, list);
                                        break;
                                    }
                                    ++n;
                                }
                                if (n < liziz2.size() || !a2.LIZ()) {
                                    continue;
                                }
                                list.add(a2);
                            }
                        }
                        return;
                    }
                    final Iterator iterator3 = liziz.iterator();
                    while (iterator3.hasNext()) {
                        a = (a)iterator3.next();
                        if (a != null && a.LIZ()) {
                            list.add(a);
                        }
                    }
                }
            }
        }
    }
    
    public static final class a
    {
        public long LIZ;
        public List<a> LIZIZ;
        public String LIZJ;
        public a LIZLLL;
        public String LJ;
        
        static {
            Covode.recordClassIndex(2751);
        }
        
        public a(final String lizj, final long liz, final a lizlll) {
            this.LIZIZ = new ArrayList<a>();
            this.LIZJ = lizj;
            this.LIZ = liz;
            this.LIZLLL = lizlll;
        }
        
        public static a LIZ(final JSONObject jsonObject, final a a) {
            if (jsonObject == null) {
                return null;
            }
            try {
                final String optString = jsonObject.optString("name");
                final long optLong = jsonObject.optLong("size", 0L);
                if (optString == null) {
                    return null;
                }
                final a a2 = new a(optString, optLong, a);
                if (a != null) {
                    a.LIZ(a2);
                }
                final JSONArray optJSONArray = jsonObject.optJSONArray("child");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); ++i) {
                        final JSONObject jsonObject2 = optJSONArray.getJSONObject(i);
                        if (jsonObject2 != null) {
                            LIZ(jsonObject2, a2);
                        }
                    }
                }
                return a2;
            }
            catch (final Exception ex) {
                0II.LIZ(ex);
                return null;
            }
        }
        
        public final void LIZ(final a a) {
            this.LIZIZ.add(a);
        }
        
        public final boolean LIZ() {
            return this.LIZ > 0Mh.LIZ;
        }
        
        public final String LIZIZ() {
            final String lj = this.LJ;
            if (lj != null) {
                return lj;
            }
            if (this.LIZLLL == null) {
                this.LJ = this.LIZJ;
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.LIZLLL.LIZIZ());
                sb.append(File.separator);
                sb.append(this.LIZJ);
                this.LJ = sb.toString();
            }
            return this.LJ;
        }
        
        public final JSONObject LIZJ() {
            final JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("name", (Object)this.LIZJ);
                jsonObject.put("size", this.LIZ);
                final List<a> liziz = this.LIZIZ;
                if (liziz != null && liziz.size() > 0) {
                    final JSONArray jsonArray = new JSONArray();
                    for (final a a : this.LIZIZ) {
                        if (a != null) {
                            jsonArray.put((Object)a.LIZJ());
                        }
                    }
                    jsonObject.put("child", (Object)jsonArray);
                }
            }
            catch (final JSONException ex) {
                0II.LIZ((Exception)ex);
            }
            return jsonObject;
        }
    }
    
    public enum b
    {
        LIZ, 
        LIZIZ;
        
        static {
            Covode.recordClassIndex(2752);
        }
    }
}
