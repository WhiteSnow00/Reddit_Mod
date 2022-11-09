// 
// Decompiled by Procyon v0.6.0
// 

package tb;

import androidx.viewpager.widget.c;
import ak0.n;
import ag0.a;
import com.google.android.exoplayer2.r$a;
import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import qb.a$b;

@Deprecated
public class b implements a$b
{
    public static final Parcelable$Creator<b> CREATOR;
    public final String f;
    public final String g;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<b>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new b(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new b[n];
            }
        };
    }
    
    public b(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = c0.a;
        this.f = string;
        this.g = parcel.readString();
    }
    
    public b(final String f, final String g) {
        this.f = f;
        this.g = g;
    }
    
    public final void Q(final r$a r$a) {
        final String f = this.f;
        f.getClass();
        final int hashCode = f.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1939198791: {
                if (!f.equals("ARTIST")) {
                    break;
                }
                n = 4;
                break;
            }
            case 1746739798: {
                if (!f.equals("ALBUMARTIST")) {
                    break;
                }
                n = 3;
                break;
            }
            case 428414940: {
                if (!f.equals("DESCRIPTION")) {
                    break;
                }
                n = 2;
                break;
            }
            case 79833656: {
                if (!f.equals("TITLE")) {
                    break;
                }
                n = 1;
                break;
            }
            case 62359119: {
                if (!f.equals("ALBUM")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            case 4: {
                r$a.b = this.g;
                break;
            }
            case 3: {
                r$a.d = this.g;
                break;
            }
            case 2: {
                r$a.g = this.g;
                break;
            }
            case 1: {
                r$a.a = this.g;
                break;
            }
            case 0: {
                r$a.c = this.g;
                break;
            }
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final b b2 = (b)o;
            if (!this.f.equals(b2.f) || !this.g.equals(b2.g)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.g.hashCode() + a.f(this.f, 527, 31);
    }
    
    @Override
    public final String toString() {
        final String f = this.f;
        final String g = this.g;
        return c.f(n.f(g, n.f(f, 5)), "VC: ", f, "=", g);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
