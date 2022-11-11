// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ag0.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010.\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003¢\u0006\u0002\u0010\u0019J\u0088\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u00020\u000fH\u00d6\u0001J\t\u00104\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016¨\u00065" }, d2 = { "Lcom/reddit/domain/model/FlairPostResponse;", "", "text", "", "textEditable", "", "id", "type", "backgroundColor", "textColor", "richtext", "", "Lcom/reddit/domain/model/FlairRichTextItem;", "modOnly", "maxEmojis", "", "allowableContent", "Lcom/reddit/domain/model/AllowableContent;", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/reddit/domain/model/AllowableContent;)V", "getAllowableContent", "()Lcom/reddit/domain/model/AllowableContent;", "getBackgroundColor", "()Ljava/lang/String;", "getId", "getMaxEmojis", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getModOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRichtext", "()Ljava/util/List;", "getText", "getTextColor", "getTextEditable", "()Z", "getType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/reddit/domain/model/AllowableContent;)Lcom/reddit/domain/model/FlairPostResponse;", "equals", "other", "hashCode", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class FlairPostResponse
{
    private final AllowableContent allowableContent;
    private final String backgroundColor;
    private final String id;
    private final Integer maxEmojis;
    private final Boolean modOnly;
    private final List<FlairRichTextItem> richtext;
    private final String text;
    private final String textColor;
    private final boolean textEditable;
    private final String type;
    
    public FlairPostResponse(final String text, final boolean textEditable, final String id, final String type, final String backgroundColor, final String textColor, final List<FlairRichTextItem> richtext, final Boolean modOnly, final Integer maxEmojis, final AllowableContent allowableContent) {
        f.f((Object)id, "id");
        this.text = text;
        this.textEditable = textEditable;
        this.id = id;
        this.type = type;
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.richtext = richtext;
        this.modOnly = modOnly;
        this.maxEmojis = maxEmojis;
        this.allowableContent = allowableContent;
    }
    
    public final String component1() {
        return this.text;
    }
    
    public final AllowableContent component10() {
        return this.allowableContent;
    }
    
    public final boolean component2() {
        return this.textEditable;
    }
    
    public final String component3() {
        return this.id;
    }
    
    public final String component4() {
        return this.type;
    }
    
    public final String component5() {
        return this.backgroundColor;
    }
    
    public final String component6() {
        return this.textColor;
    }
    
    public final List<FlairRichTextItem> component7() {
        return this.richtext;
    }
    
    public final Boolean component8() {
        return this.modOnly;
    }
    
    public final Integer component9() {
        return this.maxEmojis;
    }
    
    public final FlairPostResponse copy(final String s, final boolean b, final String s2, final String s3, final String s4, final String s5, final List<FlairRichTextItem> list, final Boolean b2, final Integer n, final AllowableContent allowableContent) {
        f.f((Object)s2, "id");
        return new FlairPostResponse(s, b, s2, s3, s4, s5, list, b2, n, allowableContent);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlairPostResponse)) {
            return false;
        }
        final FlairPostResponse flairPostResponse = (FlairPostResponse)o;
        return f.a((Object)this.text, (Object)flairPostResponse.text) && this.textEditable == flairPostResponse.textEditable && f.a((Object)this.id, (Object)flairPostResponse.id) && f.a((Object)this.type, (Object)flairPostResponse.type) && f.a((Object)this.backgroundColor, (Object)flairPostResponse.backgroundColor) && f.a((Object)this.textColor, (Object)flairPostResponse.textColor) && f.a((Object)this.richtext, (Object)flairPostResponse.richtext) && f.a((Object)this.modOnly, (Object)flairPostResponse.modOnly) && f.a((Object)this.maxEmojis, (Object)flairPostResponse.maxEmojis) && this.allowableContent == flairPostResponse.allowableContent;
    }
    
    public final AllowableContent getAllowableContent() {
        return this.allowableContent;
    }
    
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final Integer getMaxEmojis() {
        return this.maxEmojis;
    }
    
    public final Boolean getModOnly() {
        return this.modOnly;
    }
    
    public final List<FlairRichTextItem> getRichtext() {
        return this.richtext;
    }
    
    public final String getText() {
        return this.text;
    }
    
    public final String getTextColor() {
        return this.textColor;
    }
    
    public final boolean getTextEditable() {
        return this.textEditable;
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
        int textEditable;
        if ((textEditable = (this.textEditable ? 1 : 0)) != 0) {
            textEditable = 1;
        }
        final int f = a.f(this.id, (hashCode2 * 31 + textEditable) * 31, 31);
        final String type = this.type;
        int hashCode3;
        if (type == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = type.hashCode();
        }
        final String backgroundColor = this.backgroundColor;
        int hashCode4;
        if (backgroundColor == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = backgroundColor.hashCode();
        }
        final String textColor = this.textColor;
        int hashCode5;
        if (textColor == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = textColor.hashCode();
        }
        final List<FlairRichTextItem> richtext = this.richtext;
        int hashCode6;
        if (richtext == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = richtext.hashCode();
        }
        final Boolean modOnly = this.modOnly;
        int hashCode7;
        if (modOnly == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = modOnly.hashCode();
        }
        final Integer maxEmojis = this.maxEmojis;
        int hashCode8;
        if (maxEmojis == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = maxEmojis.hashCode();
        }
        final AllowableContent allowableContent = this.allowableContent;
        if (allowableContent != null) {
            hashCode = allowableContent.hashCode();
        }
        return ((((((f + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("FlairPostResponse(text=");
        k.append(this.text);
        k.append(", textEditable=");
        k.append(this.textEditable);
        k.append(", id=");
        k.append(this.id);
        k.append(", type=");
        k.append(this.type);
        k.append(", backgroundColor=");
        k.append(this.backgroundColor);
        k.append(", textColor=");
        k.append(this.textColor);
        k.append(", richtext=");
        k.append(this.richtext);
        k.append(", modOnly=");
        k.append(this.modOnly);
        k.append(", maxEmojis=");
        k.append(this.maxEmojis);
        k.append(", allowableContent=");
        k.append(this.allowableContent);
        k.append(')');
        return k.toString();
    }
}
