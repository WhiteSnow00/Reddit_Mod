// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.ss.com.vboost.CapabilityType;
import org.json.JSONObject;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 11p extends 00L implements 00T
{
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static String LJI;
    public static String LJII;
    public 002 LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(54);
        11p.LIZIZ = 10000;
        11p.LIZJ = 1000;
        11p.LIZLLL = 4;
        11p.LJ = "";
        11p.LJFF = "692acdfd902192d5fb014b72e301626c9964e620e9c56f6a6071f2ef4cc9bd0b";
        11p.LJI = "10b824a48cd0655eda3dfab59f8ce989126de0da1e5306c0011afcd5779fcf4c";
        11p.LJII = "08f831f9969417a2322692a31e4ea253c0eec617ec0a4e7cf1d1468be2a27064";
    }
    
    public 11p(final Context context) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   X/00L.<init>:()V
        //     4: aload_1        
        //     5: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //     8: astore_1       
        //     9: aload_1        
        //    10: ldc             "vboostdemo"
        //    12: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    15: ifne            326
        //    18: aload_1        
        //    19: ldc             "zhiliaoapp.musically"
        //    21: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    24: ifeq            308
        //    27: getstatic       X/11p.LJFF:Ljava/lang/String;
        //    30: putstatic       X/11p.LJ:Ljava/lang/String;
        //    33: getstatic       X/5mN.LIZ:LX/5mM;
        //    36: getstatic       X/11p.LJ:Ljava/lang/String;
        //    39: invokevirtual   X/5mM.LIZ:(Ljava/lang/String;)Z
        //    42: istore_2       
        //    43: iconst_4       
        //    44: invokestatic    X/00s.LIZ:(I)Z
        //    47: pop            
        //    48: iload_2        
        //    49: ifeq            665
        //    52: new             LX/11o;
        //    55: dup            
        //    56: invokespecial   X/11o.<init>:()V
        //    59: astore_3       
        //    60: getstatic       X/5mN.LIZ:LX/5mM;
        //    63: astore_1       
        //    64: aload_1        
        //    65: aload_3        
        //    66: putfield        X/5mM.LIZ:LX/5mO;
        //    69: getstatic       X/5mL.LIZ:LX/5mL;
        //    72: ldc             "callback_register"
        //    74: iconst_2       
        //    75: anewarray       Ljava/lang/Object;
        //    78: dup            
        //    79: iconst_0       
        //    80: sipush          258
        //    83: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    86: aastore        
        //    87: dup            
        //    88: iconst_1       
        //    89: new             LX/5mP;
        //    92: dup            
        //    93: aload_1        
        //    94: iconst_0       
        //    95: invokespecial   X/5mP.<init>:(LX/5mM;B)V
        //    98: aastore        
        //    99: invokevirtual   X/5mL.LIZ:(Ljava/lang/String;[Ljava/lang/Object;)[Ljava/lang/Object;
        //   102: pop            
        //   103: new             Ljava/util/HashSet;
        //   106: dup            
        //   107: invokespecial   java/util/HashSet.<init>:()V
        //   110: astore_1       
        //   111: aload_1        
        //   112: getstatic       android/ss/com/vboost/CapabilityType.CPU_FREQ_MIN:Landroid/ss/com/vboost/CapabilityType;
        //   115: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   120: pop            
        //   121: aload_1        
        //   122: getstatic       android/ss/com/vboost/CapabilityType.PRESET_SCENE:Landroid/ss/com/vboost/CapabilityType;
        //   125: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   130: pop            
        //   131: aload_1        
        //   132: getstatic       android/ss/com/vboost/CapabilityType.CPU_AFFINITY:Landroid/ss/com/vboost/CapabilityType;
        //   135: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   140: pop            
        //   141: aload_1        
        //   142: getstatic       android/ss/com/vboost/CapabilityType.NETWORK_ENHANCE:Landroid/ss/com/vboost/CapabilityType;
        //   145: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   150: pop            
        //   151: aload_0        
        //   152: aload_1        
        //   153: invokevirtual   X/00L.LIZ:(Ljava/util/Set;)V
        //   156: new             LX/002;
        //   159: dup            
        //   160: invokespecial   X/002.<init>:()V
        //   163: astore_3       
        //   164: aload_0        
        //   165: aload_3        
        //   166: putfield        X/11p.LJIIIIZZ:LX/002;
        //   169: aload_3        
        //   170: aload_1        
        //   171: invokevirtual   X/002.LIZ:(Ljava/util/Set;)V
        //   174: aload_1        
        //   175: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   180: astore_3       
        //   181: aload_3        
        //   182: invokeinterface java/util/Iterator.hasNext:()Z
        //   187: ifeq            335
        //   190: aload_3        
        //   191: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   196: checkcast       Landroid/ss/com/vboost/CapabilityType;
        //   199: astore          4
        //   201: getstatic       X/00Z.LIZ:[I
        //   204: aload           4
        //   206: invokevirtual   android/ss/com/vboost/CapabilityType.ordinal:()I
        //   209: iaload         
        //   210: istore          5
        //   212: iload           5
        //   214: iconst_1       
        //   215: if_icmpeq       263
        //   218: iload           5
        //   220: iconst_2       
        //   221: if_icmpeq       263
        //   224: iload           5
        //   226: iconst_3       
        //   227: if_icmpeq       263
        //   230: iload           5
        //   232: iconst_4       
        //   233: if_icmpeq       181
        //   236: iload           5
        //   238: iconst_5       
        //   239: if_icmpeq       250
        //   242: iconst_5       
        //   243: invokestatic    X/00s.LIZ:(I)Z
        //   246: pop            
        //   247: goto            181
        //   250: aload_0        
        //   251: getfield        X/11p.LJIIIIZZ:LX/002;
        //   254: getstatic       X/003.BIND_CLUSTER:LX/003;
        //   257: invokevirtual   X/002.LIZ:(LX/003;)V
        //   260: goto            181
        //   263: new             LX/004;
        //   266: dup            
        //   267: iconst_0       
        //   268: ldc             2147483647
        //   270: sipush          10000
        //   273: invokespecial   X/004.<init>:(ZII)V
        //   276: astore          6
        //   278: new             Ljava/util/ArrayList;
        //   281: dup            
        //   282: invokespecial   java/util/ArrayList.<init>:()V
        //   285: astore_1       
        //   286: aload_1        
        //   287: aload           6
        //   289: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   294: pop            
        //   295: aload_0        
        //   296: getfield        X/11p.LJIIIIZZ:LX/002;
        //   299: aload           4
        //   301: aload_1        
        //   302: invokevirtual   X/002.LIZ:(Landroid/ss/com/vboost/CapabilityType;Ljava/util/List;)V
        //   305: goto            181
        //   308: aload_1        
        //   309: ldc             "ugc.trill"
        //   311: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   314: ifeq            326
        //   317: getstatic       X/11p.LJI:Ljava/lang/String;
        //   320: putstatic       X/11p.LJ:Ljava/lang/String;
        //   323: goto            33
        //   326: getstatic       X/11p.LJII:Ljava/lang/String;
        //   329: putstatic       X/11p.LJ:Ljava/lang/String;
        //   332: goto            33
        //   335: new             Ljava/util/HashMap;
        //   338: dup            
        //   339: invokespecial   java/util/HashMap.<init>:()V
        //   342: astore_1       
        //   343: aload_1        
        //   344: getstatic       X/00w.LEVEL_9:LX/00w;
        //   347: new             LX/00P;
        //   350: dup            
        //   351: iconst_0       
        //   352: ldc             2147483647
        //   354: getstatic       X/00S.PLATFORM:LX/00S;
        //   357: getstatic       X/00w.LEVEL_9:LX/00w;
        //   360: invokespecial   X/00P.<init>:(IILX/00S;LX/00w;)V
        //   363: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   368: pop            
        //   369: aload_1        
        //   370: getstatic       X/00w.LEVEL_8:LX/00w;
        //   373: new             LX/00P;
        //   376: dup            
        //   377: iconst_0       
        //   378: ldc             2147483647
        //   380: getstatic       X/00S.PLATFORM:LX/00S;
        //   383: getstatic       X/00w.LEVEL_8:LX/00w;
        //   386: invokespecial   X/00P.<init>:(IILX/00S;LX/00w;)V
        //   389: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   394: pop            
        //   395: aload_1        
        //   396: getstatic       X/00w.LEVEL_7:LX/00w;
        //   399: new             LX/00P;
        //   402: dup            
        //   403: iconst_0       
        //   404: getstatic       X/11p.LIZJ:I
        //   407: getstatic       X/00S.VENDOR:LX/00S;
        //   410: getstatic       X/00w.LEVEL_8:LX/00w;
        //   413: invokespecial   X/00P.<init>:(IILX/00S;LX/00w;)V
        //   416: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   421: pop            
        //   422: aload_1        
        //   423: getstatic       X/00w.LEVEL_6:LX/00w;
        //   426: new             LX/00P;
        //   429: dup            
        //   430: iconst_0       
        //   431: getstatic       X/11p.LIZJ:I
        //   434: getstatic       X/00S.VENDOR:LX/00S;
        //   437: getstatic       X/00w.LEVEL_8:LX/00w;
        //   440: invokespecial   X/00P.<init>:(IILX/00S;LX/00w;)V
        //   443: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   448: pop            
        //   449: aload_1        
        //   450: getstatic       X/00w.LEVEL_5:LX/00w;
        //   453: new             LX/00P;
        //   456: dup            
        //   457: iconst_0       
        //   458: getstatic       X/11p.LIZJ:I
        //   461: getstatic       X/00S.VENDOR:LX/00S;
        //   464: getstatic       X/00w.LEVEL_8:LX/00w;
        //   467: invokespecial   X/00P.<init>:(IILX/00S;LX/00w;)V
        //   470: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   475: pop            
        //   476: aload_1        
        //   477: getstatic       X/00w.LEVEL_4:LX/00w;
        //   480: new             LX/00P;
        //   483: dup            
        //   484: iconst_0       
        //   485: getstatic       X/11p.LIZJ:I
        //   488: getstatic       X/00S.VENDOR:LX/00S;
        //   491: getstatic       X/00w.LEVEL_4:LX/00w;
        //   494: invokespecial   X/00P.<init>:(IILX/00S;LX/00w;)V
        //   497: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   502: pop            
        //   503: aload_1        
        //   504: getstatic       X/00w.LEVEL_3:LX/00w;
        //   507: new             LX/00P;
        //   510: dup            
        //   511: iconst_0       
        //   512: getstatic       X/11p.LIZJ:I
        //   515: getstatic       X/00S.VENDOR:LX/00S;
        //   518: getstatic       X/00w.LEVEL_3:LX/00w;
        //   521: invokespecial   X/00P.<init>:(IILX/00S;LX/00w;)V
        //   524: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   529: pop            
        //   530: aload_1        
        //   531: getstatic       X/00w.LEVEL_2:LX/00w;
        //   534: new             LX/00P;
        //   537: dup            
        //   538: iconst_0       
        //   539: getstatic       X/11p.LIZJ:I
        //   542: getstatic       X/00S.VENDOR:LX/00S;
        //   545: getstatic       X/00w.LEVEL_2:LX/00w;
        //   548: invokespecial   X/00P.<init>:(IILX/00S;LX/00w;)V
        //   551: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   556: pop            
        //   557: aload_1        
        //   558: getstatic       X/00w.LEVEL_1:LX/00w;
        //   561: new             LX/00P;
        //   564: dup            
        //   565: iconst_0       
        //   566: getstatic       X/11p.LIZJ:I
        //   569: getstatic       X/00S.VENDOR:LX/00S;
        //   572: getstatic       X/00w.LEVEL_1:LX/00w;
        //   575: invokespecial   X/00P.<init>:(IILX/00S;LX/00w;)V
        //   578: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   583: pop            
        //   584: aload_1        
        //   585: getstatic       X/00w.LEVEL_0:LX/00w;
        //   588: new             LX/00P;
        //   591: dup            
        //   592: iconst_0       
        //   593: getstatic       X/11p.LIZJ:I
        //   596: getstatic       X/00S.VENDOR:LX/00S;
        //   599: getstatic       X/00w.LEVEL_0:LX/00w;
        //   602: invokespecial   X/00P.<init>:(IILX/00S;LX/00w;)V
        //   605: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   610: pop            
        //   611: getstatic       X/00W.LIZ:LX/00X;
        //   614: getstatic       X/00S.VENDOR:LX/00S;
        //   617: getstatic       android/ss/com/vboost/CapabilityType.CPU_FREQ_MIN:Landroid/ss/com/vboost/CapabilityType;
        //   620: aload_1        
        //   621: invokevirtual   X/00X.LIZ:(LX/00S;Landroid/ss/com/vboost/CapabilityType;Ljava/util/Map;)V
        //   624: invokestatic    X/00p.LIZ:()Z
        //   627: ifeq            665
        //   630: new             Lorg/json/JSONObject;
        //   633: astore_1       
        //   634: aload_1        
        //   635: invokespecial   org/json/JSONObject.<init>:()V
        //   638: aload_1        
        //   639: ldc_w           "vendor"
        //   642: ldc_w           "vo"
        //   645: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   648: pop            
        //   649: ldc_w           "vboost_event_active"
        //   652: aload_1        
        //   653: ldc_w           "behavior"
        //   656: invokestatic    X/00p.LIZ:(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)V
        //   659: return         
        //   660: astore_1       
        //   661: aload_1        
        //   662: invokestatic    X/0II.LIZ:(Ljava/lang/Exception;)V
        //   665: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  630    659    660    665    Lorg/json/JSONException;
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
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
    
    @Override
    public final Object LIZ(final 00U 00U) {
        final int n = 00Z.LIZ[00U.LIZ.ordinal()];
        if (n != 3) {
            if (n == 4) {
                final 00V lizlll = 00U.LIZLLL;
                lizlll.LIZ.getDesc();
                00s.LIZ(4);
                switch (00Z.LIZIZ[lizlll.LIZ.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35: {
                        5mN.LIZ.LIZ(11, 11p.LIZIZ, 11p.LIZLLL, (String)null);
                        break;
                    }
                }
                return 1;
            }
            if (n != 6) {
                00s.LIZ(5);
            }
            else {
                final String liz = 00U.LJFF.LIZ;
                final String liziz = 00U.LJFF.LIZIZ;
                final String lizj = 00U.LJFF.LIZJ;
                final String lizlll2 = 00U.LJFF.LIZLLL;
                final String ljff = 00U.LJFF.LJFF;
                final String lj = 00U.LJFF.LJ;
                final JSONObject jsonObject = new JSONObject();
                try {
                    jsonObject.put("sceneType", (Object)liz);
                    jsonObject.put("excepType", (Object)liziz);
                    jsonObject.put("excepReason", (Object)lizj);
                    jsonObject.put("behaviorType", (Object)lizlll2);
                    jsonObject.put("stallState", (Object)lj);
                    jsonObject.put("reportEnabled", (Object)ljff);
                    00s.LIZ(3);
                    String.valueOf(5mN.LIZ.LIZ(1000, 0, 0, jsonObject.toString()));
                }
                catch (final Exception ex) {
                    0II.LIZ(ex);
                }
            }
        }
        else {
            5mN.LIZ.LIZ(12, 11p.LIZIZ, 11p.LIZLLL, (String)null);
            00s.LIZ(4);
        }
        return 1;
    }
    
    @Override
    public final boolean LIZ(final CapabilityType capabilityType) {
        final 002 ljiiiizz = this.LJIIIIZZ;
        return ljiiiizz != null && ljiiiizz.LIZ().contains(capabilityType);
    }
    
    @Override
    public final Object LIZIZ(final 00U 00U) {
        final int n = 00Z.LIZ[00U.LIZ.ordinal()];
        if (n != 3 && n != 4) {
            if (n != 6) {
                00s.LIZ(5);
            }
        }
        else {
            5mN.LIZ.LIZ(13, 0, 0, (String)null);
            00U.LIZLLL.LIZ.getDesc();
            00s.LIZ(4);
        }
        return 1;
    }
}
