// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import android.os.Parcel;
import al0.f0;
import sg2.e;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;
import java.io.Serializable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0004\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0007\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\t\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\bH\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/model/RichTextResponse;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "component1", "richTextString", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhg2/j;", "writeToParcel", "Ljava/lang/String;", "getRichTextString", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RichTextResponse implements Serializable, Parcelable
{
    public static final Parcelable$Creator<RichTextResponse> CREATOR;
    private final String richTextString;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public RichTextResponse(final String richTextString) {
        e.f((Object)richTextString, "richTextString");
        this.richTextString = richTextString;
    }
    
    public final String component1() {
        return this.richTextString;
    }
    
    public final RichTextResponse copy(final String s) {
        e.f((Object)s, "richTextString");
        return new RichTextResponse(s);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof RichTextResponse && e.a((Object)this.richTextString, (Object)((RichTextResponse)o).richTextString));
    }
    
    public final String getRichTextString() {
        return this.richTextString;
    }
    
    @Override
    public int hashCode() {
        return this.richTextString.hashCode();
    }
    
    @Override
    public String toString() {
        return f0.n(a.r("RichTextResponse(richTextString="), this.richTextString, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.richTextString);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<RichTextResponse>
    {
        public final RichTextResponse createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new RichTextResponse(parcel.readString());
        }
        
        public final RichTextResponse[] newArray(final int n) {
            return new RichTextResponse[n];
        }
    }
}
