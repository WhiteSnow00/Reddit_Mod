// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import java.util.Objects;

public class TextCue extends Cue
{
    public final float line;
    public final float position;
    public final float size;
    public final String text;
    public final TextCue.TextCue$TextAlignment textAlign;
    
    public TextCue(final long n, final long n2, final float line, final float size, final float position, final int n3, final String text) {
        super(n, n2);
        this.line = line;
        this.size = size;
        this.position = position;
        this.textAlign = TextCue.TextCue$TextAlignment.fromInt(n3);
        this.text = text;
    }
    
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final TextCue textCue = (TextCue)o;
        if (Float.compare(textCue.line, this.line) != 0 || Float.compare(textCue.size, this.size) != 0 || Float.compare(textCue.position, this.position) != 0 || this.textAlign != textCue.textAlign || !Objects.equals(this.text, textCue.text)) {
            b = false;
        }
        return b;
    }
    
    public int hashCode() {
        return Objects.hash(super.startTime, super.endTime, this.line, this.size, this.position, this.textAlign, this.text);
    }
    
    public String toString() {
        final StringBuilder t = a.t("TextCue{startTime=");
        t.append(super.startTime);
        t.append(", endTime=");
        t.append(super.endTime);
        t.append(", line=");
        t.append(this.line);
        t.append(", size=");
        t.append(this.size);
        t.append(", position=");
        t.append(this.position);
        t.append(", textAlign=");
        t.append(this.textAlign);
        t.append(", text='");
        return d.m(t, this.text, '\'', '}');
    }
}
