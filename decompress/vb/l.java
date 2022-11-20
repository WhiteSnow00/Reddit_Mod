// 
// Decompiled by Procyon v0.6.0
// 

package vb;

import u10.o;
import aq2.a;
import com.google.android.exoplayer2.r$a;
import java.util.ArrayList;
import bd.c0;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class l extends h
{
    public static final Parcelable$Creator<l> CREATOR;
    public final String g;
    public final String h;
    
    static {
        CREATOR = (Parcelable$Creator)new l$a();
    }
    
    public l(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = c0.a;
        super(string);
        this.g = parcel.readString();
        this.h = parcel.readString();
    }
    
    public l(final String s, final String g, final String h) {
        super(s);
        this.g = g;
        this.h = h;
    }
    
    public static ArrayList a(final String s) {
        final ArrayList list = new ArrayList();
        try {
            if (s.length() >= 10) {
                list.add(Integer.parseInt(s.substring(0, 4)));
                list.add(Integer.parseInt(s.substring(5, 7)));
                list.add(Integer.parseInt(s.substring(8, 10)));
            }
            else if (s.length() >= 7) {
                list.add(Integer.parseInt(s.substring(0, 4)));
                list.add(Integer.parseInt(s.substring(5, 7)));
            }
            else if (s.length() >= 4) {
                list.add(Integer.parseInt(s.substring(0, 4)));
            }
            return list;
        }
        catch (final NumberFormatException ex) {
            return new ArrayList();
        }
    }
    
    public final void Q(final r$a r$a) {
        final String f = super.f;
        f.getClass();
        int n = 0;
        Label_0618: {
            switch (f) {
                case "TYER": {
                    n = 21;
                    break Label_0618;
                }
                case "TRCK": {
                    n = 20;
                    break Label_0618;
                }
                case "TPE3": {
                    n = 19;
                    break Label_0618;
                }
                case "TPE2": {
                    n = 18;
                    break Label_0618;
                }
                case "TPE1": {
                    n = 17;
                    break Label_0618;
                }
                case "TIT2": {
                    n = 16;
                    break Label_0618;
                }
                case "TEXT": {
                    n = 15;
                    break Label_0618;
                }
                case "TDRL": {
                    n = 14;
                    break Label_0618;
                }
                case "TDRC": {
                    n = 13;
                    break Label_0618;
                }
                case "TDAT": {
                    n = 12;
                    break Label_0618;
                }
                case "TCOM": {
                    n = 11;
                    break Label_0618;
                }
                case "TALB": {
                    n = 10;
                    break Label_0618;
                }
                case "TYE": {
                    n = 9;
                    break Label_0618;
                }
                case "TXT": {
                    n = 8;
                    break Label_0618;
                }
                case "TT2": {
                    n = 7;
                    break Label_0618;
                }
                case "TRK": {
                    n = 6;
                    break Label_0618;
                }
                case "TP3": {
                    n = 5;
                    break Label_0618;
                }
                case "TP2": {
                    n = 4;
                    break Label_0618;
                }
                case "TP1": {
                    n = 3;
                    break Label_0618;
                }
                case "TDA": {
                    n = 2;
                    break Label_0618;
                }
                case "TCM": {
                    n = 1;
                    break Label_0618;
                }
                case "TAL": {
                    n = 0;
                    break Label_0618;
                }
                default:
                    break;
            }
            n = -1;
        }
        Label_1060: {
            switch (n) {
                default: {
                    return;
                }
                case 14: {
                    final ArrayList a = a(this.h);
                    final int size = a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            }
                            r$a.w = (Integer)a.get(2);
                        }
                        r$a.v = (Integer)a.get(1);
                    }
                    r$a.u = (Integer)a.get(0);
                    return;
                }
                case 13: {
                    final ArrayList a2 = a(this.h);
                    final int size2 = a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            }
                            r$a.t = (Integer)a2.get(2);
                        }
                        r$a.s = (Integer)a2.get(1);
                    }
                    r$a.r = (Integer)a2.get(0);
                    return;
                }
                case 9:
                case 21: {
                    break Label_1060;
                }
                case 8:
                case 15: {
                    break Label_1060;
                }
                case 7:
                case 16: {
                    break Label_1060;
                }
                case 6:
                case 20: {
                    break Label_1060;
                }
                case 5:
                case 19: {
                    break Label_1060;
                }
                case 4:
                case 18: {
                    break Label_1060;
                }
                case 3:
                case 17: {
                    break Label_1060;
                }
                case 2:
                case 12: {
                    break Label_1060;
                }
                case 1:
                case 11: {
                    break Label_1060;
                }
                case 0:
                case 10: {
                    Label_1071: {
                        break Label_1071;
                        try {
                            r$a.r = Integer.parseInt(this.h);
                            return;
                            while (true) {
                                final String[] split;
                                Integer value = Integer.parseInt(split[1]);
                                Label_0965: {
                                    break Label_0965;
                                    r$a.z = this.h;
                                    return;
                                    Label_0962: {
                                        value = null;
                                    }
                                    break Label_0965;
                                    r$a.d = this.h;
                                    return;
                                    r$a.b = this.h;
                                    return;
                                    final int int1 = Integer.parseInt(this.h.substring(2, 4));
                                    final int int2 = Integer.parseInt(this.h.substring(0, 2));
                                    r$a.s = int1;
                                    r$a.t = int2;
                                    return;
                                }
                                final int int3;
                                r$a.n = int3;
                                r$a.o = value;
                                return;
                                r$a.y = this.h;
                                return;
                                r$a.c = this.h;
                                return;
                                r$a.a = this.h;
                                return;
                                final String h = this.h;
                                final int a3 = c0.a;
                                split = h.split("/", -1);
                                int3 = Integer.parseInt(split[0]);
                                iftrue(Label_0962:)(split.length <= 1);
                                continue;
                            }
                            r$a.x = this.h;
                            return;
                        }
                        catch (final NumberFormatException | StringIndexOutOfBoundsException ex) {
                            return;
                        }
                    }
                    break;
                }
            }
        }
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && l.class == o.getClass()) {
            final l l = (l)o;
            if (!c0.a((Object)super.f, (Object)l.f) || !c0.a((Object)this.g, (Object)l.g) || !c0.a((Object)this.h, (Object)l.h)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int e = a.e(super.f, 527, 31);
        final String g = this.g;
        int hashCode = 0;
        int hashCode2;
        if (g != null) {
            hashCode2 = g.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return (e + hashCode2) * 31 + hashCode;
    }
    
    public final String toString() {
        final String f = super.f;
        final String g = this.g;
        final String h = this.h;
        final StringBuilder p = d.p(o.e(h, o.e(g, o.e(f, 22))), f, ": description=", g, ": value=");
        p.append(h);
        return p.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}
