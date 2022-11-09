// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.File;
import java.util.List;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.bytedance.covode.number.Covode;

public final class 1Ky<T> implements 3VJ
{
    public final /* synthetic */ 1L1 LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ 0hW LIZJ;
    
    static {
        Covode.recordClassIndex(6463);
    }
    
    public 1Ky(final 1L1 liz, final long liziz, final 0hW lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final void subscribe(final FDm<2P9> fDm) {
        public final class 1Kx implements 0hV
        {
            public final /* synthetic */ 1Ky LIZ;
            
            static {
                Covode.recordClassIndex(6464);
            }
            
            public 1Kx(final 1Ky liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void LIZ() {
                final StringBuilder sb = new StringBuilder("FileDownload-onStart, albumId: ");
                sb.append(this.LIZ.LIZIZ);
                sb.append(", accompanimentId: ");
                sb.append(this.LIZ.LIZ.LIZ);
                0ba.LIZ(6, "AccompanimentManager", sb.toString());
                0hd.LIZ(0hc.LJII, this.LIZ.LIZIZ, this.LIZ.LIZ);
                if (this.LIZ.LIZJ != null) {
                    CTM.LIZ((Object)this.LIZ.LIZ);
                }
            }
            
            @Override
            public final void LIZ(final DownloadInfo downloadInfo) {
                if (downloadInfo == null) {
                    return;
                }
                if (this.LIZ.LIZJ != null) {
                    CTM.LIZ((Object)new 1L2(downloadInfo, this.LIZ.LIZ));
                }
            }
            
            @Override
            public final void LIZ(final DownloadInfo downloadInfo, final BaseException ex) {
                final StringBuilder sb = new StringBuilder("FileDownload-onFailed, albumId: ");
                sb.append(this.LIZ.LIZIZ);
                sb.append(", accompanimentId: ");
                sb.append(this.LIZ.LIZ.LIZ);
                sb.append(", exception: ");
                String errorMessage;
                if (ex != null) {
                    errorMessage = ex.getErrorMessage();
                }
                else {
                    errorMessage = null;
                }
                sb.append(errorMessage);
                0ba.LIZ(6, "AccompanimentManager", sb.toString());
                if (ex != null) {
                    if (ex.getErrorCode() == 1006) {
                        Hf4.LIZ(0cB.LJ(), 2131830460);
                    }
                    return;
                }
                if (downloadInfo == null) {
                    return;
                }
                final List list = 0hc.LJII.get(this.LIZ.LIZIZ);
                if (list != null) {
                    list.remove(this.LIZ.LIZ);
                }
                1Kr.LIZ.LIZ(downloadInfo);
                0hc.LJIILJJIL.LIZIZ(this.LIZ.LIZIZ);
                0hc.LJIILJJIL.LIZ(this.LIZ.LIZIZ);
                if (this.LIZ.LIZJ != null) {
                    CTM.LIZ((Object)new 1L2(downloadInfo, this.LIZ.LIZ));
                }
            }
            
            @Override
            public final void LIZIZ(final DownloadInfo downloadInfo) {
                final StringBuilder sb = new StringBuilder("FileDownload-onSucceed, albumId: ");
                sb.append(this.LIZ.LIZIZ);
                sb.append(", accompanimentId: ");
                sb.append(this.LIZ.LIZ.LIZ);
                0ba.LIZ(6, "AccompanimentManager", sb.toString());
                if (downloadInfo == null) {
                    return;
                }
                final List list = 0hc.LJII.get(this.LIZ.LIZIZ);
                if (list != null) {
                    list.remove(this.LIZ.LIZ);
                }
                final 1L2 1l2 = new 1L2(downloadInfo, this.LIZ.LIZ);
                0hd.LIZ(0hc.LJIIIIZZ, this.LIZ.LIZIZ, 1l2);
                final 0hW lizj = this.LIZ.LIZJ;
                if (lizj != null) {
                    lizj.LIZ(1l2);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: getfield        X/1Ky.LIZ:LX/1L1;
        //     8: getfield        X/1L1.LJ:Ljava/lang/String;
        //    11: astore_1       
        //    12: aload_0        
        //    13: getfield        X/1Ky.LIZ:LX/1L1;
        //    16: astore_2       
        //    17: aload_2        
        //    18: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    21: aload_2        
        //    22: getfield        X/1L1.LIZ:J
        //    25: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    28: astore_2       
        //    29: aload_0        
        //    30: getfield        X/1Ky.LIZIZ:J
        //    33: lstore_3       
        //    34: new             Ljava/lang/StringBuilder;
        //    37: dup            
        //    38: invokespecial   java/lang/StringBuilder.<init>:()V
        //    41: astore          5
        //    43: aload           5
        //    45: getstatic       X/0hS.LIZ:LX/5DO;
        //    48: invokeinterface X/5DO.getValue:()Ljava/lang/Object;
        //    53: checkcast       Ljava/lang/String;
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: pop            
        //    60: aload           5
        //    62: ldc             "/live/music/accompaniment/"
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: pop            
        //    68: aload           5
        //    70: lload_3        
        //    71: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    74: pop            
        //    75: aload           5
        //    77: bipush          47
        //    79: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    82: pop            
        //    83: aload           5
        //    85: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    88: astore          5
        //    90: new             Ljava/io/File;
        //    93: dup            
        //    94: aload           5
        //    96: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    99: astore          6
        //   101: aload           6
        //   103: invokevirtual   java/io/File.exists:()Z
        //   106: ifne            126
        //   109: aload           6
        //   111: invokevirtual   java/io/File.mkdirs:()Z
        //   114: ifne            126
        //   117: bipush          6
        //   119: ldc             "FileCacheManager"
        //   121: ldc             "mkdirs return false"
        //   123: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   126: new             Ljava/lang/StringBuilder;
        //   129: dup            
        //   130: invokespecial   java/lang/StringBuilder.<init>:()V
        //   133: astore          6
        //   135: aload           6
        //   137: aload_0        
        //   138: getfield        X/1Ky.LIZIZ:J
        //   141: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   144: pop            
        //   145: aload           6
        //   147: bipush          38
        //   149: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   152: pop            
        //   153: aload           6
        //   155: getstatic       X/0b5.LIZJ:Lcom/google/gson/Gson;
        //   158: aload_0        
        //   159: getfield        X/1Ky.LIZ:LX/1L1;
        //   162: invokevirtual   com/google/gson/Gson.LIZIZ:(Ljava/lang/Object;)Ljava/lang/String;
        //   165: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   168: pop            
        //   169: aload           6
        //   171: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   174: astore          7
        //   176: new             LX/1Kx;
        //   179: dup            
        //   180: aload_0        
        //   181: invokespecial   X/1Kx.<init>:(LX/1Ky;)V
        //   184: astore          6
        //   186: aload_1        
        //   187: aload_2        
        //   188: aload           5
        //   190: ldc             "live_music_accompaniment"
        //   192: aload           7
        //   194: aload           6
        //   196: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   199: invokestatic    X/0cB.LJ:()Landroid/content/Context;
        //   202: invokestatic    X/VCb.with:(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;
        //   205: astore          8
        //   207: aload           8
        //   209: aload_1        
        //   210: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadTask.url:(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;
        //   213: pop            
        //   214: aload           8
        //   216: aload_2        
        //   217: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadTask.name:(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;
        //   220: pop            
        //   221: aload           8
        //   223: aload           5
        //   225: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadTask.savePath:(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;
        //   228: pop            
        //   229: aload           8
        //   231: ldc             "live_music_accompaniment"
        //   233: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadTask.mimeType:(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;
        //   236: pop            
        //   237: aload           8
        //   239: aload           7
        //   241: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadTask.extra:(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;
        //   244: pop            
        //   245: aload           8
        //   247: ldc             ""
        //   249: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   252: aload           8
        //   254: new             LX/1jB;
        //   257: dup            
        //   258: aload           6
        //   260: invokespecial   X/1jB.<init>:(LX/0hV;)V
        //   263: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadTask.subThreadListener:(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;
        //   266: pop            
        //   267: aload           8
        //   269: ldc             ""
        //   271: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   274: aload           8
        //   276: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadTask.autoCalAndGetHashCodeForSameTask:()I
        //   279: pop            
        //   280: aload           8
        //   282: new             LX/1Kq;
        //   285: dup            
        //   286: aload           6
        //   288: invokespecial   X/1Kq.<init>:(LX/0hV;)V
        //   291: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadTask.asyncDownload:(LX/VCF;)V
        //   294: return         
        //    Signature:
        //  (LX/FDm<LX/2P9;>;)V
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
