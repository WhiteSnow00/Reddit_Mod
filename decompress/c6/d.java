// 
// Decompiled by Procyon v0.6.0
// 

package c6;

import android.app.Notification;

public final class d
{
    public final int a;
    public final int b;
    public final Notification c;
    
    public d(final int a, final int b, final Notification c) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && d.class == o.getClass()) {
            final d d = (d)o;
            return this.a == d.a && this.b == d.b && this.c.equals(d.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.a * 31 + this.b) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ForegroundInfo{");
        sb.append("mNotificationId=");
        sb.append(this.a);
        sb.append(", mForegroundServiceType=");
        sb.append(this.b);
        sb.append(", mNotification=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
