// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import ag0.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.squareup.moshi.n;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;
import java.io.Serializable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b)\u0010*J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J7\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u00d6\u0001R$\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR$\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u0011\u0010(\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+" }, d2 = { "Lcom/reddit/domain/model/FlairRichTextItem;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "emojiMarkup", "typeString", "emojiUrl", "text", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getEmojiMarkup", "()Ljava/lang/String;", "setEmojiMarkup", "(Ljava/lang/String;)V", "getTypeString", "setTypeString", "getEmojiUrl", "setEmojiUrl", "getText", "setText", "Lcom/reddit/domain/model/FlairRichTextItemType;", "getType", "()Lcom/reddit/domain/model/FlairRichTextItemType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class FlairRichTextItem implements Serializable, Parcelable
{
    public static final Parcelable$Creator<FlairRichTextItem> CREATOR;
    private String emojiMarkup;
    private String emojiUrl;
    private String text;
    private String typeString;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public FlairRichTextItem(@n(name = "a") final String emojiMarkup, @n(name = "e") final String typeString, @n(name = "u") final String emojiUrl, @n(name = "t") final String text) {
        f.f((Object)typeString, "typeString");
        this.emojiMarkup = emojiMarkup;
        this.typeString = typeString;
        this.emojiUrl = emojiUrl;
        this.text = text;
    }
    
    public final String component1() {
        return this.emojiMarkup;
    }
    
    public final String component2() {
        return this.typeString;
    }
    
    public final String component3() {
        return this.emojiUrl;
    }
    
    public final String component4() {
        return this.text;
    }
    
    public final FlairRichTextItem copy(@n(name = "a") final String s, @n(name = "e") final String s2, @n(name = "u") final String s3, @n(name = "t") final String s4) {
        f.f((Object)s2, "typeString");
        return new FlairRichTextItem(s, s2, s3, s4);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlairRichTextItem)) {
            return false;
        }
        final FlairRichTextItem flairRichTextItem = (FlairRichTextItem)o;
        return f.a((Object)this.emojiMarkup, (Object)flairRichTextItem.emojiMarkup) && f.a((Object)this.typeString, (Object)flairRichTextItem.typeString) && f.a((Object)this.emojiUrl, (Object)flairRichTextItem.emojiUrl) && f.a((Object)this.text, (Object)flairRichTextItem.text);
    }
    
    public final String getEmojiMarkup() {
        return this.emojiMarkup;
    }
    
    public final String getEmojiUrl() {
        return this.emojiUrl;
    }
    
    public final String getText() {
        return this.text;
    }
    
    public final FlairRichTextItemType getType() {
        FlairRichTextItemType flairRichTextItemType;
        if (f.a((Object)this.typeString, (Object)"text")) {
            flairRichTextItemType = FlairRichTextItemType.Text;
        }
        else {
            flairRichTextItemType = FlairRichTextItemType.Emoji;
        }
        return flairRichTextItemType;
    }
    
    public final String getTypeString() {
        return this.typeString;
    }
    
    @Override
    public int hashCode() {
        final String emojiMarkup = this.emojiMarkup;
        int hashCode = 0;
        int hashCode2;
        if (emojiMarkup == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = emojiMarkup.hashCode();
        }
        final int f = a.f(this.typeString, hashCode2 * 31, 31);
        final String emojiUrl = this.emojiUrl;
        int hashCode3;
        if (emojiUrl == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = emojiUrl.hashCode();
        }
        final String text = this.text;
        if (text != null) {
            hashCode = text.hashCode();
        }
        return (f + hashCode3) * 31 + hashCode;
    }
    
    public final void setEmojiMarkup(final String emojiMarkup) {
        this.emojiMarkup = emojiMarkup;
    }
    
    public final void setEmojiUrl(final String emojiUrl) {
        this.emojiUrl = emojiUrl;
    }
    
    public final void setText(final String text) {
        this.text = text;
    }
    
    public final void setTypeString(final String typeString) {
        f.f((Object)typeString, "<set-?>");
        this.typeString = typeString;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("FlairRichTextItem(emojiMarkup=");
        k.append(this.emojiMarkup);
        k.append(", typeString=");
        k.append(this.typeString);
        k.append(", emojiUrl=");
        k.append(this.emojiUrl);
        k.append(", text=");
        return b.k(k, this.text, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.emojiMarkup);
        parcel.writeString(this.typeString);
        parcel.writeString(this.emojiUrl);
        parcel.writeString(this.text);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<FlairRichTextItem>
    {
        public final FlairRichTextItem createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            return new FlairRichTextItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
        
        public final FlairRichTextItem[] newArray(final int n) {
            return new FlairRichTextItem[n];
        }
    }
}
