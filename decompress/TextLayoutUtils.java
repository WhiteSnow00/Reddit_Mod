// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.text;

import android.text.Layout;
import android.graphics.Paint$Align;
import android.text.TextUtils;
import android.graphics.Paint$FontMetrics;
import android.text.BoringLayout$Metrics;
import android.text.StaticLayout;
import android.text.StaticLayout$Builder;
import android.os.Build$VERSION;
import android.text.BoringLayout;
import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import com.bef.effectsdk.text.data.BitmapType;
import java.util.Iterator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Rect;
import com.bef.effectsdk.text.data.CharLayout;
import java.util.HashMap;
import java.util.ArrayList;
import android.text.TextPaint;
import android.graphics.Paint$Style;
import android.graphics.Typeface;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bef.effectsdk.text.data.TextBitmapResult;
import com.bef.effectsdk.text.data.TextLayoutParam;
import com.bytedance.covode.number.Covode;

public class TextLayoutUtils
{
    static {
        Covode.recordClassIndex(2841);
    }
    
    public static TextBitmapResult generateBitmapAtlasAlphaUTF32(final int[] array, final TextLayoutParam textLayoutParam) {
        if (array == null || array.length <= 0) {
            return null;
        }
        return generateBitmapAtlasUTF8(new String(array, 0, array.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }
    
    public static TextBitmapResult generateBitmapAtlasAlphaUTF8(final String s, final TextLayoutParam textLayoutParam) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        return generateBitmapAtlasUTF8(s, textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }
    
    public static TextBitmapResult generateBitmapAtlasRGBAUTF32(final int[] array, final TextLayoutParam textLayoutParam) {
        if (array == null || array.length <= 0) {
            return null;
        }
        return generateBitmapAtlasUTF8(new String(array, 0, array.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }
    
    public static TextBitmapResult generateBitmapAtlasRGBAUTF8(final String s, final TextLayoutParam textLayoutParam) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        return generateBitmapAtlasUTF8(s, textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }
    
    public static TextBitmapResult generateBitmapAtlasUTF8(final String s, final TextLayoutParam textLayoutParam, final COLOR_TYPE color_TYPE) {
        MethodCollector.i(7187);
        if (s.isEmpty()) {
            MethodCollector.o(7187);
            return null;
        }
        Typeface typeface2;
        final Typeface typeface = typeface2 = Typeface.DEFAULT;
        if (textLayoutParam.familyName != null) {
            typeface2 = typeface;
            if (!textLayoutParam.familyName.isEmpty()) {
                if (textLayoutParam.fontPath != null && !textLayoutParam.fontPath.isEmpty()) {
                    typeface2 = FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName);
                }
                else {
                    typeface2 = FontCache.getFromSystem(textLayoutParam.familyName, textLayoutParam.fontStyle);
                }
            }
        }
        final int textColor = textLayoutParam.textColor;
        final int backColor = textLayoutParam.backColor;
        final int shadowColor = textLayoutParam.shadowColor;
        int color;
        int color2;
        int n;
        if (TextLayoutUtils$1.$SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE[color_TYPE.ordinal()] != 1) {
            color = ((textColor & 0xFF) << 24) + (textColor >> 8 & 0xFFFFFF);
            color2 = ((backColor & 0xFF) << 24) + (backColor >> 8 & 0xFFFFFF);
            n = ((shadowColor & 0xFF) << 24) + (shadowColor >> 8 & 0xFFFFFF);
        }
        else {
            color = (textColor & 0xFF) << 24;
            color2 = (backColor & 0xFF) << 24;
            n = (shadowColor & 0xFF) << 24;
        }
        Paint$Style style = Paint$Style.FILL;
        final int paintStyle = textLayoutParam.paintStyle;
        float strokeWidth = 0.0f;
        Label_0198: {
            if (paintStyle != 0) {
                if (paintStyle == 1) {
                    style = Paint$Style.STROKE;
                    strokeWidth = textLayoutParam.strokeWidth;
                    break Label_0198;
                }
                if (paintStyle == 2) {
                    style = Paint$Style.FILL_AND_STROKE;
                    strokeWidth = textLayoutParam.strokeWidth;
                    break Label_0198;
                }
            }
            else {
                style = Paint$Style.FILL;
            }
            strokeWidth = 0.0f;
        }
        final TextPaint textPaint = new TextPaint(1);
        if (typeface2 != null) {
            textPaint.setTypeface(typeface2);
        }
        textPaint.setColor(color);
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(strokeWidth);
        textPaint.setTextSize(textLayoutParam.fontSize);
        textPaint.setShadowLayer(textLayoutParam.shadowRadius, textLayoutParam.shadowDx, textLayoutParam.shadowDy, n);
        final int lineWidth = textLayoutParam.lineWidth;
        int n2;
        if (lineWidth > 2048 || (n2 = lineWidth) == 0) {
            n2 = 2048;
        }
        final TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 4;
        textBitmapResult.lineCount = 0;
        textBitmapResult.type = 1;
        final ArrayList list = new ArrayList();
        final HashMap hashMap = new HashMap();
        final ArrayList list2 = new ArrayList();
        final float n3 = Math.abs(textLayoutParam.shadowDx) + textLayoutParam.shadowRadius / 2.0f;
        final float abs = Math.abs(textLayoutParam.shadowDy);
        final float n4 = textLayoutParam.shadowRadius / 2.0f;
        float letterSpacing;
        if (textLayoutParam.letterSpacing > 0.0f) {
            letterSpacing = textLayoutParam.letterSpacing;
        }
        else {
            letterSpacing = 0.0f;
        }
        final int n5 = (int)letterSpacing;
        float lineSpacingAdd;
        if (textLayoutParam.lineSpacingAdd > 0.0f) {
            lineSpacingAdd = textLayoutParam.lineSpacingAdd;
        }
        else {
            lineSpacingAdd = 0.0f;
        }
        final int n6 = (int)lineSpacingAdd;
        int n7 = (int)Math.max(-textLayoutParam.shadowDx + textLayoutParam.shadowRadius / 2.0f, 0.0f) + n5 + 1;
        int n8 = (int)(Math.max(-textLayoutParam.shadowDy + textLayoutParam.shadowRadius / 2.0f, 0.0f) + textLayoutParam.fontSize) + n6 + 1;
        int charId = 0;
        int n9 = 0;
        int n10;
        while (true) {
            n10 = n8;
            if (n9 >= s.length()) {
                break;
            }
            final CharLayout charLayout = new CharLayout();
            charLayout.charCode = 0;
            charLayout.isEmoji = false;
            charLayout.charId = charId;
            int n11 = 1;
            int n19 = 0;
            Label_0757: {
                int n14;
                while (true) {
                    final int length = s.length();
                    final int n12 = n11 + n9;
                    final int n13 = n12 + 1;
                    n14 = n11;
                    if (length <= n13) {
                        break;
                    }
                    final String substring = s.substring(n12 - 1, n12);
                    final String substring2 = s.substring(n12, n13);
                    int n15 = n11;
                    if (substring.compareTo("\ud800") >= 0) {
                        n15 = n11;
                        if (substring.compareTo("\udbff") <= 0) {
                            n15 = n11;
                            if (substring2.compareTo("\udc00") >= 0) {
                                n15 = n11;
                                if (substring2.compareTo("\udfff") <= 0) {
                                    charLayout.isEmoji = true;
                                    final short n16 = (short)(n14 = (short)(n11 + 1));
                                    if (s.length() < n9 + 3) {
                                        break;
                                    }
                                    n15 = n16;
                                }
                            }
                        }
                    }
                    final int n17 = n9 + n15;
                    final int n18 = n17 + 1;
                    final String substring3 = s.substring(n17, n18);
                    final String substring4 = s.substring(n18, n17 + 2);
                    n19 = n15;
                    if (substring3.compareTo("\u200d") != 0) {
                        break Label_0757;
                    }
                    n19 = n15;
                    if (substring4.compareTo("\ud800") < 0) {
                        break Label_0757;
                    }
                    n19 = n15;
                    if (substring4.compareTo("\udbff") > 0) {
                        break Label_0757;
                    }
                    n11 = (short)(n15 + 2);
                }
                n19 = n14;
            }
            if (!charLayout.isEmoji) {
                final byte[] bytes = s.substring(n9, n9 + n19).getBytes();
                charLayout.charCode = 0;
                for (int i = 0; i < bytes.length; ++i) {
                    charLayout.charCode += (bytes[i] & 0xFF) << (bytes.length - i - 1) * 8;
                }
            }
            final CharLayout charLayout2 = (CharLayout)hashMap.get(charLayout.charCode);
            if (charLayout2 == null || charLayout.isEmoji) {
                final Rect rect = new Rect();
                final int n20 = n9 + n19;
                textPaint.getTextBounds(s, n9, n20, rect);
                rect.left += (int)Math.min(textLayoutParam.shadowDx - textLayoutParam.shadowRadius / 2.0f, 0.0f);
                rect.right += (int)Math.max(textLayoutParam.shadowDx + textLayoutParam.shadowRadius / 2.0f, 0.0f);
                rect.bottom += (int)Math.max(textLayoutParam.shadowDy + textLayoutParam.shadowRadius / 2.0f, 0.0f);
                rect.top += (int)Math.min(textLayoutParam.shadowDy - textLayoutParam.shadowRadius / 2.0f, 0.0f);
                final float measureText = textPaint.measureText(s, n9, n20);
                charLayout.advance = measureText;
                final float n21 = (float)n7;
                final float n22 = (float)n5;
                int n23 = n8;
                if (n21 + measureText + n3 + n22 + 1.0f >= n2) {
                    n7 = (int)Math.max(-textLayoutParam.shadowDx + textLayoutParam.shadowRadius / 2.0f, 0.0f) + n5 + 1;
                    final int n24 = (int)(n8 + (textLayoutParam.fontSize + (abs + n4) + n6 + 1.0f));
                    if ((n10 = n24) >= 4194304 / n2) {
                        break;
                    }
                    n23 = n24;
                }
                list2.add(new Rect(n9, n20, n7, n23));
                charLayout.baseline = (float)n23;
                final float origin = (float)n7;
                charLayout.origin = origin;
                charLayout.pos_left = (float)rect.left;
                charLayout.pos_top = (float)rect.top;
                charLayout.pos_right = (float)rect.right;
                charLayout.pos_bottom = (float)rect.bottom;
                charLayout.left = (float)(rect.left + n7);
                charLayout.top = (float)(rect.top + n23);
                charLayout.right = (float)(rect.right + n7);
                charLayout.bottom = (float)(rect.bottom + n23);
                hashMap.put(charLayout.charCode, charLayout);
                n7 = (int)(origin + (measureText + n3 + n22 + 1.0f));
                n8 = n23;
            }
            else {
                charLayout.pos_left = charLayout2.pos_left;
                charLayout.pos_top = charLayout2.pos_top;
                charLayout.pos_right = charLayout2.pos_right;
                charLayout.pos_bottom = charLayout2.pos_bottom;
                charLayout.left = charLayout2.left;
                charLayout.top = charLayout2.top;
                charLayout.right = charLayout2.right;
                charLayout.bottom = charLayout2.bottom;
                charLayout.baseline = charLayout2.baseline;
                charLayout.origin = charLayout2.origin;
                charLayout.advance = charLayout2.advance;
            }
            list.add(charLayout);
            n9 += n19;
            ++charId;
        }
        textBitmapResult.charLayouts = (CharLayout[])list.toArray(new CharLayout[0]);
        final int n25 = n10 + (int)textLayoutParam.fontSize;
        Bitmap bitmap;
        if (TextLayoutUtils$1.$SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE[color_TYPE.ordinal()] != 1) {
            bitmap = Bitmap.createBitmap(n2, n25, Bitmap$Config.ARGB_8888);
            textBitmapResult.channel = 4;
        }
        else {
            bitmap = Bitmap.createBitmap(n2, n25, Bitmap$Config.ALPHA_8);
            textBitmapResult.channel = 1;
        }
        if (bitmap == null) {
            MethodCollector.o(7187);
            return null;
        }
        final Paint paint = new Paint();
        paint.setColor(color2);
        final Canvas canvas = new Canvas(bitmap);
        int j = 0;
        canvas.drawRect(new Rect(0, 0, n2, n25), paint);
        for (final Rect rect2 : list2) {
            canvas.drawText(s.substring(rect2.left, rect2.top), (float)rect2.right, (float)rect2.bottom, (Paint)textPaint);
        }
        textBitmapResult.bitmap = bitmap;
        while (j < textBitmapResult.charLayouts.length) {
            final CharLayout charLayout3 = textBitmapResult.charLayouts[j];
            final float bottom = charLayout3.bottom;
            final float n26 = (float)n25;
            charLayout3.bottom = bottom / n26;
            final CharLayout charLayout4 = textBitmapResult.charLayouts[j];
            charLayout4.top /= n26;
            final CharLayout charLayout5 = textBitmapResult.charLayouts[j];
            final float left = charLayout5.left;
            final float n27 = (float)n2;
            charLayout5.left = left / n27;
            final CharLayout charLayout6 = textBitmapResult.charLayouts[j];
            charLayout6.right /= n27;
            ++j;
        }
        canvas.setBitmap((Bitmap)null);
        MethodCollector.o(7187);
        return textBitmapResult;
    }
    
    public static TextBitmapResult generateBitmapNeonAlphaUTF32(final int[] array, final TextLayoutParam textLayoutParam) {
        if (array == null || array.length <= 0) {
            return null;
        }
        return generateBitmapNeonAlphaUTF8(new String(array, 0, array.length), textLayoutParam);
    }
    
    public static TextBitmapResult generateBitmapNeonAlphaUTF8(final String s, final TextLayoutParam textLayoutParam) {
        final int n = TextLayoutUtils$1.$SwitchMap$com$bef$effectsdk$text$data$BitmapType[BitmapType.valueOf(textLayoutParam.bitmapType).ordinal()];
        if (n == 1) {
            return generateTextAutoSizedShakeBitmap(s, textLayoutParam);
        }
        if (n != 2) {
            return null;
        }
        return generateTextAutoSizedNeonBitmap(s, textLayoutParam);
    }
    
    public static TextBitmapResult generateBitmapNormalAlphaUTF32(final int[] array, final TextLayoutParam textLayoutParam) {
        if (array == null || array.length <= 0) {
            return null;
        }
        return generateBitmapNormalUTF8(new String(array, 0, array.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }
    
    public static TextBitmapResult generateBitmapNormalAlphaUTF8(final String s, final TextLayoutParam textLayoutParam) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        return generateBitmapNormalUTF8(s, textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }
    
    public static TextBitmapResult generateBitmapNormalRGBAUTF32(final int[] array, final TextLayoutParam textLayoutParam) {
        if (array == null || array.length <= 0) {
            return null;
        }
        return generateBitmapNormalUTF8(new String(array, 0, array.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }
    
    public static TextBitmapResult generateBitmapNormalRGBAUTF8(final String s, final TextLayoutParam textLayoutParam) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        return generateBitmapNormalUTF8(s, textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }
    
    public static TextBitmapResult generateBitmapNormalUTF8(final String s, final TextLayoutParam textLayoutParam, final COLOR_TYPE color_TYPE) {
        MethodCollector.i(6511);
        if (s.isEmpty()) {
            MethodCollector.o(6511);
            return null;
        }
        Typeface typeface2;
        final Typeface typeface = typeface2 = Typeface.DEFAULT;
        if (textLayoutParam.familyName != null) {
            typeface2 = typeface;
            if (!textLayoutParam.familyName.isEmpty()) {
                if (textLayoutParam.fontPath != null && !textLayoutParam.fontPath.isEmpty()) {
                    typeface2 = FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName);
                }
                else {
                    typeface2 = FontCache.getFromSystem(textLayoutParam.familyName, textLayoutParam.fontStyle);
                }
            }
        }
        final int textColor = textLayoutParam.textColor;
        final int backColor = textLayoutParam.backColor;
        final int shadowColor = textLayoutParam.shadowColor;
        int color;
        int color2;
        int n;
        if (TextLayoutUtils$1.$SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE[color_TYPE.ordinal()] != 1) {
            color = ((textColor & 0xFF) << 24) + (textColor >> 8 & 0xFFFFFF);
            color2 = ((backColor & 0xFF) << 24) + (backColor >> 8 & 0xFFFFFF);
            n = ((shadowColor & 0xFF) << 24) + (shadowColor >> 8 & 0xFFFFFF);
        }
        else {
            color = (textColor & 0xFF) << 24;
            color2 = (backColor & 0xFF) << 24;
            n = (shadowColor & 0xFF) << 24;
        }
        Paint$Style style = Paint$Style.FILL;
        final int paintStyle = textLayoutParam.paintStyle;
        final float n2 = 0.0f;
        float strokeWidth = 0.0f;
        Label_0202: {
            if (paintStyle != 0) {
                if (paintStyle == 1) {
                    style = Paint$Style.STROKE;
                    strokeWidth = textLayoutParam.strokeWidth;
                    break Label_0202;
                }
                if (paintStyle == 2) {
                    style = Paint$Style.FILL_AND_STROKE;
                    strokeWidth = textLayoutParam.strokeWidth;
                    break Label_0202;
                }
            }
            else {
                style = Paint$Style.FILL;
            }
            strokeWidth = 0.0f;
        }
        Layout$Alignment alignment = Layout$Alignment.ALIGN_NORMAL;
        final int textAlign = textLayoutParam.textAlign;
        if (textAlign != 0) {
            if (textAlign != 1) {
                if (textAlign == 2) {
                    alignment = Layout$Alignment.ALIGN_CENTER;
                }
            }
            else {
                alignment = Layout$Alignment.ALIGN_OPPOSITE;
            }
        }
        else {
            alignment = Layout$Alignment.ALIGN_NORMAL;
        }
        int maxLine = textLayoutParam.maxLine;
        int lineWidth = textLayoutParam.lineWidth;
        int lineWidth2 = textLayoutParam.lineWidth;
        int n3;
        if (lineWidth == 0) {
            maxLine = 1;
            lineWidth = 2048;
            lineWidth2 = 2048;
            n3 = 0;
        }
        else {
            n3 = 1;
        }
        TextUtils$TruncateAt ellipsize = null;
        int n4 = 0;
        Label_0315: {
            if (maxLine == 1) {
                final int lineBreakMode = textLayoutParam.lineBreakMode;
                if (lineBreakMode != 0 && lineBreakMode != 1) {
                    if (lineBreakMode != 2) {
                        if (lineBreakMode != 3) {
                            if (lineBreakMode != 4) {
                                ellipsize = null;
                            }
                            else {
                                ellipsize = TextUtils$TruncateAt.END;
                            }
                        }
                        else {
                            ellipsize = TextUtils$TruncateAt.MIDDLE;
                        }
                    }
                    else {
                        ellipsize = TextUtils$TruncateAt.START;
                    }
                }
                else {
                    ellipsize = TextUtils$TruncateAt.MARQUEE;
                }
                while (true) {
                    n4 = 0;
                    break Label_0315;
                    continue;
                }
            }
            ellipsize = null;
            n4 = n3;
        }
        int max = lineWidth2;
        if (lineWidth2 > 2048) {
            max = 2048;
        }
        int n5;
        if ((n5 = lineWidth) > 2048) {
            n5 = 2048;
        }
        int n6;
        if ((n6 = maxLine) == 0) {
            n6 = Integer.MAX_VALUE;
        }
        final TextPaint textPaint = new TextPaint(1);
        if (typeface2 != null) {
            textPaint.setTypeface(typeface2);
        }
        textPaint.setColor(color);
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(strokeWidth);
        textPaint.setTextSize(textLayoutParam.fontSize);
        textPaint.setShadowLayer(textLayoutParam.shadowRadius, textLayoutParam.shadowDx, textLayoutParam.shadowDy, n);
        textPaint.setLetterSpacing(textLayoutParam.letterSpacing);
        final BoringLayout$Metrics boring = BoringLayout.isBoring((CharSequence)s, textPaint);
        Object build;
        if (n6 == 1 && boring != null && ellipsize != TextUtils$TruncateAt.MARQUEE) {
            final float lineSpacingMult = textLayoutParam.lineSpacingMult;
            final float lineSpacingAdd = textLayoutParam.lineSpacingAdd;
            n6 = 1;
            build = new BoringLayout((CharSequence)s, textPaint, n5, alignment, lineSpacingMult, lineSpacingAdd, boring, true, ellipsize, max);
        }
        else {
            final TextPaint textPaint2 = textPaint;
            final int n7 = n5;
            if (Build$VERSION.SDK_INT >= 23) {
                build = StaticLayout$Builder.obtain((CharSequence)s, 0, s.length(), textPaint2, n7).setAlignment(alignment).setLineSpacing(textLayoutParam.lineSpacingAdd, textLayoutParam.lineSpacingMult).setIncludePad(true).setEllipsize(ellipsize).setEllipsizedWidth(max).build();
            }
            else {
                build = new StaticLayout((CharSequence)s, 0, s.length(), textPaint2, n7, alignment, textLayoutParam.lineSpacingMult, textLayoutParam.lineSpacingAdd, true, ellipsize, max);
            }
        }
        final int min = Math.min(((Layout)build).getLineCount(), n6);
        if (min == 0) {
            MethodCollector.o(6511);
        }
        else {
            if (n4 != 0) {
                max = n5;
            }
            int max2;
            int n8;
            int n9;
            for (max2 = 0, n8 = 0, n9 = 0; n8 < min && Math.max(((Layout)build).getLineBottom(n8), max2) <= 2048; max2 = Math.max(((Layout)build).getLineBottom(n8), max2), ++n9, ++n8) {
                max = Math.max((int)(((Layout)build).getLineRight(n8) - ((Layout)build).getLineLeft(n8)), max);
            }
            int n10;
            if ((n10 = max) > 2048) {
                n10 = 2048;
            }
            if (((Layout)build).getLineBottom(0) != 0) {
                int lineCount;
                if ((lineCount = n9) == 0) {
                    lineCount = 1;
                    max2 = 2048;
                }
                int n11 = max2;
                float n12 = n2;
                if (lineCount == ((Layout)build).getLineCount()) {
                    final Paint$FontMetrics fontMetrics = textPaint.getFontMetrics();
                    final float lineSpacingAdd2 = textLayoutParam.lineSpacingAdd;
                    final float lineSpacingMult2 = textLayoutParam.lineSpacingMult;
                    final float descent = fontMetrics.descent;
                    final float abs = Math.abs(fontMetrics.ascent);
                    final float leading = fontMetrics.leading;
                    final int n13 = lineCount - 1;
                    final float n14 = lineSpacingAdd2 + lineSpacingMult2 * (descent + abs + leading) - (((Layout)build).getLineBottom(n13) - ((Layout)build).getLineTop(n13));
                    n11 = max2;
                    n12 = n2;
                    if (n14 > 0.0f) {
                        n12 = n14 + 0.5f;
                        n11 = (int)(max2 + n12);
                    }
                }
                final TextBitmapResult textBitmapResult = new TextBitmapResult();
                textBitmapResult.channel = 4;
                textBitmapResult.lineCount = lineCount;
                textBitmapResult.type = 1;
                textBitmapResult.charLayouts = new CharLayout[lineCount];
                for (int i = 0; i < lineCount; ++i) {
                    textBitmapResult.charLayouts[i] = new CharLayout();
                    final CharLayout charLayout = textBitmapResult.charLayouts[i];
                    final float n15 = (float)((Layout)build).getLineBaseline(i);
                    final float n16 = (float)n11;
                    charLayout.baseline = n15 / n16;
                    final CharLayout charLayout2 = textBitmapResult.charLayouts[i];
                    final CharLayout charLayout3 = textBitmapResult.charLayouts[i];
                    final float lineLeft = ((Layout)build).getLineLeft(i);
                    final float n17 = (float)n10;
                    final float n18 = lineLeft / n17;
                    charLayout3.left = n18;
                    charLayout2.pos_left = n18;
                    final CharLayout charLayout4 = textBitmapResult.charLayouts[i];
                    final CharLayout charLayout5 = textBitmapResult.charLayouts[i];
                    final float n19 = ((Layout)build).getLineTop(i) / n16;
                    charLayout5.top = n19;
                    charLayout4.pos_top = n19;
                    final CharLayout charLayout6 = textBitmapResult.charLayouts[i];
                    final CharLayout charLayout7 = textBitmapResult.charLayouts[i];
                    final float n20 = ((Layout)build).getLineRight(i) / n17;
                    charLayout7.right = n20;
                    charLayout6.pos_right = n20;
                    if (i == lineCount - 1) {
                        final CharLayout charLayout8 = textBitmapResult.charLayouts[i];
                        final CharLayout charLayout9 = textBitmapResult.charLayouts[i];
                        final float n21 = (((Layout)build).getLineBottom(i) + n12) / n16;
                        charLayout9.bottom = n21;
                        charLayout8.pos_bottom = n21;
                    }
                    else {
                        final CharLayout charLayout10 = textBitmapResult.charLayouts[i];
                        final CharLayout charLayout11 = textBitmapResult.charLayouts[i];
                        final float n22 = ((Layout)build).getLineBottom(i) / n16;
                        charLayout11.bottom = n22;
                        charLayout10.pos_bottom = n22;
                    }
                    textBitmapResult.charLayouts[i].charCode = -2;
                }
                Bitmap bitmap;
                if (TextLayoutUtils$1.$SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE[color_TYPE.ordinal()] != 1) {
                    bitmap = Bitmap.createBitmap(n10, n11, Bitmap$Config.ARGB_8888);
                    textBitmapResult.channel = 4;
                }
                else {
                    bitmap = Bitmap.createBitmap(n10, n11, Bitmap$Config.ALPHA_8);
                    textBitmapResult.channel = 1;
                }
                bitmap.setPremultiplied(true);
                final Canvas canvas = new Canvas(bitmap);
                final Paint paint = new Paint();
                paint.setColor(color2);
                canvas.drawRect(new Rect(0, 0, n10, n11), paint);
                ((Layout)build).draw(canvas);
                textBitmapResult.bitmap = bitmap;
                canvas.setBitmap((Bitmap)null);
                MethodCollector.o(6511);
                return textBitmapResult;
            }
            MethodCollector.o(6511);
        }
        return null;
    }
    
    public static TextBitmapResult generateTextAutoSizedNeonBitmap(String s, final TextLayoutParam textLayoutParam) {
        MethodCollector.i(5972);
        final String[] splitLyric = splitLyric(s);
        if (TextUtils.isEmpty((CharSequence)s) || textLayoutParam == null) {
            MethodCollector.o(5972);
            return null;
        }
        final TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint$Align.LEFT);
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty((CharSequence)textLayoutParam.familyName) && !TextUtils.isEmpty((CharSequence)textLayoutParam.fontPath)) {
            textPaint.setTypeface(FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        boolean b;
        if (textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent) {
            b = true;
        }
        else {
            b = false;
        }
        final TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = splitLyric.length;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[splitLyric.length];
        final int[] array = new int[splitLyric.length];
        int i = 0;
        float n = 0.0f;
        while (i < splitLyric.length) {
            int n2 = 10;
            s = splitLyric[i];
            textPaint.setTextSize(10.0f);
            for (float n3 = textPaint.measureText(s, 0, s.length()); n3 <= textLayoutParam.lineWidth; n3 = textPaint.measureText(s, 0, s.length())) {
                n2 += 2;
                textPaint.setTextSize((float)n2);
            }
            array[i] = n2 - 2;
            textPaint.setTextSize((float)array[i]);
            final Paint$FontMetrics fontMetrics = textPaint.getFontMetrics();
            float n4;
            float n5;
            if (b) {
                n4 = fontMetrics.bottom;
                n5 = fontMetrics.top;
            }
            else {
                n4 = fontMetrics.descent;
                n5 = fontMetrics.ascent;
            }
            n += n4 - n5;
            ++i;
        }
        final Bitmap bitmap = Bitmap.createBitmap(textLayoutParam.lineWidth, (int)n, Bitmap$Config.ALPHA_8);
        final Canvas canvas = new Canvas(bitmap);
        textBitmapResult.bitmap = bitmap;
        int j = 0;
        float n6 = 0.0f;
        while (j < splitLyric.length) {
            s = splitLyric[j];
            textPaint.setTextSize((float)array[j]);
            final Paint$FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            StaticLayout build;
            if (Build$VERSION.SDK_INT >= 23) {
                build = StaticLayout$Builder.obtain((CharSequence)s, 0, s.length(), textPaint, canvas.getWidth()).setAlignment(Layout$Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
            }
            else {
                build = new StaticLayout((CharSequence)s, 0, s.length(), textPaint, canvas.getWidth(), Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            build.draw(canvas);
            final CharLayout charLayout = new CharLayout();
            float n7;
            if (b) {
                n7 = fontMetrics2.bottom - fontMetrics2.top;
                charLayout.baseline = (n6 - fontMetrics2.top) / n;
            }
            else {
                n7 = fontMetrics2.descent - fontMetrics2.ascent;
                charLayout.baseline = (n6 - fontMetrics2.ascent) / n;
            }
            charLayout.top = n6 / n;
            n6 += n7;
            charLayout.bottom = n6 / n;
            charLayout.left = 0.0f;
            charLayout.right = 1.0f;
            textBitmapResult.charLayouts[j] = charLayout;
            canvas.translate(0.0f, n7);
            ++j;
        }
        MethodCollector.o(5972);
        return textBitmapResult;
    }
    
    public static TextBitmapResult generateTextAutoSizedShakeBitmap(String s, final TextLayoutParam textLayoutParam) {
        MethodCollector.i(5302);
        final String[] lyricShakeSplit = lyricShakeSplit(s);
        if (TextUtils.isEmpty((CharSequence)s)) {
            MethodCollector.o(5302);
            return null;
        }
        final TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty((CharSequence)textLayoutParam.familyName) && !TextUtils.isEmpty((CharSequence)textLayoutParam.fontPath)) {
            textPaint.setTypeface(FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        textPaint.setTextSize(textLayoutParam.fontSize);
        final boolean b = textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent;
        final Paint$FontMetrics fontMetrics = textPaint.getFontMetrics();
        final ArrayList list = new ArrayList();
        final float n = (float)textLayoutParam.lineWidth;
        float n2 = 0.0f;
        int lineCount = 0;
        for (int i = 0; i < lyricShakeSplit.length; ++i) {
            s = lyricShakeSplit[i];
            StaticLayout build;
            if (Build$VERSION.SDK_INT >= 23) {
                build = StaticLayout$Builder.obtain((CharSequence)s, 0, s.length(), textPaint, (int)n).setAlignment(Layout$Alignment.ALIGN_OPPOSITE).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
            }
            else {
                build = new StaticLayout((CharSequence)s, 0, s.length(), textPaint, (int)n, Layout$Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
            }
            lineCount += build.getLineCount();
            list.add(build);
            n2 += build.getHeight();
        }
        final TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = lineCount;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[lineCount];
        final Bitmap bitmap = Bitmap.createBitmap(textLayoutParam.lineWidth, (int)n2, Bitmap$Config.ALPHA_8);
        final Canvas canvas = new Canvas(bitmap);
        textBitmapResult.bitmap = bitmap;
        int j = 0;
        float n3 = 0.0f;
        int n4 = 0;
        while (j < lyricShakeSplit.length) {
            final float n5 = (float)((StaticLayout)list.get(j)).getHeight();
            final float n6 = n5 / ((StaticLayout)list.get(j)).getLineCount();
            for (int k = 0; k < ((StaticLayout)list.get(j)).getLineCount(); ++k) {
                final CharLayout charLayout = new CharLayout();
                final float lineWidth = ((StaticLayout)list.get(j)).getLineWidth(k);
                if (b) {
                    charLayout.baseline = (n3 - fontMetrics.top) / n2;
                }
                else {
                    charLayout.baseline = (n3 - fontMetrics.ascent) / n2;
                }
                charLayout.top = n3 / n2;
                n3 += n6;
                charLayout.bottom = (n3 - Math.abs(fontMetrics.bottom - fontMetrics.descent) / 2.0f) / n2;
                if (textLayoutParam.textAlign == 0) {
                    charLayout.left = 0.0f;
                    charLayout.right = (n - lineWidth) / n;
                }
                else {
                    charLayout.left = (n - lineWidth) / n;
                    charLayout.right = 1.0f;
                }
                textBitmapResult.charLayouts[n4] = charLayout;
                ++n4;
            }
            ((StaticLayout)list.get(j)).draw(canvas);
            canvas.translate(0.0f, n5 * ((StaticLayout)list.get(j)).getLineCount());
            ++j;
        }
        MethodCollector.o(5302);
        return textBitmapResult;
    }
    
    public static String[] lyricShakeSplit(final String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        final String[] split = s.replace("\n", " ").replace(",", "").replace("\r", " ").split(" ");
        final ArrayList list = new ArrayList();
        final StringBuilder sb = new StringBuilder();
        int n;
    Label_0120:
        for (int i = 0; i < split.length; i = n + 1) {
            n = i;
            if (!split[i].isEmpty()) {
                final int length = sb.toString().length();
                if (length == 0) {
                    if (split[i].length() < 10) {
                        sb.append(split[i]);
                        n = i;
                    }
                    else if (split[i].length() == 10) {
                        list.add(split[i]);
                        n = i;
                    }
                    else {
                        list.add(split[i].substring(0, 10));
                        boolean b;
                        int n2;
                        if ((split[i].length() - 10) % 9 == 0) {
                            b = true;
                            n2 = (split[i].length() - 10) / 9;
                        }
                        else {
                            b = false;
                            n2 = (split[i].length() - 10) / 9 + 1;
                        }
                        int n3 = 0;
                        while (true) {
                            n = i;
                            if (n3 >= n2) {
                                continue Label_0120;
                            }
                            if (n3 == 0) {
                                if (b) {
                                    sb.append("-");
                                    sb.append(split[i].substring(10, 19));
                                    final String string = sb.toString();
                                    list.add(string);
                                    sb.delete(0, string.length());
                                }
                                else {
                                    if (n2 == 1) {
                                        break;
                                    }
                                    sb.append("-");
                                    sb.append(split[i].substring(10, 19));
                                    final String string2 = sb.toString();
                                    list.add(string2);
                                    sb.delete(0, string2.length());
                                }
                            }
                            else {
                                final int n4 = (n3 - 1) * 9 + 19;
                                if (n3 < n2 - 1) {
                                    sb.append("-");
                                    sb.append(split[i].substring(n4, n3 * 9 + 19));
                                    final String string3 = sb.toString();
                                    list.add(string3);
                                    sb.delete(0, string3.length());
                                }
                                else if (b) {
                                    sb.append("-");
                                    sb.append(split[i].substring(n4, n3 * 9 + 19));
                                    final String string4 = sb.toString();
                                    list.add(string4);
                                    sb.delete(0, string4.length());
                                }
                                else {
                                    final int length2 = split[i].length();
                                    sb.append("-");
                                    sb.append(split[i].substring(n4, length2));
                                }
                            }
                            ++n3;
                        }
                        final int length3 = split[i].length();
                        sb.append("-");
                        sb.append(split[i].substring(10, length3));
                        n = i;
                    }
                }
                else if (sb.toString().length() + split[i].length() + 1 <= 10) {
                    sb.append(" ");
                    sb.append(split[i]);
                    n = i;
                }
                else {
                    list.add(sb.toString());
                    sb.delete(0, length);
                    n = i - 1;
                }
            }
        }
        if (sb.toString().length() != 0) {
            list.add(sb.toString());
        }
        return (String[])list.toArray(new String[list.size()]);
    }
    
    public static String[] splitLyric(final String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        final String[] split = s.replace("\n", " ").replace("\r", " ").split(" ");
        final ArrayList list = new ArrayList();
        int i = 0;
        int n = 0;
        while (i < split.length) {
            final StringBuilder sb = new StringBuilder();
            int n2;
            if (n % 5 % 3 == 0) {
                n2 = 6;
            }
            else {
                n2 = 10;
            }
            int n4;
            for (int n3 = 0; i < split.length && (split[i].length() + n3 + 1 <= n2 || n3 <= 3); i = n4) {
                n3 += split[i].length() + 1;
                n4 = i + 1;
                sb.append(split[i]);
                sb.append(" ");
                if (n4 == split.length - 1 && split[n4].length() < 3) {
                    sb.append(split[n4]);
                }
            }
            ++n;
            list.add(sb.substring(0, sb.length() - 1));
        }
        return (String[])list.toArray(new String[list.size()]);
    }
    
    public enum COLOR_TYPE
    {
        COLOR_TYPE_ALPHA, 
        COLOR_TYPE_RGBA;
        
        static {
            Covode.recordClassIndex(2843);
        }
    }
}
