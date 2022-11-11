// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.livesdk.livesetting.other.EnableImageDefault565Setting;
import java.io.PipedInputStream;
import java.io.IOException;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.PipedOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import android.graphics.Bitmap$Config;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import java.util.ArrayList;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.List;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import android.graphics.drawable.Drawable;
import com.bytedance.android.live.base.model.ImageModel;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import android.os.Handler;

public final class 0ch
{
    public static final Handler LIZ;
    
    static {
        Covode.recordClassIndex(5747);
        LIZ = new Handler(Looper.getMainLooper());
    }
    
    public static Qom<S0P<S5q>> LIZ(final ImageModel imageModel, final int n, final int n2) {
        S7S s7S;
        if (n > 0 && n2 > 0) {
            s7S = new S7S(n, n2);
        }
        else {
            s7S = null;
        }
        final S8e[] liz = LIZ(imageModel, s7S, null, false);
        if (liz == null || liz.length == 0) {
            return null;
        }
        return (Qom<S0P<S5q>>)S7y.LIZIZ().LJIIIIZZ().LIZIZ(liz[0], (Object)null);
    }
    
    public static Drawable LIZ(final int n) {
        if (n <= 0) {
            return null;
        }
        return 0cB.LJ().getResources().getDrawable(n);
    }
    
    public static void LIZ(final 1si 1si, final int n) {
        if (1si == null) {
            return;
        }
        1si.setImageURI(S8f.LIZ(Ql3.LIZ(n)).LIZ().LIZIZ);
    }
    
    public static void LIZ(final 1si 1si, final ImageModel imageModel) {
        if (!LiveImageLoaderModuleSetting.useImageModule()) {
            if (1si != null && imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
                final S8e[] liz = LIZ(imageModel, null, null, false);
                if (liz != null) {
                    if (liz.length != 0) {
                        final SAp liziz = SBH.LIZIZ();
                        ((SDU)liziz).LIZ(((SEd)1si).getController());
                        ((SDU)liziz).LIZ((Object[])liz);
                        ((SDU)liziz).LIZJ(true);
                        ((SEd)1si).setController((SDe)((SDU)liziz).LIZJ());
                    }
                }
            }
            return;
        }
        if (!0cp.LIZ(imageModel)) {
            return;
        }
        final G18 liz2 = 0cp.LIZ();
        liz2.LIZ((List)imageModel.getUrls());
        liz2.LIZ(true);
        liz2.LIZ((View)1si);
    }
    
    public static void LIZ(final 1si 1si, final ImageModel imageModel, final int n) {
        LIZ(1si, imageModel, LIZ(n), null, null, false);
    }
    
    public static void LIZ(final 1si 1si, final ImageModel imageModel, final IAA iaa) {
        LIZ(1si, imageModel, null, null, iaa, false);
    }
    
    public static void LIZ(final 1si 1si, final ImageModel imageModel, final IAA iaa, final boolean b) {
        LIZ(1si, imageModel, null, null, iaa, b);
    }
    
    public static void LIZ(final 1si 1si, final ImageModel imageModel, final Qys qys) {
        LIZ(1si, imageModel, null, qys, null, false);
    }
    
    public static void LIZ(final 1si 1si, final String s) {
        if (1si != null && !TextUtils.isEmpty((CharSequence)s)) {
            1si.setImageURI(S8f.LIZ(Uri.parse(s)).LIZ().LIZIZ);
        }
    }
    
    public static void LIZ(final SE3 se3, final ImageModel imageModel, final Drawable ljff, int measuredHeight, final int n, final Qys qys, final IAA iaa, final boolean b, final boolean b2) {
        if (!LiveImageLoaderModuleSetting.useImageModule() || qys != null) {
            if (se3 != null && imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
                final S7S s7S = null;
                int measuredWidth = 0;
                Label_0163: {
                    if (measuredHeight >= 0) {
                        measuredWidth = measuredHeight;
                        if ((measuredHeight = n) >= 0) {
                            break Label_0163;
                        }
                    }
                    measuredWidth = se3.getMeasuredWidth();
                    measuredHeight = se3.getMeasuredHeight();
                }
                S7S s7S2 = s7S;
                if (measuredWidth > 0) {
                    s7S2 = s7S;
                    if (measuredHeight > 0) {
                        s7S2 = new S7S(measuredWidth, measuredHeight);
                    }
                }
                final S8e[] liz = LIZ(imageModel, s7S2, qys, b2);
                if (liz != null) {
                    if (liz.length != 0) {
                        final SAp liziz = SBH.LIZIZ();
                        ((SDU)liziz).LIZ(((SEd)se3).getController());
                        ((SDU)liziz).LIZ((Object[])liz);
                        if (b) {
                            ((SDU)liziz).LIZJ(true);
                        }
                        if (ljff != null) {
                            if (((SEd)se3).getHierarchy() == null) {
                                final SEU seu = new SEU(se3.getContext().getResources());
                                SEU.LIZLLL = 300;
                                seu.LJFF = ljff;
                                seu.LJI = I7e.LJII;
                                ((SEd)se3).setHierarchy((SB0)seu.LIZ());
                            }
                            else {
                                final SEV hierarchy = (SEV)((SEd)se3).getHierarchy();
                                hierarchy.LIZIZ(300);
                                hierarchy.LIZ(1, ljff);
                                ((SEd)se3).setHierarchy((SB0)hierarchy);
                            }
                        }
                        ((SDU)liziz).LIZ((KFw)new b(imageModel, iaa));
                        ((SEd)se3).setController((SDe)((SDU)liziz).LIZJ());
                    }
                }
            }
            return;
        }
        if (!0cp.LIZ(imageModel)) {
            return;
        }
        final G18 liz2 = 0cp.LIZ();
        liz2.LIZ((List)imageModel.getUrls());
        liz2.LIZ(measuredHeight, n);
        liz2.LIZ(iaa);
        liz2.LIZIZ();
        liz2.LIZ(ljff);
        liz2.LIZ(b);
        liz2.LIZIZ(Boolean.valueOf(b2));
        liz2.LIZ((View)se3);
    }
    
    public static void LIZ(final SE3 se3, final ImageModel imageModel, final Drawable drawable, final Qys qys, final IAA iaa, final boolean b) {
        LIZ(se3, imageModel, drawable, -1, -1, qys, iaa, b, false);
    }
    
    public static void LIZ(final ImageModel imageModel) {
        if (0cB.LJ() != null && imageModel != null && !Fhk.LIZ((List)imageModel.getUrls())) {
            S7y.LIZIZ().LJIIIIZZ().LIZLLL(S8e.LIZ((String)imageModel.getUrls().get(0)), (Object)0cB.LJ());
        }
    }
    
    public static void LIZ(final Runnable runnable) {
        0ch.LIZ.post(runnable);
    }
    
    public static boolean LIZ(final Uri uri) {
        if (uri == null) {
            return false;
        }
        final S6f liziz = LIZIZ(uri);
        return liziz != null && S7y.LIZIZ().LJII().LIZLLL(liziz);
    }
    
    public static S8e[] LIZ(final ImageModel imageModel, final S7S lizlll, final Qys ljiij, final boolean b) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return new S8e[0];
        }
        final ArrayList list = new ArrayList();
        final 1sZ 1sZ = new 1sZ();
        for (final String s : imageModel.getUrls()) {
            if (!5ow.LIZ(s)) {
                final S8f liz = S8f.LIZ(Uri.parse(s));
                if (ljiij != null) {
                    liz.LJIIJ = ljiij;
                }
                if (lizlll != null) {
                    liz.LIZLLL = lizlll;
                }
                1sZ.LIZ(liz);
                if (b) {
                    final ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                    imageDecodeOptionsBuilder.setBitmapConfig(Bitmap$Config.RGB_565);
                    liz.LJFF = imageDecodeOptionsBuilder.LIZ();
                }
                list.add(liz.LIZ());
            }
        }
        if (list.size() == 0) {
            return new S8e[0];
        }
        return (S8e[])list.toArray(new S8e[list.size()]);
    }
    
    public static S6f LIZIZ(final Uri uri) {
        final S8e liz = S8e.LIZ(uri);
        if (liz == null) {
            return null;
        }
        return S8x.LIZ().LIZJ(liz);
    }
    
    public static void LIZIZ(final 1si 1si, final ImageModel imageModel) {
        LIZ(1si, imageModel, null, null, null, false);
    }
    
    public static void LIZIZ(final 1si 1si, final ImageModel imageModel, final IAA iaa) {
        LIZ(1si, imageModel, LIZ(2131234620), null, iaa, false);
    }
    
    public static InputStream LIZJ(final Uri uri) {
        public final class 1He implements SAV<S0P<S4U>>
        {
            public final /* synthetic */ PipedOutputStream LIZ;
            
            static {
                Covode.recordClassIndex(5748);
            }
            
            public 1He(final PipedOutputStream liz) {
                this.LIZ = liz;
            }
            
            public final void LIZ(final Qom<S0P<S4U>> qom) {
                MethodCollector.i(10367);
                final S0P s0P = (S0P)qom.LIZLLL();
                if (s0P == null) {
                    goto Label_0098;
                }
                final S4U s4U = (S4U)s0P.LIZ();
                final byte[] array = new byte[s4U.LIZ()];
                s4U.LIZ(0, array, 0, s4U.LIZ());
                try {
                    this.LIZ.write(array);
                    this.LIZ.close();
                }
                catch (final IOException ex) {}
                finally {
                    qom.LJI();
                    MethodCollector.o(10367);
                }
            }
            
            public final void LIZIZ(final Qom<S0P<S4U>> qom) {
                try {
                    this.LIZ.close();
                }
                catch (final IOException ex) {}
                finally {
                    qom.LJI();
                }
            }
            
            public final void LIZJ(final Qom<S0P<S4U>> qom) {
                try {
                    this.LIZ.close();
                }
                catch (final IOException ex) {}
                finally {
                    qom.LJI();
                }
            }
            
            public final void LIZLLL(final Qom<S0P<S4U>> qom) {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: new             Ljava/io/PipedOutputStream;
        //     9: dup            
        //    10: invokespecial   java/io/PipedOutputStream.<init>:()V
        //    13: astore_1       
        //    14: new             Ljava/io/PipedInputStream;
        //    17: dup            
        //    18: aload_1        
        //    19: invokespecial   java/io/PipedInputStream.<init>:(Ljava/io/PipedOutputStream;)V
        //    22: astore_2       
        //    23: aload_0        
        //    24: invokestatic    X/S8f.LIZ:(Landroid/net/Uri;)LX/S8f;
        //    27: invokevirtual   X/S8f.LIZ:()LX/S8e;
        //    30: astore_0       
        //    31: invokestatic    X/S7y.LIZIZ:()LX/S7y;
        //    34: invokevirtual   X/S7y.LJIIIIZZ:()LX/S85;
        //    37: aload_0        
        //    38: aconst_null    
        //    39: invokevirtual   X/S85.LIZJ:(LX/S8e;Ljava/lang/Object;)LX/Qom;
        //    42: new             LX/1He;
        //    45: dup            
        //    46: aload_1        
        //    47: invokespecial   X/1He.<init>:(Ljava/io/PipedOutputStream;)V
        //    50: getstatic       android/os/AsyncTask.THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
        //    53: invokeinterface X/Qom.LIZ:(LX/SAV;Ljava/util/concurrent/Executor;)V
        //    58: sipush          9923
        //    61: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    64: aload_2        
        //    65: areturn        
        //    66: astore_0       
        //    67: sipush          9923
        //    70: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    73: aconst_null    
        //    74: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  14     23     66     75     Ljava/io/IOException;
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:479)
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
        public final ImageModel LIZ;
        public Drawable LIZIZ;
        public int LIZJ;
        public int LIZLLL;
        public Qys LJ;
        public IAA LJFF;
        public boolean LJI;
        public boolean LJII;
        
        static {
            Covode.recordClassIndex(5750);
        }
        
        public a(final ImageModel liz) {
            this.LIZJ = -1;
            this.LIZLLL = -1;
            this.LJII = EnableImageDefault565Setting.INSTANCE.getValue();
            this.LIZ = liz;
        }
    }
    
    public static final class b implements KFw<ByQ>
    {
        public ImageModel LIZ;
        public IAA LIZIZ;
        
        static {
            Covode.recordClassIndex(5751);
        }
        
        public b(final ImageModel liz, final IAA liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        public final void LIZ(final String s) {
        }
        
        public final void LIZ(final String s, final Object o) {
            final IAA liziz = this.LIZIZ;
            if (liziz != null) {
                liziz.LIZ();
            }
        }
        
        public final void LIZ(String s, final Throwable t) {
            final ImageModel liz = this.LIZ;
            if (liz != null && liz.getUrls().size() != 0) {
                s = this.LIZ.getUrls().get(0);
            }
            else {
                s = null;
            }
            final IAA liziz = this.LIZIZ;
            if (liziz != null) {
                liziz.LIZ(s, (Exception)new RuntimeException(t));
            }
        }
        
        public final void LIZIZ(final String s, final Throwable t) {
        }
    }
}
