// 
// Decompiled by Procyon v0.6.0
// 

package ra2;

import x82.i;
import java.io.Serializable;
import android.os.Parcel;
import al0.f0;
import sg2.e;
import android.os.Parcelable$Creator;
import x82.a;
import java.math.BigInteger;
import android.os.Parcelable;

public abstract class g implements Parcelable
{
    public final BigInteger f;
    public final x82.a g;
    
    public g(final BigInteger f, final x82.a g) {
        this.f = f;
        this.g = g;
    }
    
    public BigInteger c() {
        return this.f;
    }
    
    public static final class a extends g
    {
        public static final Parcelable$Creator<g.a> CREATOR;
        public final String h;
        public final String i;
        public final BigInteger j;
        public final String k;
        
        static {
            CREATOR = (Parcelable$Creator)new g.a.a();
        }
        
        public a(final String h, final String i, final String k, final BigInteger j) {
            e.f((Object)h, "memo");
            e.f((Object)i, "subredditId");
            e.f((Object)j, "price");
            e.f((Object)k, "successMessage");
            super(j, null);
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
        }
        
        @Override
        public final BigInteger c() {
            return this.j;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof g.a)) {
                return false;
            }
            final g.a a = (g.a)o;
            return e.a((Object)this.h, (Object)a.h) && e.a((Object)this.i, (Object)a.i) && e.a((Object)this.j, (Object)a.j) && e.a((Object)this.k, (Object)a.k);
        }
        
        @Override
        public final int hashCode() {
            return this.k.hashCode() + d.f(this.j, b.c(this.i, this.h.hashCode() * 31, 31), 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("BurnWithMemo(memo=");
            r.append(this.h);
            r.append(", subredditId=");
            r.append(this.i);
            r.append(", price=");
            r.append(this.j);
            r.append(", successMessage=");
            return f0.n(r, this.k, ')');
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            e.f((Object)parcel, "out");
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeSerializable((Serializable)this.j);
            parcel.writeString(this.k);
        }
        
        public static final class a implements Parcelable$Creator<g.a>
        {
            public final Object createFromParcel(final Parcel parcel) {
                e.f((Object)parcel, "parcel");
                return new g.a(parcel.readString(), parcel.readString(), parcel.readString(), (BigInteger)parcel.readSerializable());
            }
            
            public final Object[] newArray(final int n) {
                return new g.a[n];
            }
        }
    }
    
    public static final class b extends g
    {
        public static final Parcelable$Creator<b> CREATOR;
        public final String h;
        public final int i;
        public final BigInteger j;
        public final String k;
        public final int l;
        public final String m;
        public final ba2.a n;
        
        static {
            CREATOR = (Parcelable$Creator)new a();
        }
        
        public b(final String h, final int i, final BigInteger j, final String k, final int l, final String m, final ba2.a n) {
            e.f((Object)h, "productId");
            e.f((Object)j, "perCoinPrice");
            e.f((Object)k, "pricePackageId");
            e.f((Object)m, "subredditId");
            e.f((Object)n, "bundle");
            final BigInteger value = BigInteger.valueOf(l);
            e.e((Object)value, "valueOf(this.toLong())");
            final BigInteger multiply = j.multiply(value);
            e.e((Object)multiply, "this.multiply(other)");
            super(multiply, null);
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return e.a((Object)this.h, (Object)b.h) && this.i == b.i && e.a((Object)this.j, (Object)b.j) && e.a((Object)this.k, (Object)b.k) && this.l == b.l && e.a((Object)this.m, (Object)b.m) && e.a((Object)this.n, (Object)b.n);
        }
        
        @Override
        public final int hashCode() {
            return this.n.hashCode() + b.c(this.m, a.c(this.l, b.c(this.k, d.f(this.j, a.c(this.i, this.h.hashCode() * 31, 31), 31), 31), 31), 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("PurchaseCoins(productId=");
            r.append(this.h);
            r.append(", productVersion=");
            r.append(this.i);
            r.append(", perCoinPrice=");
            r.append(this.j);
            r.append(", pricePackageId=");
            r.append(this.k);
            r.append(", count=");
            r.append(this.l);
            r.append(", subredditId=");
            r.append(this.m);
            r.append(", bundle=");
            r.append(this.n);
            r.append(')');
            return r.toString();
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            e.f((Object)parcel, "out");
            parcel.writeString(this.h);
            parcel.writeInt(this.i);
            parcel.writeSerializable((Serializable)this.j);
            parcel.writeString(this.k);
            parcel.writeInt(this.l);
            parcel.writeString(this.m);
            this.n.writeToParcel(parcel, n);
        }
        
        public static final class a implements Parcelable$Creator<b>
        {
            public final Object createFromParcel(final Parcel parcel) {
                e.f((Object)parcel, "parcel");
                return new b(parcel.readString(), parcel.readInt(), (BigInteger)parcel.readSerializable(), parcel.readString(), parcel.readInt(), parcel.readString(), (ba2.a)ba2.a.CREATOR.createFromParcel(parcel));
            }
            
            public final Object[] newArray(final int n) {
                return new b[n];
            }
        }
    }
    
    public static final class c extends g
    {
        public static final Parcelable$Creator<c> CREATOR;
        public final i h;
        
        static {
            CREATOR = (Parcelable$Creator)new a();
        }
        
        public c(final i h) {
            e.f((Object)h, "communityMembershipInfo");
            super(h.f, h.i);
            this.h = h;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && e.a((Object)this.h, (Object)((c)o).h));
        }
        
        @Override
        public final int hashCode() {
            return this.h.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("PurchaseSpecialMembership(communityMembershipInfo=");
            r.append(this.h);
            r.append(')');
            return r.toString();
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            e.f((Object)parcel, "out");
            parcel.writeParcelable((Parcelable)this.h, n);
        }
        
        public static final class a implements Parcelable$Creator<c>
        {
            public final Object createFromParcel(final Parcel parcel) {
                e.f((Object)parcel, "parcel");
                return new c((i)parcel.readParcelable(c.class.getClassLoader()));
            }
            
            public final Object[] newArray(final int n) {
                return new c[n];
            }
        }
    }
}
