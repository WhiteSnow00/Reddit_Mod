// 
// Decompiled by Procyon v0.6.0
// 

package qe2;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONObject;

public final class n
{
    public static JSONObject c;
    public static n d;
    public final ArrayList<String> a;
    public final JSONObject b;
    
    public n(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: new             Lorg/json/JSONObject;
        //     7: dup            
        //     8: invokespecial   org/json/JSONObject.<init>:()V
        //    11: astore_2       
        //    12: aload_0        
        //    13: aload_2        
        //    14: putfield        qe2/n.b:Lorg/json/JSONObject;
        //    17: aload_2        
        //    18: ldc             "version"
        //    20: iconst_0       
        //    21: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    24: invokevirtual   org/json/JSONObject.putOpt:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //    27: pop            
        //    28: new             Lorg/json/JSONArray;
        //    31: astore_3       
        //    32: aload_3        
        //    33: invokespecial   org/json/JSONArray.<init>:()V
        //    36: aload_2        
        //    37: ldc             "uri_skip_list"
        //    39: aload_3        
        //    40: invokevirtual   org/json/JSONObject.putOpt:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //    43: pop            
        //    44: aload_3        
        //    45: ldc             "^fb\\d+:"
        //    47: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //    50: pop            
        //    51: aload_3        
        //    52: ldc             "^li\\d+:"
        //    54: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //    57: pop            
        //    58: aload_3        
        //    59: ldc             "^pdk\\d+:"
        //    61: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //    64: pop            
        //    65: aload_3        
        //    66: ldc             "^twitterkit-.*:"
        //    68: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //    71: pop            
        //    72: aload_3        
        //    73: ldc             "^com\\.googleusercontent\\.apps\\.\\d+-.*:\\/oauth"
        //    75: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //    78: pop            
        //    79: aload_3        
        //    80: ldc             "^(?i)(?!(http|https):).*(:|:.*\\b)(password|o?auth|o?auth.?token|access|access.?token)\\b"
        //    82: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //    85: pop            
        //    86: aload_3        
        //    87: ldc             "^(?i)((http|https):\\/\\/).*[\\/|?|#].*\\b(password|o?auth|o?auth.?token|access|access.?token)\\b"
        //    89: invokevirtual   org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
        //    92: pop            
        //    93: aload_1        
        //    94: invokestatic    qe2/j.g:(Landroid/content/Context;)Lqe2/j;
        //    97: astore_2       
        //    98: new             Lorg/json/JSONObject;
        //   101: dup            
        //   102: invokespecial   org/json/JSONObject.<init>:()V
        //   105: astore_1       
        //   106: aload_2        
        //   107: ldc             "skip_url_format_key"
        //   109: invokevirtual   qe2/j.p:(Ljava/lang/String;)Ljava/lang/String;
        //   112: astore_3       
        //   113: aload_3        
        //   114: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   117: ifne            146
        //   120: ldc             "bnc_no_value"
        //   122: aload_3        
        //   123: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   126: ifeq            132
        //   129: goto            146
        //   132: new             Lorg/json/JSONObject;
        //   135: astore_2       
        //   136: aload_2        
        //   137: aload_3        
        //   138: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   141: aload_2        
        //   142: astore_1       
        //   143: goto            151
        //   146: aload_0        
        //   147: getfield        qe2/n.b:Lorg/json/JSONObject;
        //   150: astore_1       
        //   151: aload_1        
        //   152: putstatic       qe2/n.c:Lorg/json/JSONObject;
        //   155: aload_0        
        //   156: new             Ljava/util/ArrayList;
        //   159: dup            
        //   160: invokespecial   java/util/ArrayList.<init>:()V
        //   163: putfield        qe2/n.a:Ljava/util/ArrayList;
        //   166: return         
        //   167: astore_2       
        //   168: goto            93
        //   171: astore_2       
        //   172: goto            151
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  17     93     167    171    Lorg/json/JSONException;
        //  132    141    171    175    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0132:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public final String a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc             "uri_skip_list"
        //     5: invokevirtual   org/json/JSONObject.optJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
        //     8: astore          6
        //    10: aload           6
        //    12: ifnull          64
        //    15: iconst_0       
        //    16: istore_2       
        //    17: aload           6
        //    19: invokevirtual   org/json/JSONArray.length:()I
        //    22: istore_3       
        //    23: iload_2        
        //    24: iload_3        
        //    25: if_icmpge       64
        //    28: aload           6
        //    30: iload_2        
        //    31: invokevirtual   org/json/JSONArray.getString:(I)Ljava/lang/String;
        //    34: astore          5
        //    36: aload           5
        //    38: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //    41: aload_1        
        //    42: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    45: invokevirtual   java/util/regex/Matcher.find:()Z
        //    48: istore          4
        //    50: iload           4
        //    52: ifeq            58
        //    55: goto            67
        //    58: iinc            2, 1
        //    61: goto            17
        //    64: aconst_null    
        //    65: astore          5
        //    67: aload           5
        //    69: ifnonnull       131
        //    72: aload_1        
        //    73: astore          6
        //    75: aload_0        
        //    76: getfield        qe2/n.a:Ljava/util/ArrayList;
        //    79: invokevirtual   java/util/ArrayList.size:()I
        //    82: ifle            135
        //    85: aload_0        
        //    86: getfield        qe2/n.a:Ljava/util/ArrayList;
        //    89: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    92: astore          6
        //    94: aload           6
        //    96: invokeinterface java/util/Iterator.hasNext:()Z
        //   101: ifeq            131
        //   104: aload_1        
        //   105: aload           6
        //   107: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   112: checkcast       Ljava/lang/String;
        //   115: invokevirtual   java/lang/String.matches:(Ljava/lang/String;)Z
        //   118: istore          4
        //   120: iload           4
        //   122: ifeq            94
        //   125: aload_1        
        //   126: astore          6
        //   128: goto            135
        //   131: aload           5
        //   133: astore          6
        //   135: aload           6
        //   137: areturn        
        //   138: astore          5
        //   140: aload_1        
        //   141: astore          6
        //   143: goto            135
        //   146: astore          5
        //   148: goto            58
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  0      10     138    146    Ljava/lang/Exception;
        //  17     23     138    146    Ljava/lang/Exception;
        //  28     50     146    151    Lorg/json/JSONException;
        //  28     50     138    146    Ljava/lang/Exception;
        //  75     94     138    146    Ljava/lang/Exception;
        //  94     120    138    146    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0058:
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
}
