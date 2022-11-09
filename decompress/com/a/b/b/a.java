// 
// Decompiled by Procyon v0.6.0
// 

package com.a.b.b;

import android.content.res.TypedArray;
import android.graphics.Color;
import kotlin.n.y;
import android.graphics.drawable.Drawable;
import X.0IH;
import X.46A;
import android.os.Build$VERSION;
import android.widget.Toast;
import kotlin.n.z;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.jvm.internal.n;
import X.CTM;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class a
{
    static {
        Covode.recordClassIndex(2088);
    }
    
    public static final float LIZ(final Context context, final com.a.b.a.a a) {
        CTM.LIZ((Object)context, (Object)a);
        if (a instanceof com.a.b.a.a.b && n.LIZ((Object)((com.a.b.a.a.b)a).LIZIZ, (Object)"dimen")) {
            final Resources resources = context.getResources();
            final Integer value = Integer.valueOf(a.LIZ);
            n.LIZ((Object)value, "");
            return resources.getDimension((int)value);
        }
        if (a instanceof com.a.b.a.a.d) {
            final com.a.b.a.a.d d = (com.a.b.a.a.d)a;
            final String liziz = d.LIZIZ;
            Label_0269: {
                if (liziz != null) {
                    final int hashCode = liziz.hashCode();
                    if (hashCode != 3212) {
                        if (hashCode != 3592) {
                            if (hashCode != 3677) {
                                if (hashCode != 99467 || !liziz.equals("dip")) {
                                    break Label_0269;
                                }
                            }
                            else {
                                if (liziz.equals("sp")) {
                                    final String liz = a.LIZ;
                                    n.LIZ((Object)liz, "");
                                    final float float1 = Float.parseFloat(liz);
                                    final Resources resources2 = context.getResources();
                                    n.LIZ((Object)resources2, "");
                                    return TypedValue.applyDimension(2, float1, resources2.getDisplayMetrics());
                                }
                                break Label_0269;
                            }
                        }
                        else {
                            if (liziz.equals("px")) {
                                final String liz2 = a.LIZ;
                                n.LIZ((Object)liz2, "");
                                final float float2 = Float.parseFloat(liz2);
                                final Resources resources3 = context.getResources();
                                n.LIZ((Object)resources3, "");
                                return TypedValue.applyDimension(0, float2, resources3.getDisplayMetrics());
                            }
                            break Label_0269;
                        }
                    }
                    else if (!liziz.equals("dp")) {
                        break Label_0269;
                    }
                    final String liz3 = a.LIZ;
                    n.LIZ((Object)liz3, "");
                    final float float3 = Float.parseFloat(liz3);
                    final Resources resources4 = context.getResources();
                    n.LIZ((Object)resources4, "");
                    return TypedValue.applyDimension(1, float3, resources4.getDisplayMetrics());
                }
            }
            final StringBuilder sb = new StringBuilder("getDimen:Float unsupported dimen type: ");
            sb.append(d.LIZIZ);
            throw new IllegalArgumentException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder("unsupported ParamsType type: ");
        sb2.append(a.LIZ);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public static final String LIZ(String substring) {
        CTM.LIZ((Object)substring);
        final int liz = z.LIZ((CharSequence)substring, ":");
        if (liz == -1) {
            return substring;
        }
        substring = substring.substring(liz + 1);
        n.LIZ((Object)substring, "");
        return substring;
    }
    
    public static void LIZ(final Toast toast) {
        if (Build$VERSION.SDK_INT == 25) {
            46A.LIZ(toast);
        }
    }
    
    public static final boolean LIZ(final Context context, String string, final String s) {
        CTM.LIZ((Object)string, (Object)s);
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" unsupported attr: ");
        sb.append(s);
        string = sb.toString();
        if (0IH.LIZ) {
            LIZ(Toast.makeText(context, (CharSequence)string, 1));
        }
        throw new IllegalArgumentException(string);
    }
    
    public static final boolean LIZ(final com.a.b.a.a a) {
        CTM.LIZ((Object)a);
        if (a instanceof com.a.b.a.a.c) {
            final String liz = a.LIZ;
            n.LIZ((Object)liz, "");
            return Boolean.parseBoolean(liz);
        }
        final StringBuilder sb = new StringBuilder("getBoolean:Drawable unsupported ParamsType type: ");
        sb.append(a.LIZ);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final int LIZIZ(final Context context, final com.a.b.a.a a) {
        CTM.LIZ((Object)context, (Object)a);
        if (a instanceof com.a.b.a.a.b) {
            final com.a.b.a.a.b b = (com.a.b.a.a.b)a;
            if (n.LIZ((Object)b.LIZIZ, (Object)"drawable") || n.LIZ((Object)b.LIZIZ, (Object)"color")) {
                final String liz = a.LIZ;
                n.LIZ((Object)liz, "");
                return Integer.parseInt(liz);
            }
        }
        final StringBuilder sb = new StringBuilder("getDrawableId:Int unsupported ParamsType type: ");
        sb.append(a.LIZ);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final Drawable LIZJ(final Context context, final com.a.b.a.a a) {
        CTM.LIZ((Object)context, (Object)a);
        if (a instanceof com.a.b.a.a.b) {
            final com.a.b.a.a.b b = (com.a.b.a.a.b)a;
            if (n.LIZ((Object)b.LIZIZ, (Object)"drawable") || n.LIZ((Object)b.LIZIZ, (Object)"color")) {
                final Resources resources = context.getResources();
                final String liz = a.LIZ;
                n.LIZ((Object)liz, "");
                final Drawable drawable = resources.getDrawable(Integer.parseInt(liz));
                n.LIZ((Object)drawable, "");
                return drawable;
            }
        }
        final StringBuilder sb = new StringBuilder("getDrawable:Drawable unsupported ParamsType type: ");
        sb.append(a.LIZ);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final int LIZLLL(final Context context, final com.a.b.a.a a) {
        CTM.LIZ((Object)context, (Object)a);
        if (a instanceof com.a.b.a.a.c) {
            final String liz = a.LIZ;
            n.LIZ((Object)liz, "");
            if (y.LIZIZ(liz, "#", false)) {
                if (a.LIZ.length() >= 7) {
                    return Color.parseColor(a.LIZ);
                }
                final StringBuilder sb = new StringBuilder("color format must be like #FF0000 current is ");
                sb.append(a.LIZ);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (a instanceof com.a.b.a.a.b) {
            final com.a.b.a.a.b b = (com.a.b.a.a.b)a;
            if (b.LIZIZ.equals("color")) {
                final Resources resources = context.getResources();
                final String liz2 = a.LIZ;
                n.LIZ((Object)liz2, "");
                return resources.getColor(Integer.parseInt(liz2));
            }
            final String liziz = b.LIZIZ;
            n.LIZ((Object)liziz, "");
            if (y.LIZIZ(liziz, "attr", false)) {
                final String liz3 = a.LIZ;
                n.LIZ((Object)liz3, "");
                final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { Integer.parseInt(liz3) });
                final int color = obtainStyledAttributes.getColor(0, 0);
                obtainStyledAttributes.recycle();
                return color;
            }
        }
        final StringBuilder sb2 = new StringBuilder("getColor:Drawable unsupported ParamsType type: ");
        sb2.append(a.LIZ);
        throw new IllegalArgumentException(sb2.toString());
    }
}
