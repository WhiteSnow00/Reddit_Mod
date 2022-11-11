// 
// Decompiled by Procyon v0.6.0
// 

package d92;

import android.text.TextUtils;
import android.os.Parcel;
import com.reddit.listing.model.Listable$Type;
import x82.h0;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import com.reddit.listing.model.Listable;

public final class e implements Listable, Parcelable
{
    public static final Parcelable$Creator<e> CREATOR;
    public final CharSequence f;
    public final CharSequence g;
    public final String h;
    public final String i;
    public final String j;
    public final h0 k;
    public final long l;
    public final Listable$Type m;
    
    static {
        CREATOR = (Parcelable$Creator)new e$a();
    }
    
    public e(final CharSequence f, final CharSequence g, final String h, final String i, final String j, final h0 k, final long l) {
        sg2.e.f((Object)f, "title");
        sg2.e.f((Object)g, "body");
        sg2.e.f((Object)h, "userId");
        sg2.e.f((Object)i, "username");
        sg2.e.f((Object)k, "claimablePoints");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = Listable$Type.VAULT_BANNER;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return sg2.e.a((Object)this.f, (Object)e.f) && sg2.e.a((Object)this.g, (Object)e.g) && sg2.e.a((Object)this.h, (Object)e.h) && sg2.e.a((Object)this.i, (Object)e.i) && sg2.e.a((Object)this.j, (Object)e.j) && sg2.e.a((Object)this.k, (Object)e.k) && this.l == e.l;
    }
    
    public final Listable$Type getListableType() {
        return this.m;
    }
    
    public final long getUniqueID() {
        return this.l;
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.i, b.c(this.h, (this.g.hashCode() + this.f.hashCode() * 31) * 31, 31), 31);
        final String j = this.j;
        int hashCode;
        if (j == null) {
            hashCode = 0;
        }
        else {
            hashCode = j.hashCode();
        }
        return Long.hashCode(this.l) + (this.k.hashCode() + (c + hashCode) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("VaultBannerPresentationModel(title=");
        r.append((Object)this.f);
        r.append(", body=");
        r.append((Object)this.g);
        r.append(", userId=");
        r.append(this.h);
        r.append(", username=");
        r.append(this.i);
        r.append(", userIconUrl=");
        r.append(this.j);
        r.append(", claimablePoints=");
        r.append(this.k);
        r.append(", savedUniqueID=");
        return b.i(r, this.l, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        sg2.e.f((Object)parcel, "out");
        TextUtils.writeToParcel(this.f, parcel, n);
        TextUtils.writeToParcel(this.g, parcel, n);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        this.k.writeToParcel(parcel, n);
        parcel.writeLong(this.l);
    }
}
