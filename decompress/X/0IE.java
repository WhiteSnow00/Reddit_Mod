// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.File;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import java.util.LinkedHashSet;
import com.bytedance.covode.number.Covode;
import java.util.Set;

public final class 0iE
{
    public static final 5DO LIZJ;
    public static final a LIZLLL;
    public 0gn LIZ;
    public final Set<0gn> LIZIZ;
    
    static {
        Covode.recordClassIndex(6669);
        LIZLLL = new a((byte)0);
        LIZJ = 3Os.LIZ((QgG)1tu.LIZ);
    }
    
    public 0iE() {
        this.LIZIZ = new LinkedHashSet<0gn>();
    }
    
    public final void LIZ(final 0gn 0gn, final SRS<? super Integer, 2P9> srs) {
        public final class 1jP extends AbsDownloadListener
        {
            public final /* synthetic */ 0iE LIZ;
            public final /* synthetic */ 0gn LIZIZ;
            public final /* synthetic */ SRS LIZJ;
            
            static {
                Covode.recordClassIndex(6672);
            }
            
            public 1jP(final 0iE liz, final 0gn liziz, final SRS lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
            
            public final void onFailed(final DownloadInfo downloadInfo, final BaseException ex) {
                super.onFailed(downloadInfo, ex);
                this.LIZ.LIZIZ.remove(this.LIZIZ);
                this.LIZJ.invoke((Object)(-3));
            }
            
            public final void onProgress(final DownloadInfo downloadInfo) {
                super.onProgress(downloadInfo);
                final SRS lizj = this.LIZJ;
                int downloadProcess;
                if (downloadInfo != null) {
                    downloadProcess = downloadInfo.getDownloadProcess();
                }
                else {
                    downloadProcess = 0;
                }
                lizj.invoke((Object)downloadProcess);
            }
            
            public final void onStart(final DownloadInfo downloadInfo) {
                super.onStart(downloadInfo);
                this.LIZ.LIZIZ.add(this.LIZIZ);
                this.LIZJ.invoke((Object)(-1));
            }
            
            public final void onSuccessed(final DownloadInfo downloadInfo) {
                super.onSuccessed(downloadInfo);
                this.LIZ.LIZIZ.remove(this.LIZIZ);
                this.LIZJ.invoke((Object)(-2));
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_1        
        //     6: getfield        X/0gn.LJ:Lcom/bytedance/android/live/base/model/ImageModel;
        //     9: astore_3       
        //    10: aload_3        
        //    11: ifnull          32
        //    14: aload_3        
        //    15: invokevirtual   com/bytedance/android/live/base/model/ImageModel.getUrls:()Ljava/util/List;
        //    18: astore_3       
        //    19: aload_3        
        //    20: ifnull          32
        //    23: aload_3        
        //    24: invokeinterface java/util/Collection.isEmpty:()Z
        //    29: ifeq            45
        //    32: aload_2        
        //    33: bipush          -3
        //    35: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    38: invokeinterface X/SRS.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    43: pop            
        //    44: return         
        //    45: invokestatic    X/0cB.LJ:()Landroid/content/Context;
        //    48: invokestatic    X/VCb.with:(Landroid/content/Context;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;
        //    51: astore          4
        //    53: aload           4
        //    55: aload_3        
        //    56: iconst_0       
        //    57: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    62: checkcast       Ljava/lang/String;
        //    65: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadTask.url:(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;
        //    68: pop            
        //    69: aload           4
        //    71: aload_1        
        //    72: getfield        X/0gn.LIZIZ:J
        //    75: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    78: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadTask.name:(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;
        //    81: pop            
        //    82: aload           4
        //    84: getstatic       X/0iE.LIZLLL:LX/0iD;
        //    87: invokevirtual   X/0iD.LIZ:()Ljava/lang/String;
        //    90: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadTask.savePath:(Ljava/lang/String;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;
        //    93: pop            
        //    94: aload           4
        //    96: new             LX/1jP;
        //    99: dup            
        //   100: aload_0        
        //   101: aload_1        
        //   102: aload_2        
        //   103: invokespecial   X/1jP.<init>:(LX/0iE;LX/0gn;LX/SRS;)V
        //   106: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadTask.mainThreadListener:(Lcom/ss/android/socialbase/downloader/depend/IDownloadListener;)Lcom/ss/android/socialbase/downloader/model/DownloadTask;
        //   109: pop            
        //   110: aload           4
        //   112: invokevirtual   com/ss/android/socialbase/downloader/model/DownloadTask.download:()I
        //   115: pop            
        //   116: return         
        //    Signature:
        //  (LX/0gn;LX/SRS<-Ljava/lang/Integer;LX/2P9;>;)V
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
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
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(6670);
        }
        
        private final String LIZIZ() {
            return (String)0iE.LIZJ.getValue();
        }
        
        public final String LIZ() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.LIZIZ());
            sb.append("/live/soundeffect");
            return sb.toString();
        }
        
        public final boolean LIZ(final 0gn 0gn) {
            CTM.LIZ((Object)0gn);
            return new File(this.LIZIZ(0gn)).exists();
        }
        
        public final String LIZIZ(final 0gn 0gn) {
            CTM.LIZ((Object)0gn);
            final StringBuilder sb = new StringBuilder();
            sb.append(this.LIZ());
            sb.append('/');
            sb.append(0gn.LIZIZ);
            return sb.toString();
        }
    }
}
