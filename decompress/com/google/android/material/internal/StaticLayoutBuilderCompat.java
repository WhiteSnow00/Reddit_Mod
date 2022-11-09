// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.StaticLayout$Builder;
import android.text.TextUtils;
import android.text.StaticLayout;
import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import android.text.TextPaint;

public final class StaticLayoutBuilderCompat
{
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public Layout$Alignment e;
    public int f;
    public boolean g;
    public boolean h;
    public TextUtils$TruncateAt i;
    
    public StaticLayoutBuilderCompat(final int c, final CharSequence a, final TextPaint b) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = a.length();
        this.e = Layout$Alignment.ALIGN_NORMAL;
        this.f = Integer.MAX_VALUE;
        this.g = true;
        this.i = null;
    }
    
    public final StaticLayout a() throws StaticLayoutBuilderCompatException {
        if (this.a == null) {
            this.a = "";
        }
        final int max = Math.max(0, this.c);
        CharSequence charSequence2;
        final CharSequence charSequence = charSequence2 = this.a;
        if (this.f == 1) {
            charSequence2 = TextUtils.ellipsize(charSequence, this.b, (float)max, this.i);
        }
        final int min = Math.min(charSequence2.length(), this.d);
        this.d = min;
        if (this.h) {
            this.e = Layout$Alignment.ALIGN_OPPOSITE;
        }
        final StaticLayout$Builder obtain = StaticLayout$Builder.obtain(charSequence2, 0, min, this.b, max);
        obtain.setAlignment(this.e);
        obtain.setIncludePad(this.g);
        TextDirectionHeuristic textDirection;
        if (this.h) {
            textDirection = TextDirectionHeuristics.RTL;
        }
        else {
            textDirection = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirection);
        final TextUtils$TruncateAt i = this.i;
        if (i != null) {
            obtain.setEllipsize(i);
        }
        obtain.setMaxLines(this.f);
        return obtain.build();
    }
    
    public static class StaticLayoutBuilderCompatException extends Exception
    {
        public StaticLayoutBuilderCompatException(final Throwable t) {
            final StringBuilder k = a.k("Error thrown initializing StaticLayout ");
            k.append(t.getMessage());
            super(k.toString(), t);
        }
    }
}
