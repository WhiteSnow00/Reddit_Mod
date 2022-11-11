// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.n.z;
import java.util.List;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import java.util.Map;
import com.google.gson.b.a;
import com.bytedance.covode.number.Covode;

public final class 1Kt<T> implements 3VJ
{
    public static final 1Kt LIZ;
    
    static {
        Covode.recordClassIndex(6448);
        LIZ = new 1Kt();
    }
    
    public final void subscribe(final FDm<2P9> o) {
        public final class 1Ks extends a<Map<Long, Long>>
        {
            static {
                Covode.recordClassIndex(6449);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: getstatic       X/1Kr.LIZ:LX/1Kr;
        //     7: astore_1       
        //     8: ldc             "live_music_accompaniment"
        //    10: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    13: aload_1        
        //    14: invokevirtual   X/1Kr.LIZ:()Lcom/ss/android/socialbase/downloader/downloader/Downloader;
        //    17: ldc             "live_music_accompaniment"
        //    19: invokevirtual   X/VCb.getSuccessedDownloadInfosWithMimeType:(Ljava/lang/String;)Ljava/util/List;
        //    22: astore_2       
        //    23: aload_2        
        //    24: ldc             ""
        //    26: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    29: new             Ljava/util/ArrayList;
        //    32: dup            
        //    33: invokespecial   java/util/ArrayList.<init>:()V
        //    36: astore_1       
        //    37: aload_2        
        //    38: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    43: astore_3       
        //    44: aload_3        
        //    45: invokeinterface java/util/Iterator.hasNext:()Z
        //    50: ifeq            93
        //    53: aload_3        
        //    54: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    59: astore_2       
        //    60: aload_2        
        //    61: checkcast       Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
        //    64: astore          4
        //    66: iconst_1       
        //    67: getstatic       X/1Kr.LIZ:LX/1Kr;
        //    70: invokevirtual   X/1Kr.LIZ:()Lcom/ss/android/socialbase/downloader/downloader/Downloader;
        //    73: aload           4
        //    75: invokevirtual   X/VCb.isDownloadSuccessAndFileNotExist:(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;)Z
        //    78: ixor           
        //    79: ifeq            44
        //    82: aload_1        
        //    83: aload_2        
        //    84: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    89: pop            
        //    90: goto            44
        //    93: aload_1        
        //    94: checkcast       Ljava/util/List;
        //    97: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   102: astore_1       
        //   103: aload_1        
        //   104: invokeinterface java/util/Iterator.hasNext:()Z
        //   109: ifeq            305
        //   112: aload_1        
        //   113: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   118: checkcast       Lcom/ss/android/socialbase/downloader/model/DownloadInfo;
        //   121: astore_2       
        //   122: aload_2        
        //   123: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadInfo.getExtra:()Ljava/lang/String;
        //   126: astore          4
        //   128: aload           4
        //   130: ldc             ""
        //   132: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   135: aload           4
        //   137: ldc             "&"
        //   139: iconst_0       
        //   140: iconst_0       
        //   141: bipush          6
        //   143: invokestatic    kotlin/n/z.LIZ:(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I
        //   146: istore          5
        //   148: iload           5
        //   150: iconst_m1      
        //   151: if_icmpeq       103
        //   154: aload_2        
        //   155: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadInfo.getExtra:()Ljava/lang/String;
        //   158: astore          4
        //   160: aload           4
        //   162: ldc             ""
        //   164: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   167: aload           4
        //   169: ifnull          293
        //   172: aload           4
        //   174: iconst_0       
        //   175: iload           5
        //   177: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   180: astore          4
        //   182: aload           4
        //   184: ldc             ""
        //   186: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   189: aload           4
        //   191: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   194: lstore          6
        //   196: getstatic       X/0b5.LIZJ:Lcom/google/gson/Gson;
        //   199: astore          4
        //   201: aload_2        
        //   202: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadInfo.getExtra:()Ljava/lang/String;
        //   205: astore_3       
        //   206: aload_3        
        //   207: ldc             ""
        //   209: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   212: aload_3        
        //   213: ifnull          281
        //   216: aload_3        
        //   217: iload           5
        //   219: iconst_1       
        //   220: iadd           
        //   221: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   224: astore_3       
        //   225: aload_3        
        //   226: ldc             ""
        //   228: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   231: aload           4
        //   233: aload_3        
        //   234: ldc             LX/1L1;.class
        //   236: invokevirtual   com/google/gson/Gson.LIZ:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   239: checkcast       LX/1L1;
        //   242: astore          8
        //   244: getstatic       X/0hc.LJIIIIZZ:Ljava/util/concurrent/ConcurrentHashMap;
        //   247: astore          4
        //   249: new             LX/1L2;
        //   252: astore_3       
        //   253: aload           8
        //   255: ldc             ""
        //   257: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   260: aload_3        
        //   261: aload_2        
        //   262: aload           8
        //   264: invokespecial   X/1L2.<init>:(Lcom/ss/android/socialbase/downloader/model/DownloadInfo;LX/1L1;)V
        //   267: aload           4
        //   269: lload           6
        //   271: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   274: aload_3        
        //   275: invokestatic    X/0hd.LIZ:(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/Object;Ljava/lang/Object;)V
        //   278: goto            103
        //   281: new             Ljava/lang/NullPointerException;
        //   284: astore_2       
        //   285: aload_2        
        //   286: ldc             "null cannot be cast to non-null type java.lang.String"
        //   288: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   291: aload_2        
        //   292: athrow         
        //   293: new             Ljava/lang/NullPointerException;
        //   296: astore_2       
        //   297: aload_2        
        //   298: ldc             "null cannot be cast to non-null type java.lang.String"
        //   300: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   303: aload_2        
        //   304: athrow         
        //   305: getstatic       X/0hc.LJIILJJIL:LX/0hc;
        //   308: invokevirtual   X/0hc.LIZIZ:()Ljava/util/concurrent/ConcurrentHashMap;
        //   311: astore          4
        //   313: aload           4
        //   315: invokevirtual   java/util/concurrent/ConcurrentHashMap.clear:()V
        //   318: getstatic       X/GST.LLZZJLIL:LX/44V;
        //   321: astore_1       
        //   322: aload_1        
        //   323: ldc             ""
        //   325: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   328: aload_1        
        //   329: invokevirtual   X/44T.LIZ:()Ljava/lang/Object;
        //   332: astore_1       
        //   333: aload_1        
        //   334: checkcast       Ljava/lang/String;
        //   337: astore_2       
        //   338: aload_2        
        //   339: ldc             ""
        //   341: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   344: aload_2        
        //   345: invokeinterface java/lang/CharSequence.length:()I
        //   350: ifle            404
        //   353: aload_1        
        //   354: checkcast       Ljava/lang/String;
        //   357: astore_1       
        //   358: aload_1        
        //   359: ifnull          389
        //   362: getstatic       X/0b5.LIZJ:Lcom/google/gson/Gson;
        //   365: aload_1        
        //   366: new             LX/1Ks;
        //   369: dup            
        //   370: invokespecial   X/1Ks.<init>:()V
        //   373: getfield        com/google/gson/b/a.type:Ljava/lang/reflect/Type;
        //   376: invokevirtual   com/google/gson/Gson.LIZ:(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
        //   379: checkcast       Ljava/util/Map;
        //   382: astore_2       
        //   383: aload_2        
        //   384: astore_1       
        //   385: aload_2        
        //   386: ifnonnull       397
        //   389: new             Ljava/util/LinkedHashMap;
        //   392: dup            
        //   393: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   396: astore_1       
        //   397: aload           4
        //   399: aload_1        
        //   400: invokevirtual   java/util/concurrent/ConcurrentHashMap.putAll:(Ljava/util/Map;)V
        //   403: return         
        //   404: aconst_null    
        //   405: astore_1       
        //   406: goto            353
        //   409: astore_2       
        //   410: goto            103
        //    Signature:
        //  (LX/FDm<LX/2P9;>;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  122    148    409    413    Ljava/lang/Exception;
        //  154    167    409    413    Ljava/lang/Exception;
        //  172    212    409    413    Ljava/lang/Exception;
        //  216    278    409    413    Ljava/lang/Exception;
        //  281    293    409    413    Ljava/lang/Exception;
        //  293    305    409    413    Ljava/lang/Exception;
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:479)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:410)
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
}
