// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d" }, d2 = { "Lcom/reddit/data/model/AuthorFlair;", "", "text", "", "type", "textColor", "richtext", "template", "Lcom/reddit/data/model/FlairTemplate;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/data/model/FlairTemplate;)V", "getRichtext", "()Ljava/lang/String;", "getTemplate", "()Lcom/reddit/data/model/FlairTemplate;", "getText", "getTextColor", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AuthorFlair
{
    private final String richtext;
    private final FlairTemplate template;
    private final String text;
    private final String textColor;
    private final String type;
    
    public AuthorFlair(final String text, final String type, final String textColor, final String richtext, final FlairTemplate template) {
        this.text = text;
        this.type = type;
        this.textColor = textColor;
        this.richtext = richtext;
        this.template = template;
    }
    
    public final String component1() {
        return this.text;
    }
    
    public final String component2() {
        return this.type;
    }
    
    public final String component3() {
        return this.textColor;
    }
    
    public final String component4() {
        return this.richtext;
    }
    
    public final FlairTemplate component5() {
        return this.template;
    }
    
    public final AuthorFlair copy(final String s, final String s2, final String s3, final String s4, final FlairTemplate flairTemplate) {
        return new AuthorFlair(s, s2, s3, s4, flairTemplate);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthorFlair)) {
            return false;
        }
        final AuthorFlair authorFlair = (AuthorFlair)o;
        return f.a((Object)this.text, (Object)authorFlair.text) && f.a((Object)this.type, (Object)authorFlair.type) && f.a((Object)this.textColor, (Object)authorFlair.textColor) && f.a((Object)this.richtext, (Object)authorFlair.richtext) && f.a((Object)this.template, (Object)authorFlair.template);
    }
    
    public final String getRichtext() {
        return this.richtext;
    }
    
    public final FlairTemplate getTemplate() {
        return this.template;
    }
    
    public final String getText() {
        return this.text;
    }
    
    public final String getTextColor() {
        return this.textColor;
    }
    
    public final String getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final String text = this.text;
        int hashCode = 0;
        int hashCode2;
        if (text == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = text.hashCode();
        }
        final String type = this.type;
        int hashCode3;
        if (type == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = type.hashCode();
        }
        final String textColor = this.textColor;
        int hashCode4;
        if (textColor == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = textColor.hashCode();
        }
        final String richtext = this.richtext;
        int hashCode5;
        if (richtext == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = richtext.hashCode();
        }
        final FlairTemplate template = this.template;
        if (template != null) {
            hashCode = template.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AuthorFlair(text=");
        k.append(this.text);
        k.append(", type=");
        k.append(this.type);
        k.append(", textColor=");
        k.append(this.textColor);
        k.append(", richtext=");
        k.append(this.richtext);
        k.append(", template=");
        k.append(this.template);
        k.append(')');
        return k.toString();
    }
}
