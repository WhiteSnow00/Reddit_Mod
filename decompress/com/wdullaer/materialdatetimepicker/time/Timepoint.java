// 
// Decompiled by Procyon v0.6.0
// 

package com.wdullaer.materialdatetimepicker.time;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class Timepoint implements Parcelable, Comparable<Timepoint>
{
    public static final Parcelable$Creator<Timepoint> CREATOR;
    public int f;
    public int g;
    public int h;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<Timepoint>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new Timepoint(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new Timepoint[n];
            }
        };
    }
    
    public Timepoint() {
        throw null;
    }
    
    public Timepoint(final int n, final int n2, final int n3) {
        this.f = n % 24;
        this.g = n2 % 60;
        this.h = n3 % 60;
    }
    
    public Timepoint(final Parcel parcel) {
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
    }
    
    public Timepoint(final Timepoint timepoint) {
        this(timepoint.f, timepoint.g, timepoint.h);
    }
    
    public final void a(final TYPE type, int n) {
        int n2 = n;
        if (type == TYPE.MINUTE) {
            n2 = n * 60;
        }
        n = n2;
        if (type == TYPE.HOUR) {
            n = n2 * 3600;
        }
        n += this.e();
        final int n3 = Timepoint$b.a[type.ordinal()];
        Label_0087: {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        return;
                    }
                    break Label_0087;
                }
            }
            else {
                this.h = n % 3600 % 60;
            }
            this.g = n % 3600 / 60;
        }
        this.f = n / 3600 % 24;
    }
    
    public final boolean c(final Timepoint timepoint, final TYPE type) {
        final boolean b = false;
        if (timepoint == null) {
            return false;
        }
        final int n = Timepoint$b.a[type.ordinal()];
        boolean b2 = true;
        boolean b4 = false;
        Label_0085: {
            while (true) {
                boolean b3 = false;
                Label_0065: {
                    Label_0044: {
                        if (n != 1) {
                            if (n == 2) {
                                break Label_0044;
                            }
                            if (n != 3) {
                                return b2;
                            }
                        }
                        else {
                            if (timepoint.h == this.h) {
                                break Label_0044;
                            }
                            b3 = false;
                            break Label_0065;
                        }
                        b4 = true;
                        break Label_0085;
                    }
                    b3 = true;
                }
                if (b3 && timepoint.g == this.g) {
                    continue;
                }
                break;
            }
            b4 = false;
        }
        b2 = b;
        if (b4) {
            b2 = b;
            if (timepoint.f == this.f) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final int compareTo(final Object o) {
        return this.e() - ((Timepoint)o).e();
    }
    
    public final int d(final TYPE type) {
        final int n = Timepoint$b.a[type.ordinal()];
        if (n == 1) {
            return this.h;
        }
        if (n != 2) {
            return this.f;
        }
        return this.g;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final int e() {
        return this.g * 60 + this.f * 3600 + this.h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && Timepoint.class == o.getClass()) {
            if (this.e() != ((Timepoint)o).e()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.e();
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("");
        t.append(this.f);
        t.append("h ");
        t.append(this.g);
        t.append("m ");
        return a.q(t, this.h, "s");
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }
    
    public enum TYPE
    {
        private static final TYPE[] $VALUES;
        
        HOUR, 
        MINUTE, 
        SECOND;
    }
}
