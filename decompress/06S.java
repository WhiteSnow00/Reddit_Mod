// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Looper;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$NotFoundException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.os.Handler;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.content.Context;
import android.os.Build$VERSION;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;

public final class 06s
{
    static {
        Covode.recordClassIndex(753);
    }
    
    public static int LIZ(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        if (Build$VERSION.SDK_INT >= 23) {
            return resources.getColor(n, resources$Theme);
        }
        return resources.getColor(n);
    }
    
    public static Typeface LIZ(final Context context, final int n, final TypedValue typedValue, final int n2, final a a) {
        if (context.isRestricted()) {
            return null;
        }
        return LIZIZ(context, n, typedValue, n2, a);
    }
    
    public static Typeface LIZ(final Context context, final Resources resources, final TypedValue typedValue, final int n, final int n2, final a a) {
        if (typedValue.string != null) {
            final String string = typedValue.string.toString();
            if (!string.startsWith("res/")) {
                if (a != null) {
                    a.LIZ(-3, null);
                }
                return null;
            }
            final Typeface typeface = 08a.LIZIZ.LIZ(08a.LIZ(resources, n, n2));
            if (typeface != null) {
                if (a != null) {
                    a.LIZ(typeface, null);
                }
                return typeface;
            }
            try {
                if (!string.toLowerCase().endsWith(".xml")) {
                    final Typeface liz = 08a.LIZ(context, resources, n, string, n2);
                    if (a != null) {
                        if (liz != null) {
                            a.LIZ(liz, null);
                        }
                        else {
                            a.LIZ(-3, null);
                        }
                    }
                    return liz;
                }
                final 06l.a liz2 = 06l.LIZ((XmlPullParser)resources.getXml(n), resources);
                if (liz2 == null) {
                    if (a != null) {
                        a.LIZ(-3, null);
                    }
                    return null;
                }
                Typeface typeface2;
                if (liz2 instanceof 06l.d) {
                    final 06l.d d = (06l.d)liz2;
                    typeface2 = 075.LIZ(context, d.LIZ, a, null, d.LIZJ == 0, d.LIZIZ, n2);
                }
                else {
                    final Typeface typeface3 = typeface2 = 08a.LIZ.LIZ(context, (06l.b)liz2, resources, n2);
                    if (a != null) {
                        if (typeface3 != null) {
                            a.LIZ(typeface3, null);
                            typeface2 = typeface3;
                        }
                        else {
                            a.LIZ(-3, null);
                            typeface2 = typeface3;
                        }
                    }
                }
                if (typeface2 != null) {
                    08a.LIZIZ.LIZ(08a.LIZ(resources, n, n2), typeface2);
                }
                return typeface2;
            }
            catch (final XmlPullParserException | IOException ex) {
                if (a != null) {
                    a.LIZ(-3, null);
                }
                return null;
            }
        }
        final StringBuilder sb = new StringBuilder("Resource \"");
        sb.append(resources.getResourceName(n));
        sb.append("\" (");
        sb.append(Integer.toHexString(n));
        sb.append(") is not a Font: ");
        sb.append(typedValue);
        throw new Resources$NotFoundException(sb.toString());
    }
    
    public static Drawable LIZ(final Resources resources, final Resources$Theme resources$Theme) {
        return resources.getDrawable(2131232527, resources$Theme);
    }
    
    public static Typeface LIZIZ(final Context context, final int n, final TypedValue typedValue, final int n2, final a a) {
        final Resources resources = context.getResources();
        resources.getValue(n, typedValue, true);
        final Typeface liz = LIZ(context, resources, typedValue, n, n2, a);
        if (liz != null || a != null) {
            return liz;
        }
        final StringBuilder sb = new StringBuilder("Font resource ID #0x");
        sb.append(Integer.toHexString(n));
        sb.append(" could not be retrieved.");
        throw new Resources$NotFoundException(sb.toString());
    }
    
    public abstract static class a
    {
        static {
            Covode.recordClassIndex(754);
        }
        
        public final void LIZ(final int n, final Handler handler) {
            public final class 06q implements Runnable
            {
                static {
                    Covode.recordClassIndex(756);
                }
                
                @Override
                public final void run() {
                }
            }
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: astore_3       
            //     2: aload_2        
            //     3: ifnonnull       17
            //     6: new             Landroid/os/Handler;
            //     9: dup            
            //    10: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
            //    13: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;)V
            //    16: astore_3       
            //    17: aload_3        
            //    18: new             LX/06q;
            //    21: dup            
            //    22: invokespecial   X/06q.<init>:()V
            //    25: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
            //    28: pop            
            //    29: return         
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
        
        public abstract void LIZ(final Typeface p0);
        
        public final void LIZ(final Typeface typeface, final Handler handler) {
            public final class 06p implements Runnable
            {
                public final /* synthetic */ Typeface LIZ;
                public final /* synthetic */ a LIZIZ;
                
                static {
                    Covode.recordClassIndex(755);
                }
                
                public 06p(final a liziz, final Typeface liz) {
                    this.LIZIZ = liziz;
                    this.LIZ = liz;
                }
                
                @Override
                public final void run() {
                    this.LIZIZ.LIZ(this.LIZ);
                }
            }
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: astore_3       
            //     2: aload_2        
            //     3: ifnonnull       17
            //     6: new             Landroid/os/Handler;
            //     9: dup            
            //    10: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
            //    13: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;)V
            //    16: astore_3       
            //    17: aload_3        
            //    18: new             LX/06p;
            //    21: dup            
            //    22: aload_0        
            //    23: aload_1        
            //    24: invokespecial   X/06p.<init>:(LX/06r;Landroid/graphics/Typeface;)V
            //    27: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
            //    30: pop            
            //    31: return         
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
}
