// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.os.Parcelable;
import dg.d;
import android.os.Parcel;
import java.util.Arrays;
import rd.m;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;
import sd.a;

public final class b extends a
{
    public static final Parcelable$Creator<b> CREATOR;
    public static final b j;
    public final int f;
    public final int g;
    public final PendingIntent h;
    public final String i;
    
    static {
        j = new b(0);
        CREATOR = (Parcelable$Creator)new k();
    }
    
    public b() {
        throw null;
    }
    
    public b(final int n) {
        this(1, n, null, null);
    }
    
    public b(final int f, final int g, final PendingIntent h, final String i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public b(final int n, final PendingIntent pendingIntent) {
        this(1, n, pendingIntent, null);
    }
    
    public static String q(final int n) {
        if (n == 99) {
            return "UNFINISHED";
        }
        if (n == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        final StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(n);
                        sb.append(")");
                        return sb.toString();
                    }
                    case 24: {
                        return "API_DISABLED_FOR_CONNECTION";
                    }
                    case 23: {
                        return "API_DISABLED";
                    }
                    case 22: {
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    }
                    case 21: {
                        return "API_VERSION_UPDATE_REQUIRED";
                    }
                    case 20: {
                        return "RESTRICTED_PROFILE";
                    }
                    case 19: {
                        return "SERVICE_MISSING_PERMISSION";
                    }
                    case 18: {
                        return "SERVICE_UPDATING";
                    }
                    case 17: {
                        return "SIGN_IN_FAILED";
                    }
                    case 16: {
                        return "API_UNAVAILABLE";
                    }
                    case 15: {
                        return "INTERRUPTED";
                    }
                    case 14: {
                        return "TIMEOUT";
                    }
                    case 13: {
                        return "CANCELED";
                    }
                }
                break;
            }
            case 11: {
                return "LICENSE_CHECK_FAILED";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 9: {
                return "SERVICE_INVALID";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 1: {
                return "SERVICE_MISSING";
            }
            case 0: {
                return "SUCCESS";
            }
            case -1: {
                return "UNKNOWN";
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return this.g == b.g && m.a(this.h, b.h) && m.a(this.i, b.i);
    }
    
    public final boolean f() {
        return this.g != 0 && this.h != null;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.g, this.h, this.i });
    }
    
    public final boolean j() {
        return this.g == 0;
    }
    
    @Override
    public final String toString() {
        final m.a a = new m.a(this);
        a.a(q(this.g), "statusCode");
        a.a(this.h, "resolution");
        a.a(this.i, "message");
        return a.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i2 = d.i2(parcel, 20293);
        d.T1(parcel, 1, this.f);
        d.T1(parcel, 2, this.g);
        d.Z1(parcel, 3, (Parcelable)this.h, n);
        d.b2(parcel, 4, this.i);
        d.w2(parcel, i2);
    }
}
