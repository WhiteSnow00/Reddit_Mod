// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import android.accounts.Account;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcelable;
import dg.d;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class d1 implements Parcelable$Creator<f>
{
    public static void a(final f f, final Parcel parcel, final int n) {
        final int i2 = d.i2(parcel, 20293);
        d.T1(parcel, 1, f.f);
        d.T1(parcel, 2, f.g);
        d.T1(parcel, 3, f.h);
        d.b2(parcel, 4, f.i);
        d.Q1(parcel, 5, f.j);
        d.g2(parcel, 6, (Parcelable[])f.k, n);
        d.P1(parcel, 7, f.l);
        d.Z1(parcel, 8, (Parcelable)f.m, n);
        d.g2(parcel, 10, (Parcelable[])f.n, n);
        d.g2(parcel, 11, (Parcelable[])f.o, n);
        d.N1(parcel, 12, f.p);
        d.T1(parcel, 13, f.q);
        d.N1(parcel, 14, f.r);
        d.b2(parcel, 15, f.s);
        d.w2(parcel, i2);
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        final int o = SafeParcelReader.o(parcel);
        int i;
        int j = i = 0;
        int h;
        int k = h = i;
        int h2;
        int l = h2 = h;
        Object m;
        Object c = m = null;
        Object a;
        Object o2 = a = m;
        Object o4;
        Object o3 = o4 = a;
        Object c2;
        Object[] array = (Object[])(c2 = o4);
        while (parcel.dataPosition() < o) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\u000f': {
                    c2 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u000e': {
                    h2 = (SafeParcelReader.h(parcel, int1) ? 1 : 0);
                    continue;
                }
                case '\r': {
                    l = SafeParcelReader.j(parcel, int1);
                    continue;
                }
                case '\f': {
                    h = (SafeParcelReader.h(parcel, int1) ? 1 : 0);
                    continue;
                }
                case '\u000b': {
                    array = SafeParcelReader.e(parcel, int1, (Parcelable$Creator)od.d.CREATOR);
                    continue;
                }
                case '\n': {
                    o4 = SafeParcelReader.e(parcel, int1, (Parcelable$Creator)od.d.CREATOR);
                    continue;
                }
                case '\b': {
                    o3 = SafeParcelReader.b(parcel, int1, Account.CREATOR);
                    continue;
                }
                case '\u0007': {
                    a = SafeParcelReader.a(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    o2 = SafeParcelReader.e(parcel, int1, Scope.CREATOR);
                    continue;
                }
                case '\u0005': {
                    m = SafeParcelReader.i(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    c = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    k = SafeParcelReader.j(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    i = SafeParcelReader.j(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    j = SafeParcelReader.j(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.g(parcel, o);
        return new f(j, i, k, (String)c, (IBinder)m, (Scope[])o2, (Bundle)a, (Account)o3, (od.d[])o4, (od.d[])array, (boolean)(h != 0), l, (boolean)(h2 != 0), (String)c2);
    }
}
