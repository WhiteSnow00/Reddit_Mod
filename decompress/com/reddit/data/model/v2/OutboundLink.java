// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v2;

import androidx.viewpager.widget.c;
import android.os.Parcel;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;
import java.io.Serializable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b&\u0010'J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0004\b\b\u0010\u0007J4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u000fH\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u00d6\u0001R$\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010#R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010 \u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010#¨\u0006(" }, d2 = { "Lcom/reddit/data/model/v2/OutboundLink;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "()Ljava/lang/Long;", "component3", "url", "expiration", "created", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/reddit/data/model/v2/OutboundLink;", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "Ljava/lang/Long;", "getExpiration", "setExpiration", "(Ljava/lang/Long;)V", "getCreated", "setCreated", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class OutboundLink implements Serializable, Parcelable
{
    public static final Parcelable$Creator<OutboundLink> CREATOR;
    private Long created;
    private Long expiration;
    private String url;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public OutboundLink() {
        this(null, null, null, 7, null);
    }
    
    public OutboundLink(final String url, final Long expiration, final Long created) {
        this.url = url;
        this.expiration = expiration;
        this.created = created;
    }
    
    public final String component1() {
        return this.url;
    }
    
    public final Long component2() {
        return this.expiration;
    }
    
    public final Long component3() {
        return this.created;
    }
    
    public final OutboundLink copy(final String s, final Long n, final Long n2) {
        return new OutboundLink(s, n, n2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OutboundLink)) {
            return false;
        }
        final OutboundLink outboundLink = (OutboundLink)o;
        return f.a((Object)this.url, (Object)outboundLink.url) && f.a((Object)this.expiration, (Object)outboundLink.expiration) && f.a((Object)this.created, (Object)outboundLink.created);
    }
    
    public final Long getCreated() {
        return this.created;
    }
    
    public final Long getExpiration() {
        return this.expiration;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        final String url = this.url;
        int hashCode = 0;
        int hashCode2;
        if (url == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = url.hashCode();
        }
        final Long expiration = this.expiration;
        int hashCode3;
        if (expiration == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = expiration.hashCode();
        }
        final Long created = this.created;
        if (created != null) {
            hashCode = created.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    public final void setCreated(final Long created) {
        this.created = created;
    }
    
    public final void setExpiration(final Long expiration) {
        this.expiration = expiration;
    }
    
    public final void setUrl(final String url) {
        this.url = url;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("OutboundLink(url=");
        k.append(this.url);
        k.append(", expiration=");
        k.append(this.expiration);
        k.append(", created=");
        return a40.f.o(k, this.created, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.url);
        final Long expiration = this.expiration;
        if (expiration == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, expiration);
        }
        final Long created = this.created;
        if (created == null) {
            parcel.writeInt(0);
        }
        else {
            c.q(parcel, 1, created);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<OutboundLink>
    {
        public final OutboundLink createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final int int1 = parcel.readInt();
            final Long n = null;
            Long value;
            if (int1 == 0) {
                value = null;
            }
            else {
                value = parcel.readLong();
            }
            Long value2;
            if (parcel.readInt() == 0) {
                value2 = n;
            }
            else {
                value2 = parcel.readLong();
            }
            return new OutboundLink(string, value, value2);
        }
        
        public final OutboundLink[] newArray(final int n) {
            return new OutboundLink[n];
        }
    }
}
