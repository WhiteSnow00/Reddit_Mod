// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import ag0.a;
import ah2.f;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;
import java.io.Serializable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001DB\u0081\u0001\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bB\u0010CJ\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u008a\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00052\b\b\u0003\u0010\u0017\u001a\u00020\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001¢\u0006\u0004\b\u001f\u0010 J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010&\u001a\u00020\u0010H\u00d6\u0001J\u0019\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0010H\u00d6\u0001R$\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b4\u0010.R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b5\u0010.R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b6\u0010.R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b7\u0010.R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010;\u001a\u0004\b<\u0010\u000fR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001d\u0010=\u001a\u0004\b>\u0010\u0012R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u001e\u0010?\u001a\u0004\b@\u0010A¨\u0006E" }, d2 = { "Lcom/reddit/domain/model/Flair;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "", "Lcom/reddit/domain/model/FlairRichTextItem;", "component7", "component8", "()Ljava/lang/Boolean;", "", "component9", "()Ljava/lang/Integer;", "Lcom/reddit/domain/model/AllowableContent;", "component10", "text", "textEditable", "id", "type", "backgroundColor", "textColor", "richtext", "modOnly", "maxEmojis", "allowableContent", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/reddit/domain/model/AllowableContent;)Lcom/reddit/domain/model/Flair;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Z", "getTextEditable", "()Z", "getId", "getType", "getBackgroundColor", "getTextColor", "Ljava/util/List;", "getRichtext", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getModOnly", "Ljava/lang/Integer;", "getMaxEmojis", "Lcom/reddit/domain/model/AllowableContent;", "getAllowableContent", "()Lcom/reddit/domain/model/AllowableContent;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/reddit/domain/model/AllowableContent;)V", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class Flair implements Serializable, Parcelable
{
    public static final Parcelable$Creator<Flair> CREATOR;
    public static final Companion Companion;
    public static final String DEFAULT_BACKGROUND_COLOR = "#E2E5E9";
    public static final int DEFAULT_MAX_EMOJIS = 10;
    public static final String TEXT_COLOR_DARK = "dark";
    public static final String TEXT_COLOR_LIGHT = "light";
    private final AllowableContent allowableContent;
    private final String backgroundColor;
    private final String id;
    private final Integer maxEmojis;
    private final Boolean modOnly;
    private final List<FlairRichTextItem> richtext;
    private String text;
    private final String textColor;
    private final boolean textEditable;
    private final String type;
    
    static {
        Companion = new Companion(null);
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public Flair(@n(name = "text") final String text, @n(name = "text_editable") final boolean textEditable, @n(name = "id") final String id, @n(name = "type") final String type, @n(name = "background_color") final String backgroundColor, @n(name = "text_color") final String textColor, @n(name = "richtext") final List<FlairRichTextItem> richtext, @n(name = "mod_only") final Boolean modOnly, @n(name = "max_emojis") final Integer maxEmojis, @n(name = "allowable_content") final AllowableContent allowableContent) {
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
    
    public final Flair copy(@n(name = "text") final String s, @n(name = "text_editable") final boolean b, @n(name = "id") final String s2, @n(name = "type") final String s3, @n(name = "background_color") final String s4, @n(name = "text_color") final String s5, @n(name = "richtext") final List<FlairRichTextItem> list, @n(name = "mod_only") final Boolean b2, @n(name = "max_emojis") final Integer n, @n(name = "allowable_content") final AllowableContent allowableContent) {
        f.f((Object)s2, "id");
        return new Flair(s, b, s2, s3, s4, s5, list, b2, n, allowableContent);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Flair)) {
            return false;
        }
        final Flair flair = (Flair)o;
        return f.a((Object)this.text, (Object)flair.text) && this.textEditable == flair.textEditable && f.a((Object)this.id, (Object)flair.id) && f.a((Object)this.type, (Object)flair.type) && f.a((Object)this.backgroundColor, (Object)flair.backgroundColor) && f.a((Object)this.textColor, (Object)flair.textColor) && f.a((Object)this.richtext, (Object)flair.richtext) && f.a((Object)this.modOnly, (Object)flair.modOnly) && f.a((Object)this.maxEmojis, (Object)flair.maxEmojis) && this.allowableContent == flair.allowableContent;
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
    
    public final void setText(final String text) {
        this.text = text;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Flair(text=");
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
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.text);
        parcel.writeInt((int)(this.textEditable ? 1 : 0));
        parcel.writeString(this.id);
        parcel.writeString(this.type);
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.textColor);
        final List<FlairRichTextItem> richtext = this.richtext;
        if (richtext == null) {
            parcel.writeInt(0);
        }
        else {
            final Iterator o = b.o(parcel, 1, (List)richtext);
            while (o.hasNext()) {
                ((FlairRichTextItem)o.next()).writeToParcel(parcel, n);
            }
        }
        final Boolean modOnly = this.modOnly;
        if (modOnly == null) {
            parcel.writeInt(0);
        }
        else {
            a.w(parcel, 1, modOnly);
        }
        final Integer maxEmojis = this.maxEmojis;
        if (maxEmojis == null) {
            parcel.writeInt(0);
        }
        else {
            a.x(parcel, 1, maxEmojis);
        }
        final AllowableContent allowableContent = this.allowableContent;
        if (allowableContent == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeString(((Enum)allowableContent).name());
        }
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t" }, d2 = { "Lcom/reddit/domain/model/Flair$Companion;", "", "()V", "DEFAULT_BACKGROUND_COLOR", "", "DEFAULT_MAX_EMOJIS", "", "TEXT_COLOR_DARK", "TEXT_COLOR_LIGHT", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<Flair>
    {
        public final Flair createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final int int1 = parcel.readInt();
            boolean b = true;
            final boolean b2 = int1 != 0;
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final String string4 = parcel.readString();
            final String string5 = parcel.readString();
            ArrayList list;
            if (parcel.readInt() == 0) {
                list = null;
            }
            else {
                final int int2 = parcel.readInt();
                list = new ArrayList(int2);
                for (int i = 0; i != int2; i = a.c((Parcelable$Creator)FlairRichTextItem.CREATOR, parcel, list, i, 1)) {}
            }
            Boolean value;
            if (parcel.readInt() == 0) {
                value = null;
            }
            else {
                if (parcel.readInt() == 0) {
                    b = false;
                }
                value = b;
            }
            Integer value2;
            if (parcel.readInt() == 0) {
                value2 = null;
            }
            else {
                value2 = parcel.readInt();
            }
            AllowableContent value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = AllowableContent.valueOf(parcel.readString());
            }
            return new Flair(string, b2, string2, string3, string4, string5, list, value, value2, value3);
        }
        
        public final Flair[] newArray(final int n) {
            return new Flair[n];
        }
    }
}
