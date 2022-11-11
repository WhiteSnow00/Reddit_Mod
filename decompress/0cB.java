// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.net.Uri;
import kotlin.jvm.internal.n;
import java.util.zip.ZipInputStream;
import java.io.FileInputStream;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import kotlin.n.y;
import com.bytedance.android.live.base.model.ImageModel;
import android.widget.ImageView$ScaleType;
import android.view.View;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;

public final class 0cb
{
    public static final 0cb LIZ;
    
    static {
        Covode.recordClassIndex(5735);
        LIZ = new 0cb();
    }
    
    private final IAA LIZ(final IAA iaa) {
        public final class 1HZ implements IAA
        {
            public final /* synthetic */ IAA LIZ;
            public final /* synthetic */ long LIZIZ;
            
            static {
                Covode.recordClassIndex(5736);
            }
            
            public 1HZ(final IAA liz, final long liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void LIZ() {
                final IAA liz = this.LIZ;
                if (liz != null) {
                    liz.LIZ();
                }
            }
            
            public final void LIZ(final Animatable animatable) {
                CTM.LIZ((Object)animatable);
                final IAA liz = this.LIZ;
                if (liz != null) {
                    liz.LIZ(animatable);
                }
            }
            
            public final void LIZ(final String s, final int n, final int n2) {
                final IAA liz = this.LIZ;
                if (liz != null) {
                    liz.LIZ(s, n, n2);
                }
                final StringBuilder sb = new StringBuilder("onLoadSuccess,imageUrl:");
                sb.append(s);
                sb.append(",width:");
                sb.append(n);
                sb.append(",height:");
                sb.append(n2);
                0ca.LIZ.LIZ(s, this.LIZIZ, true, sb.toString());
            }
            
            public final void LIZ(final String s, final Exception ex) {
                final IAA liz = this.LIZ;
                if (liz != null) {
                    liz.LIZ(s, ex);
                }
                final StringBuilder sb = new StringBuilder("onLoadFailed,imageUrl:");
                sb.append(s);
                sb.append(",exception:");
                sb.append(ex);
                final String string = sb.toString();
                final StringBuilder sb2 = new StringBuilder("onLoadFailed,imageUrl:");
                sb2.append(s);
                sb2.append(",exception:");
                sb2.append(ex);
                0ba.LIZ(4, "Gecko_Resource_Loader", sb2.toString());
                0ca.LIZ.LIZ(s, this.LIZIZ, false, string);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aconst_null    
        //     5: invokestatic    java/lang/System.nanoTime:()J
        //     8: invokespecial   X/1HZ.<init>:(LX/IAA;J)V
        //    11: areturn        
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
    
    public static final Drawable LIZ(final String s, final String s2) {
        if (TextUtils.isEmpty((CharSequence)s) || TextUtils.isEmpty((CharSequence)s2)) {
            final StringBuilder sb = new StringBuilder("getGeckoDrawable,load resource error,channel:");
            sb.append(s);
            sb.append(",fileName:");
            sb.append(s2);
            0ba.LIZ(6, "Gecko_Resource_Loader", sb.toString());
            return null;
        }
        String s3 = "";
        String s4;
        if (s == null) {
            s4 = "";
        }
        else {
            s4 = s;
        }
        String s5;
        if (s2 == null) {
            s5 = "";
        }
        else {
            s5 = s2;
        }
        try {
            if (!TextUtils.isEmpty((CharSequence)0cc.LJFF(s4, s5))) {
                String s6;
                if (s == null) {
                    s6 = "";
                }
                else {
                    s6 = s;
                }
                String s7;
                if (s2 == null) {
                    s7 = "";
                }
                else {
                    s7 = s2;
                }
                final InputStream lji = 0cc.LJI(s6, s7);
                if (s2 != null) {
                    s3 = s2;
                }
                return Drawable.createFromStream(lji, s3);
            }
            String s8;
            if (s == null) {
                s8 = "";
            }
            else {
                s8 = s;
            }
            String s9;
            if (s2 == null) {
                s9 = "";
            }
            else {
                s9 = s2;
            }
            final String lizlll = 0cc.LIZLLL(s8, s9);
            if (!TextUtils.isEmpty((CharSequence)lizlll)) {
                return Drawable.createFromPath(lizlll);
            }
            String s10;
            if (s == null) {
                s10 = "";
            }
            else {
                s10 = s;
            }
            if (s2 != null) {
                s3 = s2;
            }
            final String liz = 0cc.LIZ(s10, s3);
            if (!TextUtils.isEmpty((CharSequence)liz)) {
                Drawable.createFromStream(new URL(liz).openStream(), s2);
            }
        }
        catch (final Exception ex) {
            final StringBuilder sb2 = new StringBuilder("getGeckoDrawable,load resource error,channel:");
            sb2.append(s);
            sb2.append(",fileName:");
            sb2.append(s2);
            sb2.append(",exception:");
            sb2.append(ex);
            0ba.LIZ(6, "Gecko_Resource_Loader", sb2.toString());
        }
        return null;
    }
    
    public static final void LIZ(final 0cd 0cd) {
        if (0cd == null) {
            return;
        }
        0cd.LIZJ();
    }
    
    public static final void LIZ(final 1BF 1bf, final String s) {
        CTM.LIZ((Object)s);
        LIZ(1bf, "tiktok_live_lottie_resource", s, "images", false, null, null, 96);
    }
    
    public static final void LIZ(final 1BF 1bf, final String s, final 0c8 0c8) {
        CTM.LIZ((Object)s);
        LIZ(1bf, "tiktok_live_lottie_resource", s, "images", false, 0c8, null, 64);
    }
    
    public static final void LIZ(final 1BF 1bf, final String s, final String s2, String imageAssetsFolder, final boolean b, final 0c8 0c8, final SRS<? super 0Kp, 2P9> srs) {
        CTM.LIZ((Object)s, (Object)s2, (Object)imageAssetsFolder);
        final long nanoTime = System.nanoTime();
        if (1bf == null) {
            if (0c8 != null) {
                0c8.LIZ(false);
            }
            final StringBuilder sb = new StringBuilder("loadGeckoLottie,animView is null,channel:");
            sb.append(s);
            sb.append(",fileName:");
            sb.append(s2);
            imageAssetsFolder = sb.toString();
            final StringBuilder sb2 = new StringBuilder("loadGeckoLottie,animView is null,channel:");
            sb2.append(s);
            sb2.append(",fileName:");
            sb2.append(s2);
            0ba.LIZ(4, "Gecko_Resource_Loader", sb2.toString());
            0ca.LIZ.LIZ("", nanoTime, false, imageAssetsFolder);
            return;
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            if (0c8 != null) {
                0c8.LIZ(false);
            }
            final StringBuilder sb3 = new StringBuilder("loadGeckoLottie,channel is null,channel:");
            sb3.append(s);
            sb3.append(",fileName:");
            sb3.append(s2);
            imageAssetsFolder = sb3.toString();
            final StringBuilder sb4 = new StringBuilder("loadGeckoLottie,animView is null,channel:");
            sb4.append(s);
            sb4.append(",fileName:");
            sb4.append(s2);
            0ba.LIZ(4, "Gecko_Resource_Loader", sb4.toString());
            0ca.LIZ.LIZ("", nanoTime, false, imageAssetsFolder);
            return;
        }
        if (TextUtils.isEmpty((CharSequence)s2)) {
            if (0c8 != null) {
                0c8.LIZ(false);
            }
            final StringBuilder sb5 = new StringBuilder("loadGeckoLottie,fileName is null,channel:");
            sb5.append(s);
            sb5.append(",fileName:");
            sb5.append(s2);
            imageAssetsFolder = sb5.toString();
            final StringBuilder sb6 = new StringBuilder("loadGeckoLottie,animView is null,channel:");
            sb6.append(s);
            sb6.append(",fileName:");
            sb6.append(s2);
            0ba.LIZ(4, "Gecko_Resource_Loader", sb6.toString());
            0ca.LIZ.LIZ("", nanoTime, false, imageAssetsFolder);
            return;
        }
        try {
            1bf.setImageAssetsFolder(imageAssetsFolder);
            imageAssetsFolder = 0cc.LJFF(s, s2);
            if (!TextUtils.isEmpty((CharSequence)imageAssetsFolder) && LIZ(1bf, imageAssetsFolder, b, srs)) {
                if (0c8 != null) {
                    0c8.LIZ(true);
                }
                return;
            }
            final File lizj = 0cc.LIZJ(s, s2);
            if (lizj != null && lizj.exists() && LIZ(1bf, lizj, b, srs)) {
                if (0c8 != null) {
                    0c8.LIZ(true);
                }
                return;
            }
            final boolean liziz = LIZIZ(1bf, 0cc.LIZ(s, s2), b, srs);
            if (0c8 != null) {
                0c8.LIZ(liziz);
            }
        }
        catch (final Exception ex) {
            if (0c8 != null) {
                0c8.LIZ(false);
            }
            final StringBuilder sb7 = new StringBuilder("loadGeckoLottie,fileName is null,channel:");
            sb7.append(s);
            sb7.append(",fileName:");
            sb7.append(s2);
            sb7.append(",exception:");
            sb7.append(ex);
            final String string = sb7.toString();
            0ba.LIZ(4, "Gecko_Resource_Loader", string);
            0ca.LIZ.LIZ("", nanoTime, false, string);
        }
    }
    
    public static /* synthetic */ void LIZ(final 1BF 1bf, final String s, final String s2, final String s3, final boolean b, 0c8 0c8, SRS srs, final int n) {
        final SRS srs2 = null;
        if ((n & 0x20) != 0x0) {
            0c8 = null;
        }
        if ((n & 0x40) != 0x0) {
            srs = srs2;
        }
        LIZ(1bf, s, s2, s3, b, 0c8, (SRS<? super 0Kp, 2P9>)srs);
    }
    
    public static final void LIZ(final 1BF 1bf, final String s, final boolean b) {
        CTM.LIZ((Object)s);
        LIZ(1bf, "tiktok_live_lottie_resource", s, "images", b, null, null, 96);
    }
    
    public static final void LIZ(final View view, final String s) {
        LIZ(view, s, ImageView$ScaleType.CENTER_CROP);
    }
    
    public static void LIZ(final View view, final String s, final ImageView$ScaleType imageView$ScaleType) {
        final long nanoTime = System.nanoTime();
        if (view == null) {
            final String concat = "loadGeckoImage\uff0cimageView is null,url:".concat(String.valueOf(s));
            0ba.LIZ(4, "Gecko_Resource_Loader", concat);
            0ca.LIZ.LIZ("", nanoTime, false, concat);
            return;
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            0ba.LIZ(4, "Gecko_Resource_Loader", "loadGeckoImage\uff0curl is null");
            0ca.LIZ.LIZ(s, nanoTime, false, "loadGeckoImage\uff0curl is null");
            return;
        }
        ImageView$ScaleType center_CROP;
        if ((center_CROP = imageView$ScaleType) == null) {
            center_CROP = ImageView$ScaleType.CENTER_CROP;
        }
        final G18 liz = 0cp.LIZ();
        liz.LIZ(s);
        liz.LIZ(true);
        liz.LIZIZ(Boolean.valueOf(false));
        liz.LIZ(center_CROP);
        liz.LIZ(0cb.LIZ.LIZ((IAA)null));
        liz.LIZ(view);
        if (view instanceof 1JD && Ghp.LIZ(view.getContext())) {
            view.setScaleX(-1.0f);
        }
    }
    
    public static final void LIZ(final View view, final String s, final String s2) {
        LIZ(view, s, s2, ImageView$ScaleType.CENTER_CROP);
    }
    
    public static final void LIZ(final View view, String liz, final String s, final IA6 ia6) {
        if (view != null && !TextUtils.isEmpty((CharSequence)liz) && !TextUtils.isEmpty((CharSequence)s)) {
            final String lizlll = 0cc.LIZLLL(liz, s);
            if (!TextUtils.isEmpty((CharSequence)lizlll)) {
                final File file = new File(lizlll);
                if (file.exists()) {
                    final G18 liz2 = 0cp.LIZ();
                    liz2.LIZ(file);
                    liz2.LIZ(true);
                    liz2.LIZ(ia6);
                    liz2.LIZ(view);
                    return;
                }
            }
            final String lj = 0cc.LJ(liz, s);
            if (!TextUtils.isEmpty((CharSequence)lj)) {
                final G18 liz3 = 0cp.LIZ();
                liz3.LIZ(lj);
                liz3.LIZ(true);
                liz3.LIZ(ia6);
                liz3.LIZ(view);
            }
            else {
                liz = 0cc.LIZ(liz, s);
                if (TextUtils.isEmpty((CharSequence)liz)) {
                    return;
                }
                final G18 liz4 = 0cp.LIZ();
                liz4.LIZ(liz);
                liz4.LIZ(true);
                liz4.LIZ(ia6);
                liz4.LIZ(view);
            }
        }
    }
    
    public static void LIZ(final View view, String s, final String s2, final ImageView$ScaleType imageView$ScaleType) {
        String s3 = s;
        if (s == null) {
            s3 = "";
        }
        if ((s = s2) == null) {
            s = "";
        }
        LIZ(view, 0cc.LIZIZ(s3, s), imageView$ScaleType);
    }
    
    public static final void LIZ(final View view, String lizlll, final String s, final Runnable runnable) {
        final long nanoTime = System.nanoTime();
        if (view == null) {
            final StringBuilder sb = new StringBuilder("loadGeckoNinePatchImage\uff0cview is null,channel:");
            sb.append(lizlll);
            sb.append(",fileName:");
            sb.append(s);
            final String string = sb.toString();
            0ba.LIZ(4, "Gecko_Resource_Loader", string);
            0ca.LIZ.LIZ("", nanoTime, false, string);
            return;
        }
        if (TextUtils.isEmpty((CharSequence)lizlll) || TextUtils.isEmpty((CharSequence)s)) {
            final StringBuilder sb2 = new StringBuilder("loadGeckoNinePatchImage\uff0cchannel:");
            sb2.append(lizlll);
            sb2.append(",fileName:");
            sb2.append(s);
            sb2.append(",can not get resource url");
            final String string2 = sb2.toString();
            0ba.LIZ(4, "Gecko_Resource_Loader", string2);
            0ca.LIZ.LIZ("", nanoTime, false, string2);
            return;
        }
        final String liz = 0cc.LIZ(lizlll, s);
        if (TextUtils.isEmpty((CharSequence)liz)) {
            final StringBuilder sb3 = new StringBuilder("loadGeckoNinePatchImage\uff0cchannel:");
            sb3.append(lizlll);
            sb3.append(",fileName:");
            sb3.append(s);
            sb3.append(",url is null,can url error");
            final String string3 = sb3.toString();
            0ba.LIZ(4, "Gecko_Resource_Loader", string3);
            0ca.LIZ.LIZ("", nanoTime, false, string3);
            return;
        }
        lizlll = 0cc.LIZLLL(lizlll, s);
        if (!TextUtils.isEmpty((CharSequence)lizlll) && new File(lizlll).exists()) {
            CTM.LIZ((Object)lizlll, (Object)view);
            FBF.LIZIZ((Object)0).LIZIZ(FAr.LIZIZ(FGw.LIZJ)).LJ((5Vs)new GlQ(lizlll)).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((2d6)new Gl8(view, runnable), (2d6)GlA.LIZ);
        }
        else {
            final ImageModel imageModel = new ImageModel();
            imageModel.mUrls = Ey9.LIZJ((Object[])new String[] { liz });
            GlP.LIZ.LIZ(imageModel, view, false, runnable);
        }
    }
    
    private void LIZ(final String s) {
        if (0cB.LJ() == null || TextUtils.isEmpty((CharSequence)s) || (s != null && !y.LIZIZ(s, "http", false))) {
            0ba.LIZ(6, "Gecko_Resource_Loader", "preLoadImageFromUrl,load resource error,url:".concat(String.valueOf(s)));
            return;
        }
        S7y.LIZIZ().LJIIIIZZ().LIZLLL(S8e.LIZ(s), (Object)0cB.LJ());
    }
    
    public static boolean LIZ(final 1BF 1bf, final File file, final boolean b, final SRS<? super 0Kp, 2P9> srs) {
        public final class 1Hb<T> implements 0LM
        {
            public final /* synthetic */ SRS LIZ;
            public final /* synthetic */ 1BF LIZIZ;
            public final /* synthetic */ boolean LIZJ;
            public final /* synthetic */ File LIZLLL;
            public final /* synthetic */ long LJ;
            
            static {
                Covode.recordClassIndex(5738);
            }
            
            public 1Hb(final SRS liz, final 1BF liziz, final boolean lizj, final File lizlll, final long lj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                this.LJ = lj;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: invokestatic    java/lang/System.nanoTime:()J
        //     9: lstore          4
        //    11: iconst_0       
        //    12: istore          6
        //    14: aconst_null    
        //    15: astore          7
        //    17: aconst_null    
        //    18: astore          8
        //    20: aload_0        
        //    21: ifnonnull       99
        //    24: new             Ljava/lang/StringBuilder;
        //    27: dup            
        //    28: ldc_w           "animView is null,path:"
        //    31: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    34: astore_3       
        //    35: aload_1        
        //    36: ifnull          94
        //    39: aload_1        
        //    40: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    43: astore_0       
        //    44: aload_3        
        //    45: aload_0        
        //    46: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    49: pop            
        //    50: aload_3        
        //    51: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    54: astore_3       
        //    55: aload_3        
        //    56: invokestatic    X/0ba.LIZIZ:(Ljava/lang/String;)V
        //    59: getstatic       X/0ca.LIZ:LX/0ca;
        //    62: astore          7
        //    64: aload           8
        //    66: astore_0       
        //    67: aload_1        
        //    68: ifnull          76
        //    71: aload_1        
        //    72: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    75: astore_0       
        //    76: aload           7
        //    78: aload_0        
        //    79: lload           4
        //    81: iconst_0       
        //    82: aload_3        
        //    83: invokevirtual   X/0ca.LIZ:(Ljava/lang/String;JZLjava/lang/String;)V
        //    86: sipush          18931
        //    89: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    92: iconst_0       
        //    93: ireturn        
        //    94: aconst_null    
        //    95: astore_0       
        //    96: goto            44
        //    99: aload_1        
        //   100: ifnull          110
        //   103: aload_1        
        //   104: invokevirtual   java/io/File.exists:()Z
        //   107: ifne            151
        //   110: ldc_w           "animView load file is not exists"
        //   113: invokestatic    X/0ba.LIZIZ:(Ljava/lang/String;)V
        //   116: getstatic       X/0ca.LIZ:LX/0ca;
        //   119: astore_3       
        //   120: aload           7
        //   122: astore_0       
        //   123: aload_1        
        //   124: ifnull          132
        //   127: aload_1        
        //   128: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   131: astore_0       
        //   132: aload_3        
        //   133: aload_0        
        //   134: lload           4
        //   136: iconst_0       
        //   137: ldc_w           "animView load file is not exists"
        //   140: invokevirtual   X/0ca.LIZ:(Ljava/lang/String;JZLjava/lang/String;)V
        //   143: sipush          18931
        //   146: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   149: iconst_0       
        //   150: ireturn        
        //   151: new             Ljava/util/zip/ZipInputStream;
        //   154: astore          7
        //   156: new             Ljava/io/FileInputStream;
        //   159: astore          8
        //   161: aload           8
        //   163: aload_1        
        //   164: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   167: aload           7
        //   169: aload           8
        //   171: invokespecial   java/util/zip/ZipInputStream.<init>:(Ljava/io/InputStream;)V
        //   174: aload           7
        //   176: invokestatic    X/0LA.LIZ:(Ljava/util/zip/ZipInputStream;)LX/0LW;
        //   179: astore          7
        //   181: new             LX/1Hb;
        //   184: astore          8
        //   186: aload           8
        //   188: aload_3        
        //   189: aload_0        
        //   190: iload_2        
        //   191: aload_1        
        //   192: lload           4
        //   194: invokespecial   X/1Hb.<init>:(LX/SRS;LX/1BF;ZLjava/io/File;J)V
        //   197: aload           7
        //   199: aload           8
        //   201: invokevirtual   X/0LW.LIZ:(LX/0LM;)LX/0LW;
        //   204: pop            
        //   205: goto            272
        //   208: astore_3       
        //   209: new             Ljava/lang/StringBuilder;
        //   212: dup            
        //   213: ldc_w           "load lottie exception,path:"
        //   216: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   219: astore_0       
        //   220: aload_0        
        //   221: aload_1        
        //   222: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   225: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   228: pop            
        //   229: aload_0        
        //   230: ldc_w           ",e:"
        //   233: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   236: pop            
        //   237: aload_0        
        //   238: aload_3        
        //   239: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   242: pop            
        //   243: aload_0        
        //   244: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   247: astore_0       
        //   248: aload_0        
        //   249: invokestatic    X/0ba.LIZIZ:(Ljava/lang/String;)V
        //   252: getstatic       X/0ca.LIZ:LX/0ca;
        //   255: aload_1        
        //   256: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   259: lload           4
        //   261: iconst_1       
        //   262: aload_0        
        //   263: invokevirtual   X/0ca.LIZ:(Ljava/lang/String;JZLjava/lang/String;)V
        //   266: iload           6
        //   268: istore_2       
        //   269: goto            274
        //   272: iconst_1       
        //   273: istore_2       
        //   274: sipush          18931
        //   277: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   280: iload_2        
        //   281: ireturn        
        //    Signature:
        //  (LX/1BF;Ljava/io/File;ZLX/SRS<-LX/0Kp;LX/2P9;>;)Z
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  151    205    208    272    Ljava/lang/Exception;
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
    
    public static boolean LIZ(final 1BF 1bf, final String s, final boolean b, final SRS<? super 0Kp, 2P9> srs) {
        public final class 1Ha<T> implements 0LM
        {
            public final /* synthetic */ SRS LIZ;
            public final /* synthetic */ 1BF LIZIZ;
            public final /* synthetic */ boolean LIZJ;
            public final /* synthetic */ String LIZLLL;
            public final /* synthetic */ long LJ;
            
            static {
                Covode.recordClassIndex(5737);
            }
            
            public 1Ha(final SRS liz, final 1BF liziz, final boolean lizj, final String lizlll, final long lj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                this.LJ = lj;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: aload_1        
        //     7: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    10: invokestatic    java/lang/System.nanoTime:()J
        //    13: lstore          4
        //    15: iconst_0       
        //    16: istore          6
        //    18: aload_0        
        //    19: ifnonnull       59
        //    22: ldc_w           "loadGeckoLottieAsset,animView is null,assetPath:"
        //    25: aload_1        
        //    26: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    29: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    32: astore_0       
        //    33: iconst_4       
        //    34: ldc             "Gecko_Resource_Loader"
        //    36: aload_0        
        //    37: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    40: getstatic       X/0ca.LIZ:LX/0ca;
        //    43: aload_1        
        //    44: lload           4
        //    46: iconst_0       
        //    47: aload_0        
        //    48: invokevirtual   X/0ca.LIZ:(Ljava/lang/String;JZLjava/lang/String;)V
        //    51: sipush          18929
        //    54: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    57: iconst_0       
        //    58: ireturn        
        //    59: aload_1        
        //    60: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    63: ifeq            96
        //    66: iconst_4       
        //    67: ldc             "Gecko_Resource_Loader"
        //    69: ldc_w           "loadGeckoLottieAsset,assetPath is null"
        //    72: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    75: getstatic       X/0ca.LIZ:LX/0ca;
        //    78: aload_1        
        //    79: lload           4
        //    81: iconst_0       
        //    82: ldc_w           "loadGeckoLottieAsset,assetPath is null"
        //    85: invokevirtual   X/0ca.LIZ:(Ljava/lang/String;JZLjava/lang/String;)V
        //    88: sipush          18929
        //    91: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    94: iconst_0       
        //    95: ireturn        
        //    96: new             Ljava/util/zip/ZipInputStream;
        //    99: astore          7
        //   101: invokestatic    X/0cB.LJ:()Landroid/content/Context;
        //   104: astore          8
        //   106: aload           8
        //   108: ldc             ""
        //   110: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   113: aload           7
        //   115: aload           8
        //   117: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //   120: aload_1        
        //   121: invokevirtual   android/content/res/AssetManager.open:(Ljava/lang/String;)Ljava/io/InputStream;
        //   124: invokespecial   java/util/zip/ZipInputStream.<init>:(Ljava/io/InputStream;)V
        //   127: aload           7
        //   129: invokestatic    X/0LA.LIZ:(Ljava/util/zip/ZipInputStream;)LX/0LW;
        //   132: astore          7
        //   134: new             LX/1Ha;
        //   137: astore          8
        //   139: aload           8
        //   141: aload_3        
        //   142: aload_0        
        //   143: iload_2        
        //   144: aload_1        
        //   145: lload           4
        //   147: invokespecial   X/1Ha.<init>:(LX/SRS;LX/1BF;ZLjava/lang/String;J)V
        //   150: aload           7
        //   152: aload           8
        //   154: invokevirtual   X/0LW.LIZ:(LX/0LM;)LX/0LW;
        //   157: pop            
        //   158: goto            197
        //   161: astore_0       
        //   162: ldc_w           "loadGeckoLottieAsset exception,assetPath:"
        //   165: aload_1        
        //   166: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   169: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   172: astore_0       
        //   173: iconst_4       
        //   174: ldc             "Gecko_Resource_Loader"
        //   176: aload_0        
        //   177: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   180: getstatic       X/0ca.LIZ:LX/0ca;
        //   183: aload_1        
        //   184: lload           4
        //   186: iconst_0       
        //   187: aload_0        
        //   188: invokevirtual   X/0ca.LIZ:(Ljava/lang/String;JZLjava/lang/String;)V
        //   191: iload           6
        //   193: istore_2       
        //   194: goto            199
        //   197: iconst_1       
        //   198: istore_2       
        //   199: sipush          18929
        //   202: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   205: iload_2        
        //   206: ireturn        
        //    Signature:
        //  (LX/1BF;Ljava/lang/String;ZLX/SRS<-LX/0Kp;LX/2P9;>;)Z
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  96     158    161    197    Ljava/lang/Exception;
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
    
    public static boolean LIZIZ(final 1BF 1bf, final String s, final boolean b, final SRS<? super 0Kp, 2P9> srs) {
        public final class 1Hc<T> implements 0LM
        {
            public final /* synthetic */ SRS LIZ;
            public final /* synthetic */ 1BF LIZIZ;
            public final /* synthetic */ boolean LIZJ;
            public final /* synthetic */ String LIZLLL;
            public final /* synthetic */ long LJ;
            
            static {
                Covode.recordClassIndex(5739);
            }
            
            public 1Hc(final SRS liz, final 1BF liziz, final boolean lizj, final String lizlll, final long lj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                this.LJ = lj;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: invokestatic    java/lang/System.nanoTime:()J
        //     7: lstore          4
        //     9: iconst_0       
        //    10: istore          6
        //    12: aload_0        
        //    13: ifnull          23
        //    16: aload_0        
        //    17: invokevirtual   X/1BF.getContext:()Landroid/content/Context;
        //    20: ifnonnull       47
        //    23: iconst_4       
        //    24: ldc             "Gecko_Resource_Loader"
        //    26: ldc_w           "loadGeckoLottieZipUrl,animView is null"
        //    29: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    32: getstatic       X/0ca.LIZ:LX/0ca;
        //    35: aload_1        
        //    36: lload           4
        //    38: iconst_0       
        //    39: ldc_w           "loadGeckoLottieZipUrl,animView is null"
        //    42: invokevirtual   X/0ca.LIZ:(Ljava/lang/String;JZLjava/lang/String;)V
        //    45: iconst_0       
        //    46: ireturn        
        //    47: aload_1        
        //    48: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    51: ifeq            78
        //    54: iconst_4       
        //    55: ldc             "Gecko_Resource_Loader"
        //    57: ldc_w           "loadGeckoLottieZipUrl,url is null"
        //    60: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    63: getstatic       X/0ca.LIZ:LX/0ca;
        //    66: aload_1        
        //    67: lload           4
        //    69: iconst_0       
        //    70: ldc_w           "loadGeckoLottieZipUrl,url is null"
        //    73: invokevirtual   X/0ca.LIZ:(Ljava/lang/String;JZLjava/lang/String;)V
        //    76: iconst_0       
        //    77: ireturn        
        //    78: aload_0        
        //    79: invokevirtual   X/1BF.getContext:()Landroid/content/Context;
        //    82: aload_1        
        //    83: invokestatic    X/0KA.LIZ:(Landroid/content/Context;Ljava/lang/String;)LX/0LW;
        //    86: astore          7
        //    88: new             LX/1Hc;
        //    91: astore          8
        //    93: aload           8
        //    95: aload_3        
        //    96: aload_0        
        //    97: iload_2        
        //    98: aload_1        
        //    99: lload           4
        //   101: invokespecial   X/1Hc.<init>:(LX/SRS;LX/1BF;ZLjava/lang/String;J)V
        //   104: aload           7
        //   106: aload           8
        //   108: invokevirtual   X/0LW.LIZ:(LX/0LM;)LX/0LW;
        //   111: pop            
        //   112: goto            151
        //   115: astore_0       
        //   116: ldc_w           "loadGeckoLottieZipUrl exception,lottieZipUrl:"
        //   119: aload_1        
        //   120: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   123: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   126: astore_0       
        //   127: iconst_4       
        //   128: ldc             "Gecko_Resource_Loader"
        //   130: aload_0        
        //   131: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   134: getstatic       X/0ca.LIZ:LX/0ca;
        //   137: aload_1        
        //   138: lload           4
        //   140: iconst_0       
        //   141: aload_0        
        //   142: invokevirtual   X/0ca.LIZ:(Ljava/lang/String;JZLjava/lang/String;)V
        //   145: iload           6
        //   147: istore_2       
        //   148: goto            153
        //   151: iconst_1       
        //   152: istore_2       
        //   153: iload_2        
        //   154: ireturn        
        //    Signature:
        //  (LX/1BF;Ljava/lang/String;ZLX/SRS<-LX/0Kp;LX/2P9;>;)Z
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  78     112    115    151    Ljava/lang/Exception;
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
    
    public final void LIZIZ(final String s, final String s2) {
        if (TextUtils.isEmpty((CharSequence)s) || TextUtils.isEmpty((CharSequence)s2)) {
            final StringBuilder sb = new StringBuilder("preLoadImage,load resource error,channel:");
            sb.append(s);
            sb.append(",fileName:");
            sb.append(s2);
            0ba.LIZ(6, "Gecko_Resource_Loader", sb.toString());
            return;
        }
        final File lizj = 0cc.LIZJ(s, s2);
        if (lizj == null || !lizj.exists()) {
            this.LIZ(0cc.LIZ(s, s2));
            return;
        }
        if (0cB.LJ() == null || !lizj.exists()) {
            final StringBuilder sb2 = new StringBuilder("preLoadImageFromFile,load resource error,filePath:");
            sb2.append(lizj.getAbsolutePath());
            0ba.LIZ(6, "Gecko_Resource_Loader", sb2.toString());
            return;
        }
        S7y.LIZIZ().LJIIIIZZ().LIZLLL(S8e.LIZ(Uri.fromFile(lizj)), (Object)0cB.LJ());
    }
    
    public final void LIZJ(final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s) && !TextUtils.isEmpty((CharSequence)s2)) {
            final File lizj = 0cc.LIZJ(s, s2);
            if (lizj != null && lizj.exists()) {
                return;
            }
            this.LIZ(0cc.LIZ(s, s2));
        }
    }
}
