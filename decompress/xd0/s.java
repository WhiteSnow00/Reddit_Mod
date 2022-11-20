// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import android.os.Parcel;
import ng2.e;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import io.reactivex.subjects.PublishSubject;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.domain.model.ThumbnailsPreference;
import af2.t;
import com.reddit.domain.model.GeopopularRegionSelectFilter;
import j$.time.Instant;
import com.reddit.domain.model.AccountPreferences$AcceptPrivateMessagesPolicy;
import com.reddit.listing.model.sort.CommentSortType;
import af2.c0;
import cg2.j;
import com.reddit.domain.model.AccountPreferences;
import gg2.c;
import com.reddit.domain.model.CarouselCollectionState;
import mg2.l;
import af2.a;

public interface s
{
    af2.a A(final int p0, final String p1);
    
    af2.a B(final boolean p0);
    
    af2.a C(final boolean p0);
    
    af2.a D(final a p0, final l<? super CarouselCollectionState, CarouselCollectionState> p1);
    
    af2.a E(final String p0);
    
    af2.a F(final String p0);
    
    boolean G();
    
    af2.a H(final String p0, final boolean p1);
    
    String I();
    
    boolean J();
    
    boolean K();
    
    boolean L();
    
    Object M(final c<? super AccountPreferences> p0);
    
    Object N(final boolean p0, final c<? super j> p1);
    
    c0<Boolean> O(final String p0);
    
    boolean P();
    
    c0<Boolean> Q(final String p0);
    
    c0<CommentSortType> R();
    
    int S(final int p0, final String p1);
    
    AccountPreferences$AcceptPrivateMessagesPolicy T();
    
    Object U(final boolean p0, final c<? super j> p1);
    
    af2.a V();
    
    Object W(final String p0, final String p1, final c<? super Long> p2);
    
    Object X(final c<? super Instant> p0);
    
    Object Y(final String p0, final c<? super j> p1);
    
    af2.a Z(final String p0);
    
    GeopopularRegionSelectFilter a();
    
    boolean a0();
    
    t b();
    
    af2.a b0();
    
    af2.a c(final CommentSortType p0);
    
    c0<CarouselCollectionState> c0(final a p0);
    
    void d(final boolean p0);
    
    int d0();
    
    ThumbnailsPreference e();
    
    af2.a e0(final GeopopularRegionSelectFilter p0);
    
    Object f(final AccountPreferences$AcceptPrivateMessagesPolicy p0, final c<? super j> p1);
    
    String f0();
    
    boolean g();
    
    Object g0(final boolean p0, final c<? super j> p1);
    
    ListingViewMode h();
    
    void h0();
    
    boolean i(final String p0);
    
    af2.a i0(final boolean p0);
    
    c0<Boolean> j(final String p0, final boolean p1);
    
    int j0();
    
    void k(final String p0);
    
    af2.a k0(final ListingViewMode p0);
    
    boolean l();
    
    void m();
    
    void n();
    
    af2.a o(final ThumbnailsPreference p0);
    
    af2.a p(final String p0);
    
    void q();
    
    c0<Boolean> r(final String p0);
    
    boolean s();
    
    Object t(final Instant p0, final c<? super j> p1);
    
    PublishSubject u();
    
    af2.a v(final String p0, final ListingViewMode p1);
    
    t<ListingViewMode> w();
    
    boolean w3();
    
    Object x(final String p0, final String p1, final c<? super Integer> p2);
    
    Object y(final String p0, final String p1, final c<? super Integer> p2);
    
    ListingViewMode z(final String p0, final ListingViewMode p1);
    
    public static final class a implements Parcelable
    {
        public static final Parcelable$Creator<s.a> CREATOR;
        public final String f;
        public final String g;
        public final String h;
        
        static {
            CREATOR = (Parcelable$Creator)new s.a.a();
        }
        
        public a() {
            this(0);
        }
        
        public a(final int n) {
            this("", "", "");
        }
        
        public a(final String f, final String g, final String h) {
            b.w(f, "surface", g, "uniqueId", h, "customKey");
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        public final int describeContents() {
            return 0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof s.a)) {
                return false;
            }
            final s.a a = (s.a)o;
            return e.a((Object)this.f, (Object)a.f) && e.a((Object)this.g, (Object)a.g) && e.a((Object)this.h, (Object)a.h);
        }
        
        @Override
        public final int hashCode() {
            return this.h.hashCode() + aq2.a.e(this.g, this.f.hashCode() * 31, 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.f);
            sb.append('-');
            sb.append(this.g);
            sb.append('-');
            sb.append(this.h);
            return sb.toString();
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            e.f((Object)parcel, "out");
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
        }
        
        public static final class a implements Parcelable$Creator<s.a>
        {
            public final Object createFromParcel(final Parcel parcel) {
                e.f((Object)parcel, "parcel");
                return new s.a(parcel.readString(), parcel.readString(), parcel.readString());
            }
            
            public final Object[] newArray(final int n) {
                return new s.a[n];
            }
        }
    }
}
