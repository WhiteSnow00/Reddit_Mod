// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk.text.data;

import com.bytedance.covode.number.Covode;

public class TextLayoutParam
{
    public int backColor;
    public int bitmapType;
    public String familyName;
    public String fontPath;
    public float fontSize;
    public int fontStyle;
    public float letterSpacing;
    public int lineBreakMode;
    public float lineSpacingAdd;
    public float lineSpacingMult;
    public int lineWidth;
    public int maxLine;
    public int paintStyle;
    public int shadowColor;
    public float shadowDx;
    public float shadowDy;
    public float shadowRadius;
    public float strokeWidth;
    public int textAlign;
    public int textColor;
    
    static {
        Covode.recordClassIndex(2847);
    }
    
    public TextLayoutParam() {
        this.fontSize = 16.0f;
        this.lineSpacingMult = 1.0f;
    }
}
