// 
// Decompiled by Procyon v0.6.0
// 

package h;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import android.content.Context;

public final class s
{
    public static void a(final Context p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             ""
        //     3: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //     6: ifeq            17
        //     9: aload_0        
        //    10: ldc             "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
        //    12: invokevirtual   android/content/Context.deleteFile:(Ljava/lang/String;)Z
        //    15: pop            
        //    16: return         
        //    17: aload_0        
        //    18: ldc             "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
        //    20: iconst_0       
        //    21: invokevirtual   android/content/Context.openFileOutput:(Ljava/lang/String;I)Ljava/io/FileOutputStream;
        //    24: astore_0       
        //    25: invokestatic    android/util/Xml.newSerializer:()Lorg/xmlpull/v1/XmlSerializer;
        //    28: astore_2       
        //    29: aload_2        
        //    30: aload_0        
        //    31: aconst_null    
        //    32: invokeinterface org/xmlpull/v1/XmlSerializer.setOutput:(Ljava/io/OutputStream;Ljava/lang/String;)V
        //    37: aload_2        
        //    38: ldc             "UTF-8"
        //    40: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //    43: invokeinterface org/xmlpull/v1/XmlSerializer.startDocument:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //    48: aload_2        
        //    49: aconst_null    
        //    50: ldc             "locales"
        //    52: invokeinterface org/xmlpull/v1/XmlSerializer.startTag:(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //    57: pop            
        //    58: aload_2        
        //    59: aconst_null    
        //    60: ldc             "application_locales"
        //    62: aload_1        
        //    63: invokeinterface org/xmlpull/v1/XmlSerializer.attribute:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //    68: pop            
        //    69: aload_2        
        //    70: aconst_null    
        //    71: ldc             "locales"
        //    73: invokeinterface org/xmlpull/v1/XmlSerializer.endTag:(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //    78: pop            
        //    79: aload_2        
        //    80: invokeinterface org/xmlpull/v1/XmlSerializer.endDocument:()V
        //    85: new             Ljava/lang/StringBuilder;
        //    88: astore_2       
        //    89: aload_2        
        //    90: invokespecial   java/lang/StringBuilder.<init>:()V
        //    93: aload_2        
        //    94: ldc             "Storing App Locales : app-locales: "
        //    96: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    99: pop            
        //   100: aload_2        
        //   101: aload_1        
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: pop            
        //   106: aload_2        
        //   107: ldc             " persisted successfully."
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: pop            
        //   113: ldc             "AppLocalesStorageHelper"
        //   115: aload_2        
        //   116: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   119: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   122: pop            
        //   123: aload_0        
        //   124: ifnull          178
        //   127: aload_0        
        //   128: invokevirtual   java/io/FileOutputStream.close:()V
        //   131: goto            178
        //   134: astore_1       
        //   135: goto            179
        //   138: astore_2       
        //   139: new             Ljava/lang/StringBuilder;
        //   142: astore_3       
        //   143: aload_3        
        //   144: invokespecial   java/lang/StringBuilder.<init>:()V
        //   147: aload_3        
        //   148: ldc             "Storing App Locales : Failed to persist app-locales: "
        //   150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   153: pop            
        //   154: aload_3        
        //   155: aload_1        
        //   156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   159: pop            
        //   160: ldc             "AppLocalesStorageHelper"
        //   162: aload_3        
        //   163: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   166: aload_2        
        //   167: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   170: pop            
        //   171: aload_0        
        //   172: ifnull          178
        //   175: goto            127
        //   178: return         
        //   179: aload_0        
        //   180: ifnull          187
        //   183: aload_0        
        //   184: invokevirtual   java/io/FileOutputStream.close:()V
        //   187: aload_1        
        //   188: athrow         
        //   189: astore_0       
        //   190: ldc             "AppLocalesStorageHelper"
        //   192: ldc             "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
        //   194: iconst_1       
        //   195: anewarray       Ljava/lang/Object;
        //   198: dup            
        //   199: iconst_0       
        //   200: ldc             "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
        //   202: aastore        
        //   203: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   206: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   209: pop            
        //   210: return         
        //   211: astore_0       
        //   212: goto            178
        //   215: astore_0       
        //   216: goto            187
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  17     25     189    211    Ljava/io/FileNotFoundException;
        //  29     123    138    178    Ljava/lang/Exception;
        //  29     123    134    189    Any
        //  127    131    211    215    Ljava/io/IOException;
        //  139    171    134    189    Any
        //  183    187    215    219    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 116, Size: 116
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
    
    public static String b(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: astore_1       
        //     3: aload_0        
        //     4: ldc             "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
        //     6: invokevirtual   android/content/Context.openFileInput:(Ljava/lang/String;)Ljava/io/FileInputStream;
        //     9: astore_2       
        //    10: invokestatic    android/util/Xml.newPullParser:()Lorg/xmlpull/v1/XmlPullParser;
        //    13: astore_3       
        //    14: aload_3        
        //    15: aload_2        
        //    16: ldc             "UTF-8"
        //    18: invokeinterface org/xmlpull/v1/XmlPullParser.setInput:(Ljava/io/InputStream;Ljava/lang/String;)V
        //    23: aload_3        
        //    24: invokeinterface org/xmlpull/v1/XmlPullParser.getDepth:()I
        //    29: istore          4
        //    31: aload_3        
        //    32: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //    37: istore          5
        //    39: aload_1        
        //    40: astore          6
        //    42: iload           5
        //    44: iconst_1       
        //    45: if_icmpeq       108
        //    48: iload           5
        //    50: iconst_3       
        //    51: if_icmpne       68
        //    54: aload_1        
        //    55: astore          6
        //    57: aload_3        
        //    58: invokeinterface org/xmlpull/v1/XmlPullParser.getDepth:()I
        //    63: iload           4
        //    65: if_icmple       108
        //    68: iload           5
        //    70: iconst_3       
        //    71: if_icmpeq       31
        //    74: iload           5
        //    76: iconst_4       
        //    77: if_icmpne       83
        //    80: goto            31
        //    83: aload_3        
        //    84: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //    89: ldc             "locales"
        //    91: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    94: ifeq            31
        //    97: aload_3        
        //    98: aconst_null    
        //    99: ldc             "application_locales"
        //   101: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   106: astore          6
        //   108: aload           6
        //   110: astore_3       
        //   111: aload_2        
        //   112: ifnull          151
        //   115: aload_2        
        //   116: invokevirtual   java/io/FileInputStream.close:()V
        //   119: aload           6
        //   121: astore_3       
        //   122: goto            151
        //   125: astore_0       
        //   126: goto            201
        //   129: astore          6
        //   131: ldc             "AppLocalesStorageHelper"
        //   133: ldc             "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
        //   135: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   138: pop            
        //   139: aload_1        
        //   140: astore_3       
        //   141: aload_2        
        //   142: ifnull          151
        //   145: aload_1        
        //   146: astore          6
        //   148: goto            115
        //   151: aload_3        
        //   152: invokevirtual   java/lang/String.isEmpty:()Z
        //   155: ifne            192
        //   158: new             Ljava/lang/StringBuilder;
        //   161: dup            
        //   162: invokespecial   java/lang/StringBuilder.<init>:()V
        //   165: astore_0       
        //   166: aload_0        
        //   167: ldc             "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: pop            
        //   173: aload_0        
        //   174: aload_3        
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: pop            
        //   179: ldc             "AppLocalesStorageHelper"
        //   181: aload_0        
        //   182: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   185: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   188: pop            
        //   189: goto            199
        //   192: aload_0        
        //   193: ldc             "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
        //   195: invokevirtual   android/content/Context.deleteFile:(Ljava/lang/String;)Z
        //   198: pop            
        //   199: aload_3        
        //   200: areturn        
        //   201: aload_2        
        //   202: ifnull          209
        //   205: aload_2        
        //   206: invokevirtual   java/io/FileInputStream.close:()V
        //   209: aload_0        
        //   210: athrow         
        //   211: astore_0       
        //   212: ldc             "AppLocalesStorageHelper"
        //   214: ldc             "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
        //   216: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   219: pop            
        //   220: ldc             ""
        //   222: areturn        
        //   223: astore_1       
        //   224: aload           6
        //   226: astore_3       
        //   227: goto            151
        //   230: astore          6
        //   232: goto            209
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                   
        //  -----  -----  -----  -----  ---------------------------------------
        //  3      10     211    223    Ljava/io/FileNotFoundException;
        //  10     31     129    151    Lorg/xmlpull/v1/XmlPullParserException;
        //  10     31     129    151    Ljava/io/IOException;
        //  10     31     125    211    Any
        //  31     39     129    151    Lorg/xmlpull/v1/XmlPullParserException;
        //  31     39     129    151    Ljava/io/IOException;
        //  31     39     125    211    Any
        //  57     68     129    151    Lorg/xmlpull/v1/XmlPullParserException;
        //  57     68     129    151    Ljava/io/IOException;
        //  57     68     125    211    Any
        //  83     108    129    151    Lorg/xmlpull/v1/XmlPullParserException;
        //  83     108    129    151    Ljava/io/IOException;
        //  83     108    125    211    Any
        //  115    119    223    230    Ljava/io/IOException;
        //  131    139    125    211    Any
        //  205    209    230    235    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.util.ConcurrentModificationException
        //     at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        //     at java.util.ArrayList$Itr.next(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2913)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2501)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public static final class a implements Executor
    {
        public final Object f;
        public final ArrayDeque g;
        public final Executor h;
        public Runnable i;
        
        public a(final b h) {
            this.f = new Object();
            this.g = new ArrayDeque();
            this.h = h;
        }
        
        public final void a() {
            synchronized (this.f) {
                final Runnable i = this.g.poll();
                this.i = i;
                if (i != null) {
                    this.h.execute(i);
                }
            }
        }
        
        @Override
        public final void execute(final Runnable runnable) {
            synchronized (this.f) {
                this.g.add(new r(0, this, runnable));
                if (this.i == null) {
                    this.a();
                }
            }
        }
    }
    
    public static final class b implements Executor
    {
        @Override
        public final void execute(final Runnable runnable) {
            new Thread(runnable).start();
        }
    }
}
