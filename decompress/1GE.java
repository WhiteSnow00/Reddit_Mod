// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.app.Activity;
import java.nio.charset.Charset;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.n;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import com.bytedance.covode.number.Covode;

public final class 1Ge implements 0Zc
{
    static {
        Covode.recordClassIndex(5408);
    }
    
    public final String LIZ(final byte[] array) {
        try {
            final byte[] digest = MessageDigest.getInstance("MD5").digest(array);
            final StringBuffer sb = new StringBuffer();
            for (int length = digest.length, i = 0; i < length; ++i) {
                String s2;
                final String s = s2 = Integer.toHexString(digest[i] & 0xFF);
                if (s.length() == 1) {
                    s2 = "0".concat(String.valueOf(s));
                }
                sb.append(s2);
            }
            return sb.toString();
        }
        catch (final NoSuchAlgorithmException ex) {
            0ba.LIZ(6, "DownloadHighLightFileImpl", "getMD5String. exception. e=".concat(String.valueOf(ex)));
            return null;
        }
    }
    
    @Override
    public final void LIZ(final int n) {
        ((VCb)Downloader.getInstance(0cB.LJ())).cancel(n);
    }
    
    @Override
    public final void LIZ(final 1nL 1nL, final String s, final String s2, final String s3, final a a) {
        public final class 1Gd implements I6J
        {
            public final /* synthetic */ 1Ge LIZ;
            public final /* synthetic */ String LIZIZ;
            public final /* synthetic */ String LIZJ;
            public final /* synthetic */ String LIZLLL;
            public final /* synthetic */ 1nL LJ;
            public final /* synthetic */ a LJFF;
            
            static {
                Covode.recordClassIndex(5411);
            }
            
            public 1Gd(final 1Ge liz, final String liziz, final String lizj, final String lizlll, final 1nL lj, final a ljff) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                this.LJ = lj;
                this.LJFF = ljff;
            }
            
            public final void LIZ(final String s, final String... array) {
            }
            
            public final void LIZ(final String... array) {
                CTM.LIZ((Object)array);
                final String liziz = this.LIZIZ;
                CTM.LIZ((Object)liziz);
                final Downloader instance = Downloader.getInstance(0cB.LJ());
                final String s = "";
                n.LIZIZ((Object)instance, "");
                final List allDownloadInfo = ((VCb)instance).getAllDownloadInfo();
            Label_0094:
                while (true) {
                    if (allDownloadInfo != null) {
                        for (final DownloadInfo downloadInfo : allDownloadInfo) {
                            if (downloadInfo != null && TextUtils.equals((CharSequence)downloadInfo.getUrl(), (CharSequence)liziz)) {
                                final String s2 = downloadInfo.getName();
                                n.LIZIZ((Object)s2, "");
                                break Label_0094;
                            }
                        }
                    }
                    Label_0150: {
                        break Label_0150;
                        final String s2;
                        final Uri liz = 0HD.LIZ((Context)this.LJ, s2);
                        if (0HD.LIZJ((Context)this.LJ, liz)) {
                            final a ljff = this.LJFF;
                            final String string = liz.toString();
                            n.LIZIZ((Object)string, "");
                            ljff.LIZ(string, s2);
                            0ba.LIZ(4, "DownloadHighLightFileImpl", "file is exists");
                            return;
                        }
                        final DownloadInfo downloadInfo;
                        String s3;
                        if (downloadInfo == null) {
                            final Uri liziz2 = 0HC.LIZIZ((Context)this.LJ, s2);
                            s3 = s;
                            if (liziz2 != null) {
                                s3 = liziz2.toString();
                                n.LIZIZ((Object)s3, "");
                            }
                        }
                        else {
                            s3 = downloadInfo.getSavePath();
                            n.LIZIZ((Object)s3, "");
                        }
                        if (H25.LJFF) {
                            final StringBuilder sb = new StringBuilder();
                            for (final String s4 : array) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append(s4);
                                sb2.append(' ');
                                sb.append(sb2.toString());
                            }
                            0ba.LIZ(3, "DownloadHighLightFileImpl", "onPermissionGrant: ".concat(String.valueOf(sb)));
                        }
                        final String liziz3 = this.LIZIZ;
                        final a ljff2 = this.LJFF;
                        0ba.LIZ(4, "DownloadHighLightFileImpl", "internalDownloadHighLightVideo");
                        final 1Gc 1Gc = new 1Gc(ljff2, s3);
                        CTM.LIZ((Object)s3, (Object)s2, (Object)liziz3);
                        final StringBuilder sb3 = new StringBuilder("downloadFile. fileName=");
                        sb3.append(s2);
                        sb3.append(", url=");
                        sb3.append(liziz3);
                        sb3.append(", async=false");
                        0ba.LIZ(4, "FileDownloader", sb3.toString());
                        final DownloadTask with = VCb.with(0cB.LJ());
                        with.url(liziz3);
                        with.name(s2);
                        with.savePath(s3);
                        with.subThreadListener((IDownloadListener)new 1hr(s2, s3, 1Gc));
                        1Gc.LIZ(with.download());
                        return;
                    }
                    DownloadInfo downloadInfo = null;
                    final 1Ge liz2 = this.LIZ;
                    final String lizj = this.LIZJ;
                    final String lizlll = this.LIZLLL;
                    final Charset liz3 = 76b.LIZ;
                    Objects.requireNonNull(lizj, "null cannot be cast to non-null type java.lang.String");
                    final byte[] bytes = lizj.getBytes(liz3);
                    n.LIZIZ((Object)bytes, "");
                    final String s2 = n.LIZ(liz2.LIZ(bytes), (Object)lizlll);
                    continue Label_0094;
                }
            }
            
            public final void LIZIZ(final String... array) {
                CTM.LIZ((Object)array);
                final StringBuilder sb = new StringBuilder();
                for (final String s : array) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(s);
                    sb2.append(' ');
                    sb.append(sb2.toString());
                }
                0ba.LIZ(6, "DownloadHighLightFileImpl", "onPermissionDenied: ".concat(String.valueOf(sb)));
                final a ljff = this.LJFF;
                final StringBuilder sb3 = new StringBuilder();
                sb3.append((Object)sb);
                sb3.append(" deny");
                ljff.LIZ(0, 1, sb3.toString());
            }
            
            public final void LIZJ(final String... array) {
            }
            
            public final void LIZLLL(final String... array) {
            }
            
            public final void LJ(final String... array) {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: aload_3        
        //     3: aload           4
        //     5: aload           5
        //     7: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //    10: aload_1        
        //    11: invokestatic    X/I6E.LIZ:(Landroid/app/Activity;)LX/Gm3;
        //    14: new             LX/1Gd;
        //    17: dup            
        //    18: aload_0        
        //    19: aload_2        
        //    20: aload           4
        //    22: aload_3        
        //    23: aload_1        
        //    24: aload           5
        //    26: invokespecial   X/1Gd.<init>:(LX/1Ge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LX/1nL;LX/0ZV;)V
        //    29: iconst_2       
        //    30: anewarray       Ljava/lang/String;
        //    33: dup            
        //    34: iconst_0       
        //    35: ldc             "android.permission.READ_EXTERNAL_STORAGE"
        //    37: aastore        
        //    38: dup            
        //    39: iconst_1       
        //    40: ldc             "android.permission.WRITE_EXTERNAL_STORAGE"
        //    42: aastore        
        //    43: invokevirtual   X/Gm3.LIZ:(LX/I6J;[Ljava/lang/String;)V
        //    46: return         
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
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(5409);
        }
        
        void LIZ(final int p0);
        
        void LIZ(final int p0, final int p1, final String p2);
        
        void LIZ(final DownloadInfo p0);
        
        void LIZ(final String p0, final String p1);
    }
}
