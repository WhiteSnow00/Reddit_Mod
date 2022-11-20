// 
// Decompiled by Procyon v0.6.0
// 

package ad0;

import u10.o;
import java.util.Iterator;
import java.io.Serializable;
import android.os.Parcel;
import b5.k;
import ng2.e;
import java.util.ArrayList;
import mg2.l;
import cg2.j;
import mg2.a;
import java.util.List;
import com.reddit.domain.postsets.model.ShareIconStatus;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class c implements Parcelable
{
    public static final Parcelable$Creator<c> CREATOR;
    public final String f;
    public final ShareIconStatus g;
    public final List<d> h;
    public final mg2.a<j> i;
    public final l<ShareIconStatus, j> j;
    public final l<String, j> k;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public c(final String f, final ShareIconStatus g, final ArrayList h, final mg2.a i, final l j, final l k) {
        e.f((Object)f, "sharedInText");
        e.f((Object)g, "shareIconStatus");
        e.f((Object)i, "sharedInButtonOnClickAction");
        e.f((Object)j, "shareButtonOnClickAction");
        e.f((Object)k, "communitiesButtonOnClickAction");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = (mg2.a<j>)i;
        this.j = (l<ShareIconStatus, j>)j;
        this.k = (l<String, j>)k;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return e.a((Object)this.f, (Object)c.f) && this.g == c.g && e.a((Object)this.h, (Object)c.h) && e.a((Object)this.i, (Object)c.i) && e.a((Object)this.j, (Object)c.j) && e.a((Object)this.k, (Object)c.k);
    }
    
    @Override
    public final int hashCode() {
        return this.k.hashCode() + (this.j.hashCode() + (this.i.hashCode() + ph0.a.b((List)this.h, (this.g.hashCode() + this.f.hashCode() * 31) * 31, 31)) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PostSetCardData(sharedInText=");
        t.append(this.f);
        t.append(", shareIconStatus=");
        t.append(this.g);
        t.append(", communitiesData=");
        t.append(this.h);
        t.append(", sharedInButtonOnClickAction=");
        t.append(this.i);
        t.append(", shareButtonOnClickAction=");
        t.append(this.j);
        t.append(", communitiesButtonOnClickAction=");
        return b5.k.n(t, (l)this.k, ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeString(this.f);
        parcel.writeString(this.g.name());
        final Iterator r = android.support.v4.media.a.r((List)this.h, parcel);
        while (r.hasNext()) {
            ((d)r.next()).writeToParcel(parcel, n);
        }
        parcel.writeSerializable((Serializable)this.i);
        parcel.writeSerializable((Serializable)this.j);
        parcel.writeSerializable((Serializable)this.k);
    }
    
    public static final class a implements Parcelable$Creator<c>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final String string = parcel.readString();
            final ShareIconStatus value = ShareIconStatus.valueOf(parcel.readString());
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i != int1; i = o.c((Parcelable$Creator)d.CREATOR, parcel, list, i, 1)) {}
            return new c(string, value, list, (mg2.a)parcel.readSerializable(), (l)parcel.readSerializable(), (l)parcel.readSerializable());
        }
        
        public final Object[] newArray(final int n) {
            return new c[n];
        }
    }
}
